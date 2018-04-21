package com.spring4all.digitalsign.engine.self.cert.core.keystore.signer;

import com.spring4all.digitalsign.engine.self.cert.core.keystore.entity.P7B;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.entity.CSR;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.service.KeyStoreAdapter;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.entity.CSR;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.entity.P7B;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.service.KeyStoreAdapter;
import sun.security.x509.*;

import java.io.IOException;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by liumapp on 11/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class CSRSigner {

    private static final Logger LOGGER = Logger.getLogger(CSRSigner.class.getName());

    private final KeyStoreAdapter signerKeyStoreAdapter;

    private final CSR csr;

    private final KeyPair signerKeyPair;

    private final X509Certificate signerCert;

    private final X509CertInfo certInfo;

    public CSRSigner(KeyStoreAdapter signerKeyStoreAdapter, CSR csr, KeyPair signerKeyPair, X509Certificate signerCert) {
        this.signerKeyStoreAdapter = signerKeyStoreAdapter;
        this.csr = csr;
        this.signerKeyPair = signerKeyPair;
        this.signerCert = signerCert;
        this.certInfo = new X509CertInfo();
    }

    public CSRSigner withValidity(int period, ChronoUnit timeUnit) throws CertificateException, IOException {
        Date now = new Date();
        Instant expire = now.toInstant().plus(timeUnit.getDuration().getSeconds() * period, ChronoUnit.SECONDS);
        certInfo.set(X509CertInfo.VALIDITY, new CertificateValidity(now, new Date(expire.toEpochMilli())));
        return this;
    }

    public P7B sign() throws SignatureException {
        return sign("SHA256withRSA");
    }

    public P7B sign(String algorithm) throws SignatureException {
        try {
            certInfo.set(X509CertInfo.SERIAL_NUMBER, new CertificateSerialNumber(new BigInteger(64, new SecureRandom())));
            certInfo.set(X509CertInfo.KEY, new CertificateX509Key(csr.toPkcs10().getSubjectPublicKeyInfo()));
            certInfo.set(X509CertInfo.VERSION, new CertificateVersion(CertificateVersion.V3));
            certInfo.set(X509CertInfo.ALGORITHM_ID, new CertificateAlgorithmId(AlgorithmId.get(algorithm)));
            certInfo.set(X509CertInfo.SUBJECT, csr.toPkcs10().getSubjectName());
            certInfo.set(X509CertInfo.ISSUER, new X500Name(signerCert.getSubjectX500Principal().getEncoded()));

            CertificateExtensions extensions = new CertificateExtensions();
            extensions.set(AuthorityKeyIdentifierExtension.NAME, new AuthorityKeyIdentifierExtension(new KeyIdentifier(signerKeyPair.getPublic()), null, null));

            certInfo.set(X509CertInfo.EXTENSIONS, extensions);

            X509CertImpl x509Cert = new X509CertImpl(certInfo);
            x509Cert.sign(signerKeyPair.getPrivate(), algorithm);

            return new P7B(x509Cert, signerCert);
        } catch (CertificateException |
                IOException |
                NoSuchAlgorithmException |
                InvalidKeyException |
                NoSuchProviderException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            throw new SignatureException(e);
        }
    }
}

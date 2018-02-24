package com.liumapp.digitalsign.keystore.builder;

import com.liumapp.digitalsign.keystore.utils.Preconditions;
import com.liumapp.digitalsign.keystore.service.KeyStoreAdapter;
import sun.security.x509.*;

import java.io.IOException;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.CertificateException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by liumapp on 11/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class CertificateBuilder {

    private final KeyStoreAdapter keyStoreAdapter;

    private final KeyPair keyPair;

    private final X509CertInfo info;

    CertificateBuilder(KeyStoreAdapter keyStoreAdapter, KeyPair keyPair) {
        this.keyStoreAdapter = keyStoreAdapter;
        this.keyPair = keyPair;
        this.info = new X509CertInfo();
    }

    public CertificateBuilder withValidity(int period, ChronoUnit timeUnit) throws CertificateException, IOException {
        Date now = new Date();
        Instant expire = now.toInstant().plus(timeUnit.getDuration().getSeconds() * period, ChronoUnit.SECONDS);
        info.set(X509CertInfo.VALIDITY, new CertificateValidity(now, new Date(expire.toEpochMilli())));
        return this;
    }

    public CertificateBuilder withSerial(BigInteger serial) throws CertificateException, IOException {
        info.set(X509CertInfo.SERIAL_NUMBER, new CertificateSerialNumber(serial));
        return this;
    }

    public DistinguishNameBuilder withDistinguishName() {
        return new DistinguishNameBuilder(this);
    }

    public KeyStoreAdapter createInKeyStore(String alias, String password) throws CertificateException, IOException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException, KeyStoreException {
        Preconditions.checkState(info.get(X509CertInfo.VALIDITY) != null, "Missing Validity");
        Preconditions.checkState(info.get(X509CertInfo.SUBJECT) != null, "Missing Distinguish Name");
        Preconditions.checkState(info.get(X509CertInfo.ISSUER) != null, "Missing Issuer");

        if (info.get(X509CertInfo.SERIAL_NUMBER) == null) {
            info.set(X509CertInfo.SERIAL_NUMBER, new CertificateSerialNumber(new BigInteger(64, new SecureRandom())));
        }

        info.set(X509CertInfo.KEY, new CertificateX509Key(keyPair.getPublic()));
        info.set(X509CertInfo.VERSION, new CertificateVersion(CertificateVersion.V3));
        info.set(X509CertInfo.ALGORITHM_ID, new CertificateAlgorithmId(AlgorithmId.get("SHA256withRSA")));

        //CertificateFactory.getInstance("X.509");

        X509CertImpl x509Cert = new X509CertImpl(info);
        x509Cert.sign(keyPair.getPrivate(), "SHA256withRSA");

        this.keyStoreAdapter.addToKeyStore(alias, keyPair.getPrivate(), password, x509Cert);

        return this.keyStoreAdapter;
    }

    public X509CertInfo getInfo() {
        return info;
    }
}

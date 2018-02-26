package com.liumapp.digitalsign.keystore.service;

import com.liumapp.digitalsign.keystore.entity.CSR;
import com.liumapp.digitalsign.keystore.entity.P7B;
import com.liumapp.digitalsign.keystore.entity.Resource;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.FileOutputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * 证书导出命令：
 * keytool -export -alias liumapp -keystore ./liumapp.keystore -file ./liumapp.cer
 *
 * Created by liumapp on 11/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class KeyToolsTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Ignore
    @Test
    public void shouldGenerateKeyStoreWithKeyPair() throws Exception {
        try (FileOutputStream out = new FileOutputStream("test.ks")) {
            KeyTools.newKeyStore("1234")
                    .newKeyPair()
                    .keyLength(2048)
                    .generateWithCertificate()
                    .withValidity(1, ChronoUnit.YEARS)
                    .withDistinguishName()
                    .commonName("Andrea Como")
                    .state("Toscana")
                    .locality("Prato")
                    .country("IT")
                    .email("test@example.com")
                    .build()
                    .createInKeyStore("test", "456")
                    .writeTo(out);
            out.close();
        } finally {
            File keyStoreFile = new File("test.ks");
            assertTrue(keyStoreFile.exists());
        }
    }

    @Ignore
    @Test
    public void shouldGenerateKeyStoreWithTwoKeyPairs () throws Exception {
        try  {
            FileOutputStream out = new FileOutputStream("test2.ks");

            /**
             * 生成keystore
             * 并附带第一份证书
             */
            KeyTools.newKeyStore("1234")
                    .newKeyPair()
                    .keyLength(2048)
                    .generateWithCertificate()
                    .withValidity(1, ChronoUnit.YEARS)
                    .withDistinguishName()
                    .commonName("certA")
                    .state("city")
                    .locality("province")
                    .country("country")
                    .build()
                    .createInKeyStore("certA", "123")
                    .writeTo(out);
            out.close();

            /**
             * 读取keystore
             * 并写入第二份证书
             */
            Resource resource = Resource.from("test2.ks");
            KeyStoreAdapter keyStoreAdapter = KeyTools.keyStoreFrom(resource , "1234");
            keyStoreAdapter.newKeyPair()
                           .keyLength(2048)
                           .generateWithCertificate()
                           .withValidity(1 , ChronoUnit.YEARS)
                           .withDistinguishName()
                           .commonName("certB")
                           .state("cityb")
                           .locality("provinceb")
                           .country("countryb")
                           .build()
                           .createInKeyStore("certB" , "123");
            FileOutputStream out2 = new FileOutputStream("test2.ks");
            keyStoreAdapter.writeTo(out2);
            out2.close();
        } finally {
            File keyStoreFile = new File("test2.ks");
            assertTrue(keyStoreFile.exists());
            assertTrue(keyStoreFile.delete());
        }
    }

    /**
     * this will export certA from test2.ks to your disk.
     * plz make sure you have test2.ks
     * @throws Exception
     */
    @Ignore
    @Test
    public void shouldPrintCert() throws Exception {
        Resource resource = Resource.from("test2.ks");
        KeyStoreAdapter keyStoreAdapter = KeyTools.keyStoreFrom(resource , "1234");

        Certificate certificate = keyStoreAdapter.toKeyStore().getCertificate("certA");

        FileOutputStream out = new FileOutputStream("certA.cer");
        out.write(certificate.getEncoded());
        out.close();
    }

    @Ignore
    @Test
    public void shouldLoadKeyStoreFromClassPath() throws Exception {
        Resource resource = Resource.from("classpath:keystore.ks");
        KeyStoreAdapter keyStoreAdapter = KeyTools.keyStoreFrom(resource, "1234");

        assertNotNull(keyStoreAdapter.toKeyStore());
        Certificate certificate = keyStoreAdapter.toKeyStore().getCertificate("test");
        assertNotNull(certificate);
        assertTrue(certificate instanceof X509Certificate);

        X509Certificate x509Certificate = (X509Certificate) certificate;
        assertEquals("CN=Andrea Como, ST=Toscana, L=Prato, C=IT", x509Certificate.getSubjectDN().getName());
    }

    @Ignore
    @Test
    public void shouldGenerateCertificateSignRequest() throws Exception {
        Resource resource = Resource.from("classpath:keystore.ks");
        KeyStoreAdapter keyStoreAdapter = KeyTools.keyStoreFrom(resource, "1234");

        CSR csr = keyStoreAdapter.generateCSR("test", "456");

        assertNotNull(csr);
        assertNotNull(csr.toPkcs10());

        assertEquals("CN=Andrea Como, ST=Toscana, L=Prato, C=IT", csr.toPkcs10().getSubjectName().toString());
    }

    @Ignore
    @Test
    public void shouldSignCertificateSignRequest() throws Exception {
        Resource resource = Resource.from("classpath:keystore.ks");
        KeyStoreAdapter requesterKeyStore = KeyTools.keyStoreFrom(resource, "1234");

        X509Certificate[] certificates = requesterKeyStore.getCertificates("test");
        assertEquals(1, certificates.length);

        CSR csr = requesterKeyStore.generateCSR("test", "456");

        Resource ca = Resource.from("classpath:ca.ks");
        KeyStoreAdapter caKeyStore = KeyTools.keyStoreFrom(ca, "ca");

        P7B signResponse = caKeyStore.signCSR(csr, "ca", "ca")
                .withValidity(1, ChronoUnit.YEARS)
                .sign();

        requesterKeyStore.importCAReply(signResponse, "test", "456");
        certificates = requesterKeyStore.getCertificates("test");

        assertEquals(2, certificates.length);
    }

    @Ignore
    @Test
    public void shouldVerifySignedCertificate() throws Exception {
        Resource ca = Resource.from("classpath:ca.ks");
        KeyStoreAdapter caKeyStore = KeyTools.keyStoreFrom(ca, "ca");

        Resource signedResource = Resource.from("classpath:signed-by-ca.ks");
        KeyStoreAdapter signedKeyStore = KeyTools.keyStoreFrom(signedResource, "1234");
        signedKeyStore.verifyWithTrustStore("test", caKeyStore.toKeyStore());
    }

    @Ignore
    @Test
    public void shouldNotVerifySignedCertificate() throws Exception {
        Resource ca = Resource.from("classpath:signed-by-ca.ks");
        KeyStoreAdapter caKeyStore = KeyTools.keyStoreFrom(ca, "1234");

        Resource signedResource = Resource.from("classpath:ca.ks");
        KeyStoreAdapter signedKeyStore = KeyTools.keyStoreFrom(signedResource, "ca");

        expectedException.expect(CertificateException.class);
        expectedException.expectMessage("unable to find valid certification path to requested target");
        signedKeyStore.verifyWithTrustStore("ca", caKeyStore.toKeyStore());
    }

}

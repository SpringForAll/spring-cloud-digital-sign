package com.liumapp.cert.core;

import com.liumapp.cert.core.constant.SignConstant;
import com.liumapp.cert.core.keystore.service.KeyTools;
import com.liumapp.cert.core.property.Properties;
import com.liumapp.cert.core.constant.SignConstant;
import com.liumapp.cert.core.keystore.service.KeyTools;
import com.liumapp.cert.core.pattern.KeyStorePattern;
import com.liumapp.cert.core.property.Properties;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileOutputStream;
import java.time.temporal.ChronoUnit;

/**
 * @author liumapp
 * @file KeyStoreTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/9/18
 */
public class KeyStoreTest extends TestCase {

    protected Properties properties;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        properties = new Properties("config/sign.properties");
    }

    /**
     * generate a ks with a self signed cert
     */
    @Ignore
    @Test
    public void testGenerateKS () {
        KeyStorePattern keyStorePattern = new KeyStorePattern();
        keyStorePattern = initKeyStorePattern(keyStorePattern);

        try {
            String fileName = properties.getString(SignConstant.save_KeyStorePath) + "/" + keyStorePattern.getKeyStoreName();
            FileOutputStream out = new FileOutputStream(fileName);
            KeyTools.newKeyStore(keyStorePattern.getKeyStorePd())
                    .newKeyPair()
                    .keyLength(keyStorePattern.getKeyLength())
                    .generateWithCertificate()
                    .withValidity(1 , ChronoUnit.YEARS)
                    .withDistinguishName()
                    .commonName(keyStorePattern.getFcName())
                    .state(keyStorePattern.getFcCity())
                    .locality(keyStorePattern.getFcProvince())
                    .country(keyStorePattern.getFcCountry())
                    .build()
                    .createInKeyStore(keyStorePattern.getFcAlias() , keyStorePattern.getFcPassword())
                    .writeTo(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private KeyStorePattern initKeyStorePattern (KeyStorePattern keyStorePattern) {
        keyStorePattern = new KeyStorePattern();
        keyStorePattern.setKeyStoreName("demo.ks");
        keyStorePattern.setKeyStorePd("123456");
        keyStorePattern.setFcName("zhangsan");
        keyStorePattern.setFcProvince("ZheJiang");
        keyStorePattern.setFcCity("Hangzhou");
        keyStorePattern.setFcCountry("China");
        keyStorePattern.setFcAlias("first-certificate");
        keyStorePattern.setFcPassword("123123");
        return keyStorePattern;
    }

}

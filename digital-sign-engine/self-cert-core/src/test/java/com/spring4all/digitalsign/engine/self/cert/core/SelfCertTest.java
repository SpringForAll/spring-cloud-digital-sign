package com.spring4all.digitalsign.engine.self.cert.core;

import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.entity.Resource;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.service.KeyStoreAdapter;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.service.KeyTools;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.entity.Resource;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.service.KeyStoreAdapter;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.service.KeyTools;
import com.spring4all.digitalsign.engine.self.cert.core.pattern.ExporterPattern;
import com.spring4all.digitalsign.engine.self.cert.core.pattern.SelfSignCertPattern;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.entity.Resource;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.service.KeyStoreAdapter;
import com.spring4all.digitalsign.engine.self.cert.core.keystore.service.KeyTools;
import com.spring4all.digitalsign.engine.self.cert.core.pattern.ExporterPattern;
import com.spring4all.digitalsign.engine.self.cert.core.pattern.SelfSignCertPattern;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileOutputStream;
import java.security.cert.Certificate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

/**
 * @author liumapp
 * @file SelfCertTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/9/18
 */
public class SelfCertTest extends TestCase {

    protected Properties properties;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        properties = new Properties("config/sign.properties");
    }

    /**
     * plz make sure you have runned generate jks first
     */
    @Ignore
    @Test
    public void testExportCertByAliasFromJKS () {
        ExporterPattern exporterPattern = new ExporterPattern();
        exporterPattern = initExporterPattern(exporterPattern);
        try {
            Resource resource = Resource.from(properties.getString(SignConstant.save_KeyStorePath) + "/" + exporterPattern.getKeyStore());
            KeyStoreAdapter keyStoreAdapter = KeyTools.keyStoreFrom(resource , exporterPattern.getKeyStorePd());
            Certificate certificate = keyStoreAdapter.getCertificate(exporterPattern.getAlias());
            FileOutputStream out = new FileOutputStream(exporterPattern.getSavePath() + "/" + exporterPattern.getFileName());
            out.write(certificate.getEncoded());
            out.close();
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }

    /**
     * use "keytool -list -v -keystore ./ks/demo.ks " and you can find cert list from demo.ks
     */
    @Ignore
    @Test
    public void testGenerateSelfCertIntoJKS () {
        SelfSignCertPattern selfSignCertPattern = new SelfSignCertPattern();
        selfSignCertPattern = initSelfSignCertPattern(selfSignCertPattern);
        try {
            Resource resource = Resource.from(properties.getString(SignConstant.save_KeyStorePath) + selfSignCertPattern.getKeystore());
            KeyStoreAdapter keyStoreAdapter = KeyTools.keyStoreFrom(resource , selfSignCertPattern.getStorepass());
            keyStoreAdapter.newKeyPair()
                    .keyLength(selfSignCertPattern.getKeysize())
                    .generateWithCertificate()
                    .withValidity(1 , ChronoUnit.YEARS)
                    .withDistinguishName()
                    .commonName(selfSignCertPattern.getName())
                    .state(selfSignCertPattern.getCity())
                    .locality(selfSignCertPattern.getProvince())
                    .country(selfSignCertPattern.getCountry())
                    .build()
                    .createInKeyStore(selfSignCertPattern.getAlias() , selfSignCertPattern.getCertPassword());
            FileOutputStream out = new FileOutputStream(properties.getString(SignConstant.save_KeyStorePath) + selfSignCertPattern.getKeystore());
            keyStoreAdapter.writeTo(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private SelfSignCertPattern initSelfSignCertPattern (SelfSignCertPattern selfSignCertPattern) {
        selfSignCertPattern.setAlias("second-certificate");
        selfSignCertPattern.setCertPassword("123123");
        selfSignCertPattern.setKeystore("demo.ks");
        selfSignCertPattern.setStorepass("123456");
        selfSignCertPattern.setProvince("ZheJiang");
        selfSignCertPattern.setCity("Hangzhou");
        selfSignCertPattern.setCountry("China");
        selfSignCertPattern.setName("lisi");
        return selfSignCertPattern;

    }

    private ExporterPattern initExporterPattern (ExporterPattern exporterPattern) {
        exporterPattern.setKeyStore("demo.ks");
        exporterPattern.setKeyStorePd("123456");
        exporterPattern.setAlias("4bbdc076d4493b52209b17643fb85b00baa58522");
        exporterPattern.setCertPd("password");
        exporterPattern.setSavePath(properties.getString(SignConstant.cert_PfxSavePath));
        exporterPattern.setFileName("second-certificate.cert");
        return exporterPattern;
    }

}

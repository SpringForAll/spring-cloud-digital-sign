package com.spring4all.digitalsign.service.keystore.controller;

import com.liumapp.digitalsign.engine.keystore.entity.Resource;
import com.liumapp.digitalsign.engine.keystore.service.KeyStoreAdapter;
import com.liumapp.digitalsign.engine.keystore.service.KeyTools;
import com.spring4all.digitalsign.service.keystore.pattern.ExporterPattern;
import com.spring4all.digitalsign.service.keystore.pattern.PersonalCertPattern;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.security.cert.Certificate;
import java.time.temporal.ChronoUnit;

/**
 * Created by liumapp on 2/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("certificate")
public class CertificateController {

    @Value("${keyStoreSavePath}")
    private String keyStoreSavePath;

    /**
     * generate personal certificate by self .
     * @param personalCertPattern params required
     * @return String
     */
    @RequestMapping("/generate")
    public ResponseEntity<?> generate (@RequestBody PersonalCertPattern personalCertPattern) {
        try {
            Resource resource = Resource.from(keyStoreSavePath + "/" + personalCertPattern.getKeystore());
            KeyStoreAdapter keyStoreAdapter = KeyTools.keyStoreFrom(resource , personalCertPattern.getStorepass());
            keyStoreAdapter.newKeyPair()
                    .keyLength(personalCertPattern.getKeysize())
                    .generateWithCertificate()
                    .withValidity(1 , ChronoUnit.YEARS)
                    .withDistinguishName()
                    .commonName(personalCertPattern.getName())
                    .state(personalCertPattern.getCity())
                    .locality(personalCertPattern.getProvince())
                    .country(personalCertPattern.getCountry())
                    .build()
                    .createInKeyStore(personalCertPattern.getAlias() , personalCertPattern.getCertPassword());
            FileOutputStream out = new FileOutputStream(keyStoreSavePath + "/" + personalCertPattern.getKeystore());
            keyStoreAdapter.writeTo(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return ResponseEntity.ok("generator done");
    }

//    public String generate (@RequestBody )

    @RequestMapping("/export")
    public ResponseEntity<?> export (@RequestBody ExporterPattern exporterPattern) {
        try {
            Resource resource = Resource.from(keyStoreSavePath + "/" + exporterPattern.getKeyStore());
            KeyStoreAdapter keyStoreAdapter = KeyTools.keyStoreFrom(resource , exporterPattern.getKeyStorePd());
            Certificate certificate = keyStoreAdapter.getCertificate(exporterPattern.getAlias());
            FileOutputStream out = new FileOutputStream(exporterPattern.getSavePath() + "/" + exporterPattern.getFileName());
            out.write(certificate.getEncoded());
            out.close();
        } catch (Exception e ) {
            e.printStackTrace();
            return null;
        }
        return ResponseEntity.ok("export done");
    }

}

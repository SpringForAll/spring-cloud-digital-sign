package com.liumapp.digitalsign.service.keystore.controller;

import com.liumapp.digitalsign.engine.keystore.entity.Resource;
import com.liumapp.digitalsign.engine.keystore.service.KeyStoreAdapter;
import com.liumapp.digitalsign.engine.keystore.service.KeyTools;
import com.liumapp.digitalsign.service.keystore.config.Params;
import com.liumapp.digitalsign.service.keystore.pattern.PersonalCertPattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.time.temporal.ChronoUnit;

/**
 * Created by liumapp on 2/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("certificate")
public class CertificateController {

    @Autowired
    private Params params;

    @RequestMapping("/generate")
    public ResponseEntity<?> generator (@RequestBody PersonalCertPattern personalCertPattern) {
        try {
            Resource resource = Resource.from(params.getKeyStoreSavePath() + "/" + personalCertPattern.getKeystore());
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
            FileOutputStream out = new FileOutputStream(params.getKeyStoreSavePath() + "/" + personalCertPattern.getKeystore());
            keyStoreAdapter.writeTo(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return ResponseEntity.ok("generator done");
    }

    @RequestMapping("/export")
    public ResponseEntity<?> export () {
        return ResponseEntity.ok("export done");
    }

}

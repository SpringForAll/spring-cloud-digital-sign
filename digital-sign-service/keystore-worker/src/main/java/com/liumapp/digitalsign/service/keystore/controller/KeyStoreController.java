package com.liumapp.digitalsign.service.keystore.controller;

import com.liumapp.digitalsign.engine.keystore.service.KeyTools;
import com.liumapp.digitalsign.service.keystore.config.Params;
import com.liumapp.digitalsign.service.keystore.pattern.KeyStorePattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;
import java.time.temporal.ChronoUnit;

/**
 * Created by liumapp on 2/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("keystore")
public class KeyStoreController {

    @Autowired
    private Params params;

    @RequestMapping("/first-generate")
    public ResponseEntity<?> firstGenerate (@RequestBody KeyStorePattern keyStorePattern) {
        try {
            String fileName = params.getKeyStoreSavePath() + "/" + keyStorePattern.getKeyStoreName();
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
            return ResponseEntity.ok("faild generate");
        }

        return ResponseEntity.ok("generate done");
    }

}

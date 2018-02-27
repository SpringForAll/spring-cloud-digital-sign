package com.liumapp.digitalsign.service.keystore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 2/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("certificate")
public class CertificateController {

    @RequestMapping("/generate")
    public ResponseEntity<?> generator () {
        return ResponseEntity.ok("generator done");
    }

    @RequestMapping("/export")
    public ResponseEntity<?> export () {
        return ResponseEntity.ok("export done");
    }

}

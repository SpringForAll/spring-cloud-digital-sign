package com.liumapp.digitalsign.service.signature.controller;

import com.liumapp.digitalsign.service.signature.pattern.PdfSignPattern;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 3/5/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("sign")
public class SignController {

    @RequestMapping("")
    public ResponseEntity<?> sign (@RequestBody PdfSignPattern pdfSignPattern) {
        

        return ResponseEntity.ok("success");
    }

}

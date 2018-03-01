package com.liumapp.digitalsign.service.signature.controller;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.liumapp.digitalsign.engine.signature.helper.autowired.utils.FileUtil;
import com.liumapp.digitalsign.service.signature.pattern.SignatureAreaPattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;

/**
 * build signature area in pdf files .
 * Created by liumapp on 2/27/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("builder")
public class BuilderController {

    @Autowired
    private FileUtil fileUtil;

    @Value("${tmpDir}")
    private String tmpDir;

    @Value("${keyStoreSavePath}")
    private String keyStoreSavePath;

    /**
     * build signature area in pdf file
     * @param signatureAreaPattern params
     * @return String
     */
    public ResponseEntity<?> makeArea (@RequestBody SignatureAreaPattern signatureAreaPattern) {
        try {
            String fileResultName = signatureAreaPattern.getTmpFile() + "out";

            PdfReader pdfReader = new PdfReader(keyStoreSavePath + "/" + signatureAreaPattern.getTmpFile());
            FileOutputStream out = new FileOutputStream(tmpDir + "/" + fileResultName);
            PdfStamper pdfStamper = new PdfStamper(pdfReader , out);
            pdfStamper.addSignature(signatureAreaPattern.getName() , signatureAreaPattern.getPageNumber() , signatureAreaPattern.getFirstX().floatValue() , signatureAreaPattern.getFirstY().floatValue() , signatureAreaPattern.getSecondX().floatValue() , signatureAreaPattern.getSecondY().floatValue());
            pdfStamper.close();

            fileUtil.deleteFile(tmpDir + "/" + signatureAreaPattern.getTmpFile());

            return ResponseEntity.ok(fileResultName);
        } catch (Exception e) {
            System.out.println("maybe not builder's job....");
            e.printStackTrace();
            return null;
        }
    }

}

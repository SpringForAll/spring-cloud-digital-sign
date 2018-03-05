package com.liumapp.digitalsign.service.signature.controller;

import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.itextpdf.text.pdf.security.DigestAlgorithms;
import com.liumapp.digitalsign.engine.signature.helper.utils.Sign;
import com.liumapp.digitalsign.engine.signature.helper.utils.SignatureInfo;
import com.liumapp.digitalsign.service.signature.pattern.PdfSignPattern;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;

/**
 * Created by liumapp on 3/5/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("sign")
public class SignController {

    @Value("${keyStoreSavePath}")
    private String keyStoreSavePath;

    @Value("${sign.reason}")
    private String reason;

    @Value("${sign.location}")
    private String location;

    @Value("${tmpDir}")
    private String tmpDir;

    @RequestMapping("")
    public ResponseEntity<?> sign (@RequestBody PdfSignPattern pdfSignPattern) {
        try {
            String tmpPdfOut = pdfSignPattern.getTmpPdf() + "final";

            KeyStore ks = KeyStore.getInstance("jks");
            ks.load(new FileInputStream(keyStoreSavePath + "/" + pdfSignPattern.getKeystore()) , pdfSignPattern.getKeystorePd().toCharArray());
            PrivateKey pk = (PrivateKey) ks.getKey(pdfSignPattern.getAlias() , pdfSignPattern.getCertPd().toCharArray());
            Certificate[] chain = ks.getCertificateChain(pdfSignPattern.getAlias());

            SignatureInfo signatureInfo = new SignatureInfo();
            signatureInfo.setReason(reason);
            signatureInfo.setLocation(location);
            signatureInfo.setPk(pk);
            signatureInfo.setChain(chain);
            signatureInfo.setCertificationLevel(PdfSignatureAppearance.NOT_CERTIFIED);
            signatureInfo.setDigestAlgorithm(DigestAlgorithms.SHA256);
            signatureInfo.setFieldName(pdfSignPattern.getSignatureField());
            signatureInfo.setImagePath(tmpDir + "/" + pdfSignPattern.getTmpImg());
            signatureInfo.setRenderingMode(PdfSignatureAppearance.RenderingMode.GRAPHIC);

            Sign.sign(tmpDir + pdfSignPattern.getTmpPdf() , tmpDir + tmpPdfOut , signatureInfo);
            ossUtil.uploadFile("signed" + pdfSignPattern.getPdfKey() , new File(params.getTmpDir() + "/" + tmpPdfOut));

            fileUtil.deleteFile(params.getTmpDir() + "/" + pdfSignPattern.getTmpImg());
            fileUtil.deleteFile(params.getTmpDir() + "/" + pdfSignPattern.getTmpPdf());
            fileUtil.deleteFile(params.getTmpDir() + "/" + tmpPdfOut);

            return "signed" + pdfSignPattern.getPdfKey();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return ResponseEntity.ok("success");
    }

}

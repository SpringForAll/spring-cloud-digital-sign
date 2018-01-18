package com.liumapp.signature.pdf.tmp;

import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.security.DigestAlgorithms;
import com.liumapp.signature.pdf.helper.utils.SignatureInfo;
import com.liumapp.signature.pdf.worker.Signer;

import java.io.*;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;

/**
 * Created by liumapp on 11/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class test {

//    public static void main (String[] args) {
//        String fileName = "/usr/local/tomcat/project/working/pdf-signer/test.pdf";
//        String saveName = "/usr/local/tomcat/project/working/pdf-signer/result.pdf";
//        try {
//            PdfReader pdfReader = new PdfReader(fileName);
//            PdfStamper pdfStamper = new PdfStamper(pdfReader , new FileOutputStream(saveName));
//            pdfStamper.addSignature("sign2" , 1 , 200 , 200 , 300 , 300);
//
//            pdfStamper.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    public static void main (String[] args) {
        try {
            String imgName = "/usr/local/tomcat/project/working/pdf-signer/sign.jpg";
            String keyStore = "/usr/local/tomcat/project/working/pdf-signer/keystore/keystore.ks";
            String pdf = "/usr/local/tomcat/project/working/pdf-signer/result.pdf";
            String pdfCert = "/usr/local/tomcat/project/working/pdf-signer/resultCert.pdf";
            String alias = "430388229353192";
            Signer signer = new Signer();

            KeyStore ks = KeyStore.getInstance("jks");
            ks.load(new FileInputStream(keyStore) , "123456".toCharArray());
            PrivateKey pk = (PrivateKey)ks.getKey(alias , "123".toCharArray());
            Certificate[] chain = ks.getCertificateChain(alias);

            SignatureInfo signatureInfo = new SignatureInfo();
            signatureInfo.setReason("数字签名");
            signatureInfo.setLocation("浙江葫芦娃网络技术有限公司");
            signatureInfo.setPk(pk);
            signatureInfo.setChain(chain);
            signatureInfo.setCertificationLevel(PdfSignatureAppearance.NOT_CERTIFIED);
            signatureInfo.setDigestAlgorithm(DigestAlgorithms.SHA256);
            signatureInfo.setFieldName("sign2");
            signatureInfo.setImagePath(imgName);
            signatureInfo.setRenderingMode(PdfSignatureAppearance.RenderingMode.GRAPHIC);

            signer.sign(pdf , pdfCert , signatureInfo);

        } catch (Exception e) {
            e.printStackTrace();
        }
//        signatureInfo.setChain();
    }




}

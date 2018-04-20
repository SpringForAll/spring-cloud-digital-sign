package com.liumapp.sign.core;

import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.itextpdf.text.pdf.security.DigestAlgorithms;
import com.liumapp.sign.core.entity.Sign;
import com.liumapp.sign.core.entity.SignatureInfo;
import com.liumapp.sign.core.pattern.PdfSignByAliasPattern;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;

/**
 * @author liumapp
 * @file SignTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/10/18
 */
public class SignTest extends TestCase {

    @Ignore
    @Test
    public void testSign () {
        PdfSignByAliasPattern pdfSignByAliasPattern = initPdfSignByAliasPattern();

        try {
            String tmpPdfOut = pdfSignByAliasPattern.getTmpPdf() ;
            tmpPdfOut = "/usr/local/tomcat/project/sign-core/pdf/final.pdf";

            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new FileInputStream(pdfSignByAliasPattern.getKeystore()) , pdfSignByAliasPattern.getKeystorePd().toCharArray());

            PrivateKey pk = (PrivateKey) ks.getKey(pdfSignByAliasPattern.getAlias() , pdfSignByAliasPattern.getCertPd().toCharArray());
            Certificate[] chain = ks.getCertificateChain(pdfSignByAliasPattern.getAlias());

            SignatureInfo signatureInfo = new SignatureInfo();
            signatureInfo.setReason("this is reason");
            signatureInfo.setLocation("this is location");
            signatureInfo.setPk(pk);
            signatureInfo.setChain(chain);
            signatureInfo.setCertificationLevel(PdfSignatureAppearance.NOT_CERTIFIED);
            signatureInfo.setDigestAlgorithm(DigestAlgorithms.SHA256);
            signatureInfo.setFieldName(pdfSignByAliasPattern.getSignatureField());
            signatureInfo.setImagePath(pdfSignByAliasPattern.getTmpImg());
            signatureInfo.setRenderingMode(PdfSignatureAppearance.RenderingMode.GRAPHIC);

            Sign.sign(pdfSignByAliasPattern.getTmpPdf() ,
                    tmpPdfOut , signatureInfo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private PdfSignByAliasPattern initPdfSignByAliasPattern () {
        PdfSignByAliasPattern pdfSignByAliasPattern = new PdfSignByAliasPattern();
        pdfSignByAliasPattern.setAlias("958c82d956b4bf5229ec59e9e58c113ed877e88c");
//        pdfSignByAliasPattern.setAlias("19643137d8482943fbdd94075cd4302edd5b0908");
//        pdfSignByAliasPattern.setAlias("first-certificate");
        pdfSignByAliasPattern.setKeystore("/usr/local/tomcat/project/sign-core/ks/demo.ks");
        pdfSignByAliasPattern.setKeystorePd("123456");
        pdfSignByAliasPattern.setCertPd("123456");
        pdfSignByAliasPattern.setSignatureField("certA");
        pdfSignByAliasPattern.setTmpImg("/usr/local/tomcat/project/sign-core/pic/pic.jpg");
        pdfSignByAliasPattern.setTmpPdf("/usr/local/tomcat/project/sign-core/pdf/with_sign_area_test.pdf");
        return pdfSignByAliasPattern;
    }

}

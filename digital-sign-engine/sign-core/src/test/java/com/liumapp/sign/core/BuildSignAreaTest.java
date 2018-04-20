package com.liumapp.sign.core;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.liumapp.sign.core.pattern.SignatureAreaPattern;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileOutputStream;
import java.math.BigDecimal;

/**
 * @author liumapp
 * @file BuildSignAreaTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/10/18
 */
public class BuildSignAreaTest extends TestCase {

    @Ignore
    @Test
    public void testMakeArea () {
        SignatureAreaPattern signatureAreaPattern = initSignatureAreaPattern();
        try {

            PdfReader pdfReader = new PdfReader(signatureAreaPattern.getTmpFile());
            FileOutputStream out = new FileOutputStream(signatureAreaPattern.getSaveFile());
            PdfStamper pdfStamper = new PdfStamper(pdfReader , out);
            pdfStamper.addSignature(signatureAreaPattern.getName() , signatureAreaPattern.getPageNumber() , signatureAreaPattern.getFirstX().floatValue() , signatureAreaPattern.getFirstY().floatValue() , signatureAreaPattern.getSecondX().floatValue() , signatureAreaPattern.getSecondY().floatValue());
            pdfStamper.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private SignatureAreaPattern initSignatureAreaPattern () {
        SignatureAreaPattern signatureAreaPattern = new SignatureAreaPattern();
        signatureAreaPattern.setName("certA");
        signatureAreaPattern.setFirstX(new BigDecimal(40));
        signatureAreaPattern.setFirstY(new BigDecimal(40));
        signatureAreaPattern.setSecondX(new BigDecimal(80));
        signatureAreaPattern.setSecondY(new BigDecimal(80));
        signatureAreaPattern.setFileKey("testfile001");
        signatureAreaPattern.setPageNumber(1);
        signatureAreaPattern.setTmpFile("/usr/local/tomcat/project/sign-core/pdf/test.pdf");
        signatureAreaPattern.setSaveFile("/usr/local/tomcat/project/sign-core/pdf/with_sign_area_test.pdf");
        return signatureAreaPattern;
    }
}

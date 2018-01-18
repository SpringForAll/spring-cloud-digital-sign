package com.liumapp.signature.pdf.worker;

import com.liumapp.DNSQueen.queen.Queen;
import com.liumapp.pattern.oss.OssFileDownloadPattern;
import com.liumapp.pattern.sign.PdfSignPattern;
import com.liumapp.pattern.sign.SignatureAreaPattern;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.UnknownHostException;

/**
 * Created by liumapp on 11/30/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class BuilderTest {

    /**
     * 添加签署区域
     */
    @Test
    public void addSignature () {
        if (false) {
            Queen queen = new Queen();
            queen.setPort(40216);
            queen.setAddress("sign.huluwa.cc");
            try {
                queen.connect();

                SignatureAreaPattern signatureAreaPattern = new SignatureAreaPattern();
                signatureAreaPattern.setImportant("zhangsan",
                        new BigDecimal(200),
                        new BigDecimal(200),
                        new BigDecimal(300),
                        new BigDecimal(300),
                        "pdf/contract1510729457312.pdf",
                        1
                        );

                PdfSignPattern pdfSignPattern = new PdfSignPattern();
                pdfSignPattern.setImportant("person/sign/1511163790980529601.jpg",
                        "pdf/contract1510729457312.pdf",
                        "430388229353192",
                        "123",
                        "zhangsan");

                OssFileDownloadPattern ossFileDownloadPattern = new OssFileDownloadPattern();
                ossFileDownloadPattern.setImportant(signatureAreaPattern.getFileKey());
                String line = ossFileDownloadPattern.getEncoding();
                queen.say(line);
                String tmpFile = queen.hear();
                signatureAreaPattern.setTmpFile(tmpFile);

                if (signatureAreaPattern.chk()) {
                    String line2 = signatureAreaPattern.getEncoding();
                    queen.say(line2);
                    pdfSignPattern.setTmpPdf(queen.hear());
                    ossFileDownloadPattern.setImportant(pdfSignPattern.getImgKey());
                    String line3 = ossFileDownloadPattern.getEncoding();
                    queen.say(line3);
                    pdfSignPattern.setTmpImg(queen.hear());

                    if (pdfSignPattern.chk()) {
                        String line4 = pdfSignPattern.getEncoding();
                        queen.say(line4);
                        System.out.println(queen.hear());
                    }
                }
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

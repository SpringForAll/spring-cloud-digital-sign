package com.liumapp.signature.pdf.helper.demo;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import javax.swing.text.Document;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by liumapp on 9/25/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class ImageDemo {

    public static String dataPath = "/usr/local/tomcat/project/pfxSigner/data";

    public static void main(String[] args) {

        PdfStamper stamper = null;
        try {
            PdfReader reader = new PdfReader(dataPath + "/test.pdf");
            stamper = new PdfStamper(reader , new FileOutputStream(dataPath + "/output_onlyImage.pdf"));
            PdfContentByte over = stamper.getOverContent(1);
            Image image = Image.getInstance(dataPath +"/sign.png");
            image.setAbsolutePosition(0 , 0);
            image.scaleToFit(300 , 109);
            over.addImage(image);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            try {
                stamper.close();
            } catch (DocumentException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}

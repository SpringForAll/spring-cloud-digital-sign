package com.liumapp.signature.pdf.helper.demo;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;

/**
 * Created by liumapp on 9/27/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class DemoFromBook {

    private static final String cert_path = "/usr/local/tomcat/project/pfxSigner/data/liumapp.keystore";

    private static final String image_path = "/usr/local/tomcat/project/pfxSigner/data/sign.png";

    private static final String source_pdf = "/usr/local/tomcat/project/pfxSigner/data/test.pdf";

    private static final String tmp_pdf = "/usr/local/tomcat/project/pfxSigner/data/test_tmp.pdf";

    private static final String output_pdf = "/usr/local/tomcat/project/pfxSigner/data/output.pdf";

    public static final char[] PASSWORD = "111111".toCharArray();//keystory密码

    public static void main(String[] args)  {

//        CreatePDf();
//        SignPdfWithSignature();
        CreatePDFWithMultySign();

    }

    /**
     * 单纯创建一个可供签名的证书
     */
    public static void CreatePDf () {
        try {
            Document document = new Document();
            PdfWriter pdfWriter = PdfWriter.getInstance(document , new FileOutputStream(tmp_pdf));
            document.open();
            document.add(new Paragraph("hello world"));
            PdfFormField pdfFormField = PdfFormField.createSignature(pdfWriter);
            pdfFormField.setWidget(new Rectangle(72 , 732 , 144 , 780) , PdfAnnotation.HIGHLIGHT_INVERT);
            pdfFormField.setFieldName("mySig");
            pdfFormField.setFlags(PdfAnnotation.FLAGS_PRINT);
            pdfFormField.setPage();
            pdfFormField.setMKBorderColor(BaseColor.BLACK);
            pdfFormField.setMKBackgroundColor(BaseColor.WHITE);
            PdfAppearance pdfAppearance = PdfAppearance.createAppearance(pdfWriter , 72 , 48);
            pdfAppearance.rectangle(0.5f , 0.5f , 71.5f , 47.5f);
            pdfAppearance.stroke();
            pdfFormField.setAppearance(PdfAnnotation.APPEARANCE_NORMAL , pdfAppearance);
            pdfWriter.addAnnotation(pdfFormField);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 创建一个带有多个签名区域的pdf文本
     */
    public static void CreatePDFWithMultySign()  {
        try {
            Document document = new Document();
            PdfWriter pdfWriter = PdfWriter.getInstance(document , new FileOutputStream(tmp_pdf));
            document.open();
            document.add(new Paragraph("hello world"));
            PdfFormField pdfFormField1 = PdfFormField.createSignature(pdfWriter);
            PdfFormField pdfFormField2 = PdfFormField.createSignature(pdfWriter);
            PdfFormField pdfFormField3 = PdfFormField.createSignature(pdfWriter);
            PdfFormField pdfFormField4 = PdfFormField.createSignature(pdfWriter);

            PdfAppearance pdfAppearance = PdfAppearance.createAppearance(pdfWriter , 72 , 48);

            pdfFormField1.setWidget(new Rectangle(72 , 732 , 144 , 780) , PdfAnnotation.HIGHLIGHT_INVERT);
            pdfFormField1.setFieldName("mySig1");
            pdfFormField1.setFlags(PdfAnnotation.FLAGS_PRINT);
            pdfFormField1.setPage();
            pdfFormField1.setMKBorderColor(BaseColor.BLACK);
            pdfFormField1.setMKBackgroundColor(BaseColor.WHITE);
            pdfAppearance.rectangle(0.5f , 0.5f , 71.5f , 47.5f);
            pdfAppearance.stroke();
            pdfFormField1.setAppearance(PdfAnnotation.APPEARANCE_NORMAL , pdfAppearance);
            pdfWriter.addAnnotation(pdfFormField1);

            pdfFormField2.setWidget(new Rectangle(72 , 532 , 144 , 580) , PdfAnnotation.HIGHLIGHT_INVERT);
            pdfFormField2.setFieldName("mySig2");
            pdfFormField2.setFlags(PdfAnnotation.FLAGS_PRINT);
            pdfFormField2.setPage();
            pdfFormField2.setMKBorderColor(BaseColor.BLACK);
            pdfFormField2.setMKBackgroundColor(BaseColor.WHITE);
            pdfAppearance.rectangle(0.5f , 0.5f , 71.5f , 47.5f);
            pdfAppearance.stroke();
            pdfFormField2.setAppearance(PdfAnnotation.APPEARANCE_NORMAL , pdfAppearance);
            pdfWriter.addAnnotation(pdfFormField2);

            pdfFormField3.setWidget(new Rectangle(72 , 332 , 144 , 380) , PdfAnnotation.HIGHLIGHT_INVERT);
            pdfFormField3.setFieldName("mySig3");
            pdfFormField3.setFlags(PdfAnnotation.FLAGS_PRINT);
            pdfFormField3.setPage();
            pdfFormField3.setMKBorderColor(BaseColor.BLACK);
            pdfFormField3.setMKBackgroundColor(BaseColor.WHITE);
            pdfAppearance.rectangle(0.5f , 0.5f , 71.5f , 47.5f);
            pdfAppearance.stroke();
            pdfFormField3.setAppearance(PdfAnnotation.APPEARANCE_NORMAL , pdfAppearance);
            pdfWriter.addAnnotation(pdfFormField3);

            pdfFormField4.setWidget(new Rectangle(72 , 132 , 144 , 180) , PdfAnnotation.HIGHLIGHT_INVERT);
            pdfFormField4.setFieldName("mySig4");
            pdfFormField4.setFlags(PdfAnnotation.FLAGS_PRINT);
            pdfFormField4.setPage();
            pdfFormField4.setMKBorderColor(BaseColor.BLACK);
            pdfFormField4.setMKBackgroundColor(BaseColor.WHITE);
            pdfAppearance.rectangle(0.5f , 0.5f , 71.5f , 47.5f);
            pdfAppearance.stroke();
            pdfFormField4.setAppearance(PdfAnnotation.APPEARANCE_NORMAL , pdfAppearance);
            pdfWriter.addAnnotation(pdfFormField4);

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package com.liumapp.signature.pdf.helper.demo;


import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.security.*;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.*;
import java.security.cert.Certificate;

/**
 * Created by liumapp on 9/25/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class SignDemo {

    public static String dataPath = "/usr/local/tomcat/project/pfxSigner/data";

    public static void main(String[] args) throws Exception {
        KeyStore ks = KeyStore.getInstance("JKS");
        ks.load(new FileInputStream(dataPath + "/liumapp.keystore"), "111111".toCharArray());
        String alias = (String)ks.aliases().nextElement();
        PrivateKey pk = (PrivateKey)ks.getKey(alias, "111111".toCharArray());
        Certificate[] chain = ks.getCertificateChain(alias);
        BouncyCastleProvider provider = new BouncyCastleProvider();
        Security.addProvider(provider);
        // Creating the reader and the stamper

        PdfReader reader = new PdfReader(dataPath + "/test.pdf");

        Rectangle pageSize = reader.getPageSize(1);

        String tempPath = dataPath + "/output.pdf";
        FileOutputStream os = new FileOutputStream(tempPath);

        PdfStamper stamper = PdfStamper.createSignature(reader, os, '\0');
        // Creating the appearance
        PdfSignatureAppearance appearance = stamper.getSignatureAppearance();
        // appearance.setReason(signInfo.getReason());
        appearance.setLocation("this is the location");
        Image img = Image.getInstance(dataPath + "/sign.png");

        //float newHeight = (float) (signInfo.getHeight()*0.8f);
        //float newWeight = (float) (signInfo.getWidth()*0.8f);
        //img.scaleAbsolute(newWeight, newHeight);
        float width = pageSize.getWidth();
        float height = pageSize.getHeight();
        float realWidth = (float) (width*1);
        float realHeight = (float) (height*1);
        float[] start = new float []{(float) 0*width,(float) 0*height};
        appearance.setVisibleSignature(
                new Rectangle(
                        (float) start[0],
                        (float) (start[1]-realHeight),
                        (float) (start[0]+realWidth),
                        (float) (start[1])),1,"Signature1");
        // Custom text and background image
        appearance.setLayer2Text("");
        appearance.setImage(img);
        appearance.setImageScale((float) ((1)/img.getWidth()));
        // Creating the signature
        PrivateKeySignature pks = new PrivateKeySignature(pk, DigestAlgorithms.SHA256, provider.getName());
        ExternalDigest digest = new BouncyCastleDigest();
        MakeSignature.signDetached(appearance, digest, pks, chain, null, null, null, 0, MakeSignature.CryptoStandard.CMS);
        reader.close();
        os.close();
        stamper.close();
    }


}

package com.liumapp.digitalsign.engine.signature.helper.utils;


import java.io.*;
import java.util.*;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.itextpdf.text.pdf.PdfStamper;

import java.security.*;
import java.security.cert.Certificate;

/**
 * Created by liumapp on 2/27/18 2:46 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class PkxSign {

    private static final String cert_path = "/usr/local/tomcat/project/pfxSigner/data/liumapp.pfx";
    //"D:\\dev\\eclipse-jee-juno-SR2-win32\\eclipse\\workspace\\sign\\src\\machunlin_1.pfx";

    private static final String image_path = "/usr/local/tomcat/project/pfxSigner/data/sign.png";

    private static final String source_pdf = "/usr/local/tomcat/project/pfxSigner/data/test.pdf";

    private static final String output_pdf = "/usr/local/tomcat/project/pfxSigner/data/output.pdf";

    // 证书密码
    private static final String cert_pwd = "111111";
    //利用keytool生成数字证书
    //keytool -genkey -alias ctidcert -keystore c:/证书名称.keystore -storepass "888" -keypass "888" -keyalg "RSA" -dname "CN=www.123.cn,OU=简称,O=公司名称,L=北京,ST=北京,C=中国"
//    private static final String cert_path = "E:/test/升腾证书.pfx";
    //"D:\\dev\\eclipse-jee-juno-SR2-win32\\eclipse\\workspace\\sign\\src\\machunlin_1.pfx";

    public PkxSign() {

    }

    //转换成十六进制字符串
    public static String Byte2String(byte[] b) {
        String hs = "";
        String stmp = "";

        for (int n = 0; n < b.length; n++) {
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1)
                hs = hs + "0" + stmp;
            else
                hs = hs + stmp;
            //if (n<b.length-1)  hs=hs+":";
        }
        return hs.toUpperCase();
    }

    public static byte[] StringToByte(int number) {
        int temp = number;
        byte[] b = new byte[4];
        for (int i = b.length - 1; i > -1; i--) {
            b[i] = new Integer(temp & 0xff).byteValue();//将最高位保存在最低位
            temp = temp >> 8; //向右移8位
        }
        return b;
    }

    public PrivateKey GetPvkformPfx(String strPfx, String strPassword) {
        try {
            BouncyCastleProvider provider = new BouncyCastleProvider();
            Security.addProvider(provider);
            KeyStore ks = KeyStore.getInstance("PKCS12");
            FileInputStream fis = new FileInputStream(strPfx);
            // If the keystore password is empty(""), then we have to set
            // to null, otherwise it won't work!!!
            char[] nPassword = null;
            if ((strPassword == null) || strPassword.trim().equals("")) {
                nPassword = null;
            } else {
                nPassword = strPassword.toCharArray();
            }
            ks.load(fis, nPassword);
            fis.close();
            System.out.println("keystore type=" + ks.getType());
            // Now we loop all the aliases, we need the alias to get keys.
            // It seems that this value is the "Friendly name" field in the
            // detals tab <-- Certificate window <-- view <-- Certificate
            // Button <-- Content tab <-- Internet Options <-- Tools menu
            // In MS IE 6.
            Enumeration enumas = ks.aliases();
            String keyAlias = null;
            if (enumas.hasMoreElements())// we are readin just one certificate.
            {
                keyAlias = (String) enumas.nextElement();
                System.out.println("alias=[" + keyAlias + "]");
            }
            // Now once we know the alias, we could get the keys.
            System.out.println("is key entry=" + ks.isKeyEntry(keyAlias));
            PrivateKey prikey = (PrivateKey) ks.getKey(keyAlias, nPassword);
            Certificate[] cert = ks.getCertificateChain(keyAlias);
            System.out.println("chain size " + cert.length);
            PublicKey pubkey = cert[0].getPublicKey();
            System.out.println("cert class = " + cert.getClass().getName());
            System.out.println("cert = " + cert);
            System.out.println("public key = " + pubkey);
            System.out.println("private key = " + prikey);

            //			PdfReader reader = new PdfReader("/Users/yeyanxin/downloads/lib/test.pdf");
            //			FileOutputStream os = new FileOutputStream("/Users/yeyanxin/downloads/lib/pkxsign.pdf");
            //			PdfStamper stamper = PdfStamper.createSignature(reader, os, '\0');
            //			// Creating the appearance
            //			PdfSignatureAppearance appearance = stamper.getSignatureAppearance();
            //			appearance.setReason("digtal signature");
            //			appearance.setLocation("FuZhou");
            //			appearance.setVisibleSignature(new Rectangle(300, 840 - 200, 200, 600), 1, "sig");
            //			// Creating the signature
            //			ExternalSignature pks = new PrivateKeySignature(prikey, DigestAlgorithms.SHA256, provider.getName());
            //			ExternalDigest digest = new BouncyCastleDigest();
            //			MakeSignature.signDetached(appearance, digest, pks, cert, null, null, null, 0, CryptoStandard.CMS);
            return prikey;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void sign() throws Exception {
        BouncyCastleProvider provider = new BouncyCastleProvider();
        Security.addProvider(provider);
        KeyStore ks = KeyStore.getInstance("PKCS12");
        ks.load(new FileInputStream(cert_path), cert_pwd.toCharArray());
        String alias = (String) ks.aliases().nextElement();
        //		PrivateKey pk = (PrivateKey) ks.getKey(alias, cert_pwd.toCharArray());
        //		KeyStore ks = KeyStore.getInstance("PKCS12");
        //		ks.load(new FileInputStream(cert_path), cert_pwd.toCharArray());
        PkxSign sign = new PkxSign();
        PrivateKey pk = sign.GetPvkformPfx(cert_path, cert_pwd);
        Certificate[] chain = ks.getCertificateChain(alias);


        PdfReader reader = new PdfReader(source_pdf);
        FileOutputStream os = new FileOutputStream(output_pdf);
        PdfStamper stamper = PdfStamper.createSignature(reader, os, '\0');
        // Creating the appearance
        PdfSignatureAppearance appearance = stamper.getSignatureAppearance();
        appearance.setReason("digtal signature");
        appearance.setLocation("FuZhou");
        appearance.setVisibleSignature(new Rectangle(0, 300, 300, 109), 1, "sig");
        // Creating the signature
//        ExternalSignature pks = new PrivateKeySignature(pk, DigestAlgorithms.SHA256, provider.getName());
//        ExternalDigest digest = new BouncyCastleDigest();
//        MakeSignature.signDetached(appearance, digest, pks, chain, null, null, null, 0, CryptoStandard.CMS);
    }

    public static void main(String[] args) {
        try {
            //	new PkxSign().GetPvkformPfx(cert_path, cert_pwd);
            sign();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("done!!!");
    }
}
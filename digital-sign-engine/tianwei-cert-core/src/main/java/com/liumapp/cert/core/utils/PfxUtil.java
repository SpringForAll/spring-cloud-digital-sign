package com.liumapp.cert.core.utils;

import org.bouncycastle.util.encoders.Base64;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Enumeration;

/**
 * @author liumapp
 * @file PfxUtil.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/10/18
 */
public class PfxUtil {

    /**
     * pfx into jks method
     * @param INpfxpath pfx file path
     * @param pfxPWD pfx file password
     * @param outJKSpath jks path
     * @param jksPWD jks password
     * @param certpath export cert path
     * @throws NoSuchAlgorithmException exception
     * @throws KeyStoreException exception
     * @throws UnrecoverableKeyException exception
     * @throws KeyStoreException exception
     * @throws CertificateException exception
     * @throws NoSuchAlgorithmException exception
     */
    public void Pfx2NewJKS(String INpfxpath, String pfxPWD, String outJKSpath, String jksPWD , String certpath) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, KeyStoreException, CertificateException, NoSuchAlgorithmException {

        KeyStore inputKeyStore = KeyStore.getInstance("PKCS12");
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(INpfxpath);
            // 将PKCS12格式的数字证书转写入到密钥容器
            try {
                inputKeyStore.load(inputStream, pfxPWD.toCharArray());
                inputStream.close();
                KeyStore keyStoreOutPut = KeyStore.getInstance("JKS");
                keyStoreOutPut.load(null, jksPWD.toCharArray());
                Enumeration enums = inputKeyStore.aliases();
                while (enums.hasMoreElements()) {
                    String keyAlias = (String) enums.nextElement();
                    if (inputKeyStore.isKeyEntry(keyAlias)) {
                        java.security.Key key = inputKeyStore.getKey(keyAlias, pfxPWD.toCharArray());
                        java.security.cert.Certificate[] certChain = inputKeyStore.getCertificateChain(keyAlias);
                        keyStoreOutPut.setKeyEntry(keyAlias, key, jksPWD.toCharArray(), certChain);

                        //Certificate certificate = new Certificate(certChain[0].getEncoded());
                        System.out.println("公钥证书base64"+new String(Base64.encode(certChain[0].getEncoded())));
                        //System.out.println("证书序列号"+certificate.serialNumber());

                        certChain[0].getEncoded();

                        if (certpath != null) {
                            FileOutputStream out1 = new FileOutputStream(certpath);
                            out1.write(	certChain[0].getEncoded());
                            out1.close();
                        }

                    }
                }
                FileOutputStream out = new FileOutputStream(outJKSpath);
                keyStoreOutPut.store(out, jksPWD.toCharArray());
                out.close();
            } catch (CertificateException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    /**
     * pfx into jks method
     * @param INpfxpath pfx file path
     * @param pfxPWD pfx file password
     * @param JKSpath jks path
     * @param jksPWD jks password
     * @param certpath export cert path
     * @throws NoSuchAlgorithmException exception
     * @throws KeyStoreException exception
     * @throws UnrecoverableKeyException exception
     * @throws KeyStoreException exception
     * @throws CertificateException exception
     * @throws NoSuchAlgorithmException exception
     */
    public void Pfx2OldJKS(String INpfxpath, String pfxPWD, String JKSpath, String jksPWD , String certpath) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, KeyStoreException, CertificateException, NoSuchAlgorithmException {

        KeyStore inputKeyStore = KeyStore.getInstance("PKCS12");
        FileInputStream inputStream;
        FileInputStream readJKS;
        try {
            inputStream = new FileInputStream(INpfxpath);
            // 将PKCS12格式的数字证书转写入到密钥容器
            try {
                inputKeyStore.load(inputStream, pfxPWD.toCharArray());
                inputStream.close();
                KeyStore keyStoreOutPut = KeyStore.getInstance("JKS");

                readJKS = new FileInputStream(JKSpath);
                keyStoreOutPut.load(readJKS, jksPWD.toCharArray());
                readJKS.close();

                Enumeration enums = inputKeyStore.aliases();
                while (enums.hasMoreElements()) {
                    String keyAlias = (String) enums.nextElement();
                    if (inputKeyStore.isKeyEntry(keyAlias)) {
                        Key key = inputKeyStore.getKey(keyAlias, pfxPWD.toCharArray());
                        Certificate[] certChain = inputKeyStore.getCertificateChain(keyAlias);
                        keyStoreOutPut.setKeyEntry(keyAlias, key, jksPWD.toCharArray(), certChain);

                        //Certificate certificate = new Certificate(certChain[0].getEncoded());
                        System.out.println("公钥证书base64"+new String(Base64.encode(certChain[0].getEncoded())));
                        //System.out.println("证书序列号"+certificate.serialNumber());

                        certChain[0].getEncoded();

                        if (certpath != null) {
                            FileOutputStream out1 = new FileOutputStream(certpath);
                            out1.write(	certChain[0].getEncoded());
                            out1.close();
                        }

                    }
                }
                FileOutputStream out = new FileOutputStream(JKSpath);
                keyStoreOutPut.store(out, jksPWD.toCharArray());
                out.close();
            } catch (CertificateException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

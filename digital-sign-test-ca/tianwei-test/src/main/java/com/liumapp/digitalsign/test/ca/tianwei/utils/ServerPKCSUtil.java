package com.liumapp.digitalsign.test.ca.tianwei.utils;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.bouncycastle.pkcs.PKCS10CertificationRequestHolder;
import org.bouncycastle.util.encoders.Base64;

import cn.topca.security.x509.AlgorithmId;

import com.itrus.cert.X509Certificate;

/**
 * @author liumapp
 * @file ServerPKCSUtil.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class ServerPKCSUtil {

    private static KeyPair securityKP = null;
    private static String alg = "RSA";

    /***
     * genCsr
     *
     * @param alg0 alg
     * 密钥算法
     * @return
     */
    public static String genCsr(String alg0) {
        if ("".equals(alg0)) {
            alg = alg0;
        }
        // 产生秘钥对
        KeyPairGenerator kpg = null;
        try {
            kpg = KeyPairGenerator.getInstance(alg);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        // 根据秘钥算法配置秘钥长度
        if ("SM2".equalsIgnoreCase(alg)) {
            kpg.initialize(256);
        } else {
            kpg.initialize(2048);
        }
        KeyPair kp = kpg.generateKeyPair();
        securityKP = kp;

        // 获取公钥以及公钥算法
        byte[] publickey = kp.getPublic().getEncoded();
        String pubAlg = kp.getPublic().getAlgorithm();
        String sAlg = null;

        try {
            sAlg = AlgorithmId.get(pubAlg).getOID().toString();
        } catch (NoSuchAlgorithmException e) {
        }
        SubjectPublicKeyInfo spki = null;
        // 区分SM2和RSA
        if (sAlg.equals("1.2.156.10197.1.301")) {
            spki = SubjectPublicKeyInfo.getInstance(publickey);
        } else {
            spki = new SubjectPublicKeyInfo(ASN1Sequence.getInstance(publickey));
        }
        String subject = "CN=defaultName";
        X500Name x500 = new X500Name(subject);
        // 产生csr构造器
        PKCS10CertificationRequestBuilder prb = new PKCS10CertificationRequestBuilder(x500, spki);

        // 构建签名信息
        ContentSigner signer = null;
        PrivateKey privateKey = kp.getPrivate();
        Signature sign = null;
        try {
            if (privateKey.getAlgorithm().equals("SM2")) {
                sign = Signature.getInstance("SM3withSM2");
            } else {
                sign = Signature.getInstance("SHA1withRSA");
            }
            sign.initSign(privateKey);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        final Signature sign1 = sign;
        signer = new ContentSigner() {
            ByteArrayOutputStream originStream = new ByteArrayOutputStream();

            public byte[] getSignature() {
                try {
                    sign1.update(originStream.toByteArray());
                    return sign1.sign();
                } catch (SignatureException e) {
                    throw new RuntimeException(e);
                }
            }

            public OutputStream getOutputStream() {
                return originStream;
            }

            public AlgorithmIdentifier getAlgorithmIdentifier() {
                try {
                    return new AlgorithmIdentifier(AlgorithmId.get(sign1.getAlgorithm()).getOID().toString());
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        PKCS10CertificationRequestHolder pr = prb.build(signer);
        try {
            return new String(Base64.encode(pr.getEncoded()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param password
     *            产生私钥证书的密码
     * @param certSignBuf
     *            公钥证书
     *
     * @return Base64的私钥证书
     */
    public static String genP12(String password, String certSignBuf) {
        // 当前userId 不存在keyMap时抛出异常
        KeyStore ks = null;
        X509Certificate cert = null;
        ByteArrayOutputStream out = null;
        try {
            ks = KeyStore.getInstance("PKCS12");
            ks.load(null, password.toCharArray());
            cert = X509Certificate.getInstance(certSignBuf);
            String alias = cert.getSerialNumber().toString(16).toUpperCase();
            Certificate[] certChain = new Certificate[] { cert };
            KeyPair kp = securityKP;
            out = new ByteArrayOutputStream();
            ks.setKeyEntry(alias, kp.getPrivate(), password.toCharArray(), certChain);
            ks.store(out, password.toCharArray());
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(Base64.encode(out.toByteArray()));
    }

}

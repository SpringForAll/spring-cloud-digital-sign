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
}

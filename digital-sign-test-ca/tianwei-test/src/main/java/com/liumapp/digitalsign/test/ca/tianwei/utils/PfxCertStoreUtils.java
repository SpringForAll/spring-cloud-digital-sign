package com.liumapp.digitalsign.test.ca.tianwei.utils;


import com.itrus.util.CertUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;
import sun.security.pkcs10.PKCS10;
import sun.security.x509.X500Name;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Random;

/**
 * @author liumapp
 * @file PfxCertStoreUtils.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class PfxCertStoreUtils {
    public KeyPair kp = null;
    public String password = "";

    public String generateCSR(String alg, int size, String cn) {
    	 Security.addProvider(new BouncyCastleProvider());
	String strCSR = "";
	try {
	    strCSR = "";

	    String sigAlg = "SHA1WithRSA";
	    if ((alg == null) || (alg.length() <= 0))
		sigAlg = "SHA1WithRSA";
	    else
		sigAlg = alg;

	    int algSize = 1024;
	    if (size != 0)
		algSize = size;

	    KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
	    kpg.initialize(algSize, new SecureRandom());
	    this.kp = kpg.generateKeyPair();

	    PublicKey publicKey = this.kp.getPublic();

	    PrivateKey privateKey = this.kp.getPrivate();

	    PKCS10 pkcs10 = new PKCS10(publicKey);
	    Signature signature = Signature.getInstance(sigAlg);
	    signature.initSign(privateKey);

	    String CN = "defaultUserName";
	    if ((cn != null) && (cn.length() > 0))
		CN = cn;
	    String DN = "CN=" + CN + ",C=CN";

	    X500Name x500Name = new X500Name(DN);

	    pkcs10.encodeAndSign(x500Name, signature);

	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    pkcs10.print(ps);

	    String strPEMCSR = baos.toString();
	    strCSR = strPEMCSR.replaceAll("\r|\n", "");
	    strCSR = strCSR.replaceAll("-----BEGIN NEW CERTIFICATE REQUEST-----", "");
	    strCSR = strCSR.replaceAll("-----END NEW CERTIFICATE REQUEST-----", "");

	} catch (NoSuchAlgorithmException e) {
	    e.printStackTrace();
	} catch (InvalidKeyException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} catch (CertificateException e) {
	    e.printStackTrace();
	} catch (SignatureException e) {
	    e.printStackTrace();

	    return null;
	}
	return strCSR;
    }

    public String generatePassword(int length) {
	String random = "";
	Random r = new Random();
	random = Integer.toString(Math.abs(r.nextInt()));

	int n = length - random.length();
	for (; n > 0; --n) {
	    this.password += "0";
	}

	return this.password + random;
    }

    public String generatePkcs12(String password, KeyPair kp, String certSignBuf) {
    	
	ByteArrayOutputStream baos = null;
	try {
	    certSignBuf = certSignBuf.replaceAll("\r\n", "");
	    certSignBuf = certSignBuf.replaceAll("\r", "").replaceAll("\n", "");
	    
	    X509Certificate cert = CertUtils.getX509CertificateFromBase64(certSignBuf);
	    Certificate[] chain = { cert };
	    System.out.println("usered password:" + password);
	    KeyStore ks = KeyStore.getInstance("PKCS12");
	    ks.load(null, password.toCharArray());
	    ks.setKeyEntry("pkcs12", kp.getPrivate(), password.toCharArray(), chain);
	    baos = new ByteArrayOutputStream();
	    ks.store(baos, password.toCharArray());

	} catch (CertificateException e) {
	    e.printStackTrace();
	} catch (KeyStoreException e) {
	    e.printStackTrace();
	} catch (NoSuchAlgorithmException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();

	    return null;
	}
	return new String(Base64.encode(baos.toByteArray()));

    }

    public String getBase64KeyPair() {
	String strKP = this.kp.toString();
	return new String(Base64.encode(strKP.getBytes()));
    }
}
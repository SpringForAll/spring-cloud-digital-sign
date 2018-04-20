package com.liumapp.cert.core.utils;

import java.security.MessageDigest;

/**
 * @author liumapp
 * @file MD5Util.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class MD5Util {
    public final static String MD5Encrpytion(String source) {
	char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	try {
	    byte[] strTemp = source.getBytes();
	    MessageDigest mdTemp = MessageDigest.getInstance("MD5");
	    mdTemp.update(strTemp);
	    byte[] md = mdTemp.digest();
	    int j = md.length;
	    char str[] = new char[j * 2];
	    int k = 0;
	    for (int i = 0; i < j; i++) {
		byte byte0 = md[i];
		str[k++] = hexDigits[byte0 >>> 4 & 0xf];
		str[k++] = hexDigits[byte0 & 0xf];
	    }
	    for (int m = 0; m < str.length; m++) {
		if (str[m] >= 'a' && str[m] <= 'z')
		    str[m] = (char) (str[m] - 32);
	    }
	    return new String(str);
	} catch (Exception e) {
	    return null;
	}

    }
}

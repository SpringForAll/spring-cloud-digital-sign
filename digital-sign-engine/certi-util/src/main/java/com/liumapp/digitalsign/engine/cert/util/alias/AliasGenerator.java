package com.liumapp.digitalsign.engine.cert.util.alias;

import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file AliasGenerator.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/27/18
 * The alias of the certificate is saved on the basis of the serial number of the certificate to 16.
 * the password equals the keystore password .
 */
@Component
public class AliasGenerator {

    public String strTo16 (String serialNumber) {
        String result = "";
        for (int i = 0 ; i < serialNumber.length() ; i ++) {
            int ch = (int) serialNumber.charAt(i);
            String s16 = Integer.toHexString(ch);
            result += s16;
        }
        return result;
    }

}

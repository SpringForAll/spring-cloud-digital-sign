package com.liumapp.cert.core.property;

/**
 * @author liumapp
 * @file KeyStoreStategy.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/11/18
 */
public interface KeyStoreStategy {

    /**
     * set your keystore path params (absolute path)
     * @param keystorePath string
     */
    public void setKeyStore (String keystorePath);

    /**
     * set your keystore negative path
     */
    public void setNegativeKeyStorePath (String keystorePath);

}

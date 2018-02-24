package com.liumapp.digitalsign.keystore.service;

import com.liumapp.digitalsign.keystore.entity.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by liumapp on 11/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class KeyTools {

    private static final Logger LOGGER = Logger.getLogger(KeyTools.class.getName());

    public static KeyStoreAdapter newKeyStore(String password) throws KeyStoreException {
        try {
            return createKeyStoreAdapter(null, password);
        } catch (IOException | NoSuchAlgorithmException | CertificateException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            throw new KeyStoreException(e);
        }
    }

    public static KeyStoreAdapter keyStoreFrom(Resource resource, String password) throws KeyStoreException {
        try (InputStream ksStream = resource.getInputStream()) {
            return createKeyStoreAdapter(ksStream, password);
        } catch (IOException | NoSuchAlgorithmException | CertificateException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            throw new KeyStoreException(e);
        }
    }

    private static KeyStoreAdapter createKeyStoreAdapter(InputStream ksStream, String password) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(ksStream, password.toCharArray());
        return new KeyStoreAdapter(keyStore, password);
    }
}

package com.liumapp.keystore.builder;

import com.liumapp.keystore.builder.CertificateBuilder;
import com.liumapp.keystore.service.KeyStoreAdapter;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/**
 * Created by liumapp on 11/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class KeyPairBuilder {

    private final KeyPairGenerator generator;

    private final KeyStoreAdapter keyStoreAdapter;

    public KeyPairBuilder(String algorithm, KeyStoreAdapter keyStoreAdapter) throws NoSuchAlgorithmException {
        this.keyStoreAdapter = keyStoreAdapter;
        this.generator = KeyPairGenerator.getInstance(algorithm);
    }

    /**
     * Generates a new keypair with default algorithm RSA
     *
     * @param keyStoreAdapter
     * @throws NoSuchAlgorithmException
     */
    public KeyPairBuilder(KeyStoreAdapter keyStoreAdapter) throws NoSuchAlgorithmException {
        this("RSA", keyStoreAdapter);
    }

    public KeyPairBuilder keyLength(int length) {
        this.generator.initialize(length);
        return this;
    }

    public CertificateBuilder generateWithCertificate() {
        return new CertificateBuilder(this.keyStoreAdapter, this.generator.generateKeyPair());
    }
}

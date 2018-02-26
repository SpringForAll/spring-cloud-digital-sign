package com.liumapp.digitalsign.engine.keystore.builder;

import sun.security.x509.X500Name;
import sun.security.x509.X509CertInfo;

import java.io.IOException;
import java.security.cert.CertificateException;

/**
 * Created by liumapp on 11/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class DistinguishNameBuilder {

    private CertificateBuilder certificateBuilder;

    public static final String SEPARATOR = ",";

    private StringBuilder stringBuilder = new StringBuilder(200);

    DistinguishNameBuilder(CertificateBuilder certificateBuilder) {
        this.certificateBuilder = certificateBuilder;
    }

    public DistinguishNameBuilder commonName(String commonName) {
        stringBuilder.append("CN=").append(commonName).append(SEPARATOR);
        return this;
    }

    public DistinguishNameBuilder organizationUnit(String organizationUnit) {
        stringBuilder.append("OU=").append(organizationUnit).append(SEPARATOR);
        return this;
    }

    public DistinguishNameBuilder organizationName(String organizationName) {
        stringBuilder.append("O=").append(organizationName).append(SEPARATOR);
        return this;
    }

    public DistinguishNameBuilder locality(String locality) {
        stringBuilder.append("L=").append(locality).append(SEPARATOR);
        return this;
    }

    public DistinguishNameBuilder state(String state) {
        stringBuilder.append("ST=").append(state).append(SEPARATOR);
        return this;
    }

    public DistinguishNameBuilder country(String country) {
        stringBuilder.append("C=").append(country).append(SEPARATOR);
        return this;
    }

    public DistinguishNameBuilder email(String email) {
        stringBuilder.append("EMAILADDRESS=").append(email).append(SEPARATOR);
        return this;
    }

    public CertificateBuilder build() throws IOException, CertificateException {
        String dn = stringBuilder.toString();
        X500Name owner = new X500Name(dn.substring(0, dn.length() - 1));
        X509CertInfo info = certificateBuilder.getInfo();
        info.set(X509CertInfo.SUBJECT, owner);
        info.set(X509CertInfo.ISSUER, owner);

        return certificateBuilder;
    }

}

package com.liumapp.cert.core.pattern;

/**
 * Created by liumapp on 2/27/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class ExporterPattern {

    private String keyStore;

    private String keyStorePd;

    private String alias;

    private String certPd;

    private String savePath;

    private String fileName;

    public ExporterPattern() {

    }

    public ExporterPattern(String keyStore, String keyStorePd, String alias, String certPd, String savePath, String fileName) {
        this.keyStore = keyStore;
        this.keyStorePd = keyStorePd;
        this.alias = alias;
        this.certPd = certPd;
        this.savePath = savePath;
        this.fileName = fileName;
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }

    public String getKeyStorePd() {
        return keyStorePd;
    }

    public void setKeyStorePd(String keyStorePd) {
        this.keyStorePd = keyStorePd;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCertPd() {
        return certPd;
    }

    public void setCertPd(String certPd) {
        this.certPd = certPd;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}

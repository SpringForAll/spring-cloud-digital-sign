package com.spring4all.digitalsign.service.keystore.pattern;

/**
 * Created by liumapp on 2/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class KeyStorePattern {

    private String keyStoreName;

    private String keyStorePd;

    private Integer keyLength = 2048;

    /**
     * fc: first cert
     *
     * 个人证书：个人姓名
     *
     * 企业证书：企业名称
     *
     * 在生成keystore的时候，需要初始化第一个证书
     */
    private String fcName;

    private String fcProvince;

    private String fcCity;

    private String fcCountry;

    /**
     * 建议与证书名称保持一致
     */
    private String fcAlias;

    private String fcPassword;

    public KeyStorePattern() {
    }

    public KeyStorePattern(String keyStoreName, String keyStorePd, String fcName, String fcProvince, String fcCity, String fcCountry, String fcAlias, String fcPassword) {
        this.keyStoreName = keyStoreName;
        this.keyStorePd = keyStorePd;
        this.fcName = fcName;
        this.fcProvince = fcProvince;
        this.fcCity = fcCity;
        this.fcCountry = fcCountry;
        this.fcAlias = fcAlias;
        this.fcPassword = fcPassword;
    }

    public String getKeyStoreName() {
        return keyStoreName;
    }

    public void setKeyStoreName(String keyStoreName) {
        this.keyStoreName = keyStoreName;
    }

    public String getKeyStorePd() {
        return keyStorePd;
    }

    public void setKeyStorePd(String keyStorePd) {
        this.keyStorePd = keyStorePd;
    }

    public Integer getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }

    public String getFcName() {
        return fcName;
    }

    public void setFcName(String fcName) {
        this.fcName = fcName;
    }

    public String getFcProvince() {
        return fcProvince;
    }

    public void setFcProvince(String fcProvince) {
        this.fcProvince = fcProvince;
    }

    public String getFcCity() {
        return fcCity;
    }

    public void setFcCity(String fcCity) {
        this.fcCity = fcCity;
    }

    public String getFcCountry() {
        return fcCountry;
    }

    public void setFcCountry(String fcCountry) {
        this.fcCountry = fcCountry;
    }

    public String getFcAlias() {
        return fcAlias;
    }

    public void setFcAlias(String fcAlias) {
        this.fcAlias = fcAlias;
    }

    public String getFcPassword() {
        return fcPassword;
    }

    public void setFcPassword(String fcPassword) {
        this.fcPassword = fcPassword;
    }
}

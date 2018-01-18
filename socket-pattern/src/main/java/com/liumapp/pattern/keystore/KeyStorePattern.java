package com.liumapp.pattern.keystore;

import com.liumapp.pattern.encode.EncodingBack;
import com.liumapp.pattern.exception.PatternPropertiesNumberNotEnough;
import com.liumapp.pattern.exception.WrongType;
import com.liumapp.pattern.security.GeneratorPdn;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by liumapp on 11/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class KeyStorePattern  implements GeneratorPdn , EncodingBack {

    private String type = "keyStoreGenerate";

    private String keyStoreName;

    private String generatorPd;

    private String keyStorePd;

    private Integer keyLength;

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

    public String getType() {
        return type;
    }

    public KeyStorePattern() {
    }

    public void setImportant(String keyStoreName, String generatorPd, String keyStorePd, Integer keyLength, String fcName, String fcProvince, String fcCity, String fcCountry, String fcAlias, String fcPassword) {
        this.keyStoreName = keyStoreName;
        this.generatorPd = generatorPd;
        this.keyStorePd = keyStorePd;
        this.keyLength = keyLength;
        this.fcName = fcName;
        this.fcProvince = fcProvince;
        this.fcCity = fcCity;
        this.fcCountry = fcCountry;
        this.fcAlias = fcAlias;
        this.fcPassword = fcPassword;
    }

    /**
     * 为保证alias的唯一性，alias建议使用身份证号码做标识
     * keyStore_generatorPd_liumapp.ks_keyStorePd_2048_country_province_city_alias_certPd_fcName
     * @param line order line
     */
    public static KeyStorePattern parse(String line) throws PatternPropertiesNumberNotEnough , WrongType {
        KeyStorePattern keyStorePattern = new KeyStorePattern();
        String[] items = line.split("[\\s_]+");

        List<String> tmp = Arrays.asList(items);
        LinkedList<String> lists = new LinkedList<String>(tmp);

        if (lists.size() < 11) {
            throw new PatternPropertiesNumberNotEnough();
        }

        if (!lists.pop().equals(keyStorePattern.getType())) {
            throw new WrongType();
        }

        keyStorePattern.setGeneratorPd(lists.pop());
        keyStorePattern.setKeyStoreName(lists.pop());
        keyStorePattern.setKeyStorePd(lists.pop());
        keyStorePattern.setKeyLength(Integer.parseInt(lists.pop()));
        keyStorePattern.setFcCountry(lists.pop());
        keyStorePattern.setFcProvince(lists.pop());
        keyStorePattern.setFcCity(lists.pop());
        keyStorePattern.setFcAlias(lists.pop());
        keyStorePattern.setFcPassword(lists.pop());
        keyStorePattern.setFcName(lists.pop());

        return keyStorePattern;
    }

    @Override
    public String getEncoding () {
        LinkedList<String> lists = new LinkedList<>();
        String result = "";

        lists.add(type);
        lists.add(generatorPd);
        lists.add(keyStoreName);
        lists.add(keyStorePd);
        lists.add(keyLength.toString());
        lists.add(fcCountry);
        lists.add(fcProvince);
        lists.add(fcCity);
        lists.add(fcAlias);
        lists.add(fcPassword);
        lists.add(fcName);

        while(lists.size() > 1) {
            result += lists.pop() + "_";
        }

        result += lists.pop();
        return result;
    }

    /**
     * 检查所有必须参数是否都具备
     * 都具备返回true
     * 否则返回false
     * @return boolean
     */
    @Override
    public boolean chk() {
        return !(type == null ||
                generatorPd == null ||
                keyStoreName == null ||
                keyStorePd == null ||
                keyLength == null ||
                fcCountry == null ||
                fcCity == null ||
                fcAlias == null ||
                fcPassword == null ||
                fcName == null );
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

    @Override
    public String getGeneratorPd() {
        return generatorPd;
    }

    @Override
    public void setGeneratorPd(String generatorPd) {
        this.generatorPd = generatorPd;
    }

}

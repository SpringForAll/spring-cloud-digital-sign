package com.liumapp.digitalsign.test.ca.tianwei.license.require;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author liumapp
 * @file LicenseAbstract.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/26/18
 */
@Service
public abstract class LicenseAbstract implements LicenseInterface {

    @Value("${license}")
    protected String license;

    @Value("${trustCA.caCertPath}")
    protected String caCertPath;

    @Value("${trustCA.checkRevoke}")
    protected String checkRevoke;

    @Value("${trustCA.checkMode}")
    protected String checkMode;

    @Value("${trustCA.savePath}")
    protected String caSavePath;

    @Value("${trustCA.retryPolicy}")
    protected String caRetryPolicy;

    @Value("${trustCA.baseUrl}")
    protected String caBaseUrl;

    @Value("${keyStore.name}")
    protected String ksName;

    @Value("${keyStore.type}")
    protected String ksType;

    @Value("${keyStore.provider}")
    protected String ksProvider;

    @Value("${keyStore.keyStorePath}")
    protected String ksPath;

    @Value("${keyStore.password}")
    protected String ksPassword;

    @Value("${keyStore.enableStore}")
    protected String ksEnableStore;

    @Value("${path}")
    protected String path;

    @Override
    public JSONArray configCa(JSONArray trustCA) throws JSONException {
        Integer timeArray[] = new Integer[3];
        String retryPolicys[] = this.caRetryPolicy.split(",");

        timeArray[0] = Integer.parseInt(retryPolicys[0]);
        timeArray[1] = Integer.parseInt(retryPolicys[1]);
        timeArray[2] = Integer.parseInt(retryPolicys[2]);

        JSONObject rsa = new JSONObject();
        rsa.put("caCertPath", this.caCertPath);
        rsa.put("checkRevoke", checkRevoke);
        rsa.put("checkMode", this.checkMode);
        rsa.put("savePath", this.path + this.ksPath);
        rsa.put("retryPolicy", timeArray);
        rsa.put("baseUrl", this.caBaseUrl);
        trustCA.put(rsa);
        return trustCA;
    }

    @Override
    public JSONObject configKs(JSONObject ks) throws JSONException {
        ks.put("name", this.ksName);
        ks.put("type", this.ksType);
        ks.put("provider", this.ksProvider);
        ks.put("keyStorePath", this.path + this.ksPath);
        ks.put("password", this.ksPassword);
        ks.put("enableStore", "true".equals(this.ksEnableStore));
        return ks;
    }

    @Override
    public String configLicense() {
        return this.license;
    }

}

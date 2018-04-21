package com.spring4all.digitalsign.engine.self.cert.core.license.require;

import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.property.KeyStoreStategy;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import com.spring4all.digitalsign.engine.self.cert.core.property.PropertiesStategy;
import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.property.KeyStoreStategy;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import com.spring4all.digitalsign.engine.self.cert.core.property.PropertiesStategy;
import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.property.KeyStoreStategy;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import com.spring4all.digitalsign.engine.self.cert.core.property.PropertiesStategy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author liumapp
 * @file LicenseAbstract.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/26/18
 */
public abstract class LicenseAbstract implements LicenseInterface , PropertiesStategy, KeyStoreStategy {

    protected String license;

    protected String caCertPath;

    protected String checkRevoke;

    protected String checkMode;

    protected String caSavePath;

    protected String caRetryPolicy;

    protected String caBaseUrl;

    protected String ksName;

    protected String ksType;

    protected String ksProvider;

    protected String ksPath;

    protected String ksPassword;

    protected String ksEnableStore;

    protected String path;

    @Override
    public <T extends Properties> void initProperty (T properties) {
        this.license = properties.getString(SignConstant.license);
        this.caCertPath = properties.getString(SignConstant.trustCA_caCertPath);
        this.checkRevoke = properties.getString(SignConstant.trustCA_checkRevoke);
        this.checkMode = properties.getString(SignConstant.trustCA_checkMode);
        this.caSavePath = properties.getString(SignConstant.trustCA_savePath);
        this.caRetryPolicy = properties.getString(SignConstant.trustCA_retryPolicy);
        this.caBaseUrl = properties.getString(SignConstant.trustCA_baseUrl);
        this.ksType = properties.getString(SignConstant.keyStore_type);
        this.ksProvider = properties.getString(SignConstant.keyStore_provider);
        this.ksPassword = properties.getString(SignConstant.keyStore_password);
        this.ksEnableStore = properties.getString(SignConstant.keyStore_enableStore);
        this.path = properties.getString(SignConstant.path);
    }

    @Override
    public void setKeyStore(String keystorePath) {
        this.ksName = keystorePath;
    }

    @Override
    public void setNegativeKeyStorePath(String keystorePath) {
        this.ksPath = keystorePath;
    }

    @Override
    public JSONArray configCa(JSONArray trustCA) throws JSONException {
        Integer timeArray[] = new Integer[3];
        String retryPolicys[] = this.caRetryPolicy.split(",");

        timeArray[0] = Integer.parseInt(retryPolicys[0]);
        timeArray[1] = Integer.parseInt(retryPolicys[1]);
        timeArray[2] = Integer.parseInt(retryPolicys[2]);

        JSONObject rsa = new JSONObject();
        rsa.put("caCertPath", this.path + this.caCertPath);
        rsa.put("checkRevoke", checkRevoke);
        rsa.put("checkMode", this.checkMode);
        rsa.put("savePath", this.path + this.caSavePath);
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

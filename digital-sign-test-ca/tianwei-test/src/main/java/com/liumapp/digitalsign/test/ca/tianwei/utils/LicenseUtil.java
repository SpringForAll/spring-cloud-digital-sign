package com.liumapp.digitalsign.test.ca.tianwei.utils;

import cn.topca.api.cert.CertApiException;
import cn.topca.api.cert.TCA;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * @author liumapp
 * @file LicenseUtil.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class LicenseUtil {

    private static LicenseUtil licenseUtil = new LicenseUtil();

    private LicenseUtil() {
    }

    public static LicenseUtil getInstance() {
	return licenseUtil;
    }

    private static boolean initialized = false;

    public static void init() throws IOException, CertApiException, JSONException {
	// 初始化不可重复
	if (initialized) {
	    return;
	}
	String filePath = "/conf/license.properties";
	PropertiesUtil propertiesUtil = new PropertiesUtil(filePath);
	Integer timeArray[] = new Integer[3];
	String retryPolicys[] = propertiesUtil.getProperty("trustCA.retryPolicy").split(",");
	timeArray[0] = Integer.parseInt(retryPolicys[0]);
	timeArray[1] = Integer.parseInt(retryPolicys[1]);
	timeArray[2] = Integer.parseInt(retryPolicys[2]);

	boolean checkRevoke = "true".equals(propertiesUtil.getProperty("trustCA.checkRevoke"));
	boolean enableStore = "true".equals(propertiesUtil.getProperty("keyStore.enableStore"));
	
	// String path = LicenseUtil.class.getClassLoader().getResource("/").getPath().substring(1)
	// + "conf/";
	
	String path =propertiesUtil.getProperty("path") ;
	
	String keyStorePath = path + propertiesUtil.getProperty("keyStore.keyStorePath");
	System.out.println(keyStorePath);
	String caCertPath = path + propertiesUtil.getProperty("trustCA.caCertPath");
	String caCertPath1 = path + propertiesUtil.getProperty("trustCA1.caCertPath");
	String savePath = path + propertiesUtil.getProperty("trustCA.savePath");
        
	JSONObject json = new JSONObject();
	JSONArray trustCA = new JSONArray();
	JSONArray keyStore = new JSONArray();
	JSONObject ks = new JSONObject();
	/** 可信CA配置 **/
	JSONObject rsa = new JSONObject();
	rsa.put("caCertPath", caCertPath);
	rsa.put("checkRevoke", checkRevoke);
	rsa.put("checkMode", propertiesUtil.getProperty("trustCA.checkMode"));
	rsa.put("savePath", savePath);
	rsa.put("retryPolicy", timeArray);
	rsa.put("baseUrl", propertiesUtil.getProperty("trustCA.baseUrl"));
	trustCA.put(rsa);
	/** 服务端JKS配置 **/
	ks.put("name", propertiesUtil.getProperty("keyStore.name"));
	ks.put("type", propertiesUtil.getProperty("keyStore.type"));
	ks.put("provider", propertiesUtil.getProperty("keyStore.provider"));
	ks.put("keyStorePath", keyStorePath);
	ks.put("password", propertiesUtil.getProperty("keyStore.password"));
	ks.put("enableStore", enableStore);
	keyStore.put(ks);

	json.put("keyStore", keyStore);
	json.put("trustCA", trustCA);
	/** RSA license **/
	json.put("license", propertiesUtil.getProperty("license"));
	TCA.config(json.toString());
	initialized = true;
    }

    public static void main(String[] args) throws IOException, CertApiException, JSONException {
    	
    	init();
    }
}
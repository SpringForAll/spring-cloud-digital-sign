package com.liumapp.digitalsign.test.ca.tianwei.utils;

import cn.topca.api.cert.CertApiException;
import cn.topca.api.cert.TCA;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author liumapp
 * @file LicenseUtil.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
@Component
public class LicenseUtil {

	@Value("${license}")
	private String license;

	@Value("${trustCA.caCertPath}")
	private String caCertPath;

	@Value("${trustCA.checkRevoke}")
	private String checkRevoke;

	@Value("${trustCA.checkMode}")
	private String checkMode;

	@Value("${trustCA.savePath}")
	private String caSavePath;

	@Value("${trustCA.retryPolicy}")
	private String caRetryPolicy;

	@Value("${trustCA.baseUrl}")
	private String caBaseUrl;

	@Value("${keyStore.name}")
	private String ksName;

	@Value("${keyStore.type}")
	private String ksType;

	@Value("${keyStore.provider}")
	private String ksProvider;

	@Value("${keyStore.keyStorePath}")
	private String ksPath;

	@Value("${keyStore.password}")
	private String ksPassword;

	@Value("${keyStore.enableStore}")
	private String ksEnableStore;

	@Value("${path}")
	private String path;

	private static Logger logger = LoggerFactory.getLogger(LicenseUtil.class);

	private boolean isRegisted = false;

	public void registry () throws JSONException, CertApiException {

		// 不可重复注册
		if (isRegisted) {
			return;
		}

		Integer timeArray[] = new Integer[3];
		String retryPolicys[] = this.caRetryPolicy.split(",");
		timeArray[0] = Integer.parseInt(retryPolicys[0]);
		timeArray[1] = Integer.parseInt(retryPolicys[1]);
		timeArray[2] = Integer.parseInt(retryPolicys[2]);

		boolean checkRevoke = "true".equals(this.checkRevoke);
		boolean enableStore = "true".equals(this.ksEnableStore);

		String keyStorePath = path + ksPath;
		logger.info("ks path is : " + keyStorePath);

		JSONObject json = new JSONObject();
		JSONArray trustCA = new JSONArray();
		JSONArray keyStore = new JSONArray();
		JSONObject ks = new JSONObject();

		/** 可信CA配置 **/
		JSONObject rsa = new JSONObject();
		rsa.put("caCertPath", this.caCertPath);
		rsa.put("checkRevoke", checkRevoke);
		rsa.put("checkMode", this.checkMode);
		rsa.put("savePath", keyStorePath);
		rsa.put("retryPolicy", timeArray);
		rsa.put("baseUrl", this.caBaseUrl);
		trustCA.put(rsa);
		/** 服务端JKS配置 **/
		ks.put("name", this.ksName);
		ks.put("type", this.ksType);
		ks.put("provider", this.ksProvider);
		ks.put("keyStorePath", keyStorePath);
		ks.put("password", this.ksPassword);
		ks.put("enableStore", enableStore);
		keyStore.put(ks);

		json.put("keyStore", keyStore);
		json.put("trustCA", trustCA);
		/** RSA license **/
		json.put("license", this.license);
		TCA.config(json.toString());
		isRegisted = true;
	}

}
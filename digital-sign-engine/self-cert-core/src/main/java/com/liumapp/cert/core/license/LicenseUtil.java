package com.liumapp.cert.core.license;

import cn.topca.api.cert.CertApiException;
import cn.topca.api.cert.TCA;
import com.liumapp.cert.core.license.require.LicenseAbstract;
import com.liumapp.cert.core.property.Properties;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author liumapp
 * @file LicenseUtil.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class LicenseUtil extends LicenseAbstract {

	private static Logger logger = LoggerFactory.getLogger(LicenseUtil.class);

	private boolean isRegisted = false;

	public void registry () throws JSONException, CertApiException {
		// 不可重复注册
		if (isRegisted) {
			return;
		}
		String keyStorePath = path + ksPath;
		logger.info("ks path is : " + keyStorePath);

		JSONObject json = new JSONObject();
		JSONArray trustCA = new JSONArray();
		JSONArray keyStore = new JSONArray();
		JSONObject ks = new JSONObject();

		/** 可信CA配置 **/
		json.put("keyStore", keyStore.put(this.configKs(ks)));

		/** 服务端JKS配置 **/
		json.put("trustCA", this.configCa(trustCA));

		/** RSA license **/
		json.put("license", this.configLicense());

		TCA.config(json.toString());
		isRegisted = true;
	}

}
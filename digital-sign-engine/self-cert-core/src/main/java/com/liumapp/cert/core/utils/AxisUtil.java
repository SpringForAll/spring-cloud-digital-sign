package com.liumapp.cert.core.utils;

import com.liumapp.cert.core.constant.SignConstant;
import com.liumapp.cert.core.property.Properties;
import com.liumapp.cert.core.property.PropertiesStategy;
import com.liumapp.cert.core.proxy.UserAPIServicePortTypeProxy;

/**
 * @author liumapp
 * @file AxisUtil.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class AxisUtil implements PropertiesStategy {

	private String url;

	/**
	 * plz do not use this function
	 * @return proxy
	 */
    public static UserAPIServicePortTypeProxy getProxy() throws Exception {
    	throw new Exception("plz do not use this function");
    }

	/**
	 * plz use this function
	 * @return proxy
	 */
	public UserAPIServicePortTypeProxy getProxyNow () {
		UserAPIServicePortTypeProxy proxy = new UserAPIServicePortTypeProxy();
		proxy.setEndpoint(url);
		return proxy;
	}

	@Override
	public void initProperty(Properties properties) {
		this.url = properties.getString(SignConstant.webservice_url);
	}
}



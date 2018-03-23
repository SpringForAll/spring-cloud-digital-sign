package com.liumapp.digitalsign.test.ca.tianwei.utils;

import com.liumapp.digitalsign.test.ca.tianwei.proxy.UserAPIServicePortTypeProxy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file AxisUtil.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
@Component
public class AxisUtil {

	@Value("${webservice.url}")
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
}



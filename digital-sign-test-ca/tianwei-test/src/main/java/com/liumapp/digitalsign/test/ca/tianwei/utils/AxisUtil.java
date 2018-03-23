package com.liumapp.digitalsign.test.ca.tianwei.utils;

import com.liumapp.digitalsign.test.ca.tianwei.proxy.UserAPIServicePortTypeProxy;

/**
 * @author liumapp
 * @file AxisUtil.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class AxisUtil {
    public static UserAPIServicePortTypeProxy getProxy() {
	String filePath = "/conf/webservices.properties";
	PropertiesUtil webserviceUtil = new PropertiesUtil(filePath);
	String webserviceUrl = webserviceUtil.getProperty("webservice.url");
	UserAPIServicePortTypeProxy proxy = new UserAPIServicePortTypeProxy();
	proxy.setEndpoint(webserviceUrl);
	return proxy;
    }
}



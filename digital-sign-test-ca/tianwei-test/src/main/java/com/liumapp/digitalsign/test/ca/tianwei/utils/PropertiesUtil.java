package com.liumapp.digitalsign.test.ca.tianwei.utils;

import org.apache.commons.configuration.PropertiesConfiguration.PropertiesReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author liumapp
 * @file PropertiesUtil.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class PropertiesUtil {
    static Properties properties;

    public PropertiesUtil(String filePath) {
	properties = new Properties();
	try {
	    properties.load(PropertiesReader.class.getResourceAsStream(filePath));
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public String getProperty(String key) {
	return properties.getProperty(key);
    }

    public void addProperty(String key, String value) {
	properties.put(key, value);
    }
}

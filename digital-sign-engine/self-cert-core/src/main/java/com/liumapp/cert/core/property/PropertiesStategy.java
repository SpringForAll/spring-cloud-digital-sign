package com.liumapp.cert.core.property;

/**
 * @author liumapp
 * @file PropertiesStategy.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public interface PropertiesStategy {

    /**
     * set your params from Property
     * @param properties get content from config files .
     */
    public <T extends Properties> void initProperty (T properties);

}

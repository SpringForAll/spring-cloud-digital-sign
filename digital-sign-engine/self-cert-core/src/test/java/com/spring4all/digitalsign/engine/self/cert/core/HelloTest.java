package com.spring4all.digitalsign.engine.self.cert.core;

import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author liumapp
 * @file HelloTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class HelloTest extends TestCase {

    protected Properties properties;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        properties = new Properties("config/sign.properties");
    }

    @Test
    public void testHello () {
        System.out.println(properties.getString(SignConstant.activeInfo));
    }

}

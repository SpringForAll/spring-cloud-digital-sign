package com.liumapp.cert.core;

import cn.topca.api.cert.CertApiException;
import cn.topca.api.cert.Certificate;
import cn.topca.api.cert.Pkcs7;
import com.liumapp.cert.core.property.Properties;
import com.liumapp.cert.core.utils.AxisUtil;
import com.liumapp.cert.core.cert.CertInfo;
import com.liumapp.cert.core.component.RaService;
import com.liumapp.cert.core.license.LicenseUtil;
import com.liumapp.cert.core.property.Properties;
import com.liumapp.cert.core.user.UserInfo;
import com.liumapp.cert.core.utils.AxisUtil;
import com.liumapp.cert.core.utils.ServerPKCSUtil;
import junit.framework.TestCase;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @author liumapp
 * @file EncryAndDecryTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/9/18
 */
public class EncryAndDecryTest extends TestCase {

    protected Properties properties;

    protected LicenseUtil licenseUtil;

    protected RaService raService;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        properties = new Properties("config/sign.properties");

        licenseUtil = new LicenseUtil();
        licenseUtil.initProperty(properties);
        licenseUtil.setKeyStore("demo.ks");
        licenseUtil.setNegativeKeyStorePath("ks/demo.ks");

        AxisUtil axisUtil = new AxisUtil();
        axisUtil.initProperty(properties);

        raService = new RaService(axisUtil);
        raService.initProperty(properties);
    }

    @Ignore
    @Test
    public void testEncryAndDecry () {

    }

}

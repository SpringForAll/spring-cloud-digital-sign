package com.spring4all.digitalsign.engine.self.cert.core;

import cn.topca.api.cert.CertApiException;
import cn.topca.api.cert.CertStore;
import cn.topca.api.cert.TCA;
import com.spring4all.digitalsign.engine.self.cert.core.cert.CertInfo;
import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import com.spring4all.digitalsign.engine.self.cert.core.utils.AxisUtil;
import com.spring4all.digitalsign.engine.self.cert.core.utils.PfxUtil;
import com.spring4all.digitalsign.engine.self.cert.core.utils.ServerPKCSUtil;
import com.spring4all.digitalsign.engine.self.cert.core.cert.CertInfo;
import com.spring4all.digitalsign.engine.self.cert.core.component.RaService;
import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.license.LicenseUtil;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import com.spring4all.digitalsign.engine.self.cert.core.user.UserInfo;
import com.spring4all.digitalsign.engine.self.cert.core.utils.AxisUtil;
import com.spring4all.digitalsign.engine.self.cert.core.utils.PfxUtil;
import com.spring4all.digitalsign.engine.self.cert.core.utils.ServerPKCSUtil;
import com.spring4all.digitalsign.engine.self.cert.core.cert.CertInfo;
import com.spring4all.digitalsign.engine.self.cert.core.component.RaService;
import com.spring4all.digitalsign.engine.self.cert.core.constant.SignConstant;
import com.spring4all.digitalsign.engine.self.cert.core.license.LicenseUtil;
import com.spring4all.digitalsign.engine.self.cert.core.property.Properties;
import com.spring4all.digitalsign.engine.self.cert.core.user.UserInfo;
import com.spring4all.digitalsign.engine.self.cert.core.utils.AxisUtil;
import com.spring4all.digitalsign.engine.self.cert.core.utils.PfxUtil;
import com.spring4all.digitalsign.engine.self.cert.core.utils.ServerPKCSUtil;
import junit.framework.TestCase;
import org.bouncycastle.util.encoders.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import java.io.*;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Enumeration;

/**
 * @author liumapp
 * @file TWCertTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class TWCertTest extends TestCase {

    protected Properties properties;

    protected LicenseUtil licenseUtil;

    protected RaService raService;

    @Override
    protected void setUp() throws Exception {
        properties = new Properties("config/sign.properties");

        AxisUtil axisUtil = new AxisUtil();
        axisUtil.initProperty(properties);

        raService = new RaService(axisUtil);
        raService.initProperty(properties);

        licenseUtil = new LicenseUtil();
        licenseUtil.initProperty(properties);
        licenseUtil.setKeyStore("demo.ks");
        licenseUtil.setNegativeKeyStorePath("ks/demo.ks");

        super.setUp();
    }

    /**
     * generate a pfx certificate
     */
    @Test
    public void testGeneratePfxCert () throws JSONException, FileNotFoundException {
        String userName = "测试公司";
        String userEmail = "test@szitrus.com.cn";
        String userAdditionalField1 = "测试公司";

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName); // 证书名称
        userInfo.setUserEmail(userEmail); // 证书所有者Email
        userInfo.setUserAdditionalField1(userAdditionalField1); // 扩展字段1

        /** 产生CSR(证书请求 即 p10) **/
        ServerPKCSUtil serverPKCSUtil = new ServerPKCSUtil();
        String certReqBuf = serverPKCSUtil.genCsr("RSA");

        /** 调用接口制作证书 **/
        String passCode = "";
        Integer certValidity = 0;// 不设置证书有效期，默认读取services.properties的属性值
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject = raService.enrollCertAA(userInfo, certReqBuf, passCode, certValidity);
            CertInfo certInfo = new CertInfo();
            if (jsonObject.get("certInfo") != null) {
                certInfo = (CertInfo) jsonObject.get("certInfo");
                System.out.println("证书base64"+certInfo.getCertSignBuf());
            }
            String certSignBufP7 = certInfo.getCertSignBuf();// 公钥证书
            String password = "123123"; // 证书密码
            System.out.println("当前申请的证书序列号是：[" + certInfo.getCertSerialNumber() + "]");

            /** 数字证书转换为pkcs12 格式 **/
            String pkcs12Cert = serverPKCSUtil.genP12(password, certSignBufP7);
            System.out.println(pkcs12Cert);
            /** 将pkcs12 格式证书写到pfx文件中 **/
            String pfxPath = properties.getString(SignConstant.cert_PfxSavePath) + certInfo.getCertSerialNumber() + ".pfx";
            FileOutputStream fileOutputStream = new FileOutputStream(new File(pfxPath));
            fileOutputStream.write(Base64.decode(pkcs12Cert));
            fileOutputStream.close();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * generate a pfx certificate and install into JKS
     */
    @Ignore
    @Test
    public void testInstallCertToJKS () {
        String userName = "test_ca_002";
        String userEmail = "test@szitrus.com.cn";

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName); // 证书名称
        userInfo.setUserEmail(userEmail); // 证书所有者Email

        /** 调用接口制作证书 **/
        String passCode = "";
        Integer certValidity = 0;// 不设置证书有效期，默认读取services.properties的属性值
        JSONObject jsonObject = new JSONObject();
        try {
            licenseUtil.registry();

            /** 产生CSR(证书请求 即 p10) **/
            String certReqBuf = "";
            String csrType = "RSA2048";
            String keystore = "demo.ks";// keystore的alias名称
            if (csrType.equalsIgnoreCase("RSA1024")) {
                certReqBuf = CertStore.byName(keystore).genCsr(TCA.RSA1024).toBase64();
            } else if (csrType.equalsIgnoreCase("RSA2048")) {
                certReqBuf = CertStore.byName(keystore).genCsr(TCA.RSA2048).toBase64();
            } else {
                certReqBuf = CertStore.byName(keystore).genCsr(TCA.SM2).toBase64();
            }
            jsonObject = raService.enrollCertAA(userInfo, certReqBuf, passCode, certValidity);
            CertInfo certInfo = new CertInfo();
            if (jsonObject.get("certInfo") != null) {
                certInfo = (CertInfo) jsonObject.get("certInfo");
            }

            CertStore.installCert(certInfo.getCertSignBuf());// 安装证书

            System.out.println("当前申请的证书序列号是：[" + certInfo.getCertSerialNumber() + "]");
            System.out.println("当前存入JKS的证书别名为:["+ certInfo.getCertSerialnumberKmc() +"]");

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (CertApiException e) {
            e.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void testPfxToJKS () throws UnrecoverableKeyException, CertificateException, NoSuchAlgorithmException, KeyStoreException {
        PfxUtil pfxUtil = new PfxUtil();
        pfxUtil.Pfx2OldJKS(properties.getString(SignConstant.cert_PfxSavePath) + "19643137D8482943FBDD94075CD4302EDD5B0908.pfx",
                "123123",
                properties.getString(SignConstant.save_KeyStorePath) + "demo2.ks",
                "123456",null);
    }


}

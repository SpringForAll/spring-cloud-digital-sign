package com.liumapp.digitalsign.test.ca.tianwei.controller;

import cn.topca.api.cert.CertApiException;
import cn.topca.api.cert.CertStore;
import cn.topca.api.cert.TCA;
import com.liumapp.digitalsign.test.ca.tianwei.cert.CertInfo;
import com.liumapp.digitalsign.test.ca.tianwei.component.RaService;
import com.liumapp.digitalsign.test.ca.tianwei.user.UserInfo;
import com.liumapp.digitalsign.test.ca.tianwei.license.LicenseUtil;
import com.liumapp.digitalsign.test.ca.tianwei.utils.ServerPKCSUtil;
import org.bouncycastle.util.encoders.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author liumapp
 * @file Certificate.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
@RestController
@RequestMapping("cert")
public class Certificate {

    @Value("${custome.savepath}")
    private String savePath;

    @Autowired
    private RaService raService;

    @Autowired
    private LicenseUtil licenseUtil;

    /**
     * 直接生成pfx证书文件
     * @return
     */
    @RequestMapping("/")
    public String begin () {
        /** 服务端生成证书,并保存成Pfx文件格式 **/
        String userName = "测试公司";
        String userEmail = "test@szitrus.com.cn";
        /** 扩展字段是针对证书做扩展，即在证书的属性内增加如下内容，详细请联系天威诚信技术做解答 **/
        String userAdditionalField1 = "测试公司";
        // String userAdditionalField2 = "";
        // String userAdditionalField3 = "";
        // String userAdditionalField4 = "";
        // String userAdditionalField5 = "";
        // String userAdditionalField6 = "";
        // String userAdditionalField7 = "";
        // String userAdditionalField8 = "";
        // String userAdditionalField9 = "";
        // String userAdditionalField10 = "";

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName); // 证书名称
        userInfo.setUserEmail(userEmail); // 证书所有者Email
        userInfo.setUserAdditionalField1(userAdditionalField1); // 扩展字段1
        // userInfo.setUserAdditionalField2(userAdditionalField2); // 扩展字段2
        // userInfo.setUserAdditionalField3(userAdditionalField3); // 扩展字段3
        // userInfo.setUserAdditionalField4(userAdditionalField4); // 扩展字段4
        // userInfo.setUserAdditionalField5(userAdditionalField5); // 扩展字段5
        // userInfo.setUserAdditionalField6(userAdditionalField6); // 扩展字段6
        // userInfo.setUserAdditionalField7(userAdditionalField7); // 扩展字段7
        // userInfo.setUserAdditionalField8(userAdditionalField8); // 扩展字段8
        // userInfo.setUserAdditionalField9(userAdditionalField9); // 扩展字段9
        // userInfo.setUserAdditionalField10(userAdditionalField10);// 扩展字段10

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
            String password = "password"; // 证书密码
            System.out.println("当前申请的证书序列号是：[" + certInfo.getCertSerialNumber() + "]");
            /** 数字证书转换为pkcs12 格式 **/
            String pkcs12Cert = serverPKCSUtil.genP12(password, certSignBufP7);
            System.out.println(pkcs12Cert);
            /** 将pkcs12 格式证书写到pfx文件中 **/
            String pfxPath = savePath + certInfo.getCertSerialNumber() + ".pfx";
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
        return "success";
    }

    @RequestMapping("/jks")
    public String installIntoJKS () {
        /** 服务端生成证书,并保存成Pfx文件格式 **/
        String userName = "test_ca_002";
        String userEmail = "test@szitrus.com.cn";
        /** 扩展字段是针对证书做扩展，即在证书的属性内增加如下内容，详细请联系天威诚信技术做解答 **/
        // String userAdditionalField1 = "";
        // String userAdditionalField2 = "";
        // String userAdditionalField3 = "";
        // String userAdditionalField4 = "";
        // String userAdditionalField5 = "";
        // String userAdditionalField6 = "";
        // String userAdditionalField7 = "";
        // String userAdditionalField8 = "";
        // String userAdditionalField9 = "";
        // String userAdditionalField10 = "";

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName); // 证书名称
        userInfo.setUserEmail(userEmail); // 证书所有者Email
        // userInfo.setUserAdditionalField1(userAdditionalField1); // 扩展字段1
        // userInfo.setUserAdditionalField2(userAdditionalField2); // 扩展字段2
        // userInfo.setUserAdditionalField3(userAdditionalField3); // 扩展字段3
        // userInfo.setUserAdditionalField4(userAdditionalField4); // 扩展字段4
        // userInfo.setUserAdditionalField5(userAdditionalField5); // 扩展字段5
        // userInfo.setUserAdditionalField6(userAdditionalField6); // 扩展字段6
        // userInfo.setUserAdditionalField7(userAdditionalField7); // 扩展字段7
        // userInfo.setUserAdditionalField8(userAdditionalField8); // 扩展字段8
        // userInfo.setUserAdditionalField9(userAdditionalField9); // 扩展字段9
        // userInfo.setUserAdditionalField10(userAdditionalField10); // 扩展字段10

        /** 调用接口制作证书 **/
        String passCode = "";
        Integer certValidity = 0;// 不设置证书有效期，默认读取services.properties的属性值
        JSONObject jsonObject = new JSONObject();
        try {
            licenseUtil.registry();

            /** 产生CSR(证书请求 即 p10) **/
            String certReqBuf = "";
            String csrType = "RSA1024";
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

        return "success";
    }




}


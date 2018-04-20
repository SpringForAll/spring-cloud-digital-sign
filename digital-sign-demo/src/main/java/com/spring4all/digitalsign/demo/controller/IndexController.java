package com.spring4all.digitalsign.demo.controller;

import com.spring4all.digitalsign.demo.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by liumapp on 3/1/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("demo")
public class IndexController {

    @Autowired
    private HttpClientUtils httpClientUtils;

    @Value("${certificateExportPath}")
    private String certificateExportPath;

    /**
     * generate keystore
     * you need generate at least one certificate
     * @return String
     */
    @RequestMapping("/ks")
    public String generateKeyStore () {
        try {
            HashMap<String , Object> urlParameters = new HashMap<String , Object>();
            urlParameters.put("keyStoreName" , "demo.ks");
            urlParameters.put("keyStorePd" , "123456");
            urlParameters.put("fcName" , "zhangsan");
            urlParameters.put("fcProvince" , "ZheJiang");
            urlParameters.put("fcCity" , "Hangzhou");
            urlParameters.put("fcCountry" , "China");
            urlParameters.put("fcAlias" , "demo-certificate");
            urlParameters.put("fcPassword" , "123123");
            BufferedReader reader = httpClientUtils.post("http://localhost:2333/keystore-worker/keystore/first-generate", urlParameters);
            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * plz make sure you had generated keystore before
     * generate certificate
     * @return String
     */
    @RequestMapping("/generateCert")
    public String generateCertificate () {
        try {
            HashMap<String , Object> urlParameters = new HashMap<String , Object>();
            urlParameters.put("alias" , "demo-a");
            urlParameters.put("certPassword" , "123123123");
            urlParameters.put("keystore" , "demo.ks");//the keystore coming from generateKeyStore
            urlParameters.put("storepass" , "123456");//use the password of keystore
            urlParameters.put("province" , "ZheJiang");
            urlParameters.put("city" , "Hangzhou");
            urlParameters.put("country" , "China");
            urlParameters.put("name" , "lisi");
            BufferedReader reader = httpClientUtils.post("http://localhost:2333/keystore-worker/certificate/generate" , urlParameters);
            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * export certificate
     * if you want export demo certificate
     * plz make sure you had keystore & certificate in it .
     * if you want export demo-a certificate
     * plz make sure you had run generateCert before .
     * @return String
     */
    @RequestMapping("/exportCert")
    public String exportCertificate () {
        try {
            HashMap<String , Object> urlParameters = new HashMap<String , Object>();
            urlParameters.put("keyStore" , "demo.ks");//the keystore coming from generateKeyStore
            urlParameters.put("keyStorePd" , "123456");
            urlParameters.put("alias" , "demo-a");//alias coming from generateCertificate
            urlParameters.put("certPd" , "123123123");//cert password coming form generateCertificate
            urlParameters.put("savePath" , certificateExportPath);
            urlParameters.put("fileName" , "demo-a.cert");
            BufferedReader reader = httpClientUtils.post("http://localhost:2333/keystore-worker/certificate/export" , urlParameters);
            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * todo
     * add signature area in pdf file.
     * @return String
     */
    public String addSigatureArea () {
        
        return "success";
    }

    /**
     * todo
     * sign certificate in pdf file.
     * @return String
     */
    public String sign () {
        return "success";
    }

}

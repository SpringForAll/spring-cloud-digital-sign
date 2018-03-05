package com.liumapp.digitalsign.demo.controller;

import com.liumapp.digitalsign.demo.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
     * todo
     * plz make sure you had generated keystore before
     * generate certificate
     * @return String
     */
    public String generateCertificate () {
        try {
            HashMap<String , Object> urlParameters = new HashMap<String , Object>();
            urlParameters.put("alias" , "demo-a");
            
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
     * todo
     * export certificate
     * @return String
     */
    public String exportCertificate () {
        return "success";
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

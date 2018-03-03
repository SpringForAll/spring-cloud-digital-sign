package com.liumapp.digitalsign.demo.controller;

import com.liumapp.digitalsign.demo.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * todo
     * generate keystore
     * @return String
     */
    @RequestMapping("/ks")
    public String generateKeyStore () {
        return "success";
    }

    /**
     * todo
     * generate certificate
     * @return String
     */
    public String generateCertificate () {
        return "success";
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

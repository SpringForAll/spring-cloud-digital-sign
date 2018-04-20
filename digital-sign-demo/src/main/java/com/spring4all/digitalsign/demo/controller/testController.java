package com.spring4all.digitalsign.demo.controller;

import com.spring4all.digitalsign.demo.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by liumapp on 3/14/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("test")
public class testController {

    @Autowired
    private HttpClientUtils httpClientUtils;

    /**
     * say hello
     * to make sure the server's state is under running.
     * @return String
     */
    @RequestMapping("/keystore")
    public String testKeyStore () {
        try {
            BufferedReader reader = httpClientUtils.post("http://localhost:2333/keystore-worker/keystore/hello" , new HashMap<>());
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

    @RequestMapping("/hello")
    public String hello () {
        return "hello , this is " + testController.class;
    }

}

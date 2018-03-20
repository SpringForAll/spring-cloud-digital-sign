package com.liumapp.digitalsign.service.keystore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file TestController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/20/18
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("/hello")
    public String hello () {
        return "hello , this is " + TestController.class;
    }

}

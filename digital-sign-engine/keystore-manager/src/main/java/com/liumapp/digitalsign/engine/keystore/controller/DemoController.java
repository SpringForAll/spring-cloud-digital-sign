package com.liumapp.digitalsign.engine.keystore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 2/26/18 10:42 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("")
    public String index () {
        return "hello , this is keystore manager demo .";
    }

}

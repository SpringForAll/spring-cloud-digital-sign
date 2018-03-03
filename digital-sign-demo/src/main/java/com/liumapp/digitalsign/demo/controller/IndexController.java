package com.liumapp.digitalsign.demo.controller;

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

//    private String

    @RequestMapping("/hello")
    public String idnex () {
        return "success";
    }

}

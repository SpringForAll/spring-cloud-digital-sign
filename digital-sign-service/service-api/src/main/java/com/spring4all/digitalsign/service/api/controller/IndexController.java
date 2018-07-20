package com.spring4all.digitalsign.service.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liumapp
 * @file IndexController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/20/18
 */
@RequestMapping("/")
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index () {
        return "index";
    }

}

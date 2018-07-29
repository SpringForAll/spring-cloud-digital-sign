package com.spring4all.digitalsign.service.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file JksController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 2018/7/29
 */
@RestController
@RequestMapping("jks")
public class JksController {

    public String createJks () {

        return "success";
    }

}

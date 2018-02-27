package com.liumapp.digitalsign.service.signature.controller;

import com.liumapp.digitalsign.engine.signature.helper.autowired.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * build signature area in pdf files .
 * Created by liumapp on 2/27/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("builder")
public class BuilderController {

    @Autowired
    private FileUtil fileUtil;

    

}

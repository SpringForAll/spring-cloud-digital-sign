package com.spring4all.digitalsign.service.api.controller;

import com.alibaba.fastjson.JSON;
import com.spring4all.digitalsign.service.api.entity.DocEntity;
import com.spring4all.digitalsign.service.api.queue.pattern.DocPattern;
import com.spring4all.digitalsign.service.api.queue.publisher.service.DocPublisherService;
import com.spring4all.digitalsign.service.api.util.FileManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author liumapp
 * @file FileUploadController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/20/18
 */
@RestController
@RequestMapping("upload")
public class FileUploadController {

    @Autowired
    private FileManager fileManager;

    @Autowired
    private DocPublisherService docPublisherService;

    @Autowired
    private DocPattern docPattern;

    @RequestMapping("/")
    public String upload (@RequestParam("file") MultipartFile file) throws IOException {
        fileManager.save(file);
        return JSON.toJSONString("success");
    }

    @RequestMapping("/base64")
    public String base64Upload (@RequestBody DocEntity docEntity) {
        try {
            MultipartFile file = fileManager.base64toMultipart(docEntity.getBase64File());
            fileManager.save(file);
        } catch (IOException e) {
            e.printStackTrace();
            return JSON.toJSONString("save file failed");
        }
        return JSON.toJSONString("success");
    }


}

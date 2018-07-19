package com.spring4all.digitalsign.service.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liumapp
 * @file ApiMain.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/19/18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiMain {

    public static void main(String[] args) {
        SpringApplication.run(ApiMain.class , args);
    }

}

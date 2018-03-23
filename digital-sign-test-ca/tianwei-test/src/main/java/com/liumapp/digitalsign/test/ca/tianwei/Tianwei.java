package com.liumapp.digitalsign.test.ca.tianwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liumapp
 * @file DemoApiA.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/21/18
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Tianwei {

    public static void main(String[] args) {
        SpringApplication.run(Tianwei.class , args);
    }

}

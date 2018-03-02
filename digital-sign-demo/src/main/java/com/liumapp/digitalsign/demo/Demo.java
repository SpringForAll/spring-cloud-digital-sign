package com.liumapp.digitalsign.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liumapp on 3/1/18 5:24 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Demo {

    public static void main(String[] args) {
        SpringApplication.run(Demo.class , args);
    }

}

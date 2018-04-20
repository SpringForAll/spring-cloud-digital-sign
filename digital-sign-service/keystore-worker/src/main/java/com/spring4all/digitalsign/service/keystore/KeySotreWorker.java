package com.spring4all.digitalsign.service.keystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liumapp on 2/26/18 3:37 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class KeySotreWorker {

    public static void main(String[] args) {
        SpringApplication.run(KeySotreWorker.class , args);
    }

}

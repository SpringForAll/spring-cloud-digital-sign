package com.liumapp.digitalsign.engine.keystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liumapp on 2/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.liuampp.digitalsign.engine.keystore"})
public class KeyStore {

    public static void main (String[] args) {
        SpringApplication.run(KeyStore.class , args);
    }

}

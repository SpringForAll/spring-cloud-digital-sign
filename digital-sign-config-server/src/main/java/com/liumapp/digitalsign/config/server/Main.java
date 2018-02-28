package com.liumapp.digitalsign.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class , args);
    }

}

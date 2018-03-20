package com.liumapp.digitalsign.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by liumapp on 2/24/18 5:22 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableZuulProxy
@SpringCloudApplication
public class Gateway {

    public static void main(String[] args) {
        SpringApplication.run(Gateway.class , args);
    }

}

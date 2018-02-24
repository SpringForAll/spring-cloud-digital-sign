package com.liumapp.auth.zuul.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by liumapp on 2/6/18 10:43 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableZuulProxy
@SpringCloudApplication()
@MapperScan("com.liumapp.auth.zuul.gateway.mapper")
public class Gateway {

    public static void main(String[] args) {
        SpringApplication.run(Gateway.class , args);
    }

}

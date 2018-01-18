package com.liumapp.ali.oss.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
public class OssConfig {

    @Bean
    @ConfigurationProperties(prefix = "liumapp.ali.oss")
    public Account account () {
        Account account = new Account();
        return account;
    }

}

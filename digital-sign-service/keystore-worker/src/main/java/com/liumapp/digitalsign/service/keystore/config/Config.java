package com.liumapp.digitalsign.service.keystore.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liumapp on 2/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
public class Config {

    @Bean
    @ConfigurationProperties(prefix = "liumapp.digitalsign.service.keystore")
    public Params params () {
        return new Params();
    }

}

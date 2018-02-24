package com.liumapp.digitalsign.gateway.config;

import com.liumapp.digitalsign.gateway.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liumapp on 2/6/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
public class GatewayConf {

    @Bean
    public AccessFilter accessFilter () {
        return new AccessFilter();
    }

}

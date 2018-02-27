package com.liumapp.digitalsign.service.signature.config;

import com.liumapp.digitalsign.engine.signature.helper.autowired.utils.FileUtil;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liumapp on 2/27/18 2:53 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
public class Config {

    @Bean
    @ConfigurationProperties(prefix = "liumapp.digitalsign.service.signature")
    public Params params () {
        return new Params();
    }

    @Bean
    public FileUtil fileUtil () {
        return new FileUtil();
    }

}

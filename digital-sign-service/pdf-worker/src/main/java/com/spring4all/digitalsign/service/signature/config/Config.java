package com.spring4all.digitalsign.service.signature.config;

import com.liumapp.digitalsign.engine.signature.helper.autowired.utils.FileUtil;
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
    public FileUtil fileUtil () {
        return new FileUtil();
    }

}

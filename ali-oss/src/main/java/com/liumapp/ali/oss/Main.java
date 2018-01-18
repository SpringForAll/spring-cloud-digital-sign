package com.liumapp.ali.oss;

import com.liumapp.ali.oss.config.OssConfig;
import com.liumapp.ali.oss.utils.OssUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
@Import({OssConfig.class})
public class Main {

    @Bean
    public OssUtil ossUtil () {
        return new OssUtil();
    }

}

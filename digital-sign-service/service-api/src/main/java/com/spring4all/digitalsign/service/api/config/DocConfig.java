package com.spring4all.digitalsign.service.api.config;

import com.liumapp.convert.doc.Doc2PDF;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liumapp
 * @file DocConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/20/18
 */
@Configuration
public class DocConfig {

    @Bean
    public Doc2PDF doc2PDF () {
        return new Doc2PDF();
    }

    public static class ConvertStatus {
        public static Integer WAITING_CONVERT = 0;

        public static Integer CONVERTED_FAILD = 2;

        public static Integer CONVERTED_SUCCESS = 1;
    }

}

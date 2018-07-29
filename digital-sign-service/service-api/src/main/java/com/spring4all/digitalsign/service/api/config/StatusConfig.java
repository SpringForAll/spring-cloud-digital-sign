package com.spring4all.digitalsign.service.api.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author liumapp
 * @file StatusConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 2018/7/29
 */
@Configuration
public class StatusConfig {

    public static class ConvertStatus {
        public static Integer WAITING_CONVERT = 0;

        public static Integer CONVERTED_FAILD = 2;

        public static Integer CONVERTED_SUCCESS = 1;
    }

}

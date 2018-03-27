package com.liumapp.digitalsign.engine.cert.util;

import com.liumapp.digitalsign.engine.cert.util.alias.AliasGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liumapp
 * @file Main.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/27/18
 */
@Configuration
public class CertUtil {

    @Bean
    public AliasGenerator aliasGenerator () {
        return new AliasGenerator();
    }

}

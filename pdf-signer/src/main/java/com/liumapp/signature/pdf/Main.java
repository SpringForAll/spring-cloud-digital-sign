package com.liumapp.signature.pdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@SpringBootApplication(scanBasePackages = {"com.liumapp.signature"})
@Import({com.liumapp.ali.oss.Main.class})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class , args);
    }

}

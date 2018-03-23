package com.liumapp.digitalsign.test.ca.tianwei.component;

import com.liumapp.digitalsign.test.ca.tianwei.code.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file RaService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
@Component
public class RaService {

    @Autowired
    private ErrorCode errorCode;

    @Value("${cert.isKMC}")
    private String CERT_ISKMC;

    @Value("${cert.enroll.model}")
    private String CERT_ENROLL_MODEL;

    @Value("${cert.renew.model}")
    private String CERT_RENEW_MODEL;

    @Value("${ra.accountHash}")
    private String ACCOUNT_HASH;

    @Value("${cert.aapassword}")
    private String CERT_REQ_CHALLENGE;

    @Value("${cert.validity}")
    private Integer CERT_VALIDITY = 365;

    public String enrollCert () {



        return "success";
    }
}

package com.liumapp.cert.core.keystore.entity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by liumapp on 11/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class Resource {

    public static final String CLASSPATH_PREFIX = "classpath:";

    private String ref;

    private Resource(String ref) {
        this.ref = ref;
    }

    public static Resource from(String ref) {
        return new Resource(ref);
    }

    public InputStream getInputStream() throws FileNotFoundException {
        if (ref.startsWith(CLASSPATH_PREFIX)) {
            String classPathResource = ref.replace("classpath:", "");
            return this.getClass().getClassLoader().getResourceAsStream(classPathResource);
        } else {
            return new FileInputStream(ref);
        }
    }

}

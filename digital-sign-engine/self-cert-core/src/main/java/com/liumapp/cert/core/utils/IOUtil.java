package com.liumapp.cert.core.utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @file IOUtil.java
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class IOUtil {
    public static InputStream getInputStream(String path) throws IOException {
        // 从Resource路径获取
        InputStream inputStream = IOUtil.class.getClassLoader().getResourceAsStream(path);
        if (inputStream == null) {
            // 从文件路径获取
            inputStream = new FileInputStream(path);
        }

        return inputStream;
    }
}
package com.spring4all.digitalsign.demo.utils;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;

/**
 * Created by liumapp on 3/3/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class HttpClientUtils {

    private static Logger logger = LoggerFactory.getLogger(HttpClientUtils.class);

    @Value("${custom.UserAgent}")
    private String userAgent;

    @Value("${custom.ContentType}")
    private String type;

    public BufferedReader post (String url , HashMap<String , Object> urlParameters) throws IOException {

        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("User-Agent", userAgent);
        post.setHeader("Content-Type" , type);

        String jsonString = "";
        if (urlParameters != null)
            jsonString = JSON.toJSONString(urlParameters);

        StringEntity stringEntity = new StringEntity(jsonString , Charset.forName("utf-8"));
        post.setEntity(stringEntity);

        HttpResponse response = client.execute(post);

        logger.info("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        return rd;
    }

}

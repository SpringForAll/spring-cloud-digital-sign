package com.liumapp.ali.oss.utils;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.GetObjectRequest;
import com.liumapp.ali.oss.config.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by liumapp on 11/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class OssUtil {

    @Autowired
    private Account account;

    private OSSClient ossClient = null;

    private void connect() {
        ossClient = new OSSClient(account.getEndPoint() , account.getAccessKeyId() , account.getAccessKeySecret());
    }

    /**
     *
     * OssUtil ossUtil = new OssUtil();
     * ossUtil.uploadFile("test/test2.docx" , new File("./data/test0.docx"));
     * @param key key
     * @param file file
     */
    public void uploadFile(String key , File file) {
        if (ossClient == null) {
            connect();
        }
        try {
            ossClient.putObject(account.getBucket() , key , file);
        } catch (ClientException e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
            ossClient = null;
        }
    }

    /**
     * 流上传到OSS
     * @param key 路径
     * @param inputStream  文件流
     */
    public void uploadFile(String key , InputStream inputStream) {
        if (ossClient == null) {
            connect();
        }
        try {
            ossClient.putObject(account.getBucket() , key , inputStream);
        } catch (ClientException e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
            ossClient = null;
        }
    }

    /**
     * 字节码上传到OSS
     * @param key 路径
     * @param bytes  byte数组
     */
    public void uploadFile(String key , byte[] bytes) {
        if (ossClient == null) {
            connect();
        }
        try {
            ossClient.putObject(account.getBucket() , key , new ByteArrayInputStream(bytes));
        } catch (ClientException e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
            ossClient = null;
        }
    }

    /**
     * OssUtil ossUtil = new OssUtil();
     ossUtil.uploadFile(map);
     * @param map key:oss的key    value:上传的文件对象
     */
    public void uploadManyFile(Map<String,File> map) {
        if (ossClient == null) {
            connect();
        }
        try {
            for (String key :map.keySet()) {
                ossClient.putObject(account.getBucket() , key , map.get(key));
            }
        } catch (ClientException e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
            ossClient = null;
        }
    }

    /**
     *
     * OssUtil ossUtil = new OssUtil();
     * ossUtil.downloadFile("test/test0.docx" , new File("./data/download.docx"));
     * @param key key
     * @param file file
     */
    public void downloadFile(String key , File file) {
        if (ossClient == null) {
            connect();
        }
        try {
            ossClient.getObject(new GetObjectRequest(account.getBucket() , key) , file);
        } catch (ClientException e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
            ossClient = null;
        }
    }

    /**
     * OssUtil oss = new OssUtil();
     * oss.deleteFile("sign/contract1510393411552.jpg");
     * @param key key
     */
    public void deleteFile(String key) {
        if (ossClient == null) {
            connect();
        }
        try {
            ossClient.deleteObject(account.getBucket(), key);
        } catch (ClientException e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
            ossClient = null;
        }
    }

}

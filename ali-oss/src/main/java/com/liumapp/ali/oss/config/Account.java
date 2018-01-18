package com.liumapp.ali.oss.config;

import org.springframework.stereotype.Component;

/**
 * Created by liumapp on 11/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class Account {

    private String AccessKeyId ;

    private String AccessKeySecret ;

    private String AccessBaseUrl ;

    private String EndPoint ;

    private  String url ;

    private String Bucket ;

    private int Expires ;

    private boolean UseAlias = false;

    private String FileUrl ;

    private String ImageUrl ;

    private String FileAliasUrl ;

    private String ImageAliasUrl ;

    public String getAccessKeyId() {
        return AccessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        AccessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return AccessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        AccessKeySecret = accessKeySecret;
    }

    public String getAccessBaseUrl() {
        return AccessBaseUrl;
    }

    public void setAccessBaseUrl(String accessBaseUrl) {
        AccessBaseUrl = accessBaseUrl;
    }

    public String getEndPoint() {
        return EndPoint;
    }

    public void setEndPoint(String endPoint) {
        EndPoint = endPoint;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBucket() {
        return Bucket;
    }

    public void setBucket(String bucket) {
        Bucket = bucket;
    }

    public int getExpires() {
        return Expires;
    }

    public void setExpires(int expires) {
        Expires = expires;
    }

    public boolean isUseAlias() {
        return UseAlias;
    }

    public void setUseAlias(boolean useAlias) {
        UseAlias = useAlias;
    }

    public String getFileUrl() {
        return FileUrl;
    }

    public void setFileUrl(String fileUrl) {
        FileUrl = fileUrl;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getFileAliasUrl() {
        return FileAliasUrl;
    }

    public void setFileAliasUrl(String fileAliasUrl) {
        FileAliasUrl = fileAliasUrl;
    }

    public String getImageAliasUrl() {
        return ImageAliasUrl;
    }

    public void setImageAliasUrl(String imageAliasUrl) {
        ImageAliasUrl = imageAliasUrl;
    }
}

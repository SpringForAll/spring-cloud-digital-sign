package com.liumapp.digitalsign.service.signature.config;

import org.springframework.stereotype.Component;

/**
 * Created by liumapp on 2/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class Params {

    private String keyStoreSavePath = "/usr/local/tomcat/project/working";

    private String tmpDir = "/usr/local/signature/tmp";

    public String getTmpDir() {
        return tmpDir;
    }

    public void setTmpDir(String tmpDir) {
        this.tmpDir = tmpDir;
    }

    public String getKeyStoreSavePath() {
        return keyStoreSavePath;
    }

    public void setKeyStoreSavePath(String keyStoreSavePath) {
        this.keyStoreSavePath = keyStoreSavePath;
    }
}

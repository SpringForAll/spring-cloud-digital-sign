package com.liumapp.signature.pdf.config;

import com.liumapp.DNSQueen.worker.process.WokerEar;
import com.liumapp.DNSQueen.worker.tcp.TCPSocketMonitor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by liumapp on 11/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class Params {

    private Integer port = 9999;

    private Integer startDelay = 3000;

    private String tmpDir = "/usr/local/signature/tmp";

    private String keySotrePath = "/usr/local/tomcat/project/working";

    private String keyStorePd = "123456";

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getStartDelay() {
        return startDelay;
    }

    public void setStartDelay(Integer startDelay) {
        this.startDelay = startDelay;
    }

    public String getTmpDir() {
        return tmpDir;
    }

    public void setTmpDir(String tmpDir) {
        this.tmpDir = tmpDir;
    }

    public String getKeySotrePath() {
        return keySotrePath;
    }

    public void setKeySotrePath(String keySotrePath) {
        this.keySotrePath = keySotrePath;
    }

    public String getKeyStorePd() {
        return keyStorePd;
    }

    public void setKeyStorePd(String keyStorePd) {
        this.keyStorePd = keyStorePd;
    }
}

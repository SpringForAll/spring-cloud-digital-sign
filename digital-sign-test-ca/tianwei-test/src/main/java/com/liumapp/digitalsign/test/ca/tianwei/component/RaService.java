package com.liumapp.digitalsign.test.ca.tianwei.component;

import com.liumapp.digitalsign.test.ca.tianwei.code.ErrorCode;
import com.liumapp.digitalsign.test.ca.tianwei.user.UserInfo;
import org.apache.commons.lang.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
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

    public JSONObject enrollCert(UserInfo userInfo, String certReqBuf, String passCode, Integer certValidity) throws JSONException {
        JSONObject ret = new JSONObject();
        String json = "";
        // 用户名不能为空
        if (StringUtils.isEmpty(userInfo.getUserName())) {
            ret.put("code", "10010101");
            ret.put("msg", errorCode.getErrorCode().get(10010101));
            return ret;
        }
        // 用户邮箱不能为空
        if (StringUtils.isEmpty(userInfo.getUserEmail())) {
            ret.put("code", "10010102");
            ret.put("msg", errorCode.getErrorCode().get(10010102));
            return ret;
        }
        if (StringUtils.isEmpty(certReqBuf)) {
            ret.put("code", "10010103");
            ret.put("msg", errorCode.getErrorCode().get(10010103));
            return ret;
        }
        // 有效期为空
        if (certValidity == 0) {
            certValidity = CERT_VALIDITY;
        }
        try {
            if (CERT_ISKMC != null) {
                json = "{'certKmcReq2':'" + (CERT_ISKMC.equals("false") ? "" : "kmcClientVersion=20150130") + "','certValidity':'" + certValidity + "'}";
            }
            UserAPIServicePortTypeProxy proxy = AxisUtil.getProxy();
            proxy.enrollCert(userInfo, certReqBuf, ACCOUNT_HASH, CERT_REQ_CHALLENGE, json);
            ret.put("code", "0");
            ret.put("msg", "PassCode模式申请证书成功,请等待管理员批准......");

        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorProUtil.getProperty("20010101") + ":" + e.getMessage());
            return ret;
        }
        return ret;

    }
}

package com.liumapp.cert.core.component;

import com.liumapp.cert.core.cert.CertInfo;
import com.liumapp.cert.core.code.ErrorCode;
import com.liumapp.cert.core.constant.SignConstant;
import com.liumapp.cert.core.property.Properties;
import com.liumapp.cert.core.property.PropertiesStategy;
import com.liumapp.cert.core.utils.AxisUtil;
import com.liumapp.cert.core.utils.DateUtil;
import com.liumapp.cert.core.cert.CertInfo;
import com.liumapp.cert.core.code.ErrorCode;
import com.liumapp.cert.core.constant.SignConstant;
import com.liumapp.cert.core.property.Properties;
import com.liumapp.cert.core.property.PropertiesStategy;
import com.liumapp.cert.core.proxy.UserAPIServicePortTypeProxy;
import com.liumapp.cert.core.query.QueryCertResult;
import com.liumapp.cert.core.user.AccountConfigResult;
import com.liumapp.cert.core.user.UserInfo;
import com.liumapp.cert.core.utils.AxisUtil;
import com.liumapp.cert.core.utils.DateUtil;
import org.apache.commons.lang.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author liumapp
 * @file RaService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class RaService implements PropertiesStategy {

    private ErrorCode errorCode;

    private AxisUtil axisUtil;

    private String CERT_ISKMC;

    private String CERT_ENROLL_MODEL;

    private String CERT_RENEW_MODEL;

    private String ACCOUNT_HASH;

    private String CERT_REQ_CHALLENGE;

    private Integer CERT_VALIDITY;

    public RaService(AxisUtil axisUtil) {
        this.errorCode = new ErrorCode();
        this.axisUtil = axisUtil;
    }

    @Override
    public void initProperty(Properties properties) {
        this.CERT_ISKMC = properties.getString(SignConstant.cert_isKMC);
        this.CERT_ENROLL_MODEL = properties.getString(SignConstant.cert_enroll_model);
        this.CERT_RENEW_MODEL = properties.getString(SignConstant.cert_renew_model);
        this.ACCOUNT_HASH = properties.getString(SignConstant.ra_accountHash);
        this.CERT_REQ_CHALLENGE = properties.getString(SignConstant.cert_aapassword);
        this.CERT_VALIDITY = properties.getInteger(SignConstant.cert_validity , 365);
    }

    /**
     * ENROLL模式 申请个人用户证书
     *
     * @Title: enrollCert
     * @Description: TODO(申请个人用户证书)
     * @param userInfo
     *            证书用户信息
     * @param certReqBuf
     *            证书请求，使用客户端的加密服务提供者来产生PKCS10格式的证书申请请求信息
     * @param passCode
     *            通行码，若使用通行码模式签发证书时则需要录入得到的通行码信息，缺省为""
     * @param certValidity
     *            证书有效期 ，若传入0，则默认使用services.properties配置的值
     * @return CertInfo 返回签发的证书信息
     * @throws JSONException
     */
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
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            proxy.enrollCert(userInfo, certReqBuf, ACCOUNT_HASH, CERT_REQ_CHALLENGE, json);
            ret.put("code", "0");
            ret.put("msg", "PassCode模式申请证书成功,请等待管理员批准......");

        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;

    }

    /**
     * AA模式申请证书或PASSCODE模式申请证书
     *
     * @Title: enrollCert
     * @Description: TODO(申请个人用户证书)
     * @param userInfo
     *            证书用户信息
     * @param certReqBuf
     *            证书请求，使用客户端的加密服务提供者来产生PKCS10格式的证书申请请求信息
     * @param passCode
     *            通行码，若使用通行码模式签发证书时则需要录入得到的通行码信息，缺省为""
     * @param certValidity
     *            证书有效期 ，若传入0，则默认使用services.properties配置的值
     * @return CertInfo 返回签发的证书信息
     * @throws JSONException
     */
    public JSONObject enrollCertAA(UserInfo userInfo, String certReqBuf, String passCode, Integer certValidity) throws JSONException {
        CertInfo certInfo = new CertInfo();
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

            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            certInfo = proxy.enrollCertAA(userInfo, certReqBuf, ACCOUNT_HASH, CERT_REQ_CHALLENGE, passCode, json);
            if (CERT_ENROLL_MODEL.equals("AA")) {
                ret.put("code", "0");
                ret.put("certInfo", certInfo);
                ret.put("msg", "");
            } else {
                ret.put("code", "0");
                ret.put("msg", "PassCode模式申请证书成功,请等待管理员批准......");
            }
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

    /**
     * 获取证书 *
     *
     * @Title: pickupCert
     *
     * @Description: TODO(申请个人用户证书)
     * @param pinCode
     *            PIN码
     * @param certReqBuf
     *            证书请求，使用客户端的加密服务提供者来产生PKCS10格式的证书申请请求信息
     * @return CertInfo 返回签发的证书信息
     * @throws JSONException
     */
    public JSONObject pickupCert(String pinCode, String certReqBuf) throws JSONException {
        JSONObject ret = new JSONObject();
        String json = "";
        if (StringUtils.isBlank(pinCode)) {
            ret.put("code", "10010105");
            ret.put("msg", errorCode.getErrorCode().get("10010105"));
            return ret;
        }

        if (StringUtils.isBlank(certReqBuf)) {
            ret.put("code", "10010103");
            ret.put("msg", errorCode.getErrorCode().get(10010103));
            return ret;
        }

        try {
            if (CERT_ISKMC != null) {
                json = "{'certKmcReq2':'" + (CERT_ISKMC.equals("false") ? "" : "kmcClientVersion=20150130") + "','certValidity':'" + CERT_REQ_CHALLENGE + "'}";
            }
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            CertInfo certInfo = proxy.pickupCert(pinCode, CERT_REQ_CHALLENGE, certReqBuf, ACCOUNT_HASH, json);
            ret.put("certInfo", certInfo);
            ret.put("code", "0");
            ret.put("msg", "");
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

    /**
     * 吊销个人用户证书
     *
     * @Title: revokeCert
     * @Description: TODO(吊销个人用户证书)
     * @param serialNumber
     *            需要吊销的个人用户证书的序列号
     * @param certReqChallenge
     *            证书申请时的保护口令,若AA模式申请的证书则可传入传入空值
     * @param revokeReason
     *            吊销证书原因：可选值为：1：密钥遭受损害 2：停止使用,3：证书被替代,4：证书暂停使用,5：从属关系变动,0:未知、其他
     * @return JSONObject 返回结果信息
     * @throws JSONException
     */
    public JSONObject revokeCert(String serialNumber, String certReqChallenge, String revokeReason) throws JSONException {
        JSONObject ret = new JSONObject();
        try {
            String json = "";
            String certRevokeReasonStr = null;

            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();

            if ("1".equals(revokeReason)) {
                certRevokeReasonStr = "Key compromise[密钥遭受损害]";
            } else if ("2".equals(revokeReason)) {
                certRevokeReasonStr = "Cessation of operatio[停止使用]";
            } else if ("3".equals(revokeReason)) {
                certRevokeReasonStr = "Superseded[证书被替代]";
            } else if ("4".equals(revokeReason)) {
                certRevokeReasonStr = "Certificate hold[证书暂停使用]";
            } else if ("5".equals(revokeReason)) {
                certRevokeReasonStr = "Affiliation changed[从属关系变动]";
            } else if ("0".equals(revokeReason)) {
                certRevokeReasonStr = "Unspecified[其他]";
            }

            if (null == certReqChallenge || certReqChallenge.equals("")) {
                proxy.revokeCert(serialNumber, CERT_REQ_CHALLENGE, certRevokeReasonStr, ACCOUNT_HASH, json);
            } else {
                proxy.revokeCert(serialNumber, certReqChallenge, certRevokeReasonStr, ACCOUNT_HASH, json);
            }
            ret.put("code", "0");
            ret.put("msg", "您的证书已成功吊销......");

        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
        }
        return ret;
    }

    /**
     * 更新个人用户证书
     *
     * @Title: renewCert
     * @Description: TODO(更新个人用户证书 )
     * @param certInfo
     *            旧证书对象
     * @param csrSignedData
     *            原证书的CSR签名信息
     * @param passCode
     *            通行码，在passcode更新模式下此项必填，在普通模式下此项可为空
     * @param certValidity
     *            证书有效期
     * @return JSONObject 返回结果信息
     * @throws JSONException
     */
    public JSONObject renewCert(CertInfo certInfo, String csrSignedData, String passCode, Integer certValidity) throws JSONException {
        JSONObject ret = new JSONObject();
        if (null == certInfo.getCertReqBuf() || certInfo.getCertReqBuf().equals("")) {
            ret.put("code", "30010101");
            ret.put("msg", errorCode.getErrorCode().get(30010101));
            return ret;
        }
        if (null == certInfo.getCertSignBuf() && certInfo.getCertSignBuf().equals("")) {
            ret.put("code", "30010102");
            ret.put("msg", errorCode.getErrorCode().get(30010102));
            return ret;
        }
        String json = "";
        try {
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            if ("passCodeModel".equals(CERT_RENEW_MODEL)) {// passcode模式
                if (passCode == null || passCode.trim().length() == 0) {
                    ret.put("code", "10010104");
                    ret.put("code", errorCode.getErrorCode().get(10010104));
                    return ret;
                }
                json = "{'PKCSINFORMATION':'" + csrSignedData + "','CERT_REQ_BUF':'" + certInfo.getCertReqBuf() + "','certValidity':'" + certValidity + "'}";
                CertInfo certInfoRes = proxy.renewCertAA(null, certInfo, ACCOUNT_HASH, null, passCode, json);
                ret.put("certInfo", certInfoRes);
                ret.put("code", "0");
                ret.put("msg", "");

            } else if (CERT_ENROLL_MODEL.equals("AA")) {// AA模式
                json = "{'PKCSINFORMATION':'" + csrSignedData + "','CERT_REQ_BUF':'" + certInfo.getCertReqBuf() + "','certValidity':'" + certValidity + "'}";
                CertInfo certInfoRes = proxy.renewCertAA(null, certInfo, ACCOUNT_HASH, null, passCode, json);
                ret.put("certInfo", certInfoRes);
                ret.put("code", "0");
                ret.put("msg", "");

            } else {
                proxy.renewCert(null, certInfo, ACCOUNT_HASH, json);
                ret.put("code", "0");
                ret.put("msg", "更新证书成功,请等待管理员审批");
            }
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
        }
        return ret;
    }

    /**
     * 挂起证书
     *
     * @Title: suspendCert
     * @Description: TODO(挂起证书 )
     * @param serialNumber
     *            证书序列号
     * @return JSONObject 返回结果信息
     * @throws JSONException
     */
    public JSONObject suspendCert(String serialNumber) throws JSONException {
        JSONObject ret = new JSONObject();
        String json = "";
        if (StringUtils.isBlank(serialNumber)) {
            ret.put("code", "10010106");
            ret.put("msg", errorCode.getErrorCode().get(10010106));
            return ret;
        }
        try {
            if (CERT_ISKMC != null) {
                json = "{'certKmcReq2':'" + (CERT_ISKMC.equals("false") ? "" : "kmcClientVersion=20150130") + "','certValidity':'" + CERT_REQ_CHALLENGE + "'}";
            }

            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            proxy.suspendCert(serialNumber, ACCOUNT_HASH, json);
            ret.put("code", "0");
            ret.put("msg", "");
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

    /**
     * 恢复证书
     *
     * @Title: unsuspendCert
     * @Description: TODO(恢复证书 )
     * @param serialNumber
     *            证书序列号
     * @return JSONObject 返回结果信息
     * @throws JSONException
     */
    public JSONObject unsuspendCert(String serialNumber) throws JSONException {
        JSONObject ret = new JSONObject();
        String json = "";
        if (StringUtils.isBlank(serialNumber)) {
            ret.put("code", "10010106");
            ret.put("msg", errorCode.getErrorCode().get(10010106));
            return ret;
        }
        try {
            if (CERT_ISKMC != null) {
                json = "{'certKmcReq2':'" + (CERT_ISKMC.equals("false") ? "" : "kmcClientVersion=20150130") + "','certValidity':'" + CERT_REQ_CHALLENGE + "'}";
            }
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            proxy.unsuspendCert(serialNumber, ACCOUNT_HASH, json);
            ret.put("code", "0");
            ret.put("msg", "");
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

    /**
     * 通过序列号查询证书
     *
     * @Title: unsuspendCert
     * @Description: TODO(恢复证书 )
     * @param serialNumber
     *            证书序列号
     * @return JSONObject 返回结果信息
     * @throws JSONException
     */
    public JSONObject queryCertBySerialNumber(String serialNumber) throws JSONException {
        JSONObject ret = new JSONObject();
        String json = "";
        if (StringUtils.isBlank(serialNumber)) {
            ret.put("code", "10010106");
            ret.put("msg", errorCode.getErrorCode().get(10010106));
            return ret;
        }
        try {
            if (CERT_ISKMC != null) {
                json = "{'certKmcReq2':'" + (CERT_ISKMC.equals("false") ? "" : "kmcClientVersion=20150130") + "','certValidity':'" + CERT_REQ_CHALLENGE + "'}";
            }
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            QueryCertResult result = proxy.queryCertBySerialNumber(serialNumber, ACCOUNT_HASH, json);
            ret.put("code", "0");
            ret.put("msg", "");
            ret.put("result", result);
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

    /**
     * 通过CERT_ID查询证书
     *
     * @Title: queryCertByCertId
     * @Description: TODO(通过CERT_ID查询证书 )
     * @param certId
     *            证书ID
     * @return JSONObject 返回结果信息
     * @throws JSONException
     */
    public JSONObject queryCertByCertId(int certId) throws JSONException {
        JSONObject ret = new JSONObject();
        String json = "";
        if (certId == 0) {
            ret.put("code", "10010107");
            ret.put("msg", errorCode.getErrorCode().get(10010107));
            return ret;
        }
        try {
            if (CERT_ISKMC != null) {
                json = "{'certKmcReq2':'" + (CERT_ISKMC.equals("false") ? "" : "kmcClientVersion=20150130") + "','certValidity':'" + CERT_REQ_CHALLENGE + "'}";
            }
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            QueryCertResult result = proxy.queryCertByCertId(certId, ACCOUNT_HASH, json);
            ret.put("code", "0");
            ret.put("msg", "");
            ret.put("result", result);
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

    /**
     * 查询个人用户证书信息
     *
     * @Title: queryCerts
     * @Description: TODO(查询个人用户证书信息)
     * @param userInfo
     *            证书用户信息
     * @param certInfo
     *            证书信息
     * @param currentPage
     *            页数[从第几页开始查询]，若为空，默认从第一页开始
     * @parm pageSize 每页显示的数据条数
     * @return QueryCertResult 证书对象
     */
    public QueryCertResult queryCerts(UserInfo userInfo, CertInfo certInfo, int currentPage, int pageSize) {
        try {
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            if (null != certInfo.getCertSerialNumber() && !"".equals(certInfo.getCertSerialNumber())) {
                QueryCertResult quertResult = proxy.queryCertBySerialNumber(certInfo.getCertSerialNumber().trim(), ACCOUNT_HASH.toString().trim(), null);
                return quertResult;
            }
            if (null != certInfo.getCertNotAfter() && !"".equals(certInfo.getCertNotAfter())) {
                String notAfterTime = DateUtil.convertBeginTimeToDBDate(certInfo.getCertNotAfter());
                certInfo.setCertNotAfter(notAfterTime);
            }
            if (null != certInfo.getCertNotBefore() && !"".equals(certInfo.getCertNotBefore())) {
                String notAfterTime = DateUtil.convertBeginTimeToDBDate(certInfo.getCertNotBefore());
                certInfo.setCertNotAfter(notAfterTime);
            }
            if (null == certInfo.getCertStatus() || "".equals(certInfo.getCertStatus())) {
                certInfo.setCertStatus("ALL");
            }
            QueryCertResult queryResult = proxy.queryCerts(userInfo, certInfo, currentPage - 1, pageSize, "selectValidCert", null, null, ACCOUNT_HASH);
            return queryResult;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 下载CA证书链
     *
     * @Title: downloadCA
     * @Description: TODO(下载CA证书链)
     * @return JSONObject
     * @throws JSONException
     */
    public JSONObject downloadCA() throws JSONException {
        JSONObject ret = new JSONObject();
        try {
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            String ca = proxy.downloadCA(ACCOUNT_HASH);
            ret.put("code", "0");
            ret.put("msg", "");
            ret.put("result", ca);
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

    /**
     * 下载CRL
     *
     * @Title: downloadCACrl
     * @Description: TODO(下载CRL)
     * @return JSONObject
     * @throws JSONException
     */
    public JSONObject downloadCACrl() throws JSONException {
        JSONObject ret = new JSONObject();
        try {
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            String caCrl = proxy.downloadCRL(ACCOUNT_HASH);
            ret.put("code", "0");
            ret.put("msg", "");
            ret.put("result", caCrl);
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

    /**
     * 下载增量CRL
     *
     * @Title: downloadCACrl
     * @Description: TODO(下载增量CRL)
     * @return JSONObject
     * @throws JSONException
     */
    public JSONObject downloadDeltaCRL() throws JSONException {
        JSONObject ret = new JSONObject();
        try {
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            String deltaCRL = proxy.downloadDeltaCRL(ACCOUNT_HASH);
            ret.put("code", "0");
            ret.put("msg", "");
            ret.put("result", deltaCRL);
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

    /**
     * 调用自定义脚本（CA扩展机制）
     *
     * @throws JSONException
     */
    public JSONObject doScript(String scriptName, String jsonMap) throws JSONException {
        JSONObject ret = new JSONObject();
        try {
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            String result = proxy.doScript(scriptName, jsonMap);
            ret.put("code", "0");
            ret.put("msg", "");
            ret.put("result", result);
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

    /**
     * 获取证书模板
     *
     * @Title: synchroTemplate
     * @Description: TODO(获取证书模板)
     * @return JSONObject
     * @throws JSONException
     */
    public JSONObject synchroTemplate() throws JSONException {
        JSONObject ret = new JSONObject();
        try {
            UserAPIServicePortTypeProxy proxy = axisUtil.getProxyNow();
            AccountConfigResult result = proxy.synchroTemplate(ACCOUNT_HASH);
            ret.put("code", "0");
            ret.put("msg", "");
            ret.put("result", result);
        } catch (Exception e) {
            ret.put("code", "20010101");
            ret.put("msg", errorCode.getErrorCode().get(20010101) + ":" + e.getMessage());
            return ret;
        }
        return ret;
    }

}

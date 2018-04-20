package com.liumapp.cert.core.proxy;

import com.liumapp.cert.core.cert.CertInfo;
import com.liumapp.cert.core.error.RaServiceUnavailable;
import com.liumapp.cert.core.query.QueryCertResult;
import com.liumapp.cert.core.cert.CertInfo;
import com.liumapp.cert.core.error.RaServiceUnavailable;
import com.liumapp.cert.core.query.QueryCertResult;
import com.liumapp.cert.core.user.AccountConfigResult;
import com.liumapp.cert.core.user.UserAPIServiceLocator;
import com.liumapp.cert.core.user.UserAPIServicePortType;
import com.liumapp.cert.core.user.UserInfo;

/**
 * @author liumapp
 * @file UserAPIServicePortTypeProxy.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class UserAPIServicePortTypeProxy implements UserAPIServicePortType {
    private String _endpoint = null;
    private UserAPIServicePortType userAPIServicePortType = null;

    public UserAPIServicePortTypeProxy() {
        _initUserAPIServicePortTypeProxy();
    }

    public UserAPIServicePortTypeProxy(String endpoint) {
        _endpoint = endpoint;
        _initUserAPIServicePortTypeProxy();
    }

    private void _initUserAPIServicePortTypeProxy() {
        try {
            userAPIServicePortType = (new UserAPIServiceLocator()).getUserAPIServicePort();
            if (userAPIServicePortType != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub)userAPIServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
                else
                    _endpoint = (String)((javax.xml.rpc.Stub)userAPIServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
            }

        }
        catch (javax.xml.rpc.ServiceException serviceException) {}
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public void setEndpoint(String endpoint) {
        _endpoint = endpoint;
        if (userAPIServicePortType != null)
            ((javax.xml.rpc.Stub)userAPIServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public UserAPIServicePortType getUserAPIServicePortType() {
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType;
    }

    public QueryCertResult queryCertByCertId(int certId, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.queryCertByCertId(certId, accountHash, json);
    }

    public String downloadCRL(String accountHash) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.downloadCRL(accountHash);
    }

    public void unsuspendCert(String serialNumber, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        userAPIServicePortType.unsuspendCert(serialNumber, accountHash, json);
    }

    public void enrollCert(UserInfo userInfo, String certReqBuf, String certReqChallenge, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        userAPIServicePortType.enrollCert(userInfo, certReqBuf, certReqChallenge, accountHash, json);
    }

    public QueryCertResult queryCerts(UserInfo userInfo, CertInfo certInfo, int pageIndex, int pageSize, String sqlTemplateFileName, String nextResultTag, String totalTag, String accountHash) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.queryCerts(userInfo, certInfo, pageIndex, pageSize, sqlTemplateFileName, nextResultTag, totalTag, accountHash);
    }

    public CertInfo renewCertAA(UserInfo userInfo, CertInfo origin, String accountHash, String aaCheckPoint, String passCode, String json) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.renewCertAA(userInfo, origin, accountHash, aaCheckPoint, passCode, json);
    }

    public String downloadDeltaCRL(String accountHash) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.downloadDeltaCRL(accountHash);
    }

    public String downloadCA(String accountHash) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.downloadCA(accountHash);
    }

    public String doScript(String scriptName, String jsonMap) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.doScript(scriptName, jsonMap);
    }

    public AccountConfigResult synchroTemplate(String accountHash) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.synchroTemplate(accountHash);
    }

    public QueryCertResult queryCertBySerialNumber(String serialNumber, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.queryCertBySerialNumber(serialNumber, accountHash, json);
    }

    public CertInfo pickupCert(String certPin, String certReqChallenge, String certReqBuf, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.pickupCert(certPin, certReqChallenge, certReqBuf, accountHash, json);
    }

    public void revokeCert(String serialNumber, String certReqChallenge, String certRevokeReason, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        userAPIServicePortType.revokeCert(serialNumber, certReqChallenge, certRevokeReason, accountHash, json);
    }

    public void renewCert(UserInfo userInfo, CertInfo origin, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        userAPIServicePortType.renewCert(userInfo, origin, accountHash, json);
    }

    public void suspendCert(String serialNumber, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        userAPIServicePortType.suspendCert(serialNumber, accountHash, json);
    }

    public CertInfo enrollCertAA(UserInfo userInfo, String certReqBuf, String accountHash, String aaCheckPoint, String passCode, String json) throws java.rmi.RemoteException, RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.enrollCertAA(userInfo, certReqBuf, accountHash, aaCheckPoint, passCode, json);
    }


}
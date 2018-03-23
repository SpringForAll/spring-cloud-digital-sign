package com.liumapp.digitalsign.test.ca.tianwei.proxy;

/**
 * @author liumapp
 * @file UserAPIServicePortTypeProxy.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class UserAPIServicePortTypeProxy implements cn.topca.tca.ra.service.UserAPIServicePortType {
    private String _endpoint = null;
    private cn.topca.tca.ra.service.UserAPIServicePortType userAPIServicePortType = null;

    public UserAPIServicePortTypeProxy() {
        _initUserAPIServicePortTypeProxy();
    }

    public UserAPIServicePortTypeProxy(String endpoint) {
        _endpoint = endpoint;
        _initUserAPIServicePortTypeProxy();
    }

    private void _initUserAPIServicePortTypeProxy() {
        try {
            userAPIServicePortType = (new cn.topca.tca.ra.service.UserAPIServiceLocator()).getUserAPIServicePort();
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

    public cn.topca.tca.ra.service.UserAPIServicePortType getUserAPIServicePortType() {
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType;
    }

    public cn.topca.tca.ra.service.QueryCertResult queryCertByCertId(int certId, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.queryCertByCertId(certId, accountHash, json);
    }

    public java.lang.String downloadCRL(java.lang.String accountHash) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.downloadCRL(accountHash);
    }

    public void unsuspendCert(java.lang.String serialNumber, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        userAPIServicePortType.unsuspendCert(serialNumber, accountHash, json);
    }

    public void enrollCert(cn.topca.tca.ra.service.UserInfo userInfo, java.lang.String certReqBuf, java.lang.String certReqChallenge, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        userAPIServicePortType.enrollCert(userInfo, certReqBuf, certReqChallenge, accountHash, json);
    }

    public cn.topca.tca.ra.service.QueryCertResult queryCerts(cn.topca.tca.ra.service.UserInfo userInfo, cn.topca.tca.ra.service.CertInfo certInfo, int pageIndex, int pageSize, java.lang.String sqlTemplateFileName, java.lang.String nextResultTag, java.lang.String totalTag, java.lang.String accountHash) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.queryCerts(userInfo, certInfo, pageIndex, pageSize, sqlTemplateFileName, nextResultTag, totalTag, accountHash);
    }

    public cn.topca.tca.ra.service.CertInfo renewCertAA(cn.topca.tca.ra.service.UserInfo userInfo, cn.topca.tca.ra.service.CertInfo origin, java.lang.String accountHash, java.lang.String aaCheckPoint, java.lang.String passCode, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.renewCertAA(userInfo, origin, accountHash, aaCheckPoint, passCode, json);
    }

    public java.lang.String downloadDeltaCRL(java.lang.String accountHash) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.downloadDeltaCRL(accountHash);
    }

    public java.lang.String downloadCA(java.lang.String accountHash) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.downloadCA(accountHash);
    }

    public java.lang.String doScript(java.lang.String scriptName, java.lang.String jsonMap) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.doScript(scriptName, jsonMap);
    }

    public cn.topca.tca.ra.service.AccountConfigResult synchroTemplate(java.lang.String accountHash) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.synchroTemplate(accountHash);
    }

    public cn.topca.tca.ra.service.QueryCertResult queryCertBySerialNumber(java.lang.String serialNumber, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.queryCertBySerialNumber(serialNumber, accountHash, json);
    }

    public cn.topca.tca.ra.service.CertInfo pickupCert(java.lang.String certPin, java.lang.String certReqChallenge, java.lang.String certReqBuf, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.pickupCert(certPin, certReqChallenge, certReqBuf, accountHash, json);
    }

    public void revokeCert(java.lang.String serialNumber, java.lang.String certReqChallenge, java.lang.String certRevokeReason, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        userAPIServicePortType.revokeCert(serialNumber, certReqChallenge, certRevokeReason, accountHash, json);
    }

    public void renewCert(cn.topca.tca.ra.service.UserInfo userInfo, cn.topca.tca.ra.service.CertInfo origin, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        userAPIServicePortType.renewCert(userInfo, origin, accountHash, json);
    }

    public void suspendCert(java.lang.String serialNumber, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        userAPIServicePortType.suspendCert(serialNumber, accountHash, json);
    }

    public cn.topca.tca.ra.service.CertInfo enrollCertAA(cn.topca.tca.ra.service.UserInfo userInfo, java.lang.String certReqBuf, java.lang.String accountHash, java.lang.String aaCheckPoint, java.lang.String passCode, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable{
        if (userAPIServicePortType == null)
            _initUserAPIServicePortTypeProxy();
        return userAPIServicePortType.enrollCertAA(userInfo, certReqBuf, accountHash, aaCheckPoint, passCode, json);
    }


}
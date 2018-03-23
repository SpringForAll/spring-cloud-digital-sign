package com.liumapp.digitalsign.test.ca.tianwei.user;

import java.rmi.Remote;

/**
 * @author liumapp
 * @file UserAPIServicePortType.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public interface UserAPIServicePortType extends Remote {

    public cn.topca.tca.ra.service.QueryCertResult queryCertByCertId(int certId, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public java.lang.String downloadCRL(java.lang.String accountHash) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public void unsuspendCert(java.lang.String serialNumber, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public void enrollCert(cn.topca.tca.ra.service.UserInfo userInfo, java.lang.String certReqBuf, java.lang.String certReqChallenge, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public cn.topca.tca.ra.service.QueryCertResult queryCerts(cn.topca.tca.ra.service.UserInfo userInfo, cn.topca.tca.ra.service.CertInfo certInfo, int pageIndex, int pageSize, java.lang.String sqlTemplateFileName, java.lang.String nextResultTag, java.lang.String totalTag, java.lang.String accountHash) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public cn.topca.tca.ra.service.CertInfo renewCertAA(cn.topca.tca.ra.service.UserInfo userInfo, cn.topca.tca.ra.service.CertInfo origin, java.lang.String accountHash, java.lang.String aaCheckPoint, java.lang.String passCode, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public java.lang.String downloadDeltaCRL(java.lang.String accountHash) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public java.lang.String downloadCA(java.lang.String accountHash) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public java.lang.String doScript(java.lang.String scriptName, java.lang.String jsonMap) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public cn.topca.tca.ra.service.AccountConfigResult synchroTemplate(java.lang.String accountHash) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public cn.topca.tca.ra.service.QueryCertResult queryCertBySerialNumber(java.lang.String serialNumber, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public cn.topca.tca.ra.service.CertInfo pickupCert(java.lang.String certPin, java.lang.String certReqChallenge, java.lang.String certReqBuf, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public void revokeCert(java.lang.String serialNumber, java.lang.String certReqChallenge, java.lang.String certRevokeReason, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public void renewCert(cn.topca.tca.ra.service.UserInfo userInfo, cn.topca.tca.ra.service.CertInfo origin, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public void suspendCert(java.lang.String serialNumber, java.lang.String accountHash, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public cn.topca.tca.ra.service.CertInfo enrollCertAA(cn.topca.tca.ra.service.UserInfo userInfo, java.lang.String certReqBuf, java.lang.String accountHash, java.lang.String aaCheckPoint, java.lang.String passCode, java.lang.String json) throws java.rmi.RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;
}

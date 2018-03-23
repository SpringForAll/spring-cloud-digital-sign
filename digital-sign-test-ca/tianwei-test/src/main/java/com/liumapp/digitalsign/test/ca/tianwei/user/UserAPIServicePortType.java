package com.liumapp.digitalsign.test.ca.tianwei.user;

import com.liumapp.digitalsign.test.ca.tianwei.query.QueryCertResult;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author liumapp
 * @file UserAPIServicePortType.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public interface UserAPIServicePortType extends Remote {

    public QueryCertResult queryCertByCertId(int certId, String accountHash, String json) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public String downloadCRL(String accountHash) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public void unsuspendCert(String serialNumber, String accountHash, String json) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public void enrollCert(cn.topca.tca.ra.service.UserInfo userInfo, String certReqBuf, String certReqChallenge, String accountHash, String json) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public QueryCertResult queryCerts(cn.topca.tca.ra.service.UserInfo userInfo, cn.topca.tca.ra.service.CertInfo certInfo, int pageIndex, int pageSize, String sqlTemplateFileName, String nextResultTag, String totalTag, String accountHash) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public cn.topca.tca.ra.service.CertInfo renewCertAA(cn.topca.tca.ra.service.UserInfo userInfo, cn.topca.tca.ra.service.CertInfo origin, String accountHash, String aaCheckPoint, String passCode, String json) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public String downloadDeltaCRL(String accountHash) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public String downloadCA(String accountHash) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public String doScript(String scriptName, String jsonMap) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public cn.topca.tca.ra.service.AccountConfigResult synchroTemplate(String accountHash) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public QueryCertResult queryCertBySerialNumber(String serialNumber, String accountHash, String json) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public cn.topca.tca.ra.service.CertInfo pickupCert(String certPin, String certReqChallenge, String certReqBuf, String accountHash, String json) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public void revokeCert(String serialNumber, String certReqChallenge, String certRevokeReason, String accountHash, String json) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public void renewCert(cn.topca.tca.ra.service.UserInfo userInfo, cn.topca.tca.ra.service.CertInfo origin, String accountHash, String json) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public void suspendCert(String serialNumber, String accountHash, String json) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;

    public cn.topca.tca.ra.service.CertInfo enrollCertAA(cn.topca.tca.ra.service.UserInfo userInfo, String certReqBuf, String accountHash, String aaCheckPoint, String passCode, String json) throws RemoteException, cn.topca.tca.ra.service.RaServiceUnavailable;
}

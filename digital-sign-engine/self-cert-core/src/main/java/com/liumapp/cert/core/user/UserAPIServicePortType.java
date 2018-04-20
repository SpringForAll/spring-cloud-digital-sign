package com.liumapp.cert.core.user;

import com.liumapp.cert.core.cert.CertInfo;
import com.liumapp.cert.core.error.RaServiceUnavailable;
import com.liumapp.cert.core.query.QueryCertResult;
import com.liumapp.cert.core.cert.CertInfo;
import com.liumapp.cert.core.error.RaServiceUnavailable;
import com.liumapp.cert.core.query.QueryCertResult;

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

    public QueryCertResult queryCertByCertId(int certId, String accountHash, String json) throws RemoteException, RaServiceUnavailable;

    public String downloadCRL(String accountHash) throws RemoteException, RaServiceUnavailable;

    public void unsuspendCert(String serialNumber, String accountHash, String json) throws RemoteException, RaServiceUnavailable;

    public void enrollCert(UserInfo userInfo, String certReqBuf, String certReqChallenge, String accountHash, String json) throws RemoteException, RaServiceUnavailable;

    public QueryCertResult queryCerts(UserInfo userInfo, CertInfo certInfo, int pageIndex, int pageSize, String sqlTemplateFileName, String nextResultTag, String totalTag, String accountHash) throws RemoteException, RaServiceUnavailable;

    public CertInfo renewCertAA(UserInfo userInfo, CertInfo origin, String accountHash, String aaCheckPoint, String passCode, String json) throws RemoteException, RaServiceUnavailable;

    public String downloadDeltaCRL(String accountHash) throws RemoteException, RaServiceUnavailable;

    public String downloadCA(String accountHash) throws RemoteException, RaServiceUnavailable;

    public String doScript(String scriptName, String jsonMap) throws RemoteException, RaServiceUnavailable;

    public AccountConfigResult synchroTemplate(String accountHash) throws RemoteException, RaServiceUnavailable;

    public QueryCertResult queryCertBySerialNumber(String serialNumber, String accountHash, String json) throws RemoteException, RaServiceUnavailable;

    public CertInfo pickupCert(String certPin, String certReqChallenge, String certReqBuf, String accountHash, String json) throws RemoteException, RaServiceUnavailable;

    public void revokeCert(String serialNumber, String certReqChallenge, String certRevokeReason, String accountHash, String json) throws RemoteException, RaServiceUnavailable;

    public void renewCert(UserInfo userInfo, CertInfo origin, String accountHash, String json) throws RemoteException, RaServiceUnavailable;

    public void suspendCert(String serialNumber, String accountHash, String json) throws RemoteException, RaServiceUnavailable;

    public CertInfo enrollCertAA(UserInfo userInfo, String certReqBuf, String accountHash, String aaCheckPoint, String passCode, String json) throws RemoteException, RaServiceUnavailable;
}

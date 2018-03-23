package com.liumapp.digitalsign.test.ca.tianwei.proxy;

import com.liumapp.digitalsign.test.ca.tianwei.cert.CertInfo;
import com.liumapp.digitalsign.test.ca.tianwei.error.RaServiceUnavailable;
import com.liumapp.digitalsign.test.ca.tianwei.query.QueryCertResult;
import com.liumapp.digitalsign.test.ca.tianwei.user.AccountConfigResult;
import com.liumapp.digitalsign.test.ca.tianwei.user.UserInfo;

import java.rmi.RemoteException;

public interface UserAPIServicePortType extends java.rmi.Remote {
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

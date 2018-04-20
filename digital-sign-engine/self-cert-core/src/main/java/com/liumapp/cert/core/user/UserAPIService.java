package com.liumapp.cert.core.user;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import java.net.URL;

public interface UserAPIService extends Service {

    public String getUserAPIServicePortAddress();

    public UserAPIServicePortType getUserAPIServicePort() throws ServiceException;

    public UserAPIServicePortType getUserAPIServicePort(URL portAddress) throws ServiceException;

}

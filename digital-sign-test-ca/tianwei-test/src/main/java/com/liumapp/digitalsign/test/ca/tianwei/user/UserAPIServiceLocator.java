package com.liumapp.digitalsign.test.ca.tianwei.user;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

/**
 * UserAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
public class UserAPIServiceLocator extends Service implements UserAPIService {

    public UserAPIServiceLocator() {
    }


    public UserAPIServiceLocator(EngineConfiguration config) {
        super(config);
    }

    public UserAPIServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserAPIServicePort
    private String UserAPIServicePort_address = "http://topca.szitrus.com.cn/services/userAPI";

    public String getUserAPIServicePortAddress() {
        return UserAPIServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private String UserAPIServicePortWSDDServiceName = "UserAPIServicePort";

    public String getUserAPIServicePortWSDDServiceName() {
        return UserAPIServicePortWSDDServiceName;
    }

    public void setUserAPIServicePortWSDDServiceName(String name) {
        UserAPIServicePortWSDDServiceName = name;
    }

    public UserAPIServicePortType getUserAPIServicePort() throws ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserAPIServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new ServiceException(e);
        }
        return getUserAPIServicePort(endpoint);
    }

    public UserAPIServicePortType getUserAPIServicePort(java.net.URL portAddress) throws ServiceException {
        try {
            UserAPIServiceSoapBindingStub _stub = new UserAPIServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserAPIServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserAPIServicePortEndpointAddress(String address) {
        UserAPIServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (UserAPIServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                UserAPIServiceSoapBindingStub _stub = new UserAPIServiceSoapBindingStub(new java.net.URL(UserAPIServicePort_address), this);
                _stub.setPortName(getUserAPIServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("UserAPIServicePort".equals(inputPortName)) {
            return getUserAPIServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public QName getServiceName() {
        return new QName("http://service.ra.tca.topca.cn/", "UserAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new QName("http://service.ra.tca.topca.cn/", "UserAPIServicePort"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws ServiceException {

        if ("UserAPIServicePort".equals(portName)) {
            setUserAPIServicePortEndpointAddress(address);
        }
        else
        { // Unknown Port Name
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

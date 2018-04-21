package com.spring4all.digitalsign.engine.self.cert.core.user;


import com.spring4all.digitalsign.engine.self.cert.core.cert.CertInfo;
import com.spring4all.digitalsign.engine.self.cert.core.error.RaServiceUnavailable;
import com.spring4all.digitalsign.engine.self.cert.core.query.QueryCertResult;
import com.spring4all.digitalsign.engine.self.cert.core.cert.CertInfo;
import com.spring4all.digitalsign.engine.self.cert.core.error.RaServiceUnavailable;
import com.spring4all.digitalsign.engine.self.cert.core.query.QueryCertResult;
import org.apache.axis.client.Stub;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;

import javax.xml.namespace.QName;
import java.util.Vector;

/**
 * UserAPIServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
public class UserAPIServiceSoapBindingStub extends Stub implements UserAPIServicePortType {
    private Vector cachedSerClasses = new Vector();
    private Vector cachedSerQNames = new Vector();
    private Vector cachedSerFactories = new Vector();
    private Vector cachedDeserFactories = new Vector();

    static OperationDesc[] _operations;

    static {
        _operations = new OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        OperationDesc oper;
        ParameterDesc param;
        oper = new OperationDesc();
        oper.setName("queryCertByCertId");
        param = new ParameterDesc(new QName("", "certId"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "json"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://service.ra.tca.topca.cn/", "queryCertResult"));
        oper.setReturnClass(QueryCertResult.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[0] = oper;

        oper = new OperationDesc();
        oper.setName("downloadCRL");
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[1] = oper;

        oper = new OperationDesc();
        oper.setName("enrollCert");
        param = new ParameterDesc(new QName("", "userInfo"), ParameterDesc.IN, new QName("http://service.ra.tca.topca.cn/", "userInfo"), UserInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "certReqBuf"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "certReqChallenge"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "json"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[2] = oper;

        oper = new OperationDesc();
        oper.setName("unsuspendCert");
        param = new ParameterDesc(new QName("", "serialNumber"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "json"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[3] = oper;

        oper = new OperationDesc();
        oper.setName("queryCerts");
        param = new ParameterDesc(new QName("", "userInfo"), ParameterDesc.IN, new QName("http://service.ra.tca.topca.cn/", "userInfo"), UserInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "certInfo"), ParameterDesc.IN, new QName("http://service.ra.tca.topca.cn/", "certInfo"), CertInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "pageIndex"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "pageSize"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "sqlTemplateFileName"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "nextResultTag"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "totalTag"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://service.ra.tca.topca.cn/", "queryCertResult"));
        oper.setReturnClass(QueryCertResult.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[4] = oper;

        oper = new OperationDesc();
        oper.setName("renewCertAA");
        param = new ParameterDesc(new QName("", "userInfo"), ParameterDesc.IN, new QName("http://service.ra.tca.topca.cn/", "userInfo"), UserInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "origin"), ParameterDesc.IN, new QName("http://service.ra.tca.topca.cn/", "certInfo"), CertInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "aaCheckPoint"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "passCode"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "json"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://service.ra.tca.topca.cn/", "certInfo"));
        oper.setReturnClass(CertInfo.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[5] = oper;

        oper = new OperationDesc();
        oper.setName("downloadDeltaCRL");
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[6] = oper;

        oper = new OperationDesc();
        oper.setName("downloadCA");
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[7] = oper;

        oper = new OperationDesc();
        oper.setName("doScript");
        param = new ParameterDesc(new QName("", "scriptName"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "jsonMap"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[8] = oper;

        oper = new OperationDesc();
        oper.setName("pickupCert");
        param = new ParameterDesc(new QName("", "certPin"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "certReqChallenge"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "certReqBuf"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "json"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://service.ra.tca.topca.cn/", "certInfo"));
        oper.setReturnClass(CertInfo.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        OperationDesc oper;
        ParameterDesc param;
        oper = new OperationDesc();
        oper.setName("queryCertBySerialNumber");
        param = new ParameterDesc(new QName("", "serialNumber"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "json"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://service.ra.tca.topca.cn/", "queryCertResult"));
        oper.setReturnClass(QueryCertResult.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[10] = oper;

        oper = new OperationDesc();
        oper.setName("synchroTemplate");
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://service.ra.tca.topca.cn/", "accountConfigResult"));
        oper.setReturnClass(AccountConfigResult.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[11] = oper;

        oper = new OperationDesc();
        oper.setName("renewCert");
        param = new ParameterDesc(new QName("", "userInfo"), ParameterDesc.IN, new QName("http://service.ra.tca.topca.cn/", "userInfo"), UserInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "origin"), ParameterDesc.IN, new QName("http://service.ra.tca.topca.cn/", "certInfo"), CertInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "json"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[12] = oper;

        oper = new OperationDesc();
        oper.setName("revokeCert");
        param = new ParameterDesc(new QName("", "serialNumber"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "certReqChallenge"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "certRevokeReason"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "json"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[13] = oper;

        oper = new OperationDesc();
        oper.setName("suspendCert");
        param = new ParameterDesc(new QName("", "serialNumber"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "json"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[14] = oper;

        oper = new OperationDesc();
        oper.setName("enrollCertAA");
        param = new ParameterDesc(new QName("", "userInfo"), ParameterDesc.IN, new QName("http://service.ra.tca.topca.cn/", "userInfo"), UserInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "certReqBuf"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accountHash"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "aaCheckPoint"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "passCode"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "json"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://service.ra.tca.topca.cn/", "certInfo"));
        oper.setReturnClass(CertInfo.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                "RaServiceUnavailable",
                new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"),
                true
        ));
        _operations[15] = oper;

    }

    public UserAPIServiceSoapBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public UserAPIServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public UserAPIServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
        Class cls;
        QName qName;
        QName qName2;
        Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new QName("http://service.ra.tca.topca.cn/", "accountConfigResult");
        cachedSerQNames.add(qName);
        cls = AccountConfigResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://service.ra.tca.topca.cn/", "certInfo");
        cachedSerQNames.add(qName);
        cls = CertInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://service.ra.tca.topca.cn/", "queryCertResult");
        cachedSerQNames.add(qName);
        cls = QueryCertResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable");
        cachedSerQNames.add(qName);
        cls = RaServiceUnavailable.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://service.ra.tca.topca.cn/", "userInfo");
        cachedSerQNames.add(qName);
        cls = UserInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        QName qName =
                                (QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                    cachedSerFactories.get(i);
                            Class df = (Class)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                    cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public QueryCertResult queryCertByCertId(int certId, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "queryCertByCertId"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {new Integer(certId), accountHash, json});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (QueryCertResult) _resp;
                } catch (Exception _exception) {
                    return (QueryCertResult) org.apache.axis.utils.JavaUtils.convert(_resp, QueryCertResult.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public String downloadCRL(String accountHash) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "downloadCRL"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {accountHash});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void enrollCert(UserInfo userInfo, String certReqBuf, String certReqChallenge, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "enrollCert"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {userInfo, certReqBuf, certReqChallenge, accountHash, json});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void unsuspendCert(String serialNumber, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "unsuspendCert"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {serialNumber, accountHash, json});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public QueryCertResult queryCerts(UserInfo userInfo, CertInfo certInfo, int pageIndex, int pageSize, String sqlTemplateFileName, String nextResultTag, String totalTag, String accountHash) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "queryCerts"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {userInfo, certInfo, new Integer(pageIndex), new Integer(pageSize), sqlTemplateFileName, nextResultTag, totalTag, accountHash});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (QueryCertResult) _resp;
                } catch (Exception _exception) {
                    return (QueryCertResult) org.apache.axis.utils.JavaUtils.convert(_resp, QueryCertResult.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public CertInfo renewCertAA(UserInfo userInfo, CertInfo origin, String accountHash, String aaCheckPoint, String passCode, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "renewCertAA"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {userInfo, origin, accountHash, aaCheckPoint, passCode, json});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (CertInfo) _resp;
                } catch (Exception _exception) {
                    return (CertInfo) org.apache.axis.utils.JavaUtils.convert(_resp, CertInfo.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public String downloadDeltaCRL(String accountHash) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "downloadDeltaCRL"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {accountHash});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public String downloadCA(String accountHash) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "downloadCA"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {accountHash});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public String doScript(String scriptName, String jsonMap) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "doScript"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {scriptName, jsonMap});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public CertInfo pickupCert(String certPin, String certReqChallenge, String certReqBuf, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "pickupCert"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {certPin, certReqChallenge, certReqBuf, accountHash, json});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (CertInfo) _resp;
                } catch (Exception _exception) {
                    return (CertInfo) org.apache.axis.utils.JavaUtils.convert(_resp, CertInfo.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public QueryCertResult queryCertBySerialNumber(String serialNumber, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "queryCertBySerialNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {serialNumber, accountHash, json});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (QueryCertResult) _resp;
                } catch (Exception _exception) {
                    return (QueryCertResult) org.apache.axis.utils.JavaUtils.convert(_resp, QueryCertResult.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public AccountConfigResult synchroTemplate(String accountHash) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "synchroTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {accountHash});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (AccountConfigResult) _resp;
                } catch (Exception _exception) {
                    return (AccountConfigResult) org.apache.axis.utils.JavaUtils.convert(_resp, AccountConfigResult.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void renewCert(UserInfo userInfo, CertInfo origin, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "renewCert"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {userInfo, origin, accountHash, json});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void revokeCert(String serialNumber, String certReqChallenge, String certRevokeReason, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "revokeCert"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {serialNumber, certReqChallenge, certRevokeReason, accountHash, json});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public void suspendCert(String serialNumber, String accountHash, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "suspendCert"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {serialNumber, accountHash, json});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public CertInfo enrollCertAA(UserInfo userInfo, String certReqBuf, String accountHash, String aaCheckPoint, String passCode, String json) throws java.rmi.RemoteException, RaServiceUnavailable {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://service.ra.tca.topca.cn/", "enrollCertAA"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {        Object _resp = _call.invoke(new Object[] {userInfo, certReqBuf, accountHash, aaCheckPoint, passCode, json});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException)_resp;
            }
            else {
                extractAttachments(_call);
                try {
                    return (CertInfo) _resp;
                } catch (Exception _exception) {
                    return (CertInfo) org.apache.axis.utils.JavaUtils.convert(_resp, CertInfo.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof RaServiceUnavailable) {
                    throw (RaServiceUnavailable) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

}

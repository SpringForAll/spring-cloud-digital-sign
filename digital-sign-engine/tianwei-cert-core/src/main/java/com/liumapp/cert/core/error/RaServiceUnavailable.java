package com.liumapp.cert.core.error;

import org.apache.axis.AxisFault;

import java.io.Serializable;

/**
 * @file RaServiceUnavailable.java
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 *
 * RaServiceUnavailable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
public class RaServiceUnavailable  extends AxisFault implements Serializable {
    private Integer errorCode_;

    private String message_;

    public RaServiceUnavailable() {
    }

    public RaServiceUnavailable(
            Integer errorCode_,
            String message_) {
        this.errorCode_ = errorCode_;
        this.message_ = message_;
    }


    /**
     * Gets the errorCode_ value for this RaServiceUnavailable.
     *
     * @return errorCode_
     */
    public Integer getErrorCode_() {
        return errorCode_;
    }


    /**
     * Sets the errorCode_ value for this RaServiceUnavailable.
     *
     * @param errorCode_
     */
    public void setErrorCode_(Integer errorCode_) {
        this.errorCode_ = errorCode_;
    }


    /**
     * Gets the message_ value for this RaServiceUnavailable.
     *
     * @return message_
     */
    public String getMessage_() {
        return message_;
    }


    /**
     * Sets the message_ value for this RaServiceUnavailable.
     *
     * @param message_
     */
    public void setMessage_(String message_) {
        this.message_ = message_;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RaServiceUnavailable)) return false;
        RaServiceUnavailable other = (RaServiceUnavailable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.errorCode_==null && other.getErrorCode_()==null) ||
                        (this.errorCode_!=null &&
                                this.errorCode_.equals(other.getErrorCode_()))) &&
                ((this.message_==null && other.getMessage_()==null) ||
                        (this.message_!=null &&
                                this.message_.equals(other.getMessage_())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getErrorCode_() != null) {
            _hashCode += getErrorCode_().hashCode();
        }
        if (getMessage_() != null) {
            _hashCode += getMessage_().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RaServiceUnavailable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.ra.tca.topca.cn/", "RaServiceUnavailable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode_");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message_");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}

package com.liumapp.digitalsign.test.ca.tianwei.user;

/**
 * AccountConfigResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
public class AccountConfigResult  implements java.io.Serializable {
    private java.lang.String certTemplate;

    private java.lang.String serviceUrl;

    private java.lang.String algorithm;

    private java.lang.String isDoubleCert;

    public AccountConfigResult() {
    }

    public AccountConfigResult(
            java.lang.String certTemplate,
            java.lang.String serviceUrl,
            java.lang.String algorithm,
            java.lang.String isDoubleCert) {
        this.certTemplate = certTemplate;
        this.serviceUrl = serviceUrl;
        this.algorithm = algorithm;
        this.isDoubleCert = isDoubleCert;
    }


    /**
     * Gets the certTemplate value for this AccountConfigResult.
     *
     * @return certTemplate
     */
    public java.lang.String getCertTemplate() {
        return certTemplate;
    }


    /**
     * Sets the certTemplate value for this AccountConfigResult.
     *
     * @param certTemplate
     */
    public void setCertTemplate(java.lang.String certTemplate) {
        this.certTemplate = certTemplate;
    }


    /**
     * Gets the serviceUrl value for this AccountConfigResult.
     *
     * @return serviceUrl
     */
    public java.lang.String getServiceUrl() {
        return serviceUrl;
    }


    /**
     * Sets the serviceUrl value for this AccountConfigResult.
     *
     * @param serviceUrl
     */
    public void setServiceUrl(java.lang.String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }


    /**
     * Gets the algorithm value for this AccountConfigResult.
     *
     * @return algorithm
     */
    public java.lang.String getAlgorithm() {
        return algorithm;
    }


    /**
     * Sets the algorithm value for this AccountConfigResult.
     *
     * @param algorithm
     */
    public void setAlgorithm(java.lang.String algorithm) {
        this.algorithm = algorithm;
    }


    /**
     * Gets the isDoubleCert value for this AccountConfigResult.
     *
     * @return isDoubleCert
     */
    public java.lang.String getIsDoubleCert() {
        return isDoubleCert;
    }


    /**
     * Sets the isDoubleCert value for this AccountConfigResult.
     *
     * @param isDoubleCert
     */
    public void setIsDoubleCert(java.lang.String isDoubleCert) {
        this.isDoubleCert = isDoubleCert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountConfigResult)) return false;
        AccountConfigResult other = (AccountConfigResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.certTemplate==null && other.getCertTemplate()==null) ||
                        (this.certTemplate!=null &&
                                this.certTemplate.equals(other.getCertTemplate()))) &&
                ((this.serviceUrl==null && other.getServiceUrl()==null) ||
                        (this.serviceUrl!=null &&
                                this.serviceUrl.equals(other.getServiceUrl()))) &&
                ((this.algorithm==null && other.getAlgorithm()==null) ||
                        (this.algorithm!=null &&
                                this.algorithm.equals(other.getAlgorithm()))) &&
                ((this.isDoubleCert==null && other.getIsDoubleCert()==null) ||
                        (this.isDoubleCert!=null &&
                                this.isDoubleCert.equals(other.getIsDoubleCert())));
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
        if (getCertTemplate() != null) {
            _hashCode += getCertTemplate().hashCode();
        }
        if (getServiceUrl() != null) {
            _hashCode += getServiceUrl().hashCode();
        }
        if (getAlgorithm() != null) {
            _hashCode += getAlgorithm().hashCode();
        }
        if (getIsDoubleCert() != null) {
            _hashCode += getIsDoubleCert().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AccountConfigResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.ra.tca.topca.cn/", "accountConfigResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("algorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "algorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDoubleCert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDoubleCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}

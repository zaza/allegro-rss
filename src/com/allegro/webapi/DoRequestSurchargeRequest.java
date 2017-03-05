/**
 * DoRequestSurchargeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoRequestSurchargeRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long transactionId;

    private float surchargeValue;

    private java.lang.String surchargeMessageToBuyer;

    public DoRequestSurchargeRequest() {
    }

    public DoRequestSurchargeRequest(
           java.lang.String sessionHandle,
           long transactionId,
           float surchargeValue,
           java.lang.String surchargeMessageToBuyer) {
           this.sessionHandle = sessionHandle;
           this.transactionId = transactionId;
           this.surchargeValue = surchargeValue;
           this.surchargeMessageToBuyer = surchargeMessageToBuyer;
    }


    /**
     * Gets the sessionHandle value for this DoRequestSurchargeRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoRequestSurchargeRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the transactionId value for this DoRequestSurchargeRequest.
     * 
     * @return transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this DoRequestSurchargeRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the surchargeValue value for this DoRequestSurchargeRequest.
     * 
     * @return surchargeValue
     */
    public float getSurchargeValue() {
        return surchargeValue;
    }


    /**
     * Sets the surchargeValue value for this DoRequestSurchargeRequest.
     * 
     * @param surchargeValue
     */
    public void setSurchargeValue(float surchargeValue) {
        this.surchargeValue = surchargeValue;
    }


    /**
     * Gets the surchargeMessageToBuyer value for this DoRequestSurchargeRequest.
     * 
     * @return surchargeMessageToBuyer
     */
    public java.lang.String getSurchargeMessageToBuyer() {
        return surchargeMessageToBuyer;
    }


    /**
     * Sets the surchargeMessageToBuyer value for this DoRequestSurchargeRequest.
     * 
     * @param surchargeMessageToBuyer
     */
    public void setSurchargeMessageToBuyer(java.lang.String surchargeMessageToBuyer) {
        this.surchargeMessageToBuyer = surchargeMessageToBuyer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRequestSurchargeRequest)) return false;
        DoRequestSurchargeRequest other = (DoRequestSurchargeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            this.transactionId == other.getTransactionId() &&
            this.surchargeValue == other.getSurchargeValue() &&
            ((this.surchargeMessageToBuyer==null && other.getSurchargeMessageToBuyer()==null) || 
             (this.surchargeMessageToBuyer!=null &&
              this.surchargeMessageToBuyer.equals(other.getSurchargeMessageToBuyer())));
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
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        _hashCode += new Long(getTransactionId()).hashCode();
        _hashCode += new Float(getSurchargeValue()).hashCode();
        if (getSurchargeMessageToBuyer() != null) {
            _hashCode += getSurchargeMessageToBuyer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoRequestSurchargeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestSurchargeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surchargeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "surchargeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surchargeMessageToBuyer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "surchargeMessageToBuyer"));
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

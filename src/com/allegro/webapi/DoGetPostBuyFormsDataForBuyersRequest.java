/**
 * DoGetPostBuyFormsDataForBuyersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetPostBuyFormsDataForBuyersRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private com.allegro.webapi.ArrayOfLong transactionsIdsArray;

    public DoGetPostBuyFormsDataForBuyersRequest() {
    }

    public DoGetPostBuyFormsDataForBuyersRequest(
           java.lang.String sessionId,
           com.allegro.webapi.ArrayOfLong transactionsIdsArray) {
           this.sessionId = sessionId;
           this.transactionsIdsArray = transactionsIdsArray;
    }


    /**
     * Gets the sessionId value for this DoGetPostBuyFormsDataForBuyersRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DoGetPostBuyFormsDataForBuyersRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the transactionsIdsArray value for this DoGetPostBuyFormsDataForBuyersRequest.
     * 
     * @return transactionsIdsArray
     */
    public com.allegro.webapi.ArrayOfLong getTransactionsIdsArray() {
        return transactionsIdsArray;
    }


    /**
     * Sets the transactionsIdsArray value for this DoGetPostBuyFormsDataForBuyersRequest.
     * 
     * @param transactionsIdsArray
     */
    public void setTransactionsIdsArray(com.allegro.webapi.ArrayOfLong transactionsIdsArray) {
        this.transactionsIdsArray = transactionsIdsArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetPostBuyFormsDataForBuyersRequest)) return false;
        DoGetPostBuyFormsDataForBuyersRequest other = (DoGetPostBuyFormsDataForBuyersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.transactionsIdsArray==null && other.getTransactionsIdsArray()==null) || 
             (this.transactionsIdsArray!=null &&
              this.transactionsIdsArray.equals(other.getTransactionsIdsArray())));
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
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getTransactionsIdsArray() != null) {
            _hashCode += getTransactionsIdsArray().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetPostBuyFormsDataForBuyersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionsIdsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transactionsIdsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
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

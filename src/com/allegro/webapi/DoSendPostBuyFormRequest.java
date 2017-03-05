/**
 * DoSendPostBuyFormRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoSendPostBuyFormRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private com.allegro.webapi.ArrayOfNewpostbuyformsellerstruct newPostBuyFormSeller;

    private com.allegro.webapi.NewPostBuyFormCommonStruct newPostBuyFormCommon;

    public DoSendPostBuyFormRequest() {
    }

    public DoSendPostBuyFormRequest(
           java.lang.String sessionId,
           com.allegro.webapi.ArrayOfNewpostbuyformsellerstruct newPostBuyFormSeller,
           com.allegro.webapi.NewPostBuyFormCommonStruct newPostBuyFormCommon) {
           this.sessionId = sessionId;
           this.newPostBuyFormSeller = newPostBuyFormSeller;
           this.newPostBuyFormCommon = newPostBuyFormCommon;
    }


    /**
     * Gets the sessionId value for this DoSendPostBuyFormRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DoSendPostBuyFormRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the newPostBuyFormSeller value for this DoSendPostBuyFormRequest.
     * 
     * @return newPostBuyFormSeller
     */
    public com.allegro.webapi.ArrayOfNewpostbuyformsellerstruct getNewPostBuyFormSeller() {
        return newPostBuyFormSeller;
    }


    /**
     * Sets the newPostBuyFormSeller value for this DoSendPostBuyFormRequest.
     * 
     * @param newPostBuyFormSeller
     */
    public void setNewPostBuyFormSeller(com.allegro.webapi.ArrayOfNewpostbuyformsellerstruct newPostBuyFormSeller) {
        this.newPostBuyFormSeller = newPostBuyFormSeller;
    }


    /**
     * Gets the newPostBuyFormCommon value for this DoSendPostBuyFormRequest.
     * 
     * @return newPostBuyFormCommon
     */
    public com.allegro.webapi.NewPostBuyFormCommonStruct getNewPostBuyFormCommon() {
        return newPostBuyFormCommon;
    }


    /**
     * Sets the newPostBuyFormCommon value for this DoSendPostBuyFormRequest.
     * 
     * @param newPostBuyFormCommon
     */
    public void setNewPostBuyFormCommon(com.allegro.webapi.NewPostBuyFormCommonStruct newPostBuyFormCommon) {
        this.newPostBuyFormCommon = newPostBuyFormCommon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSendPostBuyFormRequest)) return false;
        DoSendPostBuyFormRequest other = (DoSendPostBuyFormRequest) obj;
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
            ((this.newPostBuyFormSeller==null && other.getNewPostBuyFormSeller()==null) || 
             (this.newPostBuyFormSeller!=null &&
              this.newPostBuyFormSeller.equals(other.getNewPostBuyFormSeller()))) &&
            ((this.newPostBuyFormCommon==null && other.getNewPostBuyFormCommon()==null) || 
             (this.newPostBuyFormCommon!=null &&
              this.newPostBuyFormCommon.equals(other.getNewPostBuyFormCommon())));
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
        if (getNewPostBuyFormSeller() != null) {
            _hashCode += getNewPostBuyFormSeller().hashCode();
        }
        if (getNewPostBuyFormCommon() != null) {
            _hashCode += getNewPostBuyFormCommon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSendPostBuyFormRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendPostBuyFormRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPostBuyFormSeller");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "newPostBuyFormSeller"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNewpostbuyformsellerstruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPostBuyFormCommon");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "newPostBuyFormCommon"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormCommonStruct"));
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

/**
 * DoGetFilledPostBuyFormsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetFilledPostBuyFormsRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.Integer paymentType;

    private int userRole;

    private java.lang.Long fillingTimeFrom;

    private java.lang.Long fillingTimeTo;

    public DoGetFilledPostBuyFormsRequest() {
    }

    public DoGetFilledPostBuyFormsRequest(
           java.lang.String sessionId,
           java.lang.Integer paymentType,
           int userRole,
           java.lang.Long fillingTimeFrom,
           java.lang.Long fillingTimeTo) {
           this.sessionId = sessionId;
           this.paymentType = paymentType;
           this.userRole = userRole;
           this.fillingTimeFrom = fillingTimeFrom;
           this.fillingTimeTo = fillingTimeTo;
    }


    /**
     * Gets the sessionId value for this DoGetFilledPostBuyFormsRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DoGetFilledPostBuyFormsRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the paymentType value for this DoGetFilledPostBuyFormsRequest.
     * 
     * @return paymentType
     */
    public java.lang.Integer getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this DoGetFilledPostBuyFormsRequest.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Integer paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the userRole value for this DoGetFilledPostBuyFormsRequest.
     * 
     * @return userRole
     */
    public int getUserRole() {
        return userRole;
    }


    /**
     * Sets the userRole value for this DoGetFilledPostBuyFormsRequest.
     * 
     * @param userRole
     */
    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }


    /**
     * Gets the fillingTimeFrom value for this DoGetFilledPostBuyFormsRequest.
     * 
     * @return fillingTimeFrom
     */
    public java.lang.Long getFillingTimeFrom() {
        return fillingTimeFrom;
    }


    /**
     * Sets the fillingTimeFrom value for this DoGetFilledPostBuyFormsRequest.
     * 
     * @param fillingTimeFrom
     */
    public void setFillingTimeFrom(java.lang.Long fillingTimeFrom) {
        this.fillingTimeFrom = fillingTimeFrom;
    }


    /**
     * Gets the fillingTimeTo value for this DoGetFilledPostBuyFormsRequest.
     * 
     * @return fillingTimeTo
     */
    public java.lang.Long getFillingTimeTo() {
        return fillingTimeTo;
    }


    /**
     * Sets the fillingTimeTo value for this DoGetFilledPostBuyFormsRequest.
     * 
     * @param fillingTimeTo
     */
    public void setFillingTimeTo(java.lang.Long fillingTimeTo) {
        this.fillingTimeTo = fillingTimeTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetFilledPostBuyFormsRequest)) return false;
        DoGetFilledPostBuyFormsRequest other = (DoGetFilledPostBuyFormsRequest) obj;
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
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            this.userRole == other.getUserRole() &&
            ((this.fillingTimeFrom==null && other.getFillingTimeFrom()==null) || 
             (this.fillingTimeFrom!=null &&
              this.fillingTimeFrom.equals(other.getFillingTimeFrom()))) &&
            ((this.fillingTimeTo==null && other.getFillingTimeTo()==null) || 
             (this.fillingTimeTo!=null &&
              this.fillingTimeTo.equals(other.getFillingTimeTo())));
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
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        _hashCode += getUserRole();
        if (getFillingTimeFrom() != null) {
            _hashCode += getFillingTimeFrom().hashCode();
        }
        if (getFillingTimeTo() != null) {
            _hashCode += getFillingTimeTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetFilledPostBuyFormsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRole");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fillingTimeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fillingTimeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fillingTimeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fillingTimeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

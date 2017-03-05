/**
 * PaymentMethodStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PaymentMethodStruct  implements java.io.Serializable {
    private java.lang.String paymentMethodId;

    private java.lang.String paymentMethodName;

    private java.lang.String paymentMethodImage;

    private int paymentMethodUsage;

    public PaymentMethodStruct() {
    }

    public PaymentMethodStruct(
           java.lang.String paymentMethodId,
           java.lang.String paymentMethodName,
           java.lang.String paymentMethodImage,
           int paymentMethodUsage) {
           this.paymentMethodId = paymentMethodId;
           this.paymentMethodName = paymentMethodName;
           this.paymentMethodImage = paymentMethodImage;
           this.paymentMethodUsage = paymentMethodUsage;
    }


    /**
     * Gets the paymentMethodId value for this PaymentMethodStruct.
     * 
     * @return paymentMethodId
     */
    public java.lang.String getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this PaymentMethodStruct.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(java.lang.String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the paymentMethodName value for this PaymentMethodStruct.
     * 
     * @return paymentMethodName
     */
    public java.lang.String getPaymentMethodName() {
        return paymentMethodName;
    }


    /**
     * Sets the paymentMethodName value for this PaymentMethodStruct.
     * 
     * @param paymentMethodName
     */
    public void setPaymentMethodName(java.lang.String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }


    /**
     * Gets the paymentMethodImage value for this PaymentMethodStruct.
     * 
     * @return paymentMethodImage
     */
    public java.lang.String getPaymentMethodImage() {
        return paymentMethodImage;
    }


    /**
     * Sets the paymentMethodImage value for this PaymentMethodStruct.
     * 
     * @param paymentMethodImage
     */
    public void setPaymentMethodImage(java.lang.String paymentMethodImage) {
        this.paymentMethodImage = paymentMethodImage;
    }


    /**
     * Gets the paymentMethodUsage value for this PaymentMethodStruct.
     * 
     * @return paymentMethodUsage
     */
    public int getPaymentMethodUsage() {
        return paymentMethodUsage;
    }


    /**
     * Sets the paymentMethodUsage value for this PaymentMethodStruct.
     * 
     * @param paymentMethodUsage
     */
    public void setPaymentMethodUsage(int paymentMethodUsage) {
        this.paymentMethodUsage = paymentMethodUsage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMethodStruct)) return false;
        PaymentMethodStruct other = (PaymentMethodStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentMethodId==null && other.getPaymentMethodId()==null) || 
             (this.paymentMethodId!=null &&
              this.paymentMethodId.equals(other.getPaymentMethodId()))) &&
            ((this.paymentMethodName==null && other.getPaymentMethodName()==null) || 
             (this.paymentMethodName!=null &&
              this.paymentMethodName.equals(other.getPaymentMethodName()))) &&
            ((this.paymentMethodImage==null && other.getPaymentMethodImage()==null) || 
             (this.paymentMethodImage!=null &&
              this.paymentMethodImage.equals(other.getPaymentMethodImage()))) &&
            this.paymentMethodUsage == other.getPaymentMethodUsage();
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
        if (getPaymentMethodId() != null) {
            _hashCode += getPaymentMethodId().hashCode();
        }
        if (getPaymentMethodName() != null) {
            _hashCode += getPaymentMethodName().hashCode();
        }
        if (getPaymentMethodImage() != null) {
            _hashCode += getPaymentMethodImage().hashCode();
        }
        _hashCode += getPaymentMethodUsage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentMethodStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentMethodStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentMethodName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentMethodImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentMethodUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

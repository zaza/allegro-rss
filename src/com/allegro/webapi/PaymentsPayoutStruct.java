/**
 * PaymentsPayoutStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PaymentsPayoutStruct  implements java.io.Serializable {
    private int payoutType;

    private com.allegro.webapi.PayoutAutoSettingsStruct payoutAutoSettings;

    public PaymentsPayoutStruct() {
    }

    public PaymentsPayoutStruct(
           int payoutType,
           com.allegro.webapi.PayoutAutoSettingsStruct payoutAutoSettings) {
           this.payoutType = payoutType;
           this.payoutAutoSettings = payoutAutoSettings;
    }


    /**
     * Gets the payoutType value for this PaymentsPayoutStruct.
     * 
     * @return payoutType
     */
    public int getPayoutType() {
        return payoutType;
    }


    /**
     * Sets the payoutType value for this PaymentsPayoutStruct.
     * 
     * @param payoutType
     */
    public void setPayoutType(int payoutType) {
        this.payoutType = payoutType;
    }


    /**
     * Gets the payoutAutoSettings value for this PaymentsPayoutStruct.
     * 
     * @return payoutAutoSettings
     */
    public com.allegro.webapi.PayoutAutoSettingsStruct getPayoutAutoSettings() {
        return payoutAutoSettings;
    }


    /**
     * Sets the payoutAutoSettings value for this PaymentsPayoutStruct.
     * 
     * @param payoutAutoSettings
     */
    public void setPayoutAutoSettings(com.allegro.webapi.PayoutAutoSettingsStruct payoutAutoSettings) {
        this.payoutAutoSettings = payoutAutoSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentsPayoutStruct)) return false;
        PaymentsPayoutStruct other = (PaymentsPayoutStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.payoutType == other.getPayoutType() &&
            ((this.payoutAutoSettings==null && other.getPayoutAutoSettings()==null) || 
             (this.payoutAutoSettings!=null &&
              this.payoutAutoSettings.equals(other.getPayoutAutoSettings())));
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
        _hashCode += getPayoutType();
        if (getPayoutAutoSettings() != null) {
            _hashCode += getPayoutAutoSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentsPayoutStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsPayoutStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutAutoSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payoutAutoSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoSettingsStruct"));
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

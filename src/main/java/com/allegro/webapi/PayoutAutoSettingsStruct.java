/**
 * PayoutAutoSettingsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PayoutAutoSettingsStruct  implements java.io.Serializable {
    private float payoutAutoAmount;

    private com.allegro.webapi.PayoutAutoFrequencyStruct payoutAutoFrequency;

    public PayoutAutoSettingsStruct() {
    }

    public PayoutAutoSettingsStruct(
           float payoutAutoAmount,
           com.allegro.webapi.PayoutAutoFrequencyStruct payoutAutoFrequency) {
           this.payoutAutoAmount = payoutAutoAmount;
           this.payoutAutoFrequency = payoutAutoFrequency;
    }


    /**
     * Gets the payoutAutoAmount value for this PayoutAutoSettingsStruct.
     * 
     * @return payoutAutoAmount
     */
    public float getPayoutAutoAmount() {
        return payoutAutoAmount;
    }


    /**
     * Sets the payoutAutoAmount value for this PayoutAutoSettingsStruct.
     * 
     * @param payoutAutoAmount
     */
    public void setPayoutAutoAmount(float payoutAutoAmount) {
        this.payoutAutoAmount = payoutAutoAmount;
    }


    /**
     * Gets the payoutAutoFrequency value for this PayoutAutoSettingsStruct.
     * 
     * @return payoutAutoFrequency
     */
    public com.allegro.webapi.PayoutAutoFrequencyStruct getPayoutAutoFrequency() {
        return payoutAutoFrequency;
    }


    /**
     * Sets the payoutAutoFrequency value for this PayoutAutoSettingsStruct.
     * 
     * @param payoutAutoFrequency
     */
    public void setPayoutAutoFrequency(com.allegro.webapi.PayoutAutoFrequencyStruct payoutAutoFrequency) {
        this.payoutAutoFrequency = payoutAutoFrequency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayoutAutoSettingsStruct)) return false;
        PayoutAutoSettingsStruct other = (PayoutAutoSettingsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.payoutAutoAmount == other.getPayoutAutoAmount() &&
            ((this.payoutAutoFrequency==null && other.getPayoutAutoFrequency()==null) || 
             (this.payoutAutoFrequency!=null &&
              this.payoutAutoFrequency.equals(other.getPayoutAutoFrequency())));
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
        _hashCode += new Float(getPayoutAutoAmount()).hashCode();
        if (getPayoutAutoFrequency() != null) {
            _hashCode += getPayoutAutoFrequency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayoutAutoSettingsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoSettingsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutAutoAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payoutAutoAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutAutoFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payoutAutoFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoFrequencyStruct"));
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

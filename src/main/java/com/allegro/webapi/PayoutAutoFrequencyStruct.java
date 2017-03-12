/**
 * PayoutAutoFrequencyStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PayoutAutoFrequencyStruct  implements java.io.Serializable {
    private short frequencyType;

    private short frequencyWeekValue;

    private short frequencyMonthValue;

    public PayoutAutoFrequencyStruct() {
    }

    public PayoutAutoFrequencyStruct(
           short frequencyType,
           short frequencyWeekValue,
           short frequencyMonthValue) {
           this.frequencyType = frequencyType;
           this.frequencyWeekValue = frequencyWeekValue;
           this.frequencyMonthValue = frequencyMonthValue;
    }


    /**
     * Gets the frequencyType value for this PayoutAutoFrequencyStruct.
     * 
     * @return frequencyType
     */
    public short getFrequencyType() {
        return frequencyType;
    }


    /**
     * Sets the frequencyType value for this PayoutAutoFrequencyStruct.
     * 
     * @param frequencyType
     */
    public void setFrequencyType(short frequencyType) {
        this.frequencyType = frequencyType;
    }


    /**
     * Gets the frequencyWeekValue value for this PayoutAutoFrequencyStruct.
     * 
     * @return frequencyWeekValue
     */
    public short getFrequencyWeekValue() {
        return frequencyWeekValue;
    }


    /**
     * Sets the frequencyWeekValue value for this PayoutAutoFrequencyStruct.
     * 
     * @param frequencyWeekValue
     */
    public void setFrequencyWeekValue(short frequencyWeekValue) {
        this.frequencyWeekValue = frequencyWeekValue;
    }


    /**
     * Gets the frequencyMonthValue value for this PayoutAutoFrequencyStruct.
     * 
     * @return frequencyMonthValue
     */
    public short getFrequencyMonthValue() {
        return frequencyMonthValue;
    }


    /**
     * Sets the frequencyMonthValue value for this PayoutAutoFrequencyStruct.
     * 
     * @param frequencyMonthValue
     */
    public void setFrequencyMonthValue(short frequencyMonthValue) {
        this.frequencyMonthValue = frequencyMonthValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayoutAutoFrequencyStruct)) return false;
        PayoutAutoFrequencyStruct other = (PayoutAutoFrequencyStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.frequencyType == other.getFrequencyType() &&
            this.frequencyWeekValue == other.getFrequencyWeekValue() &&
            this.frequencyMonthValue == other.getFrequencyMonthValue();
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
        _hashCode += getFrequencyType();
        _hashCode += getFrequencyWeekValue();
        _hashCode += getFrequencyMonthValue();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayoutAutoFrequencyStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoFrequencyStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "frequencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyWeekValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "frequencyWeekValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyMonthValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "frequencyMonthValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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

/**
 * ItemSurchargeStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ItemSurchargeStruct  implements java.io.Serializable {
    private java.lang.String surchargeDescription;

    private com.allegro.webapi.AmountStruct surchargeAmount;

    public ItemSurchargeStruct() {
    }

    public ItemSurchargeStruct(
           java.lang.String surchargeDescription,
           com.allegro.webapi.AmountStruct surchargeAmount) {
           this.surchargeDescription = surchargeDescription;
           this.surchargeAmount = surchargeAmount;
    }


    /**
     * Gets the surchargeDescription value for this ItemSurchargeStruct.
     * 
     * @return surchargeDescription
     */
    public java.lang.String getSurchargeDescription() {
        return surchargeDescription;
    }


    /**
     * Sets the surchargeDescription value for this ItemSurchargeStruct.
     * 
     * @param surchargeDescription
     */
    public void setSurchargeDescription(java.lang.String surchargeDescription) {
        this.surchargeDescription = surchargeDescription;
    }


    /**
     * Gets the surchargeAmount value for this ItemSurchargeStruct.
     * 
     * @return surchargeAmount
     */
    public com.allegro.webapi.AmountStruct getSurchargeAmount() {
        return surchargeAmount;
    }


    /**
     * Sets the surchargeAmount value for this ItemSurchargeStruct.
     * 
     * @param surchargeAmount
     */
    public void setSurchargeAmount(com.allegro.webapi.AmountStruct surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSurchargeStruct)) return false;
        ItemSurchargeStruct other = (ItemSurchargeStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.surchargeDescription==null && other.getSurchargeDescription()==null) || 
             (this.surchargeDescription!=null &&
              this.surchargeDescription.equals(other.getSurchargeDescription()))) &&
            ((this.surchargeAmount==null && other.getSurchargeAmount()==null) || 
             (this.surchargeAmount!=null &&
              this.surchargeAmount.equals(other.getSurchargeAmount())));
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
        if (getSurchargeDescription() != null) {
            _hashCode += getSurchargeDescription().hashCode();
        }
        if (getSurchargeAmount() != null) {
            _hashCode += getSurchargeAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemSurchargeStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemSurchargeStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surchargeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "surchargeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surchargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "surchargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AmountStruct"));
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

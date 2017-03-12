/**
 * DoVerifyItemResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoVerifyItemResponse  implements java.io.Serializable {
    private long itemId;

    private int itemListed;

    private long itemStartingTime;

    public DoVerifyItemResponse() {
    }

    public DoVerifyItemResponse(
           long itemId,
           int itemListed,
           long itemStartingTime) {
           this.itemId = itemId;
           this.itemListed = itemListed;
           this.itemStartingTime = itemStartingTime;
    }


    /**
     * Gets the itemId value for this DoVerifyItemResponse.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this DoVerifyItemResponse.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemListed value for this DoVerifyItemResponse.
     * 
     * @return itemListed
     */
    public int getItemListed() {
        return itemListed;
    }


    /**
     * Sets the itemListed value for this DoVerifyItemResponse.
     * 
     * @param itemListed
     */
    public void setItemListed(int itemListed) {
        this.itemListed = itemListed;
    }


    /**
     * Gets the itemStartingTime value for this DoVerifyItemResponse.
     * 
     * @return itemStartingTime
     */
    public long getItemStartingTime() {
        return itemStartingTime;
    }


    /**
     * Sets the itemStartingTime value for this DoVerifyItemResponse.
     * 
     * @param itemStartingTime
     */
    public void setItemStartingTime(long itemStartingTime) {
        this.itemStartingTime = itemStartingTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoVerifyItemResponse)) return false;
        DoVerifyItemResponse other = (DoVerifyItemResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemId == other.getItemId() &&
            this.itemListed == other.getItemListed() &&
            this.itemStartingTime == other.getItemStartingTime();
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
        _hashCode += new Long(getItemId()).hashCode();
        _hashCode += getItemListed();
        _hashCode += new Long(getItemStartingTime()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoVerifyItemResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemListed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemListed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemStartingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemStartingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

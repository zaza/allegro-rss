/**
 * FulfillmentTimeStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class FulfillmentTimeStruct  implements java.io.Serializable {
    private int fulfillmentTimeFrom;

    private int fulfillmentTimeTo;

    public FulfillmentTimeStruct() {
    }

    public FulfillmentTimeStruct(
           int fulfillmentTimeFrom,
           int fulfillmentTimeTo) {
           this.fulfillmentTimeFrom = fulfillmentTimeFrom;
           this.fulfillmentTimeTo = fulfillmentTimeTo;
    }


    /**
     * Gets the fulfillmentTimeFrom value for this FulfillmentTimeStruct.
     * 
     * @return fulfillmentTimeFrom
     */
    public int getFulfillmentTimeFrom() {
        return fulfillmentTimeFrom;
    }


    /**
     * Sets the fulfillmentTimeFrom value for this FulfillmentTimeStruct.
     * 
     * @param fulfillmentTimeFrom
     */
    public void setFulfillmentTimeFrom(int fulfillmentTimeFrom) {
        this.fulfillmentTimeFrom = fulfillmentTimeFrom;
    }


    /**
     * Gets the fulfillmentTimeTo value for this FulfillmentTimeStruct.
     * 
     * @return fulfillmentTimeTo
     */
    public int getFulfillmentTimeTo() {
        return fulfillmentTimeTo;
    }


    /**
     * Sets the fulfillmentTimeTo value for this FulfillmentTimeStruct.
     * 
     * @param fulfillmentTimeTo
     */
    public void setFulfillmentTimeTo(int fulfillmentTimeTo) {
        this.fulfillmentTimeTo = fulfillmentTimeTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentTimeStruct)) return false;
        FulfillmentTimeStruct other = (FulfillmentTimeStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.fulfillmentTimeFrom == other.getFulfillmentTimeFrom() &&
            this.fulfillmentTimeTo == other.getFulfillmentTimeTo();
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
        _hashCode += getFulfillmentTimeFrom();
        _hashCode += getFulfillmentTimeTo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FulfillmentTimeStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FulfillmentTimeStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentTimeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fulfillmentTimeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentTimeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fulfillmentTimeTo"));
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

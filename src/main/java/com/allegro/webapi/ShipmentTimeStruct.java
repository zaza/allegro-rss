/**
 * ShipmentTimeStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ShipmentTimeStruct  implements java.io.Serializable {
    private int shipmentTimeFrom;

    private int shipmentTimeTo;

    public ShipmentTimeStruct() {
    }

    public ShipmentTimeStruct(
           int shipmentTimeFrom,
           int shipmentTimeTo) {
           this.shipmentTimeFrom = shipmentTimeFrom;
           this.shipmentTimeTo = shipmentTimeTo;
    }


    /**
     * Gets the shipmentTimeFrom value for this ShipmentTimeStruct.
     * 
     * @return shipmentTimeFrom
     */
    public int getShipmentTimeFrom() {
        return shipmentTimeFrom;
    }


    /**
     * Sets the shipmentTimeFrom value for this ShipmentTimeStruct.
     * 
     * @param shipmentTimeFrom
     */
    public void setShipmentTimeFrom(int shipmentTimeFrom) {
        this.shipmentTimeFrom = shipmentTimeFrom;
    }


    /**
     * Gets the shipmentTimeTo value for this ShipmentTimeStruct.
     * 
     * @return shipmentTimeTo
     */
    public int getShipmentTimeTo() {
        return shipmentTimeTo;
    }


    /**
     * Sets the shipmentTimeTo value for this ShipmentTimeStruct.
     * 
     * @param shipmentTimeTo
     */
    public void setShipmentTimeTo(int shipmentTimeTo) {
        this.shipmentTimeTo = shipmentTimeTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentTimeStruct)) return false;
        ShipmentTimeStruct other = (ShipmentTimeStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.shipmentTimeFrom == other.getShipmentTimeFrom() &&
            this.shipmentTimeTo == other.getShipmentTimeTo();
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
        _hashCode += getShipmentTimeFrom();
        _hashCode += getShipmentTimeTo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentTimeStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentTimeStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentTimeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentTimeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentTimeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentTimeTo"));
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

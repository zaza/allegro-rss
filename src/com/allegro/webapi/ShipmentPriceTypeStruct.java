/**
 * ShipmentPriceTypeStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ShipmentPriceTypeStruct  implements java.io.Serializable {
    private int shipmentPriceTypeId;

    private java.lang.String shipmentPriceTypeName;

    public ShipmentPriceTypeStruct() {
    }

    public ShipmentPriceTypeStruct(
           int shipmentPriceTypeId,
           java.lang.String shipmentPriceTypeName) {
           this.shipmentPriceTypeId = shipmentPriceTypeId;
           this.shipmentPriceTypeName = shipmentPriceTypeName;
    }


    /**
     * Gets the shipmentPriceTypeId value for this ShipmentPriceTypeStruct.
     * 
     * @return shipmentPriceTypeId
     */
    public int getShipmentPriceTypeId() {
        return shipmentPriceTypeId;
    }


    /**
     * Sets the shipmentPriceTypeId value for this ShipmentPriceTypeStruct.
     * 
     * @param shipmentPriceTypeId
     */
    public void setShipmentPriceTypeId(int shipmentPriceTypeId) {
        this.shipmentPriceTypeId = shipmentPriceTypeId;
    }


    /**
     * Gets the shipmentPriceTypeName value for this ShipmentPriceTypeStruct.
     * 
     * @return shipmentPriceTypeName
     */
    public java.lang.String getShipmentPriceTypeName() {
        return shipmentPriceTypeName;
    }


    /**
     * Sets the shipmentPriceTypeName value for this ShipmentPriceTypeStruct.
     * 
     * @param shipmentPriceTypeName
     */
    public void setShipmentPriceTypeName(java.lang.String shipmentPriceTypeName) {
        this.shipmentPriceTypeName = shipmentPriceTypeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentPriceTypeStruct)) return false;
        ShipmentPriceTypeStruct other = (ShipmentPriceTypeStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.shipmentPriceTypeId == other.getShipmentPriceTypeId() &&
            ((this.shipmentPriceTypeName==null && other.getShipmentPriceTypeName()==null) || 
             (this.shipmentPriceTypeName!=null &&
              this.shipmentPriceTypeName.equals(other.getShipmentPriceTypeName())));
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
        _hashCode += getShipmentPriceTypeId();
        if (getShipmentPriceTypeName() != null) {
            _hashCode += getShipmentPriceTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentPriceTypeStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPriceTypeStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentPriceTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentPriceTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentPriceTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentPriceTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

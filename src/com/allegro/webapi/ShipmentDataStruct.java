/**
 * ShipmentDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ShipmentDataStruct  implements java.io.Serializable {
    private int shipmentId;

    private java.lang.String shipmentName;

    private int shipmentType;

    private com.allegro.webapi.ShipmentTimeStruct shipmentTime;

    public ShipmentDataStruct() {
    }

    public ShipmentDataStruct(
           int shipmentId,
           java.lang.String shipmentName,
           int shipmentType,
           com.allegro.webapi.ShipmentTimeStruct shipmentTime) {
           this.shipmentId = shipmentId;
           this.shipmentName = shipmentName;
           this.shipmentType = shipmentType;
           this.shipmentTime = shipmentTime;
    }


    /**
     * Gets the shipmentId value for this ShipmentDataStruct.
     * 
     * @return shipmentId
     */
    public int getShipmentId() {
        return shipmentId;
    }


    /**
     * Sets the shipmentId value for this ShipmentDataStruct.
     * 
     * @param shipmentId
     */
    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }


    /**
     * Gets the shipmentName value for this ShipmentDataStruct.
     * 
     * @return shipmentName
     */
    public java.lang.String getShipmentName() {
        return shipmentName;
    }


    /**
     * Sets the shipmentName value for this ShipmentDataStruct.
     * 
     * @param shipmentName
     */
    public void setShipmentName(java.lang.String shipmentName) {
        this.shipmentName = shipmentName;
    }


    /**
     * Gets the shipmentType value for this ShipmentDataStruct.
     * 
     * @return shipmentType
     */
    public int getShipmentType() {
        return shipmentType;
    }


    /**
     * Sets the shipmentType value for this ShipmentDataStruct.
     * 
     * @param shipmentType
     */
    public void setShipmentType(int shipmentType) {
        this.shipmentType = shipmentType;
    }


    /**
     * Gets the shipmentTime value for this ShipmentDataStruct.
     * 
     * @return shipmentTime
     */
    public com.allegro.webapi.ShipmentTimeStruct getShipmentTime() {
        return shipmentTime;
    }


    /**
     * Sets the shipmentTime value for this ShipmentDataStruct.
     * 
     * @param shipmentTime
     */
    public void setShipmentTime(com.allegro.webapi.ShipmentTimeStruct shipmentTime) {
        this.shipmentTime = shipmentTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentDataStruct)) return false;
        ShipmentDataStruct other = (ShipmentDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.shipmentId == other.getShipmentId() &&
            ((this.shipmentName==null && other.getShipmentName()==null) || 
             (this.shipmentName!=null &&
              this.shipmentName.equals(other.getShipmentName()))) &&
            this.shipmentType == other.getShipmentType() &&
            ((this.shipmentTime==null && other.getShipmentTime()==null) || 
             (this.shipmentTime!=null &&
              this.shipmentTime.equals(other.getShipmentTime())));
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
        _hashCode += getShipmentId();
        if (getShipmentName() != null) {
            _hashCode += getShipmentName().hashCode();
        }
        _hashCode += getShipmentType();
        if (getShipmentTime() != null) {
            _hashCode += getShipmentTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentTimeStruct"));
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

/**
 * ShipmentPaymentInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ShipmentPaymentInfoStruct  implements java.io.Serializable {
    private int shipmentId;

    private java.lang.String shipmentName;

    private float shipmentAmount;

    private int shipmentPaymentType;

    private com.allegro.webapi.ArrayOfLong shipmentItemIds;

    public ShipmentPaymentInfoStruct() {
    }

    public ShipmentPaymentInfoStruct(
           int shipmentId,
           java.lang.String shipmentName,
           float shipmentAmount,
           int shipmentPaymentType,
           com.allegro.webapi.ArrayOfLong shipmentItemIds) {
           this.shipmentId = shipmentId;
           this.shipmentName = shipmentName;
           this.shipmentAmount = shipmentAmount;
           this.shipmentPaymentType = shipmentPaymentType;
           this.shipmentItemIds = shipmentItemIds;
    }


    /**
     * Gets the shipmentId value for this ShipmentPaymentInfoStruct.
     * 
     * @return shipmentId
     */
    public int getShipmentId() {
        return shipmentId;
    }


    /**
     * Sets the shipmentId value for this ShipmentPaymentInfoStruct.
     * 
     * @param shipmentId
     */
    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }


    /**
     * Gets the shipmentName value for this ShipmentPaymentInfoStruct.
     * 
     * @return shipmentName
     */
    public java.lang.String getShipmentName() {
        return shipmentName;
    }


    /**
     * Sets the shipmentName value for this ShipmentPaymentInfoStruct.
     * 
     * @param shipmentName
     */
    public void setShipmentName(java.lang.String shipmentName) {
        this.shipmentName = shipmentName;
    }


    /**
     * Gets the shipmentAmount value for this ShipmentPaymentInfoStruct.
     * 
     * @return shipmentAmount
     */
    public float getShipmentAmount() {
        return shipmentAmount;
    }


    /**
     * Sets the shipmentAmount value for this ShipmentPaymentInfoStruct.
     * 
     * @param shipmentAmount
     */
    public void setShipmentAmount(float shipmentAmount) {
        this.shipmentAmount = shipmentAmount;
    }


    /**
     * Gets the shipmentPaymentType value for this ShipmentPaymentInfoStruct.
     * 
     * @return shipmentPaymentType
     */
    public int getShipmentPaymentType() {
        return shipmentPaymentType;
    }


    /**
     * Sets the shipmentPaymentType value for this ShipmentPaymentInfoStruct.
     * 
     * @param shipmentPaymentType
     */
    public void setShipmentPaymentType(int shipmentPaymentType) {
        this.shipmentPaymentType = shipmentPaymentType;
    }


    /**
     * Gets the shipmentItemIds value for this ShipmentPaymentInfoStruct.
     * 
     * @return shipmentItemIds
     */
    public com.allegro.webapi.ArrayOfLong getShipmentItemIds() {
        return shipmentItemIds;
    }


    /**
     * Sets the shipmentItemIds value for this ShipmentPaymentInfoStruct.
     * 
     * @param shipmentItemIds
     */
    public void setShipmentItemIds(com.allegro.webapi.ArrayOfLong shipmentItemIds) {
        this.shipmentItemIds = shipmentItemIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentPaymentInfoStruct)) return false;
        ShipmentPaymentInfoStruct other = (ShipmentPaymentInfoStruct) obj;
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
            this.shipmentAmount == other.getShipmentAmount() &&
            this.shipmentPaymentType == other.getShipmentPaymentType() &&
            ((this.shipmentItemIds==null && other.getShipmentItemIds()==null) || 
             (this.shipmentItemIds!=null &&
              this.shipmentItemIds.equals(other.getShipmentItemIds())));
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
        _hashCode += new Float(getShipmentAmount()).hashCode();
        _hashCode += getShipmentPaymentType();
        if (getShipmentItemIds() != null) {
            _hashCode += getShipmentItemIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentPaymentInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPaymentInfoStruct"));
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
        elemField.setFieldName("shipmentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentPaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentPaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentItemIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentItemIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
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

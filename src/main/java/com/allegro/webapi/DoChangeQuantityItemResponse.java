/**
 * DoChangeQuantityItemResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoChangeQuantityItemResponse  implements java.io.Serializable {
    private long itemId;

    private java.lang.String itemInfo;

    private int itemQuantityLeft;

    private int itemQuantitySold;

    public DoChangeQuantityItemResponse() {
    }

    public DoChangeQuantityItemResponse(
           long itemId,
           java.lang.String itemInfo,
           int itemQuantityLeft,
           int itemQuantitySold) {
           this.itemId = itemId;
           this.itemInfo = itemInfo;
           this.itemQuantityLeft = itemQuantityLeft;
           this.itemQuantitySold = itemQuantitySold;
    }


    /**
     * Gets the itemId value for this DoChangeQuantityItemResponse.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this DoChangeQuantityItemResponse.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemInfo value for this DoChangeQuantityItemResponse.
     * 
     * @return itemInfo
     */
    public java.lang.String getItemInfo() {
        return itemInfo;
    }


    /**
     * Sets the itemInfo value for this DoChangeQuantityItemResponse.
     * 
     * @param itemInfo
     */
    public void setItemInfo(java.lang.String itemInfo) {
        this.itemInfo = itemInfo;
    }


    /**
     * Gets the itemQuantityLeft value for this DoChangeQuantityItemResponse.
     * 
     * @return itemQuantityLeft
     */
    public int getItemQuantityLeft() {
        return itemQuantityLeft;
    }


    /**
     * Sets the itemQuantityLeft value for this DoChangeQuantityItemResponse.
     * 
     * @param itemQuantityLeft
     */
    public void setItemQuantityLeft(int itemQuantityLeft) {
        this.itemQuantityLeft = itemQuantityLeft;
    }


    /**
     * Gets the itemQuantitySold value for this DoChangeQuantityItemResponse.
     * 
     * @return itemQuantitySold
     */
    public int getItemQuantitySold() {
        return itemQuantitySold;
    }


    /**
     * Sets the itemQuantitySold value for this DoChangeQuantityItemResponse.
     * 
     * @param itemQuantitySold
     */
    public void setItemQuantitySold(int itemQuantitySold) {
        this.itemQuantitySold = itemQuantitySold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoChangeQuantityItemResponse)) return false;
        DoChangeQuantityItemResponse other = (DoChangeQuantityItemResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemId == other.getItemId() &&
            ((this.itemInfo==null && other.getItemInfo()==null) || 
             (this.itemInfo!=null &&
              this.itemInfo.equals(other.getItemInfo()))) &&
            this.itemQuantityLeft == other.getItemQuantityLeft() &&
            this.itemQuantitySold == other.getItemQuantitySold();
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
        if (getItemInfo() != null) {
            _hashCode += getItemInfo().hashCode();
        }
        _hashCode += getItemQuantityLeft();
        _hashCode += getItemQuantitySold();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoChangeQuantityItemResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQuantityLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemQuantityLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQuantitySold");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemQuantitySold"));
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

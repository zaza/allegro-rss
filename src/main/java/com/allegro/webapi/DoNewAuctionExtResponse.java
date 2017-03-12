/**
 * DoNewAuctionExtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoNewAuctionExtResponse  implements java.io.Serializable {
    private long itemId;

    private java.lang.String itemInfo;

    private int itemIsAllegroStandard;

    public DoNewAuctionExtResponse() {
    }

    public DoNewAuctionExtResponse(
           long itemId,
           java.lang.String itemInfo,
           int itemIsAllegroStandard) {
           this.itemId = itemId;
           this.itemInfo = itemInfo;
           this.itemIsAllegroStandard = itemIsAllegroStandard;
    }


    /**
     * Gets the itemId value for this DoNewAuctionExtResponse.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this DoNewAuctionExtResponse.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemInfo value for this DoNewAuctionExtResponse.
     * 
     * @return itemInfo
     */
    public java.lang.String getItemInfo() {
        return itemInfo;
    }


    /**
     * Sets the itemInfo value for this DoNewAuctionExtResponse.
     * 
     * @param itemInfo
     */
    public void setItemInfo(java.lang.String itemInfo) {
        this.itemInfo = itemInfo;
    }


    /**
     * Gets the itemIsAllegroStandard value for this DoNewAuctionExtResponse.
     * 
     * @return itemIsAllegroStandard
     */
    public int getItemIsAllegroStandard() {
        return itemIsAllegroStandard;
    }


    /**
     * Sets the itemIsAllegroStandard value for this DoNewAuctionExtResponse.
     * 
     * @param itemIsAllegroStandard
     */
    public void setItemIsAllegroStandard(int itemIsAllegroStandard) {
        this.itemIsAllegroStandard = itemIsAllegroStandard;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoNewAuctionExtResponse)) return false;
        DoNewAuctionExtResponse other = (DoNewAuctionExtResponse) obj;
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
            this.itemIsAllegroStandard == other.getItemIsAllegroStandard();
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
        _hashCode += getItemIsAllegroStandard();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoNewAuctionExtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse"));
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
        elemField.setFieldName("itemIsAllegroStandard");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemIsAllegroStandard"));
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

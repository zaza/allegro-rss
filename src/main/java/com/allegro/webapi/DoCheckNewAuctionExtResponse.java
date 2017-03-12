/**
 * DoCheckNewAuctionExtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoCheckNewAuctionExtResponse  implements java.io.Serializable {
    private java.lang.String itemPrice;

    private java.lang.String itemPriceDesc;

    private int itemIsAllegroStandard;

    public DoCheckNewAuctionExtResponse() {
    }

    public DoCheckNewAuctionExtResponse(
           java.lang.String itemPrice,
           java.lang.String itemPriceDesc,
           int itemIsAllegroStandard) {
           this.itemPrice = itemPrice;
           this.itemPriceDesc = itemPriceDesc;
           this.itemIsAllegroStandard = itemIsAllegroStandard;
    }


    /**
     * Gets the itemPrice value for this DoCheckNewAuctionExtResponse.
     * 
     * @return itemPrice
     */
    public java.lang.String getItemPrice() {
        return itemPrice;
    }


    /**
     * Sets the itemPrice value for this DoCheckNewAuctionExtResponse.
     * 
     * @param itemPrice
     */
    public void setItemPrice(java.lang.String itemPrice) {
        this.itemPrice = itemPrice;
    }


    /**
     * Gets the itemPriceDesc value for this DoCheckNewAuctionExtResponse.
     * 
     * @return itemPriceDesc
     */
    public java.lang.String getItemPriceDesc() {
        return itemPriceDesc;
    }


    /**
     * Sets the itemPriceDesc value for this DoCheckNewAuctionExtResponse.
     * 
     * @param itemPriceDesc
     */
    public void setItemPriceDesc(java.lang.String itemPriceDesc) {
        this.itemPriceDesc = itemPriceDesc;
    }


    /**
     * Gets the itemIsAllegroStandard value for this DoCheckNewAuctionExtResponse.
     * 
     * @return itemIsAllegroStandard
     */
    public int getItemIsAllegroStandard() {
        return itemIsAllegroStandard;
    }


    /**
     * Sets the itemIsAllegroStandard value for this DoCheckNewAuctionExtResponse.
     * 
     * @param itemIsAllegroStandard
     */
    public void setItemIsAllegroStandard(int itemIsAllegroStandard) {
        this.itemIsAllegroStandard = itemIsAllegroStandard;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCheckNewAuctionExtResponse)) return false;
        DoCheckNewAuctionExtResponse other = (DoCheckNewAuctionExtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemPrice==null && other.getItemPrice()==null) || 
             (this.itemPrice!=null &&
              this.itemPrice.equals(other.getItemPrice()))) &&
            ((this.itemPriceDesc==null && other.getItemPriceDesc()==null) || 
             (this.itemPriceDesc!=null &&
              this.itemPriceDesc.equals(other.getItemPriceDesc()))) &&
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
        if (getItemPrice() != null) {
            _hashCode += getItemPrice().hashCode();
        }
        if (getItemPriceDesc() != null) {
            _hashCode += getItemPriceDesc().hashCode();
        }
        _hashCode += getItemIsAllegroStandard();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCheckNewAuctionExtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPriceDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPriceDesc"));
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

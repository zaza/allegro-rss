/**
 * SellRatingDetailStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class SellRatingDetailStruct  implements java.io.Serializable {
    private java.lang.String sellRatingGroupTitle;

    private com.allegro.webapi.ArrayOfSellratingreasonsumstruct sellRatingReasonsSummary;

    public SellRatingDetailStruct() {
    }

    public SellRatingDetailStruct(
           java.lang.String sellRatingGroupTitle,
           com.allegro.webapi.ArrayOfSellratingreasonsumstruct sellRatingReasonsSummary) {
           this.sellRatingGroupTitle = sellRatingGroupTitle;
           this.sellRatingReasonsSummary = sellRatingReasonsSummary;
    }


    /**
     * Gets the sellRatingGroupTitle value for this SellRatingDetailStruct.
     * 
     * @return sellRatingGroupTitle
     */
    public java.lang.String getSellRatingGroupTitle() {
        return sellRatingGroupTitle;
    }


    /**
     * Sets the sellRatingGroupTitle value for this SellRatingDetailStruct.
     * 
     * @param sellRatingGroupTitle
     */
    public void setSellRatingGroupTitle(java.lang.String sellRatingGroupTitle) {
        this.sellRatingGroupTitle = sellRatingGroupTitle;
    }


    /**
     * Gets the sellRatingReasonsSummary value for this SellRatingDetailStruct.
     * 
     * @return sellRatingReasonsSummary
     */
    public com.allegro.webapi.ArrayOfSellratingreasonsumstruct getSellRatingReasonsSummary() {
        return sellRatingReasonsSummary;
    }


    /**
     * Sets the sellRatingReasonsSummary value for this SellRatingDetailStruct.
     * 
     * @param sellRatingReasonsSummary
     */
    public void setSellRatingReasonsSummary(com.allegro.webapi.ArrayOfSellratingreasonsumstruct sellRatingReasonsSummary) {
        this.sellRatingReasonsSummary = sellRatingReasonsSummary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellRatingDetailStruct)) return false;
        SellRatingDetailStruct other = (SellRatingDetailStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellRatingGroupTitle==null && other.getSellRatingGroupTitle()==null) || 
             (this.sellRatingGroupTitle!=null &&
              this.sellRatingGroupTitle.equals(other.getSellRatingGroupTitle()))) &&
            ((this.sellRatingReasonsSummary==null && other.getSellRatingReasonsSummary()==null) || 
             (this.sellRatingReasonsSummary!=null &&
              this.sellRatingReasonsSummary.equals(other.getSellRatingReasonsSummary())));
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
        if (getSellRatingGroupTitle() != null) {
            _hashCode += getSellRatingGroupTitle().hashCode();
        }
        if (getSellRatingReasonsSummary() != null) {
            _hashCode += getSellRatingReasonsSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellRatingDetailStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingDetailStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingGroupTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingGroupTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingReasonsSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingReasonsSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingreasonsumstruct"));
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

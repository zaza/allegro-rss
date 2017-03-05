/**
 * SellRatingAveragePerMonthStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class SellRatingAveragePerMonthStruct  implements java.io.Serializable {
    private java.lang.String sellRatingMonth;

    private com.allegro.webapi.ArrayOfSellratingstatsstruct sellRatingAverageValues;

    public SellRatingAveragePerMonthStruct() {
    }

    public SellRatingAveragePerMonthStruct(
           java.lang.String sellRatingMonth,
           com.allegro.webapi.ArrayOfSellratingstatsstruct sellRatingAverageValues) {
           this.sellRatingMonth = sellRatingMonth;
           this.sellRatingAverageValues = sellRatingAverageValues;
    }


    /**
     * Gets the sellRatingMonth value for this SellRatingAveragePerMonthStruct.
     * 
     * @return sellRatingMonth
     */
    public java.lang.String getSellRatingMonth() {
        return sellRatingMonth;
    }


    /**
     * Sets the sellRatingMonth value for this SellRatingAveragePerMonthStruct.
     * 
     * @param sellRatingMonth
     */
    public void setSellRatingMonth(java.lang.String sellRatingMonth) {
        this.sellRatingMonth = sellRatingMonth;
    }


    /**
     * Gets the sellRatingAverageValues value for this SellRatingAveragePerMonthStruct.
     * 
     * @return sellRatingAverageValues
     */
    public com.allegro.webapi.ArrayOfSellratingstatsstruct getSellRatingAverageValues() {
        return sellRatingAverageValues;
    }


    /**
     * Sets the sellRatingAverageValues value for this SellRatingAveragePerMonthStruct.
     * 
     * @param sellRatingAverageValues
     */
    public void setSellRatingAverageValues(com.allegro.webapi.ArrayOfSellratingstatsstruct sellRatingAverageValues) {
        this.sellRatingAverageValues = sellRatingAverageValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellRatingAveragePerMonthStruct)) return false;
        SellRatingAveragePerMonthStruct other = (SellRatingAveragePerMonthStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellRatingMonth==null && other.getSellRatingMonth()==null) || 
             (this.sellRatingMonth!=null &&
              this.sellRatingMonth.equals(other.getSellRatingMonth()))) &&
            ((this.sellRatingAverageValues==null && other.getSellRatingAverageValues()==null) || 
             (this.sellRatingAverageValues!=null &&
              this.sellRatingAverageValues.equals(other.getSellRatingAverageValues())));
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
        if (getSellRatingMonth() != null) {
            _hashCode += getSellRatingMonth().hashCode();
        }
        if (getSellRatingAverageValues() != null) {
            _hashCode += getSellRatingAverageValues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellRatingAveragePerMonthStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAveragePerMonthStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingAverageValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingAverageValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingstatsstruct"));
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

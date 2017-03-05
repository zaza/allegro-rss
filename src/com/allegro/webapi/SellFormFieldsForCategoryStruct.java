/**
 * SellFormFieldsForCategoryStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class SellFormFieldsForCategoryStruct  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfSellformtype sellFormFieldsList;

    private long sellFormFieldsVersionKey;

    private java.lang.String sellFormFieldsComponentValue;

    public SellFormFieldsForCategoryStruct() {
    }

    public SellFormFieldsForCategoryStruct(
           com.allegro.webapi.ArrayOfSellformtype sellFormFieldsList,
           long sellFormFieldsVersionKey,
           java.lang.String sellFormFieldsComponentValue) {
           this.sellFormFieldsList = sellFormFieldsList;
           this.sellFormFieldsVersionKey = sellFormFieldsVersionKey;
           this.sellFormFieldsComponentValue = sellFormFieldsComponentValue;
    }


    /**
     * Gets the sellFormFieldsList value for this SellFormFieldsForCategoryStruct.
     * 
     * @return sellFormFieldsList
     */
    public com.allegro.webapi.ArrayOfSellformtype getSellFormFieldsList() {
        return sellFormFieldsList;
    }


    /**
     * Sets the sellFormFieldsList value for this SellFormFieldsForCategoryStruct.
     * 
     * @param sellFormFieldsList
     */
    public void setSellFormFieldsList(com.allegro.webapi.ArrayOfSellformtype sellFormFieldsList) {
        this.sellFormFieldsList = sellFormFieldsList;
    }


    /**
     * Gets the sellFormFieldsVersionKey value for this SellFormFieldsForCategoryStruct.
     * 
     * @return sellFormFieldsVersionKey
     */
    public long getSellFormFieldsVersionKey() {
        return sellFormFieldsVersionKey;
    }


    /**
     * Sets the sellFormFieldsVersionKey value for this SellFormFieldsForCategoryStruct.
     * 
     * @param sellFormFieldsVersionKey
     */
    public void setSellFormFieldsVersionKey(long sellFormFieldsVersionKey) {
        this.sellFormFieldsVersionKey = sellFormFieldsVersionKey;
    }


    /**
     * Gets the sellFormFieldsComponentValue value for this SellFormFieldsForCategoryStruct.
     * 
     * @return sellFormFieldsComponentValue
     */
    public java.lang.String getSellFormFieldsComponentValue() {
        return sellFormFieldsComponentValue;
    }


    /**
     * Sets the sellFormFieldsComponentValue value for this SellFormFieldsForCategoryStruct.
     * 
     * @param sellFormFieldsComponentValue
     */
    public void setSellFormFieldsComponentValue(java.lang.String sellFormFieldsComponentValue) {
        this.sellFormFieldsComponentValue = sellFormFieldsComponentValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellFormFieldsForCategoryStruct)) return false;
        SellFormFieldsForCategoryStruct other = (SellFormFieldsForCategoryStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellFormFieldsList==null && other.getSellFormFieldsList()==null) || 
             (this.sellFormFieldsList!=null &&
              this.sellFormFieldsList.equals(other.getSellFormFieldsList()))) &&
            this.sellFormFieldsVersionKey == other.getSellFormFieldsVersionKey() &&
            ((this.sellFormFieldsComponentValue==null && other.getSellFormFieldsComponentValue()==null) || 
             (this.sellFormFieldsComponentValue!=null &&
              this.sellFormFieldsComponentValue.equals(other.getSellFormFieldsComponentValue())));
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
        if (getSellFormFieldsList() != null) {
            _hashCode += getSellFormFieldsList().hashCode();
        }
        _hashCode += new Long(getSellFormFieldsVersionKey()).hashCode();
        if (getSellFormFieldsComponentValue() != null) {
            _hashCode += getSellFormFieldsComponentValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellFormFieldsForCategoryStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormFieldsForCategoryStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellFormFieldsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellFormFieldsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellformtype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellFormFieldsVersionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellFormFieldsVersionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellFormFieldsComponentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellFormFieldsComponentValue"));
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

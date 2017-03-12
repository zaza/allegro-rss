/**
 * DoGetSellFormFieldsForCategoryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetSellFormFieldsForCategoryRequest  implements java.io.Serializable {
    private java.lang.String webapiKey;

    private int countryId;

    private int categoryId;

    public DoGetSellFormFieldsForCategoryRequest() {
    }

    public DoGetSellFormFieldsForCategoryRequest(
           java.lang.String webapiKey,
           int countryId,
           int categoryId) {
           this.webapiKey = webapiKey;
           this.countryId = countryId;
           this.categoryId = categoryId;
    }


    /**
     * Gets the webapiKey value for this DoGetSellFormFieldsForCategoryRequest.
     * 
     * @return webapiKey
     */
    public java.lang.String getWebapiKey() {
        return webapiKey;
    }


    /**
     * Sets the webapiKey value for this DoGetSellFormFieldsForCategoryRequest.
     * 
     * @param webapiKey
     */
    public void setWebapiKey(java.lang.String webapiKey) {
        this.webapiKey = webapiKey;
    }


    /**
     * Gets the countryId value for this DoGetSellFormFieldsForCategoryRequest.
     * 
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this DoGetSellFormFieldsForCategoryRequest.
     * 
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the categoryId value for this DoGetSellFormFieldsForCategoryRequest.
     * 
     * @return categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this DoGetSellFormFieldsForCategoryRequest.
     * 
     * @param categoryId
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSellFormFieldsForCategoryRequest)) return false;
        DoGetSellFormFieldsForCategoryRequest other = (DoGetSellFormFieldsForCategoryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webapiKey==null && other.getWebapiKey()==null) || 
             (this.webapiKey!=null &&
              this.webapiKey.equals(other.getWebapiKey()))) &&
            this.countryId == other.getCountryId() &&
            this.categoryId == other.getCategoryId();
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
        if (getWebapiKey() != null) {
            _hashCode += getWebapiKey().hashCode();
        }
        _hashCode += getCountryId();
        _hashCode += getCategoryId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSellFormFieldsForCategoryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webapiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "webapiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "categoryId"));
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

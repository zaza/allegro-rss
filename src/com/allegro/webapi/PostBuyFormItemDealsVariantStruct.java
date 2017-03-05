/**
 * PostBuyFormItemDealsVariantStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PostBuyFormItemDealsVariantStruct  implements java.io.Serializable {
    private java.lang.String variantName;

    private java.lang.String variantValue;

    public PostBuyFormItemDealsVariantStruct() {
    }

    public PostBuyFormItemDealsVariantStruct(
           java.lang.String variantName,
           java.lang.String variantValue) {
           this.variantName = variantName;
           this.variantValue = variantValue;
    }


    /**
     * Gets the variantName value for this PostBuyFormItemDealsVariantStruct.
     * 
     * @return variantName
     */
    public java.lang.String getVariantName() {
        return variantName;
    }


    /**
     * Sets the variantName value for this PostBuyFormItemDealsVariantStruct.
     * 
     * @param variantName
     */
    public void setVariantName(java.lang.String variantName) {
        this.variantName = variantName;
    }


    /**
     * Gets the variantValue value for this PostBuyFormItemDealsVariantStruct.
     * 
     * @return variantValue
     */
    public java.lang.String getVariantValue() {
        return variantValue;
    }


    /**
     * Sets the variantValue value for this PostBuyFormItemDealsVariantStruct.
     * 
     * @param variantValue
     */
    public void setVariantValue(java.lang.String variantValue) {
        this.variantValue = variantValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormItemDealsVariantStruct)) return false;
        PostBuyFormItemDealsVariantStruct other = (PostBuyFormItemDealsVariantStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.variantName==null && other.getVariantName()==null) || 
             (this.variantName!=null &&
              this.variantName.equals(other.getVariantName()))) &&
            ((this.variantValue==null && other.getVariantValue()==null) || 
             (this.variantValue!=null &&
              this.variantValue.equals(other.getVariantValue())));
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
        if (getVariantName() != null) {
            _hashCode += getVariantName().hashCode();
        }
        if (getVariantValue() != null) {
            _hashCode += getVariantValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostBuyFormItemDealsVariantStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsVariantStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variantName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "variantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variantValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "variantValue"));
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

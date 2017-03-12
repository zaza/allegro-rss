/**
 * ProductParametersGroupStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ProductParametersGroupStruct  implements java.io.Serializable {
    private java.lang.String productParametersGroupName;

    private com.allegro.webapi.ArrayOfProductparametersstruct productParametersList;

    public ProductParametersGroupStruct() {
    }

    public ProductParametersGroupStruct(
           java.lang.String productParametersGroupName,
           com.allegro.webapi.ArrayOfProductparametersstruct productParametersList) {
           this.productParametersGroupName = productParametersGroupName;
           this.productParametersList = productParametersList;
    }


    /**
     * Gets the productParametersGroupName value for this ProductParametersGroupStruct.
     * 
     * @return productParametersGroupName
     */
    public java.lang.String getProductParametersGroupName() {
        return productParametersGroupName;
    }


    /**
     * Sets the productParametersGroupName value for this ProductParametersGroupStruct.
     * 
     * @param productParametersGroupName
     */
    public void setProductParametersGroupName(java.lang.String productParametersGroupName) {
        this.productParametersGroupName = productParametersGroupName;
    }


    /**
     * Gets the productParametersList value for this ProductParametersGroupStruct.
     * 
     * @return productParametersList
     */
    public com.allegro.webapi.ArrayOfProductparametersstruct getProductParametersList() {
        return productParametersList;
    }


    /**
     * Sets the productParametersList value for this ProductParametersGroupStruct.
     * 
     * @param productParametersList
     */
    public void setProductParametersList(com.allegro.webapi.ArrayOfProductparametersstruct productParametersList) {
        this.productParametersList = productParametersList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductParametersGroupStruct)) return false;
        ProductParametersGroupStruct other = (ProductParametersGroupStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productParametersGroupName==null && other.getProductParametersGroupName()==null) || 
             (this.productParametersGroupName!=null &&
              this.productParametersGroupName.equals(other.getProductParametersGroupName()))) &&
            ((this.productParametersList==null && other.getProductParametersList()==null) || 
             (this.productParametersList!=null &&
              this.productParametersList.equals(other.getProductParametersList())));
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
        if (getProductParametersGroupName() != null) {
            _hashCode += getProductParametersGroupName().hashCode();
        }
        if (getProductParametersList() != null) {
            _hashCode += getProductParametersList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductParametersGroupStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersGroupStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productParametersGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "productParametersGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productParametersList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "productParametersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersstruct"));
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

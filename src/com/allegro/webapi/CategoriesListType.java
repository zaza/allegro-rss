/**
 * CategoriesListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class CategoriesListType  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfCategorytreetype categoriesTree;

    private com.allegro.webapi.ArrayOfCategorypathtype categoriesPath;

    public CategoriesListType() {
    }

    public CategoriesListType(
           com.allegro.webapi.ArrayOfCategorytreetype categoriesTree,
           com.allegro.webapi.ArrayOfCategorypathtype categoriesPath) {
           this.categoriesTree = categoriesTree;
           this.categoriesPath = categoriesPath;
    }


    /**
     * Gets the categoriesTree value for this CategoriesListType.
     * 
     * @return categoriesTree
     */
    public com.allegro.webapi.ArrayOfCategorytreetype getCategoriesTree() {
        return categoriesTree;
    }


    /**
     * Sets the categoriesTree value for this CategoriesListType.
     * 
     * @param categoriesTree
     */
    public void setCategoriesTree(com.allegro.webapi.ArrayOfCategorytreetype categoriesTree) {
        this.categoriesTree = categoriesTree;
    }


    /**
     * Gets the categoriesPath value for this CategoriesListType.
     * 
     * @return categoriesPath
     */
    public com.allegro.webapi.ArrayOfCategorypathtype getCategoriesPath() {
        return categoriesPath;
    }


    /**
     * Sets the categoriesPath value for this CategoriesListType.
     * 
     * @param categoriesPath
     */
    public void setCategoriesPath(com.allegro.webapi.ArrayOfCategorypathtype categoriesPath) {
        this.categoriesPath = categoriesPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoriesListType)) return false;
        CategoriesListType other = (CategoriesListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoriesTree==null && other.getCategoriesTree()==null) || 
             (this.categoriesTree!=null &&
              this.categoriesTree.equals(other.getCategoriesTree()))) &&
            ((this.categoriesPath==null && other.getCategoriesPath()==null) || 
             (this.categoriesPath!=null &&
              this.categoriesPath.equals(other.getCategoriesPath())));
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
        if (getCategoriesTree() != null) {
            _hashCode += getCategoriesTree().hashCode();
        }
        if (getCategoriesPath() != null) {
            _hashCode += getCategoriesPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoriesListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriesTree");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "categoriesTree"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorytreetype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriesPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "categoriesPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorypathtype"));
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

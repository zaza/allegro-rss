/**
 * CategoryData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class CategoryData  implements java.io.Serializable {
    private int catId;

    private int catParent;

    private int catCountry;

    private int catLevel;

    private int catIsLeaf;

    private java.lang.String catName;

    private int catOptions;

    public CategoryData() {
    }

    public CategoryData(
           int catId,
           int catParent,
           int catCountry,
           int catLevel,
           int catIsLeaf,
           java.lang.String catName,
           int catOptions) {
           this.catId = catId;
           this.catParent = catParent;
           this.catCountry = catCountry;
           this.catLevel = catLevel;
           this.catIsLeaf = catIsLeaf;
           this.catName = catName;
           this.catOptions = catOptions;
    }


    /**
     * Gets the catId value for this CategoryData.
     * 
     * @return catId
     */
    public int getCatId() {
        return catId;
    }


    /**
     * Sets the catId value for this CategoryData.
     * 
     * @param catId
     */
    public void setCatId(int catId) {
        this.catId = catId;
    }


    /**
     * Gets the catParent value for this CategoryData.
     * 
     * @return catParent
     */
    public int getCatParent() {
        return catParent;
    }


    /**
     * Sets the catParent value for this CategoryData.
     * 
     * @param catParent
     */
    public void setCatParent(int catParent) {
        this.catParent = catParent;
    }


    /**
     * Gets the catCountry value for this CategoryData.
     * 
     * @return catCountry
     */
    public int getCatCountry() {
        return catCountry;
    }


    /**
     * Sets the catCountry value for this CategoryData.
     * 
     * @param catCountry
     */
    public void setCatCountry(int catCountry) {
        this.catCountry = catCountry;
    }


    /**
     * Gets the catLevel value for this CategoryData.
     * 
     * @return catLevel
     */
    public int getCatLevel() {
        return catLevel;
    }


    /**
     * Sets the catLevel value for this CategoryData.
     * 
     * @param catLevel
     */
    public void setCatLevel(int catLevel) {
        this.catLevel = catLevel;
    }


    /**
     * Gets the catIsLeaf value for this CategoryData.
     * 
     * @return catIsLeaf
     */
    public int getCatIsLeaf() {
        return catIsLeaf;
    }


    /**
     * Sets the catIsLeaf value for this CategoryData.
     * 
     * @param catIsLeaf
     */
    public void setCatIsLeaf(int catIsLeaf) {
        this.catIsLeaf = catIsLeaf;
    }


    /**
     * Gets the catName value for this CategoryData.
     * 
     * @return catName
     */
    public java.lang.String getCatName() {
        return catName;
    }


    /**
     * Sets the catName value for this CategoryData.
     * 
     * @param catName
     */
    public void setCatName(java.lang.String catName) {
        this.catName = catName;
    }


    /**
     * Gets the catOptions value for this CategoryData.
     * 
     * @return catOptions
     */
    public int getCatOptions() {
        return catOptions;
    }


    /**
     * Sets the catOptions value for this CategoryData.
     * 
     * @param catOptions
     */
    public void setCatOptions(int catOptions) {
        this.catOptions = catOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoryData)) return false;
        CategoryData other = (CategoryData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.catId == other.getCatId() &&
            this.catParent == other.getCatParent() &&
            this.catCountry == other.getCatCountry() &&
            this.catLevel == other.getCatLevel() &&
            this.catIsLeaf == other.getCatIsLeaf() &&
            ((this.catName==null && other.getCatName()==null) || 
             (this.catName!=null &&
              this.catName.equals(other.getCatName()))) &&
            this.catOptions == other.getCatOptions();
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
        _hashCode += getCatId();
        _hashCode += getCatParent();
        _hashCode += getCatCountry();
        _hashCode += getCatLevel();
        _hashCode += getCatIsLeaf();
        if (getCatName() != null) {
            _hashCode += getCatName().hashCode();
        }
        _hashCode += getCatOptions();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoryData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catParent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catIsLeaf");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catIsLeaf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catOptions"));
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

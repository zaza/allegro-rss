/**
 * DoGetShopsTagsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetShopsTagsResponse  implements java.io.Serializable {
    private int shopsTagsCount;

    private com.allegro.webapi.ArrayOfShopstagtypestruct shopsTags;

    public DoGetShopsTagsResponse() {
    }

    public DoGetShopsTagsResponse(
           int shopsTagsCount,
           com.allegro.webapi.ArrayOfShopstagtypestruct shopsTags) {
           this.shopsTagsCount = shopsTagsCount;
           this.shopsTags = shopsTags;
    }


    /**
     * Gets the shopsTagsCount value for this DoGetShopsTagsResponse.
     * 
     * @return shopsTagsCount
     */
    public int getShopsTagsCount() {
        return shopsTagsCount;
    }


    /**
     * Sets the shopsTagsCount value for this DoGetShopsTagsResponse.
     * 
     * @param shopsTagsCount
     */
    public void setShopsTagsCount(int shopsTagsCount) {
        this.shopsTagsCount = shopsTagsCount;
    }


    /**
     * Gets the shopsTags value for this DoGetShopsTagsResponse.
     * 
     * @return shopsTags
     */
    public com.allegro.webapi.ArrayOfShopstagtypestruct getShopsTags() {
        return shopsTags;
    }


    /**
     * Sets the shopsTags value for this DoGetShopsTagsResponse.
     * 
     * @param shopsTags
     */
    public void setShopsTags(com.allegro.webapi.ArrayOfShopstagtypestruct shopsTags) {
        this.shopsTags = shopsTags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetShopsTagsResponse)) return false;
        DoGetShopsTagsResponse other = (DoGetShopsTagsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.shopsTagsCount == other.getShopsTagsCount() &&
            ((this.shopsTags==null && other.getShopsTags()==null) || 
             (this.shopsTags!=null &&
              this.shopsTags.equals(other.getShopsTags())));
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
        _hashCode += getShopsTagsCount();
        if (getShopsTags() != null) {
            _hashCode += getShopsTags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetShopsTagsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShopsTagsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopsTagsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shopsTagsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopsTags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shopsTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShopstagtypestruct"));
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

/**
 * FilterPriceStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class FilterPriceStruct  implements java.io.Serializable {
    private java.lang.Float filterPriceFrom;

    private java.lang.Float filterPriceTo;

    public FilterPriceStruct() {
    }

    public FilterPriceStruct(
           java.lang.Float filterPriceFrom,
           java.lang.Float filterPriceTo) {
           this.filterPriceFrom = filterPriceFrom;
           this.filterPriceTo = filterPriceTo;
    }


    /**
     * Gets the filterPriceFrom value for this FilterPriceStruct.
     * 
     * @return filterPriceFrom
     */
    public java.lang.Float getFilterPriceFrom() {
        return filterPriceFrom;
    }


    /**
     * Sets the filterPriceFrom value for this FilterPriceStruct.
     * 
     * @param filterPriceFrom
     */
    public void setFilterPriceFrom(java.lang.Float filterPriceFrom) {
        this.filterPriceFrom = filterPriceFrom;
    }


    /**
     * Gets the filterPriceTo value for this FilterPriceStruct.
     * 
     * @return filterPriceTo
     */
    public java.lang.Float getFilterPriceTo() {
        return filterPriceTo;
    }


    /**
     * Sets the filterPriceTo value for this FilterPriceStruct.
     * 
     * @param filterPriceTo
     */
    public void setFilterPriceTo(java.lang.Float filterPriceTo) {
        this.filterPriceTo = filterPriceTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterPriceStruct)) return false;
        FilterPriceStruct other = (FilterPriceStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filterPriceFrom==null && other.getFilterPriceFrom()==null) || 
             (this.filterPriceFrom!=null &&
              this.filterPriceFrom.equals(other.getFilterPriceFrom()))) &&
            ((this.filterPriceTo==null && other.getFilterPriceTo()==null) || 
             (this.filterPriceTo!=null &&
              this.filterPriceTo.equals(other.getFilterPriceTo())));
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
        if (getFilterPriceFrom() != null) {
            _hashCode += getFilterPriceFrom().hashCode();
        }
        if (getFilterPriceTo() != null) {
            _hashCode += getFilterPriceTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterPriceStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterPriceStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterPriceFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterPriceFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterPriceTo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterPriceTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

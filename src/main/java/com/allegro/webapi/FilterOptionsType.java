/**
 * FilterOptionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class FilterOptionsType  implements java.io.Serializable {
    private java.lang.String filterId;

    private com.allegro.webapi.ArrayOfString filterValueId;

    private com.allegro.webapi.RangeValueType filterValueRange;

    public FilterOptionsType() {
    }

    public FilterOptionsType(
           java.lang.String filterId,
           com.allegro.webapi.ArrayOfString filterValueId,
           com.allegro.webapi.RangeValueType filterValueRange) {
           this.filterId = filterId;
           this.filterValueId = filterValueId;
           this.filterValueRange = filterValueRange;
    }


    /**
     * Gets the filterId value for this FilterOptionsType.
     * 
     * @return filterId
     */
    public java.lang.String getFilterId() {
        return filterId;
    }


    /**
     * Sets the filterId value for this FilterOptionsType.
     * 
     * @param filterId
     */
    public void setFilterId(java.lang.String filterId) {
        this.filterId = filterId;
    }


    /**
     * Gets the filterValueId value for this FilterOptionsType.
     * 
     * @return filterValueId
     */
    public com.allegro.webapi.ArrayOfString getFilterValueId() {
        return filterValueId;
    }


    /**
     * Sets the filterValueId value for this FilterOptionsType.
     * 
     * @param filterValueId
     */
    public void setFilterValueId(com.allegro.webapi.ArrayOfString filterValueId) {
        this.filterValueId = filterValueId;
    }


    /**
     * Gets the filterValueRange value for this FilterOptionsType.
     * 
     * @return filterValueRange
     */
    public com.allegro.webapi.RangeValueType getFilterValueRange() {
        return filterValueRange;
    }


    /**
     * Sets the filterValueRange value for this FilterOptionsType.
     * 
     * @param filterValueRange
     */
    public void setFilterValueRange(com.allegro.webapi.RangeValueType filterValueRange) {
        this.filterValueRange = filterValueRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterOptionsType)) return false;
        FilterOptionsType other = (FilterOptionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filterId==null && other.getFilterId()==null) || 
             (this.filterId!=null &&
              this.filterId.equals(other.getFilterId()))) &&
            ((this.filterValueId==null && other.getFilterValueId()==null) || 
             (this.filterValueId!=null &&
              this.filterValueId.equals(other.getFilterValueId()))) &&
            ((this.filterValueRange==null && other.getFilterValueRange()==null) || 
             (this.filterValueRange!=null &&
              this.filterValueRange.equals(other.getFilterValueRange())));
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
        if (getFilterId() != null) {
            _hashCode += getFilterId().hashCode();
        }
        if (getFilterValueId() != null) {
            _hashCode += getFilterValueId().hashCode();
        }
        if (getFilterValueRange() != null) {
            _hashCode += getFilterValueRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterOptionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterOptionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterValueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValueRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterValueRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeValueType"));
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

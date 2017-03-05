/**
 * FilterValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class FilterValueType  implements java.io.Serializable {
    private java.lang.String filterValueId;

    private java.lang.String filterValueName;

    private java.lang.Integer filterValueCount;

    public FilterValueType() {
    }

    public FilterValueType(
           java.lang.String filterValueId,
           java.lang.String filterValueName,
           java.lang.Integer filterValueCount) {
           this.filterValueId = filterValueId;
           this.filterValueName = filterValueName;
           this.filterValueCount = filterValueCount;
    }


    /**
     * Gets the filterValueId value for this FilterValueType.
     * 
     * @return filterValueId
     */
    public java.lang.String getFilterValueId() {
        return filterValueId;
    }


    /**
     * Sets the filterValueId value for this FilterValueType.
     * 
     * @param filterValueId
     */
    public void setFilterValueId(java.lang.String filterValueId) {
        this.filterValueId = filterValueId;
    }


    /**
     * Gets the filterValueName value for this FilterValueType.
     * 
     * @return filterValueName
     */
    public java.lang.String getFilterValueName() {
        return filterValueName;
    }


    /**
     * Sets the filterValueName value for this FilterValueType.
     * 
     * @param filterValueName
     */
    public void setFilterValueName(java.lang.String filterValueName) {
        this.filterValueName = filterValueName;
    }


    /**
     * Gets the filterValueCount value for this FilterValueType.
     * 
     * @return filterValueCount
     */
    public java.lang.Integer getFilterValueCount() {
        return filterValueCount;
    }


    /**
     * Sets the filterValueCount value for this FilterValueType.
     * 
     * @param filterValueCount
     */
    public void setFilterValueCount(java.lang.Integer filterValueCount) {
        this.filterValueCount = filterValueCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterValueType)) return false;
        FilterValueType other = (FilterValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filterValueId==null && other.getFilterValueId()==null) || 
             (this.filterValueId!=null &&
              this.filterValueId.equals(other.getFilterValueId()))) &&
            ((this.filterValueName==null && other.getFilterValueName()==null) || 
             (this.filterValueName!=null &&
              this.filterValueName.equals(other.getFilterValueName()))) &&
            ((this.filterValueCount==null && other.getFilterValueCount()==null) || 
             (this.filterValueCount!=null &&
              this.filterValueCount.equals(other.getFilterValueCount())));
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
        if (getFilterValueId() != null) {
            _hashCode += getFilterValueId().hashCode();
        }
        if (getFilterValueName() != null) {
            _hashCode += getFilterValueName().hashCode();
        }
        if (getFilterValueCount() != null) {
            _hashCode += getFilterValueCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterValueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValueName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterValueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValueCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterValueCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

/**
 * RangeValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class RangeValueType  implements java.io.Serializable {
    private java.lang.String rangeValueMin;

    private java.lang.String rangeValueMax;

    public RangeValueType() {
    }

    public RangeValueType(
           java.lang.String rangeValueMin,
           java.lang.String rangeValueMax) {
           this.rangeValueMin = rangeValueMin;
           this.rangeValueMax = rangeValueMax;
    }


    /**
     * Gets the rangeValueMin value for this RangeValueType.
     * 
     * @return rangeValueMin
     */
    public java.lang.String getRangeValueMin() {
        return rangeValueMin;
    }


    /**
     * Sets the rangeValueMin value for this RangeValueType.
     * 
     * @param rangeValueMin
     */
    public void setRangeValueMin(java.lang.String rangeValueMin) {
        this.rangeValueMin = rangeValueMin;
    }


    /**
     * Gets the rangeValueMax value for this RangeValueType.
     * 
     * @return rangeValueMax
     */
    public java.lang.String getRangeValueMax() {
        return rangeValueMax;
    }


    /**
     * Sets the rangeValueMax value for this RangeValueType.
     * 
     * @param rangeValueMax
     */
    public void setRangeValueMax(java.lang.String rangeValueMax) {
        this.rangeValueMax = rangeValueMax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RangeValueType)) return false;
        RangeValueType other = (RangeValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rangeValueMin==null && other.getRangeValueMin()==null) || 
             (this.rangeValueMin!=null &&
              this.rangeValueMin.equals(other.getRangeValueMin()))) &&
            ((this.rangeValueMax==null && other.getRangeValueMax()==null) || 
             (this.rangeValueMax!=null &&
              this.rangeValueMax.equals(other.getRangeValueMax())));
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
        if (getRangeValueMin() != null) {
            _hashCode += getRangeValueMin().hashCode();
        }
        if (getRangeValueMax() != null) {
            _hashCode += getRangeValueMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RangeValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeValueMin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "rangeValueMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeValueMax");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "rangeValueMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

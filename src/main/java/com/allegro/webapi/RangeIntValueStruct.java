/**
 * RangeIntValueStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class RangeIntValueStruct  implements java.io.Serializable {
    private java.lang.Integer fvalueRangeIntMin;

    private java.lang.Integer fvalueRangeIntMax;

    public RangeIntValueStruct() {
    }

    public RangeIntValueStruct(
           java.lang.Integer fvalueRangeIntMin,
           java.lang.Integer fvalueRangeIntMax) {
           this.fvalueRangeIntMin = fvalueRangeIntMin;
           this.fvalueRangeIntMax = fvalueRangeIntMax;
    }


    /**
     * Gets the fvalueRangeIntMin value for this RangeIntValueStruct.
     * 
     * @return fvalueRangeIntMin
     */
    public java.lang.Integer getFvalueRangeIntMin() {
        return fvalueRangeIntMin;
    }


    /**
     * Sets the fvalueRangeIntMin value for this RangeIntValueStruct.
     * 
     * @param fvalueRangeIntMin
     */
    public void setFvalueRangeIntMin(java.lang.Integer fvalueRangeIntMin) {
        this.fvalueRangeIntMin = fvalueRangeIntMin;
    }


    /**
     * Gets the fvalueRangeIntMax value for this RangeIntValueStruct.
     * 
     * @return fvalueRangeIntMax
     */
    public java.lang.Integer getFvalueRangeIntMax() {
        return fvalueRangeIntMax;
    }


    /**
     * Sets the fvalueRangeIntMax value for this RangeIntValueStruct.
     * 
     * @param fvalueRangeIntMax
     */
    public void setFvalueRangeIntMax(java.lang.Integer fvalueRangeIntMax) {
        this.fvalueRangeIntMax = fvalueRangeIntMax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RangeIntValueStruct)) return false;
        RangeIntValueStruct other = (RangeIntValueStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fvalueRangeIntMin==null && other.getFvalueRangeIntMin()==null) || 
             (this.fvalueRangeIntMin!=null &&
              this.fvalueRangeIntMin.equals(other.getFvalueRangeIntMin()))) &&
            ((this.fvalueRangeIntMax==null && other.getFvalueRangeIntMax()==null) || 
             (this.fvalueRangeIntMax!=null &&
              this.fvalueRangeIntMax.equals(other.getFvalueRangeIntMax())));
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
        if (getFvalueRangeIntMin() != null) {
            _hashCode += getFvalueRangeIntMin().hashCode();
        }
        if (getFvalueRangeIntMax() != null) {
            _hashCode += getFvalueRangeIntMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RangeIntValueStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeIntValueStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeIntMin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueRangeIntMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeIntMax");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueRangeIntMax"));
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

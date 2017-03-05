/**
 * RangeFloatValueStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class RangeFloatValueStruct  implements java.io.Serializable {
    private java.lang.Float fvalueRangeFloatMin;

    private java.lang.Float fvalueRangeFloatMax;

    public RangeFloatValueStruct() {
    }

    public RangeFloatValueStruct(
           java.lang.Float fvalueRangeFloatMin,
           java.lang.Float fvalueRangeFloatMax) {
           this.fvalueRangeFloatMin = fvalueRangeFloatMin;
           this.fvalueRangeFloatMax = fvalueRangeFloatMax;
    }


    /**
     * Gets the fvalueRangeFloatMin value for this RangeFloatValueStruct.
     * 
     * @return fvalueRangeFloatMin
     */
    public java.lang.Float getFvalueRangeFloatMin() {
        return fvalueRangeFloatMin;
    }


    /**
     * Sets the fvalueRangeFloatMin value for this RangeFloatValueStruct.
     * 
     * @param fvalueRangeFloatMin
     */
    public void setFvalueRangeFloatMin(java.lang.Float fvalueRangeFloatMin) {
        this.fvalueRangeFloatMin = fvalueRangeFloatMin;
    }


    /**
     * Gets the fvalueRangeFloatMax value for this RangeFloatValueStruct.
     * 
     * @return fvalueRangeFloatMax
     */
    public java.lang.Float getFvalueRangeFloatMax() {
        return fvalueRangeFloatMax;
    }


    /**
     * Sets the fvalueRangeFloatMax value for this RangeFloatValueStruct.
     * 
     * @param fvalueRangeFloatMax
     */
    public void setFvalueRangeFloatMax(java.lang.Float fvalueRangeFloatMax) {
        this.fvalueRangeFloatMax = fvalueRangeFloatMax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RangeFloatValueStruct)) return false;
        RangeFloatValueStruct other = (RangeFloatValueStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fvalueRangeFloatMin==null && other.getFvalueRangeFloatMin()==null) || 
             (this.fvalueRangeFloatMin!=null &&
              this.fvalueRangeFloatMin.equals(other.getFvalueRangeFloatMin()))) &&
            ((this.fvalueRangeFloatMax==null && other.getFvalueRangeFloatMax()==null) || 
             (this.fvalueRangeFloatMax!=null &&
              this.fvalueRangeFloatMax.equals(other.getFvalueRangeFloatMax())));
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
        if (getFvalueRangeFloatMin() != null) {
            _hashCode += getFvalueRangeFloatMin().hashCode();
        }
        if (getFvalueRangeFloatMax() != null) {
            _hashCode += getFvalueRangeFloatMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RangeFloatValueStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeFloatValueStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeFloatMin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueRangeFloatMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeFloatMax");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueRangeFloatMax"));
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

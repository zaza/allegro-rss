/**
 * ParameterInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ParameterInfoType  implements java.io.Serializable {
    private java.lang.String parameterName;

    private com.allegro.webapi.ArrayOfString parameterValue;

    private java.lang.String parameterUnit;

    private boolean parameterIsRange;

    public ParameterInfoType() {
    }

    public ParameterInfoType(
           java.lang.String parameterName,
           com.allegro.webapi.ArrayOfString parameterValue,
           java.lang.String parameterUnit,
           boolean parameterIsRange) {
           this.parameterName = parameterName;
           this.parameterValue = parameterValue;
           this.parameterUnit = parameterUnit;
           this.parameterIsRange = parameterIsRange;
    }


    /**
     * Gets the parameterName value for this ParameterInfoType.
     * 
     * @return parameterName
     */
    public java.lang.String getParameterName() {
        return parameterName;
    }


    /**
     * Sets the parameterName value for this ParameterInfoType.
     * 
     * @param parameterName
     */
    public void setParameterName(java.lang.String parameterName) {
        this.parameterName = parameterName;
    }


    /**
     * Gets the parameterValue value for this ParameterInfoType.
     * 
     * @return parameterValue
     */
    public com.allegro.webapi.ArrayOfString getParameterValue() {
        return parameterValue;
    }


    /**
     * Sets the parameterValue value for this ParameterInfoType.
     * 
     * @param parameterValue
     */
    public void setParameterValue(com.allegro.webapi.ArrayOfString parameterValue) {
        this.parameterValue = parameterValue;
    }


    /**
     * Gets the parameterUnit value for this ParameterInfoType.
     * 
     * @return parameterUnit
     */
    public java.lang.String getParameterUnit() {
        return parameterUnit;
    }


    /**
     * Sets the parameterUnit value for this ParameterInfoType.
     * 
     * @param parameterUnit
     */
    public void setParameterUnit(java.lang.String parameterUnit) {
        this.parameterUnit = parameterUnit;
    }


    /**
     * Gets the parameterIsRange value for this ParameterInfoType.
     * 
     * @return parameterIsRange
     */
    public boolean isParameterIsRange() {
        return parameterIsRange;
    }


    /**
     * Sets the parameterIsRange value for this ParameterInfoType.
     * 
     * @param parameterIsRange
     */
    public void setParameterIsRange(boolean parameterIsRange) {
        this.parameterIsRange = parameterIsRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParameterInfoType)) return false;
        ParameterInfoType other = (ParameterInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameterName==null && other.getParameterName()==null) || 
             (this.parameterName!=null &&
              this.parameterName.equals(other.getParameterName()))) &&
            ((this.parameterValue==null && other.getParameterValue()==null) || 
             (this.parameterValue!=null &&
              this.parameterValue.equals(other.getParameterValue()))) &&
            ((this.parameterUnit==null && other.getParameterUnit()==null) || 
             (this.parameterUnit!=null &&
              this.parameterUnit.equals(other.getParameterUnit()))) &&
            this.parameterIsRange == other.isParameterIsRange();
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
        if (getParameterName() != null) {
            _hashCode += getParameterName().hashCode();
        }
        if (getParameterValue() != null) {
            _hashCode += getParameterValue().hashCode();
        }
        if (getParameterUnit() != null) {
            _hashCode += getParameterUnit().hashCode();
        }
        _hashCode += (isParameterIsRange() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParameterInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ParameterInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "parameterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "parameterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "parameterUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterIsRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "parameterIsRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

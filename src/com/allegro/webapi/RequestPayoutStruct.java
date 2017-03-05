/**
 * RequestPayoutStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class RequestPayoutStruct  implements java.io.Serializable {
    private long payoutId;

    private float payoutAmount;

    private long payoutTime;

    public RequestPayoutStruct() {
    }

    public RequestPayoutStruct(
           long payoutId,
           float payoutAmount,
           long payoutTime) {
           this.payoutId = payoutId;
           this.payoutAmount = payoutAmount;
           this.payoutTime = payoutTime;
    }


    /**
     * Gets the payoutId value for this RequestPayoutStruct.
     * 
     * @return payoutId
     */
    public long getPayoutId() {
        return payoutId;
    }


    /**
     * Sets the payoutId value for this RequestPayoutStruct.
     * 
     * @param payoutId
     */
    public void setPayoutId(long payoutId) {
        this.payoutId = payoutId;
    }


    /**
     * Gets the payoutAmount value for this RequestPayoutStruct.
     * 
     * @return payoutAmount
     */
    public float getPayoutAmount() {
        return payoutAmount;
    }


    /**
     * Sets the payoutAmount value for this RequestPayoutStruct.
     * 
     * @param payoutAmount
     */
    public void setPayoutAmount(float payoutAmount) {
        this.payoutAmount = payoutAmount;
    }


    /**
     * Gets the payoutTime value for this RequestPayoutStruct.
     * 
     * @return payoutTime
     */
    public long getPayoutTime() {
        return payoutTime;
    }


    /**
     * Sets the payoutTime value for this RequestPayoutStruct.
     * 
     * @param payoutTime
     */
    public void setPayoutTime(long payoutTime) {
        this.payoutTime = payoutTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestPayoutStruct)) return false;
        RequestPayoutStruct other = (RequestPayoutStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.payoutId == other.getPayoutId() &&
            this.payoutAmount == other.getPayoutAmount() &&
            this.payoutTime == other.getPayoutTime();
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
        _hashCode += new Long(getPayoutId()).hashCode();
        _hashCode += new Float(getPayoutAmount()).hashCode();
        _hashCode += new Long(getPayoutTime()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestPayoutStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RequestPayoutStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payoutId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payoutAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payoutTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

/**
 * ReasonInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ReasonInfoType  implements java.io.Serializable {
    private int reasonId;

    private java.lang.String reasonName;

    private java.lang.Integer maxQuantity;

    public ReasonInfoType() {
    }

    public ReasonInfoType(
           int reasonId,
           java.lang.String reasonName,
           java.lang.Integer maxQuantity) {
           this.reasonId = reasonId;
           this.reasonName = reasonName;
           this.maxQuantity = maxQuantity;
    }


    /**
     * Gets the reasonId value for this ReasonInfoType.
     * 
     * @return reasonId
     */
    public int getReasonId() {
        return reasonId;
    }


    /**
     * Sets the reasonId value for this ReasonInfoType.
     * 
     * @param reasonId
     */
    public void setReasonId(int reasonId) {
        this.reasonId = reasonId;
    }


    /**
     * Gets the reasonName value for this ReasonInfoType.
     * 
     * @return reasonName
     */
    public java.lang.String getReasonName() {
        return reasonName;
    }


    /**
     * Sets the reasonName value for this ReasonInfoType.
     * 
     * @param reasonName
     */
    public void setReasonName(java.lang.String reasonName) {
        this.reasonName = reasonName;
    }


    /**
     * Gets the maxQuantity value for this ReasonInfoType.
     * 
     * @return maxQuantity
     */
    public java.lang.Integer getMaxQuantity() {
        return maxQuantity;
    }


    /**
     * Sets the maxQuantity value for this ReasonInfoType.
     * 
     * @param maxQuantity
     */
    public void setMaxQuantity(java.lang.Integer maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReasonInfoType)) return false;
        ReasonInfoType other = (ReasonInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.reasonId == other.getReasonId() &&
            ((this.reasonName==null && other.getReasonName()==null) || 
             (this.reasonName!=null &&
              this.reasonName.equals(other.getReasonName()))) &&
            ((this.maxQuantity==null && other.getMaxQuantity()==null) || 
             (this.maxQuantity!=null &&
              this.maxQuantity.equals(other.getMaxQuantity())));
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
        _hashCode += getReasonId();
        if (getReasonName() != null) {
            _hashCode += getReasonName().hashCode();
        }
        if (getMaxQuantity() != null) {
            _hashCode += getMaxQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReasonInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ReasonInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "reasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "reasonName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "maxQuantity"));
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

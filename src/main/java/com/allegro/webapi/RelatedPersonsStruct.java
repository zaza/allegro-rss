/**
 * RelatedPersonsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class RelatedPersonsStruct  implements java.io.Serializable {
    private java.lang.String spouseFirstName;

    private java.lang.String spouseLastName;

    public RelatedPersonsStruct() {
    }

    public RelatedPersonsStruct(
           java.lang.String spouseFirstName,
           java.lang.String spouseLastName) {
           this.spouseFirstName = spouseFirstName;
           this.spouseLastName = spouseLastName;
    }


    /**
     * Gets the spouseFirstName value for this RelatedPersonsStruct.
     * 
     * @return spouseFirstName
     */
    public java.lang.String getSpouseFirstName() {
        return spouseFirstName;
    }


    /**
     * Sets the spouseFirstName value for this RelatedPersonsStruct.
     * 
     * @param spouseFirstName
     */
    public void setSpouseFirstName(java.lang.String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }


    /**
     * Gets the spouseLastName value for this RelatedPersonsStruct.
     * 
     * @return spouseLastName
     */
    public java.lang.String getSpouseLastName() {
        return spouseLastName;
    }


    /**
     * Sets the spouseLastName value for this RelatedPersonsStruct.
     * 
     * @param spouseLastName
     */
    public void setSpouseLastName(java.lang.String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedPersonsStruct)) return false;
        RelatedPersonsStruct other = (RelatedPersonsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.spouseFirstName==null && other.getSpouseFirstName()==null) || 
             (this.spouseFirstName!=null &&
              this.spouseFirstName.equals(other.getSpouseFirstName()))) &&
            ((this.spouseLastName==null && other.getSpouseLastName()==null) || 
             (this.spouseLastName!=null &&
              this.spouseLastName.equals(other.getSpouseLastName())));
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
        if (getSpouseFirstName() != null) {
            _hashCode += getSpouseFirstName().hashCode();
        }
        if (getSpouseLastName() != null) {
            _hashCode += getSpouseLastName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelatedPersonsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedPersonsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spouseFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "spouseFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spouseLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "spouseLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

/**
 * FilledPostBuyFormsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class FilledPostBuyFormsStruct  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfLong transactionIds;

    public FilledPostBuyFormsStruct() {
    }

    public FilledPostBuyFormsStruct(
           com.allegro.webapi.ArrayOfLong transactionIds) {
           this.transactionIds = transactionIds;
    }


    /**
     * Gets the transactionIds value for this FilledPostBuyFormsStruct.
     * 
     * @return transactionIds
     */
    public com.allegro.webapi.ArrayOfLong getTransactionIds() {
        return transactionIds;
    }


    /**
     * Sets the transactionIds value for this FilledPostBuyFormsStruct.
     * 
     * @param transactionIds
     */
    public void setTransactionIds(com.allegro.webapi.ArrayOfLong transactionIds) {
        this.transactionIds = transactionIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilledPostBuyFormsStruct)) return false;
        FilledPostBuyFormsStruct other = (FilledPostBuyFormsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionIds==null && other.getTransactionIds()==null) || 
             (this.transactionIds!=null &&
              this.transactionIds.equals(other.getTransactionIds())));
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
        if (getTransactionIds() != null) {
            _hashCode += getTransactionIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilledPostBuyFormsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilledPostBuyFormsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transactionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
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

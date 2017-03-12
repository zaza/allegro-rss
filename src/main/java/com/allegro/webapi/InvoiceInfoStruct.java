/**
 * InvoiceInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class InvoiceInfoStruct  implements java.io.Serializable {
    private int invoiceAddressType;

    private com.allegro.webapi.AddressUserDataStruct invoiceAddressData;

    private java.lang.String invoiceNip;

    public InvoiceInfoStruct() {
    }

    public InvoiceInfoStruct(
           int invoiceAddressType,
           com.allegro.webapi.AddressUserDataStruct invoiceAddressData,
           java.lang.String invoiceNip) {
           this.invoiceAddressType = invoiceAddressType;
           this.invoiceAddressData = invoiceAddressData;
           this.invoiceNip = invoiceNip;
    }


    /**
     * Gets the invoiceAddressType value for this InvoiceInfoStruct.
     * 
     * @return invoiceAddressType
     */
    public int getInvoiceAddressType() {
        return invoiceAddressType;
    }


    /**
     * Sets the invoiceAddressType value for this InvoiceInfoStruct.
     * 
     * @param invoiceAddressType
     */
    public void setInvoiceAddressType(int invoiceAddressType) {
        this.invoiceAddressType = invoiceAddressType;
    }


    /**
     * Gets the invoiceAddressData value for this InvoiceInfoStruct.
     * 
     * @return invoiceAddressData
     */
    public com.allegro.webapi.AddressUserDataStruct getInvoiceAddressData() {
        return invoiceAddressData;
    }


    /**
     * Sets the invoiceAddressData value for this InvoiceInfoStruct.
     * 
     * @param invoiceAddressData
     */
    public void setInvoiceAddressData(com.allegro.webapi.AddressUserDataStruct invoiceAddressData) {
        this.invoiceAddressData = invoiceAddressData;
    }


    /**
     * Gets the invoiceNip value for this InvoiceInfoStruct.
     * 
     * @return invoiceNip
     */
    public java.lang.String getInvoiceNip() {
        return invoiceNip;
    }


    /**
     * Sets the invoiceNip value for this InvoiceInfoStruct.
     * 
     * @param invoiceNip
     */
    public void setInvoiceNip(java.lang.String invoiceNip) {
        this.invoiceNip = invoiceNip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceInfoStruct)) return false;
        InvoiceInfoStruct other = (InvoiceInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.invoiceAddressType == other.getInvoiceAddressType() &&
            ((this.invoiceAddressData==null && other.getInvoiceAddressData()==null) || 
             (this.invoiceAddressData!=null &&
              this.invoiceAddressData.equals(other.getInvoiceAddressData()))) &&
            ((this.invoiceNip==null && other.getInvoiceNip()==null) || 
             (this.invoiceNip!=null &&
              this.invoiceNip.equals(other.getInvoiceNip())));
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
        _hashCode += getInvoiceAddressType();
        if (getInvoiceAddressData() != null) {
            _hashCode += getInvoiceAddressData().hashCode();
        }
        if (getInvoiceNip() != null) {
            _hashCode += getInvoiceNip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceAddressType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "invoiceAddressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceAddressData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "invoiceAddressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressUserDataStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNip");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "invoiceNip"));
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

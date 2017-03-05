/**
 * AddressInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class AddressInfoStruct  implements java.io.Serializable {
    private int addressType;

    private com.allegro.webapi.AddressUserDataStruct addressUserData;

    public AddressInfoStruct() {
    }

    public AddressInfoStruct(
           int addressType,
           com.allegro.webapi.AddressUserDataStruct addressUserData) {
           this.addressType = addressType;
           this.addressUserData = addressUserData;
    }


    /**
     * Gets the addressType value for this AddressInfoStruct.
     * 
     * @return addressType
     */
    public int getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this AddressInfoStruct.
     * 
     * @param addressType
     */
    public void setAddressType(int addressType) {
        this.addressType = addressType;
    }


    /**
     * Gets the addressUserData value for this AddressInfoStruct.
     * 
     * @return addressUserData
     */
    public com.allegro.webapi.AddressUserDataStruct getAddressUserData() {
        return addressUserData;
    }


    /**
     * Sets the addressUserData value for this AddressInfoStruct.
     * 
     * @param addressUserData
     */
    public void setAddressUserData(com.allegro.webapi.AddressUserDataStruct addressUserData) {
        this.addressUserData = addressUserData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressInfoStruct)) return false;
        AddressInfoStruct other = (AddressInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.addressType == other.getAddressType() &&
            ((this.addressUserData==null && other.getAddressUserData()==null) || 
             (this.addressUserData!=null &&
              this.addressUserData.equals(other.getAddressUserData())));
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
        _hashCode += getAddressType();
        if (getAddressUserData() != null) {
            _hashCode += getAddressUserData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "addressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressUserData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "addressUserData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressUserDataStruct"));
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

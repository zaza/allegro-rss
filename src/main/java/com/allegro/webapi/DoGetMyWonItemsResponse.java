/**
 * DoGetMyWonItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyWonItemsResponse  implements java.io.Serializable {
    private int wonItemsCounter;

    private com.allegro.webapi.ArrayOfWonitemstruct wonItemsList;

    public DoGetMyWonItemsResponse() {
    }

    public DoGetMyWonItemsResponse(
           int wonItemsCounter,
           com.allegro.webapi.ArrayOfWonitemstruct wonItemsList) {
           this.wonItemsCounter = wonItemsCounter;
           this.wonItemsList = wonItemsList;
    }


    /**
     * Gets the wonItemsCounter value for this DoGetMyWonItemsResponse.
     * 
     * @return wonItemsCounter
     */
    public int getWonItemsCounter() {
        return wonItemsCounter;
    }


    /**
     * Sets the wonItemsCounter value for this DoGetMyWonItemsResponse.
     * 
     * @param wonItemsCounter
     */
    public void setWonItemsCounter(int wonItemsCounter) {
        this.wonItemsCounter = wonItemsCounter;
    }


    /**
     * Gets the wonItemsList value for this DoGetMyWonItemsResponse.
     * 
     * @return wonItemsList
     */
    public com.allegro.webapi.ArrayOfWonitemstruct getWonItemsList() {
        return wonItemsList;
    }


    /**
     * Sets the wonItemsList value for this DoGetMyWonItemsResponse.
     * 
     * @param wonItemsList
     */
    public void setWonItemsList(com.allegro.webapi.ArrayOfWonitemstruct wonItemsList) {
        this.wonItemsList = wonItemsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyWonItemsResponse)) return false;
        DoGetMyWonItemsResponse other = (DoGetMyWonItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.wonItemsCounter == other.getWonItemsCounter() &&
            ((this.wonItemsList==null && other.getWonItemsList()==null) || 
             (this.wonItemsList!=null &&
              this.wonItemsList.equals(other.getWonItemsList())));
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
        _hashCode += getWonItemsCounter();
        if (getWonItemsList() != null) {
            _hashCode += getWonItemsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyWonItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wonItemsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "wonItemsCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wonItemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "wonItemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWonitemstruct"));
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

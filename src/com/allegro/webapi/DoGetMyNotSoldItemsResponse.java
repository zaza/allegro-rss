/**
 * DoGetMyNotSoldItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyNotSoldItemsResponse  implements java.io.Serializable {
    private int notSoldItemsCounter;

    private com.allegro.webapi.ArrayOfNotsolditemstruct notSoldItemsList;

    public DoGetMyNotSoldItemsResponse() {
    }

    public DoGetMyNotSoldItemsResponse(
           int notSoldItemsCounter,
           com.allegro.webapi.ArrayOfNotsolditemstruct notSoldItemsList) {
           this.notSoldItemsCounter = notSoldItemsCounter;
           this.notSoldItemsList = notSoldItemsList;
    }


    /**
     * Gets the notSoldItemsCounter value for this DoGetMyNotSoldItemsResponse.
     * 
     * @return notSoldItemsCounter
     */
    public int getNotSoldItemsCounter() {
        return notSoldItemsCounter;
    }


    /**
     * Sets the notSoldItemsCounter value for this DoGetMyNotSoldItemsResponse.
     * 
     * @param notSoldItemsCounter
     */
    public void setNotSoldItemsCounter(int notSoldItemsCounter) {
        this.notSoldItemsCounter = notSoldItemsCounter;
    }


    /**
     * Gets the notSoldItemsList value for this DoGetMyNotSoldItemsResponse.
     * 
     * @return notSoldItemsList
     */
    public com.allegro.webapi.ArrayOfNotsolditemstruct getNotSoldItemsList() {
        return notSoldItemsList;
    }


    /**
     * Sets the notSoldItemsList value for this DoGetMyNotSoldItemsResponse.
     * 
     * @param notSoldItemsList
     */
    public void setNotSoldItemsList(com.allegro.webapi.ArrayOfNotsolditemstruct notSoldItemsList) {
        this.notSoldItemsList = notSoldItemsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyNotSoldItemsResponse)) return false;
        DoGetMyNotSoldItemsResponse other = (DoGetMyNotSoldItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.notSoldItemsCounter == other.getNotSoldItemsCounter() &&
            ((this.notSoldItemsList==null && other.getNotSoldItemsList()==null) || 
             (this.notSoldItemsList!=null &&
              this.notSoldItemsList.equals(other.getNotSoldItemsList())));
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
        _hashCode += getNotSoldItemsCounter();
        if (getNotSoldItemsList() != null) {
            _hashCode += getNotSoldItemsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyNotSoldItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notSoldItemsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "notSoldItemsCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notSoldItemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "notSoldItemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotsolditemstruct"));
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

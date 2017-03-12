/**
 * DoGetMyFutureItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyFutureItemsResponse  implements java.io.Serializable {
    private int futureItemsCounter;

    private com.allegro.webapi.ArrayOfFutureitemstruct futureItemsList;

    public DoGetMyFutureItemsResponse() {
    }

    public DoGetMyFutureItemsResponse(
           int futureItemsCounter,
           com.allegro.webapi.ArrayOfFutureitemstruct futureItemsList) {
           this.futureItemsCounter = futureItemsCounter;
           this.futureItemsList = futureItemsList;
    }


    /**
     * Gets the futureItemsCounter value for this DoGetMyFutureItemsResponse.
     * 
     * @return futureItemsCounter
     */
    public int getFutureItemsCounter() {
        return futureItemsCounter;
    }


    /**
     * Sets the futureItemsCounter value for this DoGetMyFutureItemsResponse.
     * 
     * @param futureItemsCounter
     */
    public void setFutureItemsCounter(int futureItemsCounter) {
        this.futureItemsCounter = futureItemsCounter;
    }


    /**
     * Gets the futureItemsList value for this DoGetMyFutureItemsResponse.
     * 
     * @return futureItemsList
     */
    public com.allegro.webapi.ArrayOfFutureitemstruct getFutureItemsList() {
        return futureItemsList;
    }


    /**
     * Sets the futureItemsList value for this DoGetMyFutureItemsResponse.
     * 
     * @param futureItemsList
     */
    public void setFutureItemsList(com.allegro.webapi.ArrayOfFutureitemstruct futureItemsList) {
        this.futureItemsList = futureItemsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyFutureItemsResponse)) return false;
        DoGetMyFutureItemsResponse other = (DoGetMyFutureItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.futureItemsCounter == other.getFutureItemsCounter() &&
            ((this.futureItemsList==null && other.getFutureItemsList()==null) || 
             (this.futureItemsList!=null &&
              this.futureItemsList.equals(other.getFutureItemsList())));
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
        _hashCode += getFutureItemsCounter();
        if (getFutureItemsList() != null) {
            _hashCode += getFutureItemsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyFutureItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("futureItemsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "futureItemsCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("futureItemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "futureItemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFutureitemstruct"));
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

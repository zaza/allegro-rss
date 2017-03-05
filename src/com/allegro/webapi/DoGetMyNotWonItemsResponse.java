/**
 * DoGetMyNotWonItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyNotWonItemsResponse  implements java.io.Serializable {
    private int notWonItemsCounter;

    private com.allegro.webapi.ArrayOfNotwonitemstruct notWonItemsList;

    public DoGetMyNotWonItemsResponse() {
    }

    public DoGetMyNotWonItemsResponse(
           int notWonItemsCounter,
           com.allegro.webapi.ArrayOfNotwonitemstruct notWonItemsList) {
           this.notWonItemsCounter = notWonItemsCounter;
           this.notWonItemsList = notWonItemsList;
    }


    /**
     * Gets the notWonItemsCounter value for this DoGetMyNotWonItemsResponse.
     * 
     * @return notWonItemsCounter
     */
    public int getNotWonItemsCounter() {
        return notWonItemsCounter;
    }


    /**
     * Sets the notWonItemsCounter value for this DoGetMyNotWonItemsResponse.
     * 
     * @param notWonItemsCounter
     */
    public void setNotWonItemsCounter(int notWonItemsCounter) {
        this.notWonItemsCounter = notWonItemsCounter;
    }


    /**
     * Gets the notWonItemsList value for this DoGetMyNotWonItemsResponse.
     * 
     * @return notWonItemsList
     */
    public com.allegro.webapi.ArrayOfNotwonitemstruct getNotWonItemsList() {
        return notWonItemsList;
    }


    /**
     * Sets the notWonItemsList value for this DoGetMyNotWonItemsResponse.
     * 
     * @param notWonItemsList
     */
    public void setNotWonItemsList(com.allegro.webapi.ArrayOfNotwonitemstruct notWonItemsList) {
        this.notWonItemsList = notWonItemsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyNotWonItemsResponse)) return false;
        DoGetMyNotWonItemsResponse other = (DoGetMyNotWonItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.notWonItemsCounter == other.getNotWonItemsCounter() &&
            ((this.notWonItemsList==null && other.getNotWonItemsList()==null) || 
             (this.notWonItemsList!=null &&
              this.notWonItemsList.equals(other.getNotWonItemsList())));
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
        _hashCode += getNotWonItemsCounter();
        if (getNotWonItemsList() != null) {
            _hashCode += getNotWonItemsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyNotWonItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notWonItemsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "notWonItemsCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notWonItemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "notWonItemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotwonitemstruct"));
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

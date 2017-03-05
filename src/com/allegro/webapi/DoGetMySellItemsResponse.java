/**
 * DoGetMySellItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMySellItemsResponse  implements java.io.Serializable {
    private int sellItemsCounter;

    private com.allegro.webapi.ArrayOfSellitemstruct sellItemsList;

    public DoGetMySellItemsResponse() {
    }

    public DoGetMySellItemsResponse(
           int sellItemsCounter,
           com.allegro.webapi.ArrayOfSellitemstruct sellItemsList) {
           this.sellItemsCounter = sellItemsCounter;
           this.sellItemsList = sellItemsList;
    }


    /**
     * Gets the sellItemsCounter value for this DoGetMySellItemsResponse.
     * 
     * @return sellItemsCounter
     */
    public int getSellItemsCounter() {
        return sellItemsCounter;
    }


    /**
     * Sets the sellItemsCounter value for this DoGetMySellItemsResponse.
     * 
     * @param sellItemsCounter
     */
    public void setSellItemsCounter(int sellItemsCounter) {
        this.sellItemsCounter = sellItemsCounter;
    }


    /**
     * Gets the sellItemsList value for this DoGetMySellItemsResponse.
     * 
     * @return sellItemsList
     */
    public com.allegro.webapi.ArrayOfSellitemstruct getSellItemsList() {
        return sellItemsList;
    }


    /**
     * Sets the sellItemsList value for this DoGetMySellItemsResponse.
     * 
     * @param sellItemsList
     */
    public void setSellItemsList(com.allegro.webapi.ArrayOfSellitemstruct sellItemsList) {
        this.sellItemsList = sellItemsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMySellItemsResponse)) return false;
        DoGetMySellItemsResponse other = (DoGetMySellItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sellItemsCounter == other.getSellItemsCounter() &&
            ((this.sellItemsList==null && other.getSellItemsList()==null) || 
             (this.sellItemsList!=null &&
              this.sellItemsList.equals(other.getSellItemsList())));
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
        _hashCode += getSellItemsCounter();
        if (getSellItemsList() != null) {
            _hashCode += getSellItemsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMySellItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellItemsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellItemsCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellItemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellItemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellitemstruct"));
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

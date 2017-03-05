/**
 * DoGetMyBidItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyBidItemsResponse  implements java.io.Serializable {
    private int bidItemsCounter;

    private com.allegro.webapi.ArrayOfBiditemstruct bidItemsList;

    public DoGetMyBidItemsResponse() {
    }

    public DoGetMyBidItemsResponse(
           int bidItemsCounter,
           com.allegro.webapi.ArrayOfBiditemstruct bidItemsList) {
           this.bidItemsCounter = bidItemsCounter;
           this.bidItemsList = bidItemsList;
    }


    /**
     * Gets the bidItemsCounter value for this DoGetMyBidItemsResponse.
     * 
     * @return bidItemsCounter
     */
    public int getBidItemsCounter() {
        return bidItemsCounter;
    }


    /**
     * Sets the bidItemsCounter value for this DoGetMyBidItemsResponse.
     * 
     * @param bidItemsCounter
     */
    public void setBidItemsCounter(int bidItemsCounter) {
        this.bidItemsCounter = bidItemsCounter;
    }


    /**
     * Gets the bidItemsList value for this DoGetMyBidItemsResponse.
     * 
     * @return bidItemsList
     */
    public com.allegro.webapi.ArrayOfBiditemstruct getBidItemsList() {
        return bidItemsList;
    }


    /**
     * Sets the bidItemsList value for this DoGetMyBidItemsResponse.
     * 
     * @param bidItemsList
     */
    public void setBidItemsList(com.allegro.webapi.ArrayOfBiditemstruct bidItemsList) {
        this.bidItemsList = bidItemsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyBidItemsResponse)) return false;
        DoGetMyBidItemsResponse other = (DoGetMyBidItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bidItemsCounter == other.getBidItemsCounter() &&
            ((this.bidItemsList==null && other.getBidItemsList()==null) || 
             (this.bidItemsList!=null &&
              this.bidItemsList.equals(other.getBidItemsList())));
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
        _hashCode += getBidItemsCounter();
        if (getBidItemsList() != null) {
            _hashCode += getBidItemsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyBidItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidItemsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "bidItemsCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidItemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "bidItemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBiditemstruct"));
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

/**
 * DoGetPostBuyDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetPostBuyDataRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private com.allegro.webapi.ArrayOfLong itemsArray;

    private com.allegro.webapi.ArrayOfLong buyerFilterArray;

    public DoGetPostBuyDataRequest() {
    }

    public DoGetPostBuyDataRequest(
           java.lang.String sessionHandle,
           com.allegro.webapi.ArrayOfLong itemsArray,
           com.allegro.webapi.ArrayOfLong buyerFilterArray) {
           this.sessionHandle = sessionHandle;
           this.itemsArray = itemsArray;
           this.buyerFilterArray = buyerFilterArray;
    }


    /**
     * Gets the sessionHandle value for this DoGetPostBuyDataRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetPostBuyDataRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the itemsArray value for this DoGetPostBuyDataRequest.
     * 
     * @return itemsArray
     */
    public com.allegro.webapi.ArrayOfLong getItemsArray() {
        return itemsArray;
    }


    /**
     * Sets the itemsArray value for this DoGetPostBuyDataRequest.
     * 
     * @param itemsArray
     */
    public void setItemsArray(com.allegro.webapi.ArrayOfLong itemsArray) {
        this.itemsArray = itemsArray;
    }


    /**
     * Gets the buyerFilterArray value for this DoGetPostBuyDataRequest.
     * 
     * @return buyerFilterArray
     */
    public com.allegro.webapi.ArrayOfLong getBuyerFilterArray() {
        return buyerFilterArray;
    }


    /**
     * Sets the buyerFilterArray value for this DoGetPostBuyDataRequest.
     * 
     * @param buyerFilterArray
     */
    public void setBuyerFilterArray(com.allegro.webapi.ArrayOfLong buyerFilterArray) {
        this.buyerFilterArray = buyerFilterArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetPostBuyDataRequest)) return false;
        DoGetPostBuyDataRequest other = (DoGetPostBuyDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            ((this.itemsArray==null && other.getItemsArray()==null) || 
             (this.itemsArray!=null &&
              this.itemsArray.equals(other.getItemsArray()))) &&
            ((this.buyerFilterArray==null && other.getBuyerFilterArray()==null) || 
             (this.buyerFilterArray!=null &&
              this.buyerFilterArray.equals(other.getBuyerFilterArray())));
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
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        if (getItemsArray() != null) {
            _hashCode += getItemsArray().hashCode();
        }
        if (getBuyerFilterArray() != null) {
            _hashCode += getBuyerFilterArray().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetPostBuyDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerFilterArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "buyerFilterArray"));
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

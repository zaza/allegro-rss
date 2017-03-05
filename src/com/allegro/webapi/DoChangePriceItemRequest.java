/**
 * DoChangePriceItemRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoChangePriceItemRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long itemId;

    private java.lang.Float newStartingPrice;

    private java.lang.Float newReservePrice;

    private java.lang.Float newBuyNowPrice;

    public DoChangePriceItemRequest() {
    }

    public DoChangePriceItemRequest(
           java.lang.String sessionHandle,
           long itemId,
           java.lang.Float newStartingPrice,
           java.lang.Float newReservePrice,
           java.lang.Float newBuyNowPrice) {
           this.sessionHandle = sessionHandle;
           this.itemId = itemId;
           this.newStartingPrice = newStartingPrice;
           this.newReservePrice = newReservePrice;
           this.newBuyNowPrice = newBuyNowPrice;
    }


    /**
     * Gets the sessionHandle value for this DoChangePriceItemRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoChangePriceItemRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the itemId value for this DoChangePriceItemRequest.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this DoChangePriceItemRequest.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the newStartingPrice value for this DoChangePriceItemRequest.
     * 
     * @return newStartingPrice
     */
    public java.lang.Float getNewStartingPrice() {
        return newStartingPrice;
    }


    /**
     * Sets the newStartingPrice value for this DoChangePriceItemRequest.
     * 
     * @param newStartingPrice
     */
    public void setNewStartingPrice(java.lang.Float newStartingPrice) {
        this.newStartingPrice = newStartingPrice;
    }


    /**
     * Gets the newReservePrice value for this DoChangePriceItemRequest.
     * 
     * @return newReservePrice
     */
    public java.lang.Float getNewReservePrice() {
        return newReservePrice;
    }


    /**
     * Sets the newReservePrice value for this DoChangePriceItemRequest.
     * 
     * @param newReservePrice
     */
    public void setNewReservePrice(java.lang.Float newReservePrice) {
        this.newReservePrice = newReservePrice;
    }


    /**
     * Gets the newBuyNowPrice value for this DoChangePriceItemRequest.
     * 
     * @return newBuyNowPrice
     */
    public java.lang.Float getNewBuyNowPrice() {
        return newBuyNowPrice;
    }


    /**
     * Sets the newBuyNowPrice value for this DoChangePriceItemRequest.
     * 
     * @param newBuyNowPrice
     */
    public void setNewBuyNowPrice(java.lang.Float newBuyNowPrice) {
        this.newBuyNowPrice = newBuyNowPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoChangePriceItemRequest)) return false;
        DoChangePriceItemRequest other = (DoChangePriceItemRequest) obj;
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
            this.itemId == other.getItemId() &&
            ((this.newStartingPrice==null && other.getNewStartingPrice()==null) || 
             (this.newStartingPrice!=null &&
              this.newStartingPrice.equals(other.getNewStartingPrice()))) &&
            ((this.newReservePrice==null && other.getNewReservePrice()==null) || 
             (this.newReservePrice!=null &&
              this.newReservePrice.equals(other.getNewReservePrice()))) &&
            ((this.newBuyNowPrice==null && other.getNewBuyNowPrice()==null) || 
             (this.newBuyNowPrice!=null &&
              this.newBuyNowPrice.equals(other.getNewBuyNowPrice())));
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
        _hashCode += new Long(getItemId()).hashCode();
        if (getNewStartingPrice() != null) {
            _hashCode += getNewStartingPrice().hashCode();
        }
        if (getNewReservePrice() != null) {
            _hashCode += getNewReservePrice().hashCode();
        }
        if (getNewBuyNowPrice() != null) {
            _hashCode += getNewBuyNowPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoChangePriceItemRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newStartingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "newStartingPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newReservePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "newReservePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBuyNowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "newBuyNowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

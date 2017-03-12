/**
 * DoGetMyIncomingPaymentsRefundsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyIncomingPaymentsRefundsRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private java.lang.Integer buyerId;

    private java.lang.Long itemId;

    private java.lang.Integer limit;

    private java.lang.Integer offset;

    public DoGetMyIncomingPaymentsRefundsRequest() {
    }

    public DoGetMyIncomingPaymentsRefundsRequest(
           java.lang.String sessionHandle,
           java.lang.Integer buyerId,
           java.lang.Long itemId,
           java.lang.Integer limit,
           java.lang.Integer offset) {
           this.sessionHandle = sessionHandle;
           this.buyerId = buyerId;
           this.itemId = itemId;
           this.limit = limit;
           this.offset = offset;
    }


    /**
     * Gets the sessionHandle value for this DoGetMyIncomingPaymentsRefundsRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetMyIncomingPaymentsRefundsRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the buyerId value for this DoGetMyIncomingPaymentsRefundsRequest.
     * 
     * @return buyerId
     */
    public java.lang.Integer getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this DoGetMyIncomingPaymentsRefundsRequest.
     * 
     * @param buyerId
     */
    public void setBuyerId(java.lang.Integer buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the itemId value for this DoGetMyIncomingPaymentsRefundsRequest.
     * 
     * @return itemId
     */
    public java.lang.Long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this DoGetMyIncomingPaymentsRefundsRequest.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the limit value for this DoGetMyIncomingPaymentsRefundsRequest.
     * 
     * @return limit
     */
    public java.lang.Integer getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this DoGetMyIncomingPaymentsRefundsRequest.
     * 
     * @param limit
     */
    public void setLimit(java.lang.Integer limit) {
        this.limit = limit;
    }


    /**
     * Gets the offset value for this DoGetMyIncomingPaymentsRefundsRequest.
     * 
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this DoGetMyIncomingPaymentsRefundsRequest.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyIncomingPaymentsRefundsRequest)) return false;
        DoGetMyIncomingPaymentsRefundsRequest other = (DoGetMyIncomingPaymentsRefundsRequest) obj;
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
            ((this.buyerId==null && other.getBuyerId()==null) || 
             (this.buyerId!=null &&
              this.buyerId.equals(other.getBuyerId()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset())));
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
        if (getBuyerId() != null) {
            _hashCode += getBuyerId().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyIncomingPaymentsRefundsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "buyerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

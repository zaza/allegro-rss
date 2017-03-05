/**
 * DoGetMyIncomingPaymentsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyIncomingPaymentsRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private java.lang.Integer buyerId;

    private java.lang.Long itemId;

    private java.lang.Long transRecvDateFrom;

    private java.lang.Long transRecvDateTo;

    private java.lang.Integer transPageLimit;

    private java.lang.Integer transOffset;

    private java.lang.Integer strictedSearch;

    public DoGetMyIncomingPaymentsRequest() {
    }

    public DoGetMyIncomingPaymentsRequest(
           java.lang.String sessionHandle,
           java.lang.Integer buyerId,
           java.lang.Long itemId,
           java.lang.Long transRecvDateFrom,
           java.lang.Long transRecvDateTo,
           java.lang.Integer transPageLimit,
           java.lang.Integer transOffset,
           java.lang.Integer strictedSearch) {
           this.sessionHandle = sessionHandle;
           this.buyerId = buyerId;
           this.itemId = itemId;
           this.transRecvDateFrom = transRecvDateFrom;
           this.transRecvDateTo = transRecvDateTo;
           this.transPageLimit = transPageLimit;
           this.transOffset = transOffset;
           this.strictedSearch = strictedSearch;
    }


    /**
     * Gets the sessionHandle value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the buyerId value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @return buyerId
     */
    public java.lang.Integer getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @param buyerId
     */
    public void setBuyerId(java.lang.Integer buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the itemId value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @return itemId
     */
    public java.lang.Long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the transRecvDateFrom value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @return transRecvDateFrom
     */
    public java.lang.Long getTransRecvDateFrom() {
        return transRecvDateFrom;
    }


    /**
     * Sets the transRecvDateFrom value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @param transRecvDateFrom
     */
    public void setTransRecvDateFrom(java.lang.Long transRecvDateFrom) {
        this.transRecvDateFrom = transRecvDateFrom;
    }


    /**
     * Gets the transRecvDateTo value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @return transRecvDateTo
     */
    public java.lang.Long getTransRecvDateTo() {
        return transRecvDateTo;
    }


    /**
     * Sets the transRecvDateTo value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @param transRecvDateTo
     */
    public void setTransRecvDateTo(java.lang.Long transRecvDateTo) {
        this.transRecvDateTo = transRecvDateTo;
    }


    /**
     * Gets the transPageLimit value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @return transPageLimit
     */
    public java.lang.Integer getTransPageLimit() {
        return transPageLimit;
    }


    /**
     * Sets the transPageLimit value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @param transPageLimit
     */
    public void setTransPageLimit(java.lang.Integer transPageLimit) {
        this.transPageLimit = transPageLimit;
    }


    /**
     * Gets the transOffset value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @return transOffset
     */
    public java.lang.Integer getTransOffset() {
        return transOffset;
    }


    /**
     * Sets the transOffset value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @param transOffset
     */
    public void setTransOffset(java.lang.Integer transOffset) {
        this.transOffset = transOffset;
    }


    /**
     * Gets the strictedSearch value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @return strictedSearch
     */
    public java.lang.Integer getStrictedSearch() {
        return strictedSearch;
    }


    /**
     * Sets the strictedSearch value for this DoGetMyIncomingPaymentsRequest.
     * 
     * @param strictedSearch
     */
    public void setStrictedSearch(java.lang.Integer strictedSearch) {
        this.strictedSearch = strictedSearch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyIncomingPaymentsRequest)) return false;
        DoGetMyIncomingPaymentsRequest other = (DoGetMyIncomingPaymentsRequest) obj;
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
            ((this.transRecvDateFrom==null && other.getTransRecvDateFrom()==null) || 
             (this.transRecvDateFrom!=null &&
              this.transRecvDateFrom.equals(other.getTransRecvDateFrom()))) &&
            ((this.transRecvDateTo==null && other.getTransRecvDateTo()==null) || 
             (this.transRecvDateTo!=null &&
              this.transRecvDateTo.equals(other.getTransRecvDateTo()))) &&
            ((this.transPageLimit==null && other.getTransPageLimit()==null) || 
             (this.transPageLimit!=null &&
              this.transPageLimit.equals(other.getTransPageLimit()))) &&
            ((this.transOffset==null && other.getTransOffset()==null) || 
             (this.transOffset!=null &&
              this.transOffset.equals(other.getTransOffset()))) &&
            ((this.strictedSearch==null && other.getStrictedSearch()==null) || 
             (this.strictedSearch!=null &&
              this.strictedSearch.equals(other.getStrictedSearch())));
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
        if (getTransRecvDateFrom() != null) {
            _hashCode += getTransRecvDateFrom().hashCode();
        }
        if (getTransRecvDateTo() != null) {
            _hashCode += getTransRecvDateTo().hashCode();
        }
        if (getTransPageLimit() != null) {
            _hashCode += getTransPageLimit().hashCode();
        }
        if (getTransOffset() != null) {
            _hashCode += getTransOffset().hashCode();
        }
        if (getStrictedSearch() != null) {
            _hashCode += getStrictedSearch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyIncomingPaymentsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest"));
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
        elemField.setFieldName("transRecvDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transRecvDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transRecvDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transRecvDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transPageLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transPageLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strictedSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "strictedSearch"));
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

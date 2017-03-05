/**
 * DoGetMyPaymentsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyPaymentsRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.Integer sellerId;

    private java.lang.Long itemId;

    private java.lang.Long paymentTimeFrom;

    private java.lang.Long paymentTimeTo;

    private java.lang.Integer pageSize;

    private java.lang.Integer pageNumber;

    private java.lang.Integer strictedSearch;

    public DoGetMyPaymentsRequest() {
    }

    public DoGetMyPaymentsRequest(
           java.lang.String sessionId,
           java.lang.Integer sellerId,
           java.lang.Long itemId,
           java.lang.Long paymentTimeFrom,
           java.lang.Long paymentTimeTo,
           java.lang.Integer pageSize,
           java.lang.Integer pageNumber,
           java.lang.Integer strictedSearch) {
           this.sessionId = sessionId;
           this.sellerId = sellerId;
           this.itemId = itemId;
           this.paymentTimeFrom = paymentTimeFrom;
           this.paymentTimeTo = paymentTimeTo;
           this.pageSize = pageSize;
           this.pageNumber = pageNumber;
           this.strictedSearch = strictedSearch;
    }


    /**
     * Gets the sessionId value for this DoGetMyPaymentsRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DoGetMyPaymentsRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the sellerId value for this DoGetMyPaymentsRequest.
     * 
     * @return sellerId
     */
    public java.lang.Integer getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this DoGetMyPaymentsRequest.
     * 
     * @param sellerId
     */
    public void setSellerId(java.lang.Integer sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the itemId value for this DoGetMyPaymentsRequest.
     * 
     * @return itemId
     */
    public java.lang.Long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this DoGetMyPaymentsRequest.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the paymentTimeFrom value for this DoGetMyPaymentsRequest.
     * 
     * @return paymentTimeFrom
     */
    public java.lang.Long getPaymentTimeFrom() {
        return paymentTimeFrom;
    }


    /**
     * Sets the paymentTimeFrom value for this DoGetMyPaymentsRequest.
     * 
     * @param paymentTimeFrom
     */
    public void setPaymentTimeFrom(java.lang.Long paymentTimeFrom) {
        this.paymentTimeFrom = paymentTimeFrom;
    }


    /**
     * Gets the paymentTimeTo value for this DoGetMyPaymentsRequest.
     * 
     * @return paymentTimeTo
     */
    public java.lang.Long getPaymentTimeTo() {
        return paymentTimeTo;
    }


    /**
     * Sets the paymentTimeTo value for this DoGetMyPaymentsRequest.
     * 
     * @param paymentTimeTo
     */
    public void setPaymentTimeTo(java.lang.Long paymentTimeTo) {
        this.paymentTimeTo = paymentTimeTo;
    }


    /**
     * Gets the pageSize value for this DoGetMyPaymentsRequest.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this DoGetMyPaymentsRequest.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the pageNumber value for this DoGetMyPaymentsRequest.
     * 
     * @return pageNumber
     */
    public java.lang.Integer getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this DoGetMyPaymentsRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the strictedSearch value for this DoGetMyPaymentsRequest.
     * 
     * @return strictedSearch
     */
    public java.lang.Integer getStrictedSearch() {
        return strictedSearch;
    }


    /**
     * Sets the strictedSearch value for this DoGetMyPaymentsRequest.
     * 
     * @param strictedSearch
     */
    public void setStrictedSearch(java.lang.Integer strictedSearch) {
        this.strictedSearch = strictedSearch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyPaymentsRequest)) return false;
        DoGetMyPaymentsRequest other = (DoGetMyPaymentsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.sellerId==null && other.getSellerId()==null) || 
             (this.sellerId!=null &&
              this.sellerId.equals(other.getSellerId()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.paymentTimeFrom==null && other.getPaymentTimeFrom()==null) || 
             (this.paymentTimeFrom!=null &&
              this.paymentTimeFrom.equals(other.getPaymentTimeFrom()))) &&
            ((this.paymentTimeTo==null && other.getPaymentTimeTo()==null) || 
             (this.paymentTimeTo!=null &&
              this.paymentTimeTo.equals(other.getPaymentTimeTo()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
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
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getSellerId() != null) {
            _hashCode += getSellerId().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getPaymentTimeFrom() != null) {
            _hashCode += getPaymentTimeFrom().hashCode();
        }
        if (getPaymentTimeTo() != null) {
            _hashCode += getPaymentTimeTo().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getStrictedSearch() != null) {
            _hashCode += getStrictedSearch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyPaymentsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerId"));
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
        elemField.setFieldName("paymentTimeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentTimeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTimeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentTimeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "pageNumber"));
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

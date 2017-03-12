/**
 * DoRequestCancelBidRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoRequestCancelBidRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long requestItemId;

    private java.lang.String requestCancelReason;

    public DoRequestCancelBidRequest() {
    }

    public DoRequestCancelBidRequest(
           java.lang.String sessionHandle,
           long requestItemId,
           java.lang.String requestCancelReason) {
           this.sessionHandle = sessionHandle;
           this.requestItemId = requestItemId;
           this.requestCancelReason = requestCancelReason;
    }


    /**
     * Gets the sessionHandle value for this DoRequestCancelBidRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoRequestCancelBidRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the requestItemId value for this DoRequestCancelBidRequest.
     * 
     * @return requestItemId
     */
    public long getRequestItemId() {
        return requestItemId;
    }


    /**
     * Sets the requestItemId value for this DoRequestCancelBidRequest.
     * 
     * @param requestItemId
     */
    public void setRequestItemId(long requestItemId) {
        this.requestItemId = requestItemId;
    }


    /**
     * Gets the requestCancelReason value for this DoRequestCancelBidRequest.
     * 
     * @return requestCancelReason
     */
    public java.lang.String getRequestCancelReason() {
        return requestCancelReason;
    }


    /**
     * Sets the requestCancelReason value for this DoRequestCancelBidRequest.
     * 
     * @param requestCancelReason
     */
    public void setRequestCancelReason(java.lang.String requestCancelReason) {
        this.requestCancelReason = requestCancelReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRequestCancelBidRequest)) return false;
        DoRequestCancelBidRequest other = (DoRequestCancelBidRequest) obj;
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
            this.requestItemId == other.getRequestItemId() &&
            ((this.requestCancelReason==null && other.getRequestCancelReason()==null) || 
             (this.requestCancelReason!=null &&
              this.requestCancelReason.equals(other.getRequestCancelReason())));
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
        _hashCode += new Long(getRequestItemId()).hashCode();
        if (getRequestCancelReason() != null) {
            _hashCode += getRequestCancelReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoRequestCancelBidRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestCancelBidRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "requestItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestCancelReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "requestCancelReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

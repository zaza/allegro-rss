/**
 * DoFinishItemRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoFinishItemRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long finishItemId;

    private java.lang.Integer finishCancelAllBids;

    private java.lang.String finishCancelReason;

    public DoFinishItemRequest() {
    }

    public DoFinishItemRequest(
           java.lang.String sessionHandle,
           long finishItemId,
           java.lang.Integer finishCancelAllBids,
           java.lang.String finishCancelReason) {
           this.sessionHandle = sessionHandle;
           this.finishItemId = finishItemId;
           this.finishCancelAllBids = finishCancelAllBids;
           this.finishCancelReason = finishCancelReason;
    }


    /**
     * Gets the sessionHandle value for this DoFinishItemRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoFinishItemRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the finishItemId value for this DoFinishItemRequest.
     * 
     * @return finishItemId
     */
    public long getFinishItemId() {
        return finishItemId;
    }


    /**
     * Sets the finishItemId value for this DoFinishItemRequest.
     * 
     * @param finishItemId
     */
    public void setFinishItemId(long finishItemId) {
        this.finishItemId = finishItemId;
    }


    /**
     * Gets the finishCancelAllBids value for this DoFinishItemRequest.
     * 
     * @return finishCancelAllBids
     */
    public java.lang.Integer getFinishCancelAllBids() {
        return finishCancelAllBids;
    }


    /**
     * Sets the finishCancelAllBids value for this DoFinishItemRequest.
     * 
     * @param finishCancelAllBids
     */
    public void setFinishCancelAllBids(java.lang.Integer finishCancelAllBids) {
        this.finishCancelAllBids = finishCancelAllBids;
    }


    /**
     * Gets the finishCancelReason value for this DoFinishItemRequest.
     * 
     * @return finishCancelReason
     */
    public java.lang.String getFinishCancelReason() {
        return finishCancelReason;
    }


    /**
     * Sets the finishCancelReason value for this DoFinishItemRequest.
     * 
     * @param finishCancelReason
     */
    public void setFinishCancelReason(java.lang.String finishCancelReason) {
        this.finishCancelReason = finishCancelReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoFinishItemRequest)) return false;
        DoFinishItemRequest other = (DoFinishItemRequest) obj;
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
            this.finishItemId == other.getFinishItemId() &&
            ((this.finishCancelAllBids==null && other.getFinishCancelAllBids()==null) || 
             (this.finishCancelAllBids!=null &&
              this.finishCancelAllBids.equals(other.getFinishCancelAllBids()))) &&
            ((this.finishCancelReason==null && other.getFinishCancelReason()==null) || 
             (this.finishCancelReason!=null &&
              this.finishCancelReason.equals(other.getFinishCancelReason())));
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
        _hashCode += new Long(getFinishItemId()).hashCode();
        if (getFinishCancelAllBids() != null) {
            _hashCode += getFinishCancelAllBids().hashCode();
        }
        if (getFinishCancelReason() != null) {
            _hashCode += getFinishCancelReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoFinishItemRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "finishItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishCancelAllBids");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "finishCancelAllBids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishCancelReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "finishCancelReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

/**
 * DoSendRefundFormRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoSendRefundFormRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private int dealId;

    private int reasonId;

    private java.lang.Integer refundQuantity;

    public DoSendRefundFormRequest() {
    }

    public DoSendRefundFormRequest(
           java.lang.String sessionId,
           int dealId,
           int reasonId,
           java.lang.Integer refundQuantity) {
           this.sessionId = sessionId;
           this.dealId = dealId;
           this.reasonId = reasonId;
           this.refundQuantity = refundQuantity;
    }


    /**
     * Gets the sessionId value for this DoSendRefundFormRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DoSendRefundFormRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the dealId value for this DoSendRefundFormRequest.
     * 
     * @return dealId
     */
    public int getDealId() {
        return dealId;
    }


    /**
     * Sets the dealId value for this DoSendRefundFormRequest.
     * 
     * @param dealId
     */
    public void setDealId(int dealId) {
        this.dealId = dealId;
    }


    /**
     * Gets the reasonId value for this DoSendRefundFormRequest.
     * 
     * @return reasonId
     */
    public int getReasonId() {
        return reasonId;
    }


    /**
     * Sets the reasonId value for this DoSendRefundFormRequest.
     * 
     * @param reasonId
     */
    public void setReasonId(int reasonId) {
        this.reasonId = reasonId;
    }


    /**
     * Gets the refundQuantity value for this DoSendRefundFormRequest.
     * 
     * @return refundQuantity
     */
    public java.lang.Integer getRefundQuantity() {
        return refundQuantity;
    }


    /**
     * Sets the refundQuantity value for this DoSendRefundFormRequest.
     * 
     * @param refundQuantity
     */
    public void setRefundQuantity(java.lang.Integer refundQuantity) {
        this.refundQuantity = refundQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSendRefundFormRequest)) return false;
        DoSendRefundFormRequest other = (DoSendRefundFormRequest) obj;
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
            this.dealId == other.getDealId() &&
            this.reasonId == other.getReasonId() &&
            ((this.refundQuantity==null && other.getRefundQuantity()==null) || 
             (this.refundQuantity!=null &&
              this.refundQuantity.equals(other.getRefundQuantity())));
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
        _hashCode += getDealId();
        _hashCode += getReasonId();
        if (getRefundQuantity() != null) {
            _hashCode += getRefundQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSendRefundFormRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "dealId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "reasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundQuantity"));
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

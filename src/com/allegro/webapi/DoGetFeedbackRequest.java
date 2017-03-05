/**
 * DoGetFeedbackRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetFeedbackRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private int feedbackFrom;

    private int feedbackTo;

    private java.lang.Integer feedbackOffset;

    private java.lang.String feedbackKindList;

    public DoGetFeedbackRequest() {
    }

    public DoGetFeedbackRequest(
           java.lang.String sessionHandle,
           int feedbackFrom,
           int feedbackTo,
           java.lang.Integer feedbackOffset,
           java.lang.String feedbackKindList) {
           this.sessionHandle = sessionHandle;
           this.feedbackFrom = feedbackFrom;
           this.feedbackTo = feedbackTo;
           this.feedbackOffset = feedbackOffset;
           this.feedbackKindList = feedbackKindList;
    }


    /**
     * Gets the sessionHandle value for this DoGetFeedbackRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetFeedbackRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the feedbackFrom value for this DoGetFeedbackRequest.
     * 
     * @return feedbackFrom
     */
    public int getFeedbackFrom() {
        return feedbackFrom;
    }


    /**
     * Sets the feedbackFrom value for this DoGetFeedbackRequest.
     * 
     * @param feedbackFrom
     */
    public void setFeedbackFrom(int feedbackFrom) {
        this.feedbackFrom = feedbackFrom;
    }


    /**
     * Gets the feedbackTo value for this DoGetFeedbackRequest.
     * 
     * @return feedbackTo
     */
    public int getFeedbackTo() {
        return feedbackTo;
    }


    /**
     * Sets the feedbackTo value for this DoGetFeedbackRequest.
     * 
     * @param feedbackTo
     */
    public void setFeedbackTo(int feedbackTo) {
        this.feedbackTo = feedbackTo;
    }


    /**
     * Gets the feedbackOffset value for this DoGetFeedbackRequest.
     * 
     * @return feedbackOffset
     */
    public java.lang.Integer getFeedbackOffset() {
        return feedbackOffset;
    }


    /**
     * Sets the feedbackOffset value for this DoGetFeedbackRequest.
     * 
     * @param feedbackOffset
     */
    public void setFeedbackOffset(java.lang.Integer feedbackOffset) {
        this.feedbackOffset = feedbackOffset;
    }


    /**
     * Gets the feedbackKindList value for this DoGetFeedbackRequest.
     * 
     * @return feedbackKindList
     */
    public java.lang.String getFeedbackKindList() {
        return feedbackKindList;
    }


    /**
     * Sets the feedbackKindList value for this DoGetFeedbackRequest.
     * 
     * @param feedbackKindList
     */
    public void setFeedbackKindList(java.lang.String feedbackKindList) {
        this.feedbackKindList = feedbackKindList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetFeedbackRequest)) return false;
        DoGetFeedbackRequest other = (DoGetFeedbackRequest) obj;
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
            this.feedbackFrom == other.getFeedbackFrom() &&
            this.feedbackTo == other.getFeedbackTo() &&
            ((this.feedbackOffset==null && other.getFeedbackOffset()==null) || 
             (this.feedbackOffset!=null &&
              this.feedbackOffset.equals(other.getFeedbackOffset()))) &&
            ((this.feedbackKindList==null && other.getFeedbackKindList()==null) || 
             (this.feedbackKindList!=null &&
              this.feedbackKindList.equals(other.getFeedbackKindList())));
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
        _hashCode += getFeedbackFrom();
        _hashCode += getFeedbackTo();
        if (getFeedbackOffset() != null) {
            _hashCode += getFeedbackOffset().hashCode();
        }
        if (getFeedbackKindList() != null) {
            _hashCode += getFeedbackKindList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetFeedbackRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFeedbackRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feedbackFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackTo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feedbackTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feedbackOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackKindList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feedbackKindList"));
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

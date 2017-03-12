/**
 * DoGetFeedbackResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetFeedbackResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfFeedbacklist feedbackList;

    private int feedbackCount;

    public DoGetFeedbackResponse() {
    }

    public DoGetFeedbackResponse(
           com.allegro.webapi.ArrayOfFeedbacklist feedbackList,
           int feedbackCount) {
           this.feedbackList = feedbackList;
           this.feedbackCount = feedbackCount;
    }


    /**
     * Gets the feedbackList value for this DoGetFeedbackResponse.
     * 
     * @return feedbackList
     */
    public com.allegro.webapi.ArrayOfFeedbacklist getFeedbackList() {
        return feedbackList;
    }


    /**
     * Sets the feedbackList value for this DoGetFeedbackResponse.
     * 
     * @param feedbackList
     */
    public void setFeedbackList(com.allegro.webapi.ArrayOfFeedbacklist feedbackList) {
        this.feedbackList = feedbackList;
    }


    /**
     * Gets the feedbackCount value for this DoGetFeedbackResponse.
     * 
     * @return feedbackCount
     */
    public int getFeedbackCount() {
        return feedbackCount;
    }


    /**
     * Sets the feedbackCount value for this DoGetFeedbackResponse.
     * 
     * @param feedbackCount
     */
    public void setFeedbackCount(int feedbackCount) {
        this.feedbackCount = feedbackCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetFeedbackResponse)) return false;
        DoGetFeedbackResponse other = (DoGetFeedbackResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedbackList==null && other.getFeedbackList()==null) || 
             (this.feedbackList!=null &&
              this.feedbackList.equals(other.getFeedbackList()))) &&
            this.feedbackCount == other.getFeedbackCount();
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
        if (getFeedbackList() != null) {
            _hashCode += getFeedbackList().hashCode();
        }
        _hashCode += getFeedbackCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetFeedbackResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFeedbackResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feedbackList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbacklist"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feedbackCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

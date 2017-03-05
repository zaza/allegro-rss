/**
 * DoGetPostBuyFormsIdsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetPostBuyFormsIdsRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private com.allegro.webapi.ArrayOfFilteroptionstype filterOptions;

    private java.lang.Integer resultSize;

    private java.lang.Integer resultOffset;

    public DoGetPostBuyFormsIdsRequest() {
    }

    public DoGetPostBuyFormsIdsRequest(
           java.lang.String sessionId,
           com.allegro.webapi.ArrayOfFilteroptionstype filterOptions,
           java.lang.Integer resultSize,
           java.lang.Integer resultOffset) {
           this.sessionId = sessionId;
           this.filterOptions = filterOptions;
           this.resultSize = resultSize;
           this.resultOffset = resultOffset;
    }


    /**
     * Gets the sessionId value for this DoGetPostBuyFormsIdsRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DoGetPostBuyFormsIdsRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the filterOptions value for this DoGetPostBuyFormsIdsRequest.
     * 
     * @return filterOptions
     */
    public com.allegro.webapi.ArrayOfFilteroptionstype getFilterOptions() {
        return filterOptions;
    }


    /**
     * Sets the filterOptions value for this DoGetPostBuyFormsIdsRequest.
     * 
     * @param filterOptions
     */
    public void setFilterOptions(com.allegro.webapi.ArrayOfFilteroptionstype filterOptions) {
        this.filterOptions = filterOptions;
    }


    /**
     * Gets the resultSize value for this DoGetPostBuyFormsIdsRequest.
     * 
     * @return resultSize
     */
    public java.lang.Integer getResultSize() {
        return resultSize;
    }


    /**
     * Sets the resultSize value for this DoGetPostBuyFormsIdsRequest.
     * 
     * @param resultSize
     */
    public void setResultSize(java.lang.Integer resultSize) {
        this.resultSize = resultSize;
    }


    /**
     * Gets the resultOffset value for this DoGetPostBuyFormsIdsRequest.
     * 
     * @return resultOffset
     */
    public java.lang.Integer getResultOffset() {
        return resultOffset;
    }


    /**
     * Sets the resultOffset value for this DoGetPostBuyFormsIdsRequest.
     * 
     * @param resultOffset
     */
    public void setResultOffset(java.lang.Integer resultOffset) {
        this.resultOffset = resultOffset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetPostBuyFormsIdsRequest)) return false;
        DoGetPostBuyFormsIdsRequest other = (DoGetPostBuyFormsIdsRequest) obj;
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
            ((this.filterOptions==null && other.getFilterOptions()==null) || 
             (this.filterOptions!=null &&
              this.filterOptions.equals(other.getFilterOptions()))) &&
            ((this.resultSize==null && other.getResultSize()==null) || 
             (this.resultSize!=null &&
              this.resultSize.equals(other.getResultSize()))) &&
            ((this.resultOffset==null && other.getResultOffset()==null) || 
             (this.resultOffset!=null &&
              this.resultOffset.equals(other.getResultOffset())));
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
        if (getFilterOptions() != null) {
            _hashCode += getFilterOptions().hashCode();
        }
        if (getResultSize() != null) {
            _hashCode += getResultSize().hashCode();
        }
        if (getResultOffset() != null) {
            _hashCode += getResultOffset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetPostBuyFormsIdsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilteroptionstype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "resultSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "resultOffset"));
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

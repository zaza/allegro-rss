/**
 * DoCreateItemTemplateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoCreateItemTemplateRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String itemTemplateName;

    private com.allegro.webapi.ArrayOfFieldsvalue itemTemplateFields;

    public DoCreateItemTemplateRequest() {
    }

    public DoCreateItemTemplateRequest(
           java.lang.String sessionId,
           java.lang.String itemTemplateName,
           com.allegro.webapi.ArrayOfFieldsvalue itemTemplateFields) {
           this.sessionId = sessionId;
           this.itemTemplateName = itemTemplateName;
           this.itemTemplateFields = itemTemplateFields;
    }


    /**
     * Gets the sessionId value for this DoCreateItemTemplateRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DoCreateItemTemplateRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the itemTemplateName value for this DoCreateItemTemplateRequest.
     * 
     * @return itemTemplateName
     */
    public java.lang.String getItemTemplateName() {
        return itemTemplateName;
    }


    /**
     * Sets the itemTemplateName value for this DoCreateItemTemplateRequest.
     * 
     * @param itemTemplateName
     */
    public void setItemTemplateName(java.lang.String itemTemplateName) {
        this.itemTemplateName = itemTemplateName;
    }


    /**
     * Gets the itemTemplateFields value for this DoCreateItemTemplateRequest.
     * 
     * @return itemTemplateFields
     */
    public com.allegro.webapi.ArrayOfFieldsvalue getItemTemplateFields() {
        return itemTemplateFields;
    }


    /**
     * Sets the itemTemplateFields value for this DoCreateItemTemplateRequest.
     * 
     * @param itemTemplateFields
     */
    public void setItemTemplateFields(com.allegro.webapi.ArrayOfFieldsvalue itemTemplateFields) {
        this.itemTemplateFields = itemTemplateFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCreateItemTemplateRequest)) return false;
        DoCreateItemTemplateRequest other = (DoCreateItemTemplateRequest) obj;
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
            ((this.itemTemplateName==null && other.getItemTemplateName()==null) || 
             (this.itemTemplateName!=null &&
              this.itemTemplateName.equals(other.getItemTemplateName()))) &&
            ((this.itemTemplateFields==null && other.getItemTemplateFields()==null) || 
             (this.itemTemplateFields!=null &&
              this.itemTemplateFields.equals(other.getItemTemplateFields())));
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
        if (getItemTemplateName() != null) {
            _hashCode += getItemTemplateName().hashCode();
        }
        if (getItemTemplateFields() != null) {
            _hashCode += getItemTemplateFields().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCreateItemTemplateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCreateItemTemplateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateFields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFieldsvalue"));
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

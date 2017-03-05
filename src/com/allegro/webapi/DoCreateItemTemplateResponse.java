/**
 * DoCreateItemTemplateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoCreateItemTemplateResponse  implements java.io.Serializable {
    private com.allegro.webapi.CreatedItemTemplateStruct createdItemTemplate;

    public DoCreateItemTemplateResponse() {
    }

    public DoCreateItemTemplateResponse(
           com.allegro.webapi.CreatedItemTemplateStruct createdItemTemplate) {
           this.createdItemTemplate = createdItemTemplate;
    }


    /**
     * Gets the createdItemTemplate value for this DoCreateItemTemplateResponse.
     * 
     * @return createdItemTemplate
     */
    public com.allegro.webapi.CreatedItemTemplateStruct getCreatedItemTemplate() {
        return createdItemTemplate;
    }


    /**
     * Sets the createdItemTemplate value for this DoCreateItemTemplateResponse.
     * 
     * @param createdItemTemplate
     */
    public void setCreatedItemTemplate(com.allegro.webapi.CreatedItemTemplateStruct createdItemTemplate) {
        this.createdItemTemplate = createdItemTemplate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCreateItemTemplateResponse)) return false;
        DoCreateItemTemplateResponse other = (DoCreateItemTemplateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdItemTemplate==null && other.getCreatedItemTemplate()==null) || 
             (this.createdItemTemplate!=null &&
              this.createdItemTemplate.equals(other.getCreatedItemTemplate())));
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
        if (getCreatedItemTemplate() != null) {
            _hashCode += getCreatedItemTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCreateItemTemplateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCreateItemTemplateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdItemTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "createdItemTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CreatedItemTemplateStruct"));
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

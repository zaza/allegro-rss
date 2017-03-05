/**
 * DoGetFilledPostBuyFormsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetFilledPostBuyFormsResponse  implements java.io.Serializable {
    private com.allegro.webapi.FilledPostBuyFormsStruct filledPostBuyForms;

    public DoGetFilledPostBuyFormsResponse() {
    }

    public DoGetFilledPostBuyFormsResponse(
           com.allegro.webapi.FilledPostBuyFormsStruct filledPostBuyForms) {
           this.filledPostBuyForms = filledPostBuyForms;
    }


    /**
     * Gets the filledPostBuyForms value for this DoGetFilledPostBuyFormsResponse.
     * 
     * @return filledPostBuyForms
     */
    public com.allegro.webapi.FilledPostBuyFormsStruct getFilledPostBuyForms() {
        return filledPostBuyForms;
    }


    /**
     * Sets the filledPostBuyForms value for this DoGetFilledPostBuyFormsResponse.
     * 
     * @param filledPostBuyForms
     */
    public void setFilledPostBuyForms(com.allegro.webapi.FilledPostBuyFormsStruct filledPostBuyForms) {
        this.filledPostBuyForms = filledPostBuyForms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetFilledPostBuyFormsResponse)) return false;
        DoGetFilledPostBuyFormsResponse other = (DoGetFilledPostBuyFormsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filledPostBuyForms==null && other.getFilledPostBuyForms()==null) || 
             (this.filledPostBuyForms!=null &&
              this.filledPostBuyForms.equals(other.getFilledPostBuyForms())));
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
        if (getFilledPostBuyForms() != null) {
            _hashCode += getFilledPostBuyForms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetFilledPostBuyFormsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filledPostBuyForms");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filledPostBuyForms"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilledPostBuyFormsStruct"));
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

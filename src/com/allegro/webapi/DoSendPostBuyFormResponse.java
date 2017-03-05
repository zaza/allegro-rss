/**
 * DoSendPostBuyFormResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoSendPostBuyFormResponse  implements java.io.Serializable {
    private com.allegro.webapi.PostBuyFormStruct postBuyForm;

    public DoSendPostBuyFormResponse() {
    }

    public DoSendPostBuyFormResponse(
           com.allegro.webapi.PostBuyFormStruct postBuyForm) {
           this.postBuyForm = postBuyForm;
    }


    /**
     * Gets the postBuyForm value for this DoSendPostBuyFormResponse.
     * 
     * @return postBuyForm
     */
    public com.allegro.webapi.PostBuyFormStruct getPostBuyForm() {
        return postBuyForm;
    }


    /**
     * Sets the postBuyForm value for this DoSendPostBuyFormResponse.
     * 
     * @param postBuyForm
     */
    public void setPostBuyForm(com.allegro.webapi.PostBuyFormStruct postBuyForm) {
        this.postBuyForm = postBuyForm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSendPostBuyFormResponse)) return false;
        DoSendPostBuyFormResponse other = (DoSendPostBuyFormResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postBuyForm==null && other.getPostBuyForm()==null) || 
             (this.postBuyForm!=null &&
              this.postBuyForm.equals(other.getPostBuyForm())));
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
        if (getPostBuyForm() != null) {
            _hashCode += getPostBuyForm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSendPostBuyFormResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendPostBuyFormResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyForm");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormStruct"));
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

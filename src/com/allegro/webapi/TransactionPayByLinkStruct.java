/**
 * TransactionPayByLinkStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class TransactionPayByLinkStruct  implements java.io.Serializable {
    private java.lang.String actionHttpMethod;

    private java.lang.String actionUrl;

    private com.allegro.webapi.ArrayOfActiondatastruct actionData;

    public TransactionPayByLinkStruct() {
    }

    public TransactionPayByLinkStruct(
           java.lang.String actionHttpMethod,
           java.lang.String actionUrl,
           com.allegro.webapi.ArrayOfActiondatastruct actionData) {
           this.actionHttpMethod = actionHttpMethod;
           this.actionUrl = actionUrl;
           this.actionData = actionData;
    }


    /**
     * Gets the actionHttpMethod value for this TransactionPayByLinkStruct.
     * 
     * @return actionHttpMethod
     */
    public java.lang.String getActionHttpMethod() {
        return actionHttpMethod;
    }


    /**
     * Sets the actionHttpMethod value for this TransactionPayByLinkStruct.
     * 
     * @param actionHttpMethod
     */
    public void setActionHttpMethod(java.lang.String actionHttpMethod) {
        this.actionHttpMethod = actionHttpMethod;
    }


    /**
     * Gets the actionUrl value for this TransactionPayByLinkStruct.
     * 
     * @return actionUrl
     */
    public java.lang.String getActionUrl() {
        return actionUrl;
    }


    /**
     * Sets the actionUrl value for this TransactionPayByLinkStruct.
     * 
     * @param actionUrl
     */
    public void setActionUrl(java.lang.String actionUrl) {
        this.actionUrl = actionUrl;
    }


    /**
     * Gets the actionData value for this TransactionPayByLinkStruct.
     * 
     * @return actionData
     */
    public com.allegro.webapi.ArrayOfActiondatastruct getActionData() {
        return actionData;
    }


    /**
     * Sets the actionData value for this TransactionPayByLinkStruct.
     * 
     * @param actionData
     */
    public void setActionData(com.allegro.webapi.ArrayOfActiondatastruct actionData) {
        this.actionData = actionData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionPayByLinkStruct)) return false;
        TransactionPayByLinkStruct other = (TransactionPayByLinkStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionHttpMethod==null && other.getActionHttpMethod()==null) || 
             (this.actionHttpMethod!=null &&
              this.actionHttpMethod.equals(other.getActionHttpMethod()))) &&
            ((this.actionUrl==null && other.getActionUrl()==null) || 
             (this.actionUrl!=null &&
              this.actionUrl.equals(other.getActionUrl()))) &&
            ((this.actionData==null && other.getActionData()==null) || 
             (this.actionData!=null &&
              this.actionData.equals(other.getActionData())));
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
        if (getActionHttpMethod() != null) {
            _hashCode += getActionHttpMethod().hashCode();
        }
        if (getActionUrl() != null) {
            _hashCode += getActionUrl().hashCode();
        }
        if (getActionData() != null) {
            _hashCode += getActionData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionPayByLinkStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TransactionPayByLinkStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionHttpMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "actionHttpMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "actionUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "actionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfActiondatastruct"));
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

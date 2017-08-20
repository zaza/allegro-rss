/**
 * PostBuyFormItemDealsAdditionalServiceStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PostBuyFormItemDealsAdditionalServiceStruct  implements java.io.Serializable {
    private java.lang.String additionalServiceDefinitionId;

    private java.lang.String additionalServiceName;

    private int additionalServiceQuantity;

    private float additionalServicePrice;

    public PostBuyFormItemDealsAdditionalServiceStruct() {
    }

    public PostBuyFormItemDealsAdditionalServiceStruct(
           java.lang.String additionalServiceDefinitionId,
           java.lang.String additionalServiceName,
           int additionalServiceQuantity,
           float additionalServicePrice) {
           this.additionalServiceDefinitionId = additionalServiceDefinitionId;
           this.additionalServiceName = additionalServiceName;
           this.additionalServiceQuantity = additionalServiceQuantity;
           this.additionalServicePrice = additionalServicePrice;
    }


    /**
     * Gets the additionalServiceDefinitionId value for this PostBuyFormItemDealsAdditionalServiceStruct.
     * 
     * @return additionalServiceDefinitionId
     */
    public java.lang.String getAdditionalServiceDefinitionId() {
        return additionalServiceDefinitionId;
    }


    /**
     * Sets the additionalServiceDefinitionId value for this PostBuyFormItemDealsAdditionalServiceStruct.
     * 
     * @param additionalServiceDefinitionId
     */
    public void setAdditionalServiceDefinitionId(java.lang.String additionalServiceDefinitionId) {
        this.additionalServiceDefinitionId = additionalServiceDefinitionId;
    }


    /**
     * Gets the additionalServiceName value for this PostBuyFormItemDealsAdditionalServiceStruct.
     * 
     * @return additionalServiceName
     */
    public java.lang.String getAdditionalServiceName() {
        return additionalServiceName;
    }


    /**
     * Sets the additionalServiceName value for this PostBuyFormItemDealsAdditionalServiceStruct.
     * 
     * @param additionalServiceName
     */
    public void setAdditionalServiceName(java.lang.String additionalServiceName) {
        this.additionalServiceName = additionalServiceName;
    }


    /**
     * Gets the additionalServiceQuantity value for this PostBuyFormItemDealsAdditionalServiceStruct.
     * 
     * @return additionalServiceQuantity
     */
    public int getAdditionalServiceQuantity() {
        return additionalServiceQuantity;
    }


    /**
     * Sets the additionalServiceQuantity value for this PostBuyFormItemDealsAdditionalServiceStruct.
     * 
     * @param additionalServiceQuantity
     */
    public void setAdditionalServiceQuantity(int additionalServiceQuantity) {
        this.additionalServiceQuantity = additionalServiceQuantity;
    }


    /**
     * Gets the additionalServicePrice value for this PostBuyFormItemDealsAdditionalServiceStruct.
     * 
     * @return additionalServicePrice
     */
    public float getAdditionalServicePrice() {
        return additionalServicePrice;
    }


    /**
     * Sets the additionalServicePrice value for this PostBuyFormItemDealsAdditionalServiceStruct.
     * 
     * @param additionalServicePrice
     */
    public void setAdditionalServicePrice(float additionalServicePrice) {
        this.additionalServicePrice = additionalServicePrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormItemDealsAdditionalServiceStruct)) return false;
        PostBuyFormItemDealsAdditionalServiceStruct other = (PostBuyFormItemDealsAdditionalServiceStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalServiceDefinitionId==null && other.getAdditionalServiceDefinitionId()==null) || 
             (this.additionalServiceDefinitionId!=null &&
              this.additionalServiceDefinitionId.equals(other.getAdditionalServiceDefinitionId()))) &&
            ((this.additionalServiceName==null && other.getAdditionalServiceName()==null) || 
             (this.additionalServiceName!=null &&
              this.additionalServiceName.equals(other.getAdditionalServiceName()))) &&
            this.additionalServiceQuantity == other.getAdditionalServiceQuantity() &&
            this.additionalServicePrice == other.getAdditionalServicePrice();
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
        if (getAdditionalServiceDefinitionId() != null) {
            _hashCode += getAdditionalServiceDefinitionId().hashCode();
        }
        if (getAdditionalServiceName() != null) {
            _hashCode += getAdditionalServiceName().hashCode();
        }
        _hashCode += getAdditionalServiceQuantity();
        _hashCode += new Float(getAdditionalServicePrice()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostBuyFormItemDealsAdditionalServiceStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsAdditionalServiceStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalServiceDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "additionalServiceDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "additionalServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalServiceQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "additionalServiceQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalServicePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "additionalServicePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

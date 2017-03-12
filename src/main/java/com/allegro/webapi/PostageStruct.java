/**
 * PostageStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PostageStruct  implements java.io.Serializable {
    private float postageAmount;

    private float postageAmountAdd;

    private int postagePackSize;

    private int postageId;

    private int postageFreeShipping;

    private java.lang.Integer postageFreeReturn;

    private com.allegro.webapi.FulfillmentTimeStruct postageFulfillmentTime;

    public PostageStruct() {
    }

    public PostageStruct(
           float postageAmount,
           float postageAmountAdd,
           int postagePackSize,
           int postageId,
           int postageFreeShipping,
           java.lang.Integer postageFreeReturn,
           com.allegro.webapi.FulfillmentTimeStruct postageFulfillmentTime) {
           this.postageAmount = postageAmount;
           this.postageAmountAdd = postageAmountAdd;
           this.postagePackSize = postagePackSize;
           this.postageId = postageId;
           this.postageFreeShipping = postageFreeShipping;
           this.postageFreeReturn = postageFreeReturn;
           this.postageFulfillmentTime = postageFulfillmentTime;
    }


    /**
     * Gets the postageAmount value for this PostageStruct.
     * 
     * @return postageAmount
     */
    public float getPostageAmount() {
        return postageAmount;
    }


    /**
     * Sets the postageAmount value for this PostageStruct.
     * 
     * @param postageAmount
     */
    public void setPostageAmount(float postageAmount) {
        this.postageAmount = postageAmount;
    }


    /**
     * Gets the postageAmountAdd value for this PostageStruct.
     * 
     * @return postageAmountAdd
     */
    public float getPostageAmountAdd() {
        return postageAmountAdd;
    }


    /**
     * Sets the postageAmountAdd value for this PostageStruct.
     * 
     * @param postageAmountAdd
     */
    public void setPostageAmountAdd(float postageAmountAdd) {
        this.postageAmountAdd = postageAmountAdd;
    }


    /**
     * Gets the postagePackSize value for this PostageStruct.
     * 
     * @return postagePackSize
     */
    public int getPostagePackSize() {
        return postagePackSize;
    }


    /**
     * Sets the postagePackSize value for this PostageStruct.
     * 
     * @param postagePackSize
     */
    public void setPostagePackSize(int postagePackSize) {
        this.postagePackSize = postagePackSize;
    }


    /**
     * Gets the postageId value for this PostageStruct.
     * 
     * @return postageId
     */
    public int getPostageId() {
        return postageId;
    }


    /**
     * Sets the postageId value for this PostageStruct.
     * 
     * @param postageId
     */
    public void setPostageId(int postageId) {
        this.postageId = postageId;
    }


    /**
     * Gets the postageFreeShipping value for this PostageStruct.
     * 
     * @return postageFreeShipping
     */
    public int getPostageFreeShipping() {
        return postageFreeShipping;
    }


    /**
     * Sets the postageFreeShipping value for this PostageStruct.
     * 
     * @param postageFreeShipping
     */
    public void setPostageFreeShipping(int postageFreeShipping) {
        this.postageFreeShipping = postageFreeShipping;
    }


    /**
     * Gets the postageFreeReturn value for this PostageStruct.
     * 
     * @return postageFreeReturn
     */
    public java.lang.Integer getPostageFreeReturn() {
        return postageFreeReturn;
    }


    /**
     * Sets the postageFreeReturn value for this PostageStruct.
     * 
     * @param postageFreeReturn
     */
    public void setPostageFreeReturn(java.lang.Integer postageFreeReturn) {
        this.postageFreeReturn = postageFreeReturn;
    }


    /**
     * Gets the postageFulfillmentTime value for this PostageStruct.
     * 
     * @return postageFulfillmentTime
     */
    public com.allegro.webapi.FulfillmentTimeStruct getPostageFulfillmentTime() {
        return postageFulfillmentTime;
    }


    /**
     * Sets the postageFulfillmentTime value for this PostageStruct.
     * 
     * @param postageFulfillmentTime
     */
    public void setPostageFulfillmentTime(com.allegro.webapi.FulfillmentTimeStruct postageFulfillmentTime) {
        this.postageFulfillmentTime = postageFulfillmentTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostageStruct)) return false;
        PostageStruct other = (PostageStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.postageAmount == other.getPostageAmount() &&
            this.postageAmountAdd == other.getPostageAmountAdd() &&
            this.postagePackSize == other.getPostagePackSize() &&
            this.postageId == other.getPostageId() &&
            this.postageFreeShipping == other.getPostageFreeShipping() &&
            ((this.postageFreeReturn==null && other.getPostageFreeReturn()==null) || 
             (this.postageFreeReturn!=null &&
              this.postageFreeReturn.equals(other.getPostageFreeReturn()))) &&
            ((this.postageFulfillmentTime==null && other.getPostageFulfillmentTime()==null) || 
             (this.postageFulfillmentTime!=null &&
              this.postageFulfillmentTime.equals(other.getPostageFulfillmentTime())));
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
        _hashCode += new Float(getPostageAmount()).hashCode();
        _hashCode += new Float(getPostageAmountAdd()).hashCode();
        _hashCode += getPostagePackSize();
        _hashCode += getPostageId();
        _hashCode += getPostageFreeShipping();
        if (getPostageFreeReturn() != null) {
            _hashCode += getPostageFreeReturn().hashCode();
        }
        if (getPostageFulfillmentTime() != null) {
            _hashCode += getPostageFulfillmentTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostageStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageAmountAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postageAmountAdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postagePackSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postagePackSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageFreeShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postageFreeShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageFreeReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postageFreeReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageFulfillmentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postageFulfillmentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FulfillmentTimeStruct"));
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

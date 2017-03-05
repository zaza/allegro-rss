/**
 * PostBuyFormItemStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PostBuyFormItemStruct  implements java.io.Serializable {
    private int postBuyFormItQuantity;

    private float postBuyFormItAmount;

    private long postBuyFormItId;

    private java.lang.String postBuyFormItTitle;

    private int postBuyFormItCountry;

    private float postBuyFormItPrice;

    private com.allegro.webapi.ArrayOfPostbuyformitemdealsstruct postBuyFormItDeals;

    public PostBuyFormItemStruct() {
    }

    public PostBuyFormItemStruct(
           int postBuyFormItQuantity,
           float postBuyFormItAmount,
           long postBuyFormItId,
           java.lang.String postBuyFormItTitle,
           int postBuyFormItCountry,
           float postBuyFormItPrice,
           com.allegro.webapi.ArrayOfPostbuyformitemdealsstruct postBuyFormItDeals) {
           this.postBuyFormItQuantity = postBuyFormItQuantity;
           this.postBuyFormItAmount = postBuyFormItAmount;
           this.postBuyFormItId = postBuyFormItId;
           this.postBuyFormItTitle = postBuyFormItTitle;
           this.postBuyFormItCountry = postBuyFormItCountry;
           this.postBuyFormItPrice = postBuyFormItPrice;
           this.postBuyFormItDeals = postBuyFormItDeals;
    }


    /**
     * Gets the postBuyFormItQuantity value for this PostBuyFormItemStruct.
     * 
     * @return postBuyFormItQuantity
     */
    public int getPostBuyFormItQuantity() {
        return postBuyFormItQuantity;
    }


    /**
     * Sets the postBuyFormItQuantity value for this PostBuyFormItemStruct.
     * 
     * @param postBuyFormItQuantity
     */
    public void setPostBuyFormItQuantity(int postBuyFormItQuantity) {
        this.postBuyFormItQuantity = postBuyFormItQuantity;
    }


    /**
     * Gets the postBuyFormItAmount value for this PostBuyFormItemStruct.
     * 
     * @return postBuyFormItAmount
     */
    public float getPostBuyFormItAmount() {
        return postBuyFormItAmount;
    }


    /**
     * Sets the postBuyFormItAmount value for this PostBuyFormItemStruct.
     * 
     * @param postBuyFormItAmount
     */
    public void setPostBuyFormItAmount(float postBuyFormItAmount) {
        this.postBuyFormItAmount = postBuyFormItAmount;
    }


    /**
     * Gets the postBuyFormItId value for this PostBuyFormItemStruct.
     * 
     * @return postBuyFormItId
     */
    public long getPostBuyFormItId() {
        return postBuyFormItId;
    }


    /**
     * Sets the postBuyFormItId value for this PostBuyFormItemStruct.
     * 
     * @param postBuyFormItId
     */
    public void setPostBuyFormItId(long postBuyFormItId) {
        this.postBuyFormItId = postBuyFormItId;
    }


    /**
     * Gets the postBuyFormItTitle value for this PostBuyFormItemStruct.
     * 
     * @return postBuyFormItTitle
     */
    public java.lang.String getPostBuyFormItTitle() {
        return postBuyFormItTitle;
    }


    /**
     * Sets the postBuyFormItTitle value for this PostBuyFormItemStruct.
     * 
     * @param postBuyFormItTitle
     */
    public void setPostBuyFormItTitle(java.lang.String postBuyFormItTitle) {
        this.postBuyFormItTitle = postBuyFormItTitle;
    }


    /**
     * Gets the postBuyFormItCountry value for this PostBuyFormItemStruct.
     * 
     * @return postBuyFormItCountry
     */
    public int getPostBuyFormItCountry() {
        return postBuyFormItCountry;
    }


    /**
     * Sets the postBuyFormItCountry value for this PostBuyFormItemStruct.
     * 
     * @param postBuyFormItCountry
     */
    public void setPostBuyFormItCountry(int postBuyFormItCountry) {
        this.postBuyFormItCountry = postBuyFormItCountry;
    }


    /**
     * Gets the postBuyFormItPrice value for this PostBuyFormItemStruct.
     * 
     * @return postBuyFormItPrice
     */
    public float getPostBuyFormItPrice() {
        return postBuyFormItPrice;
    }


    /**
     * Sets the postBuyFormItPrice value for this PostBuyFormItemStruct.
     * 
     * @param postBuyFormItPrice
     */
    public void setPostBuyFormItPrice(float postBuyFormItPrice) {
        this.postBuyFormItPrice = postBuyFormItPrice;
    }


    /**
     * Gets the postBuyFormItDeals value for this PostBuyFormItemStruct.
     * 
     * @return postBuyFormItDeals
     */
    public com.allegro.webapi.ArrayOfPostbuyformitemdealsstruct getPostBuyFormItDeals() {
        return postBuyFormItDeals;
    }


    /**
     * Sets the postBuyFormItDeals value for this PostBuyFormItemStruct.
     * 
     * @param postBuyFormItDeals
     */
    public void setPostBuyFormItDeals(com.allegro.webapi.ArrayOfPostbuyformitemdealsstruct postBuyFormItDeals) {
        this.postBuyFormItDeals = postBuyFormItDeals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormItemStruct)) return false;
        PostBuyFormItemStruct other = (PostBuyFormItemStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.postBuyFormItQuantity == other.getPostBuyFormItQuantity() &&
            this.postBuyFormItAmount == other.getPostBuyFormItAmount() &&
            this.postBuyFormItId == other.getPostBuyFormItId() &&
            ((this.postBuyFormItTitle==null && other.getPostBuyFormItTitle()==null) || 
             (this.postBuyFormItTitle!=null &&
              this.postBuyFormItTitle.equals(other.getPostBuyFormItTitle()))) &&
            this.postBuyFormItCountry == other.getPostBuyFormItCountry() &&
            this.postBuyFormItPrice == other.getPostBuyFormItPrice() &&
            ((this.postBuyFormItDeals==null && other.getPostBuyFormItDeals()==null) || 
             (this.postBuyFormItDeals!=null &&
              this.postBuyFormItDeals.equals(other.getPostBuyFormItDeals())));
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
        _hashCode += getPostBuyFormItQuantity();
        _hashCode += new Float(getPostBuyFormItAmount()).hashCode();
        _hashCode += new Long(getPostBuyFormItId()).hashCode();
        if (getPostBuyFormItTitle() != null) {
            _hashCode += getPostBuyFormItTitle().hashCode();
        }
        _hashCode += getPostBuyFormItCountry();
        _hashCode += new Float(getPostBuyFormItPrice()).hashCode();
        if (getPostBuyFormItDeals() != null) {
            _hashCode += getPostBuyFormItDeals().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostBuyFormItemStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormItQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormItQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormItAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormItAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormItId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormItId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormItTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormItTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormItCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormItCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormItPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormItPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormItDeals");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormItDeals"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemdealsstruct"));
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

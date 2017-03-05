/**
 * PostBuyFormSellersStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PostBuyFormSellersStruct  implements java.io.Serializable {
    private int postBuyFormSellerId;

    private java.lang.String postBuyFormSellerName;

    private com.allegro.webapi.ArrayOfPostbuyformitemstruct postBuyFormItems;

    private int postBuyFormShipmentId;

    private float postBuyFormPostageAmount;

    private java.lang.String postBuyFormMsgToSeller;

    private float postBuyFormAmount;

    private com.allegro.webapi.ArrayOfLong postBuyFormSurchargesList;

    private com.allegro.webapi.ArrayOfPostbuyformshipmenttrackingstruct postBuyFormShipmentTracking;

    private com.allegro.webapi.PostBuyFormAddressStruct postBuyFormGdAddress;

    private java.lang.String postBuyFormGdAdditionalInfo;

    private int postBuyFormSentBySeller;

    public PostBuyFormSellersStruct() {
    }

    public PostBuyFormSellersStruct(
           int postBuyFormSellerId,
           java.lang.String postBuyFormSellerName,
           com.allegro.webapi.ArrayOfPostbuyformitemstruct postBuyFormItems,
           int postBuyFormShipmentId,
           float postBuyFormPostageAmount,
           java.lang.String postBuyFormMsgToSeller,
           float postBuyFormAmount,
           com.allegro.webapi.ArrayOfLong postBuyFormSurchargesList,
           com.allegro.webapi.ArrayOfPostbuyformshipmenttrackingstruct postBuyFormShipmentTracking,
           com.allegro.webapi.PostBuyFormAddressStruct postBuyFormGdAddress,
           java.lang.String postBuyFormGdAdditionalInfo,
           int postBuyFormSentBySeller) {
           this.postBuyFormSellerId = postBuyFormSellerId;
           this.postBuyFormSellerName = postBuyFormSellerName;
           this.postBuyFormItems = postBuyFormItems;
           this.postBuyFormShipmentId = postBuyFormShipmentId;
           this.postBuyFormPostageAmount = postBuyFormPostageAmount;
           this.postBuyFormMsgToSeller = postBuyFormMsgToSeller;
           this.postBuyFormAmount = postBuyFormAmount;
           this.postBuyFormSurchargesList = postBuyFormSurchargesList;
           this.postBuyFormShipmentTracking = postBuyFormShipmentTracking;
           this.postBuyFormGdAddress = postBuyFormGdAddress;
           this.postBuyFormGdAdditionalInfo = postBuyFormGdAdditionalInfo;
           this.postBuyFormSentBySeller = postBuyFormSentBySeller;
    }


    /**
     * Gets the postBuyFormSellerId value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormSellerId
     */
    public int getPostBuyFormSellerId() {
        return postBuyFormSellerId;
    }


    /**
     * Sets the postBuyFormSellerId value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormSellerId
     */
    public void setPostBuyFormSellerId(int postBuyFormSellerId) {
        this.postBuyFormSellerId = postBuyFormSellerId;
    }


    /**
     * Gets the postBuyFormSellerName value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormSellerName
     */
    public java.lang.String getPostBuyFormSellerName() {
        return postBuyFormSellerName;
    }


    /**
     * Sets the postBuyFormSellerName value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormSellerName
     */
    public void setPostBuyFormSellerName(java.lang.String postBuyFormSellerName) {
        this.postBuyFormSellerName = postBuyFormSellerName;
    }


    /**
     * Gets the postBuyFormItems value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormItems
     */
    public com.allegro.webapi.ArrayOfPostbuyformitemstruct getPostBuyFormItems() {
        return postBuyFormItems;
    }


    /**
     * Sets the postBuyFormItems value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormItems
     */
    public void setPostBuyFormItems(com.allegro.webapi.ArrayOfPostbuyformitemstruct postBuyFormItems) {
        this.postBuyFormItems = postBuyFormItems;
    }


    /**
     * Gets the postBuyFormShipmentId value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormShipmentId
     */
    public int getPostBuyFormShipmentId() {
        return postBuyFormShipmentId;
    }


    /**
     * Sets the postBuyFormShipmentId value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormShipmentId
     */
    public void setPostBuyFormShipmentId(int postBuyFormShipmentId) {
        this.postBuyFormShipmentId = postBuyFormShipmentId;
    }


    /**
     * Gets the postBuyFormPostageAmount value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormPostageAmount
     */
    public float getPostBuyFormPostageAmount() {
        return postBuyFormPostageAmount;
    }


    /**
     * Sets the postBuyFormPostageAmount value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormPostageAmount
     */
    public void setPostBuyFormPostageAmount(float postBuyFormPostageAmount) {
        this.postBuyFormPostageAmount = postBuyFormPostageAmount;
    }


    /**
     * Gets the postBuyFormMsgToSeller value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormMsgToSeller
     */
    public java.lang.String getPostBuyFormMsgToSeller() {
        return postBuyFormMsgToSeller;
    }


    /**
     * Sets the postBuyFormMsgToSeller value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormMsgToSeller
     */
    public void setPostBuyFormMsgToSeller(java.lang.String postBuyFormMsgToSeller) {
        this.postBuyFormMsgToSeller = postBuyFormMsgToSeller;
    }


    /**
     * Gets the postBuyFormAmount value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormAmount
     */
    public float getPostBuyFormAmount() {
        return postBuyFormAmount;
    }


    /**
     * Sets the postBuyFormAmount value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormAmount
     */
    public void setPostBuyFormAmount(float postBuyFormAmount) {
        this.postBuyFormAmount = postBuyFormAmount;
    }


    /**
     * Gets the postBuyFormSurchargesList value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormSurchargesList
     */
    public com.allegro.webapi.ArrayOfLong getPostBuyFormSurchargesList() {
        return postBuyFormSurchargesList;
    }


    /**
     * Sets the postBuyFormSurchargesList value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormSurchargesList
     */
    public void setPostBuyFormSurchargesList(com.allegro.webapi.ArrayOfLong postBuyFormSurchargesList) {
        this.postBuyFormSurchargesList = postBuyFormSurchargesList;
    }


    /**
     * Gets the postBuyFormShipmentTracking value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormShipmentTracking
     */
    public com.allegro.webapi.ArrayOfPostbuyformshipmenttrackingstruct getPostBuyFormShipmentTracking() {
        return postBuyFormShipmentTracking;
    }


    /**
     * Sets the postBuyFormShipmentTracking value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormShipmentTracking
     */
    public void setPostBuyFormShipmentTracking(com.allegro.webapi.ArrayOfPostbuyformshipmenttrackingstruct postBuyFormShipmentTracking) {
        this.postBuyFormShipmentTracking = postBuyFormShipmentTracking;
    }


    /**
     * Gets the postBuyFormGdAddress value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormGdAddress
     */
    public com.allegro.webapi.PostBuyFormAddressStruct getPostBuyFormGdAddress() {
        return postBuyFormGdAddress;
    }


    /**
     * Sets the postBuyFormGdAddress value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormGdAddress
     */
    public void setPostBuyFormGdAddress(com.allegro.webapi.PostBuyFormAddressStruct postBuyFormGdAddress) {
        this.postBuyFormGdAddress = postBuyFormGdAddress;
    }


    /**
     * Gets the postBuyFormGdAdditionalInfo value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormGdAdditionalInfo
     */
    public java.lang.String getPostBuyFormGdAdditionalInfo() {
        return postBuyFormGdAdditionalInfo;
    }


    /**
     * Sets the postBuyFormGdAdditionalInfo value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormGdAdditionalInfo
     */
    public void setPostBuyFormGdAdditionalInfo(java.lang.String postBuyFormGdAdditionalInfo) {
        this.postBuyFormGdAdditionalInfo = postBuyFormGdAdditionalInfo;
    }


    /**
     * Gets the postBuyFormSentBySeller value for this PostBuyFormSellersStruct.
     * 
     * @return postBuyFormSentBySeller
     */
    public int getPostBuyFormSentBySeller() {
        return postBuyFormSentBySeller;
    }


    /**
     * Sets the postBuyFormSentBySeller value for this PostBuyFormSellersStruct.
     * 
     * @param postBuyFormSentBySeller
     */
    public void setPostBuyFormSentBySeller(int postBuyFormSentBySeller) {
        this.postBuyFormSentBySeller = postBuyFormSentBySeller;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormSellersStruct)) return false;
        PostBuyFormSellersStruct other = (PostBuyFormSellersStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.postBuyFormSellerId == other.getPostBuyFormSellerId() &&
            ((this.postBuyFormSellerName==null && other.getPostBuyFormSellerName()==null) || 
             (this.postBuyFormSellerName!=null &&
              this.postBuyFormSellerName.equals(other.getPostBuyFormSellerName()))) &&
            ((this.postBuyFormItems==null && other.getPostBuyFormItems()==null) || 
             (this.postBuyFormItems!=null &&
              this.postBuyFormItems.equals(other.getPostBuyFormItems()))) &&
            this.postBuyFormShipmentId == other.getPostBuyFormShipmentId() &&
            this.postBuyFormPostageAmount == other.getPostBuyFormPostageAmount() &&
            ((this.postBuyFormMsgToSeller==null && other.getPostBuyFormMsgToSeller()==null) || 
             (this.postBuyFormMsgToSeller!=null &&
              this.postBuyFormMsgToSeller.equals(other.getPostBuyFormMsgToSeller()))) &&
            this.postBuyFormAmount == other.getPostBuyFormAmount() &&
            ((this.postBuyFormSurchargesList==null && other.getPostBuyFormSurchargesList()==null) || 
             (this.postBuyFormSurchargesList!=null &&
              this.postBuyFormSurchargesList.equals(other.getPostBuyFormSurchargesList()))) &&
            ((this.postBuyFormShipmentTracking==null && other.getPostBuyFormShipmentTracking()==null) || 
             (this.postBuyFormShipmentTracking!=null &&
              this.postBuyFormShipmentTracking.equals(other.getPostBuyFormShipmentTracking()))) &&
            ((this.postBuyFormGdAddress==null && other.getPostBuyFormGdAddress()==null) || 
             (this.postBuyFormGdAddress!=null &&
              this.postBuyFormGdAddress.equals(other.getPostBuyFormGdAddress()))) &&
            ((this.postBuyFormGdAdditionalInfo==null && other.getPostBuyFormGdAdditionalInfo()==null) || 
             (this.postBuyFormGdAdditionalInfo!=null &&
              this.postBuyFormGdAdditionalInfo.equals(other.getPostBuyFormGdAdditionalInfo()))) &&
            this.postBuyFormSentBySeller == other.getPostBuyFormSentBySeller();
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
        _hashCode += getPostBuyFormSellerId();
        if (getPostBuyFormSellerName() != null) {
            _hashCode += getPostBuyFormSellerName().hashCode();
        }
        if (getPostBuyFormItems() != null) {
            _hashCode += getPostBuyFormItems().hashCode();
        }
        _hashCode += getPostBuyFormShipmentId();
        _hashCode += new Float(getPostBuyFormPostageAmount()).hashCode();
        if (getPostBuyFormMsgToSeller() != null) {
            _hashCode += getPostBuyFormMsgToSeller().hashCode();
        }
        _hashCode += new Float(getPostBuyFormAmount()).hashCode();
        if (getPostBuyFormSurchargesList() != null) {
            _hashCode += getPostBuyFormSurchargesList().hashCode();
        }
        if (getPostBuyFormShipmentTracking() != null) {
            _hashCode += getPostBuyFormShipmentTracking().hashCode();
        }
        if (getPostBuyFormGdAddress() != null) {
            _hashCode += getPostBuyFormGdAddress().hashCode();
        }
        if (getPostBuyFormGdAdditionalInfo() != null) {
            _hashCode += getPostBuyFormGdAdditionalInfo().hashCode();
        }
        _hashCode += getPostBuyFormSentBySeller();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostBuyFormSellersStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormSellersStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormSellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormSellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormSellerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormSellerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormItems");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemstruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormShipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormShipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPostageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormPostageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormMsgToSeller");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormMsgToSeller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormSurchargesList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormSurchargesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormShipmentTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormShipmentTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformshipmenttrackingstruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormGdAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormGdAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormAddressStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormGdAdditionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormGdAdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormSentBySeller");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormSentBySeller"));
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

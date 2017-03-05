/**
 * NewPostBuyFormSellerStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class NewPostBuyFormSellerStruct  implements java.io.Serializable {
    private int sellerId;

    private com.allegro.webapi.ArrayOfLong sellerItemIds;

    private int sellerShipmentId;

    private java.lang.Integer sellerGdId;

    private java.lang.Float sellerShipmentAmount;

    private java.lang.String sellerMessageTo;

    public NewPostBuyFormSellerStruct() {
    }

    public NewPostBuyFormSellerStruct(
           int sellerId,
           com.allegro.webapi.ArrayOfLong sellerItemIds,
           int sellerShipmentId,
           java.lang.Integer sellerGdId,
           java.lang.Float sellerShipmentAmount,
           java.lang.String sellerMessageTo) {
           this.sellerId = sellerId;
           this.sellerItemIds = sellerItemIds;
           this.sellerShipmentId = sellerShipmentId;
           this.sellerGdId = sellerGdId;
           this.sellerShipmentAmount = sellerShipmentAmount;
           this.sellerMessageTo = sellerMessageTo;
    }


    /**
     * Gets the sellerId value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerId
     */
    public int getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerId
     */
    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the sellerItemIds value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerItemIds
     */
    public com.allegro.webapi.ArrayOfLong getSellerItemIds() {
        return sellerItemIds;
    }


    /**
     * Sets the sellerItemIds value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerItemIds
     */
    public void setSellerItemIds(com.allegro.webapi.ArrayOfLong sellerItemIds) {
        this.sellerItemIds = sellerItemIds;
    }


    /**
     * Gets the sellerShipmentId value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerShipmentId
     */
    public int getSellerShipmentId() {
        return sellerShipmentId;
    }


    /**
     * Sets the sellerShipmentId value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerShipmentId
     */
    public void setSellerShipmentId(int sellerShipmentId) {
        this.sellerShipmentId = sellerShipmentId;
    }


    /**
     * Gets the sellerGdId value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerGdId
     */
    public java.lang.Integer getSellerGdId() {
        return sellerGdId;
    }


    /**
     * Sets the sellerGdId value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerGdId
     */
    public void setSellerGdId(java.lang.Integer sellerGdId) {
        this.sellerGdId = sellerGdId;
    }


    /**
     * Gets the sellerShipmentAmount value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerShipmentAmount
     */
    public java.lang.Float getSellerShipmentAmount() {
        return sellerShipmentAmount;
    }


    /**
     * Sets the sellerShipmentAmount value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerShipmentAmount
     */
    public void setSellerShipmentAmount(java.lang.Float sellerShipmentAmount) {
        this.sellerShipmentAmount = sellerShipmentAmount;
    }


    /**
     * Gets the sellerMessageTo value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerMessageTo
     */
    public java.lang.String getSellerMessageTo() {
        return sellerMessageTo;
    }


    /**
     * Sets the sellerMessageTo value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerMessageTo
     */
    public void setSellerMessageTo(java.lang.String sellerMessageTo) {
        this.sellerMessageTo = sellerMessageTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewPostBuyFormSellerStruct)) return false;
        NewPostBuyFormSellerStruct other = (NewPostBuyFormSellerStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sellerId == other.getSellerId() &&
            ((this.sellerItemIds==null && other.getSellerItemIds()==null) || 
             (this.sellerItemIds!=null &&
              this.sellerItemIds.equals(other.getSellerItemIds()))) &&
            this.sellerShipmentId == other.getSellerShipmentId() &&
            ((this.sellerGdId==null && other.getSellerGdId()==null) || 
             (this.sellerGdId!=null &&
              this.sellerGdId.equals(other.getSellerGdId()))) &&
            ((this.sellerShipmentAmount==null && other.getSellerShipmentAmount()==null) || 
             (this.sellerShipmentAmount!=null &&
              this.sellerShipmentAmount.equals(other.getSellerShipmentAmount()))) &&
            ((this.sellerMessageTo==null && other.getSellerMessageTo()==null) || 
             (this.sellerMessageTo!=null &&
              this.sellerMessageTo.equals(other.getSellerMessageTo())));
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
        _hashCode += getSellerId();
        if (getSellerItemIds() != null) {
            _hashCode += getSellerItemIds().hashCode();
        }
        _hashCode += getSellerShipmentId();
        if (getSellerGdId() != null) {
            _hashCode += getSellerGdId().hashCode();
        }
        if (getSellerShipmentAmount() != null) {
            _hashCode += getSellerShipmentAmount().hashCode();
        }
        if (getSellerMessageTo() != null) {
            _hashCode += getSellerMessageTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewPostBuyFormSellerStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormSellerStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerItemIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerItemIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerShipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerShipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerGdId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerGdId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerShipmentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerShipmentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerMessageTo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerMessageTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

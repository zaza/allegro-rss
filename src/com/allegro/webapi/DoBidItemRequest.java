/**
 * DoBidItemRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoBidItemRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long bidItId;

    private float bidUserPrice;

    private long bidQuantity;

    private java.lang.Long bidBuyNow;

    private com.allegro.webapi.PharmacyRecipientDataStruct pharmacyRecipientData;

    private java.lang.String variantId;

    public DoBidItemRequest() {
    }

    public DoBidItemRequest(
           java.lang.String sessionHandle,
           long bidItId,
           float bidUserPrice,
           long bidQuantity,
           java.lang.Long bidBuyNow,
           com.allegro.webapi.PharmacyRecipientDataStruct pharmacyRecipientData,
           java.lang.String variantId) {
           this.sessionHandle = sessionHandle;
           this.bidItId = bidItId;
           this.bidUserPrice = bidUserPrice;
           this.bidQuantity = bidQuantity;
           this.bidBuyNow = bidBuyNow;
           this.pharmacyRecipientData = pharmacyRecipientData;
           this.variantId = variantId;
    }


    /**
     * Gets the sessionHandle value for this DoBidItemRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoBidItemRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the bidItId value for this DoBidItemRequest.
     * 
     * @return bidItId
     */
    public long getBidItId() {
        return bidItId;
    }


    /**
     * Sets the bidItId value for this DoBidItemRequest.
     * 
     * @param bidItId
     */
    public void setBidItId(long bidItId) {
        this.bidItId = bidItId;
    }


    /**
     * Gets the bidUserPrice value for this DoBidItemRequest.
     * 
     * @return bidUserPrice
     */
    public float getBidUserPrice() {
        return bidUserPrice;
    }


    /**
     * Sets the bidUserPrice value for this DoBidItemRequest.
     * 
     * @param bidUserPrice
     */
    public void setBidUserPrice(float bidUserPrice) {
        this.bidUserPrice = bidUserPrice;
    }


    /**
     * Gets the bidQuantity value for this DoBidItemRequest.
     * 
     * @return bidQuantity
     */
    public long getBidQuantity() {
        return bidQuantity;
    }


    /**
     * Sets the bidQuantity value for this DoBidItemRequest.
     * 
     * @param bidQuantity
     */
    public void setBidQuantity(long bidQuantity) {
        this.bidQuantity = bidQuantity;
    }


    /**
     * Gets the bidBuyNow value for this DoBidItemRequest.
     * 
     * @return bidBuyNow
     */
    public java.lang.Long getBidBuyNow() {
        return bidBuyNow;
    }


    /**
     * Sets the bidBuyNow value for this DoBidItemRequest.
     * 
     * @param bidBuyNow
     */
    public void setBidBuyNow(java.lang.Long bidBuyNow) {
        this.bidBuyNow = bidBuyNow;
    }


    /**
     * Gets the pharmacyRecipientData value for this DoBidItemRequest.
     * 
     * @return pharmacyRecipientData
     */
    public com.allegro.webapi.PharmacyRecipientDataStruct getPharmacyRecipientData() {
        return pharmacyRecipientData;
    }


    /**
     * Sets the pharmacyRecipientData value for this DoBidItemRequest.
     * 
     * @param pharmacyRecipientData
     */
    public void setPharmacyRecipientData(com.allegro.webapi.PharmacyRecipientDataStruct pharmacyRecipientData) {
        this.pharmacyRecipientData = pharmacyRecipientData;
    }


    /**
     * Gets the variantId value for this DoBidItemRequest.
     * 
     * @return variantId
     */
    public java.lang.String getVariantId() {
        return variantId;
    }


    /**
     * Sets the variantId value for this DoBidItemRequest.
     * 
     * @param variantId
     */
    public void setVariantId(java.lang.String variantId) {
        this.variantId = variantId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoBidItemRequest)) return false;
        DoBidItemRequest other = (DoBidItemRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            this.bidItId == other.getBidItId() &&
            this.bidUserPrice == other.getBidUserPrice() &&
            this.bidQuantity == other.getBidQuantity() &&
            ((this.bidBuyNow==null && other.getBidBuyNow()==null) || 
             (this.bidBuyNow!=null &&
              this.bidBuyNow.equals(other.getBidBuyNow()))) &&
            ((this.pharmacyRecipientData==null && other.getPharmacyRecipientData()==null) || 
             (this.pharmacyRecipientData!=null &&
              this.pharmacyRecipientData.equals(other.getPharmacyRecipientData()))) &&
            ((this.variantId==null && other.getVariantId()==null) || 
             (this.variantId!=null &&
              this.variantId.equals(other.getVariantId())));
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
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        _hashCode += new Long(getBidItId()).hashCode();
        _hashCode += new Float(getBidUserPrice()).hashCode();
        _hashCode += new Long(getBidQuantity()).hashCode();
        if (getBidBuyNow() != null) {
            _hashCode += getBidBuyNow().hashCode();
        }
        if (getPharmacyRecipientData() != null) {
            _hashCode += getPharmacyRecipientData().hashCode();
        }
        if (getVariantId() != null) {
            _hashCode += getVariantId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoBidItemRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidItId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "bidItId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidUserPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "bidUserPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "bidQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidBuyNow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "bidBuyNow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pharmacyRecipientData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "pharmacyRecipientData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyRecipientDataStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variantId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "variantId"));
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

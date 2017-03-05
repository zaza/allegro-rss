/**
 * RelatedItemStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class RelatedItemStruct  implements java.io.Serializable {
    private long itemId;

    private java.lang.String itemTitle;

    private java.lang.String itemThumbnail;

    private float itemPrice;

    private int itemBoughtCount;

    private float itemAmount;

    private int itemPaymentType;

    private long itemSellerId;

    private java.lang.String itemSellerName;

    private int itemInvoiceInfo;

    private java.lang.Integer itemCategoryId;

    public RelatedItemStruct() {
    }

    public RelatedItemStruct(
           long itemId,
           java.lang.String itemTitle,
           java.lang.String itemThumbnail,
           float itemPrice,
           int itemBoughtCount,
           float itemAmount,
           int itemPaymentType,
           long itemSellerId,
           java.lang.String itemSellerName,
           int itemInvoiceInfo,
           java.lang.Integer itemCategoryId) {
           this.itemId = itemId;
           this.itemTitle = itemTitle;
           this.itemThumbnail = itemThumbnail;
           this.itemPrice = itemPrice;
           this.itemBoughtCount = itemBoughtCount;
           this.itemAmount = itemAmount;
           this.itemPaymentType = itemPaymentType;
           this.itemSellerId = itemSellerId;
           this.itemSellerName = itemSellerName;
           this.itemInvoiceInfo = itemInvoiceInfo;
           this.itemCategoryId = itemCategoryId;
    }


    /**
     * Gets the itemId value for this RelatedItemStruct.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this RelatedItemStruct.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemTitle value for this RelatedItemStruct.
     * 
     * @return itemTitle
     */
    public java.lang.String getItemTitle() {
        return itemTitle;
    }


    /**
     * Sets the itemTitle value for this RelatedItemStruct.
     * 
     * @param itemTitle
     */
    public void setItemTitle(java.lang.String itemTitle) {
        this.itemTitle = itemTitle;
    }


    /**
     * Gets the itemThumbnail value for this RelatedItemStruct.
     * 
     * @return itemThumbnail
     */
    public java.lang.String getItemThumbnail() {
        return itemThumbnail;
    }


    /**
     * Sets the itemThumbnail value for this RelatedItemStruct.
     * 
     * @param itemThumbnail
     */
    public void setItemThumbnail(java.lang.String itemThumbnail) {
        this.itemThumbnail = itemThumbnail;
    }


    /**
     * Gets the itemPrice value for this RelatedItemStruct.
     * 
     * @return itemPrice
     */
    public float getItemPrice() {
        return itemPrice;
    }


    /**
     * Sets the itemPrice value for this RelatedItemStruct.
     * 
     * @param itemPrice
     */
    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }


    /**
     * Gets the itemBoughtCount value for this RelatedItemStruct.
     * 
     * @return itemBoughtCount
     */
    public int getItemBoughtCount() {
        return itemBoughtCount;
    }


    /**
     * Sets the itemBoughtCount value for this RelatedItemStruct.
     * 
     * @param itemBoughtCount
     */
    public void setItemBoughtCount(int itemBoughtCount) {
        this.itemBoughtCount = itemBoughtCount;
    }


    /**
     * Gets the itemAmount value for this RelatedItemStruct.
     * 
     * @return itemAmount
     */
    public float getItemAmount() {
        return itemAmount;
    }


    /**
     * Sets the itemAmount value for this RelatedItemStruct.
     * 
     * @param itemAmount
     */
    public void setItemAmount(float itemAmount) {
        this.itemAmount = itemAmount;
    }


    /**
     * Gets the itemPaymentType value for this RelatedItemStruct.
     * 
     * @return itemPaymentType
     */
    public int getItemPaymentType() {
        return itemPaymentType;
    }


    /**
     * Sets the itemPaymentType value for this RelatedItemStruct.
     * 
     * @param itemPaymentType
     */
    public void setItemPaymentType(int itemPaymentType) {
        this.itemPaymentType = itemPaymentType;
    }


    /**
     * Gets the itemSellerId value for this RelatedItemStruct.
     * 
     * @return itemSellerId
     */
    public long getItemSellerId() {
        return itemSellerId;
    }


    /**
     * Sets the itemSellerId value for this RelatedItemStruct.
     * 
     * @param itemSellerId
     */
    public void setItemSellerId(long itemSellerId) {
        this.itemSellerId = itemSellerId;
    }


    /**
     * Gets the itemSellerName value for this RelatedItemStruct.
     * 
     * @return itemSellerName
     */
    public java.lang.String getItemSellerName() {
        return itemSellerName;
    }


    /**
     * Sets the itemSellerName value for this RelatedItemStruct.
     * 
     * @param itemSellerName
     */
    public void setItemSellerName(java.lang.String itemSellerName) {
        this.itemSellerName = itemSellerName;
    }


    /**
     * Gets the itemInvoiceInfo value for this RelatedItemStruct.
     * 
     * @return itemInvoiceInfo
     */
    public int getItemInvoiceInfo() {
        return itemInvoiceInfo;
    }


    /**
     * Sets the itemInvoiceInfo value for this RelatedItemStruct.
     * 
     * @param itemInvoiceInfo
     */
    public void setItemInvoiceInfo(int itemInvoiceInfo) {
        this.itemInvoiceInfo = itemInvoiceInfo;
    }


    /**
     * Gets the itemCategoryId value for this RelatedItemStruct.
     * 
     * @return itemCategoryId
     */
    public java.lang.Integer getItemCategoryId() {
        return itemCategoryId;
    }


    /**
     * Sets the itemCategoryId value for this RelatedItemStruct.
     * 
     * @param itemCategoryId
     */
    public void setItemCategoryId(java.lang.Integer itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedItemStruct)) return false;
        RelatedItemStruct other = (RelatedItemStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemId == other.getItemId() &&
            ((this.itemTitle==null && other.getItemTitle()==null) || 
             (this.itemTitle!=null &&
              this.itemTitle.equals(other.getItemTitle()))) &&
            ((this.itemThumbnail==null && other.getItemThumbnail()==null) || 
             (this.itemThumbnail!=null &&
              this.itemThumbnail.equals(other.getItemThumbnail()))) &&
            this.itemPrice == other.getItemPrice() &&
            this.itemBoughtCount == other.getItemBoughtCount() &&
            this.itemAmount == other.getItemAmount() &&
            this.itemPaymentType == other.getItemPaymentType() &&
            this.itemSellerId == other.getItemSellerId() &&
            ((this.itemSellerName==null && other.getItemSellerName()==null) || 
             (this.itemSellerName!=null &&
              this.itemSellerName.equals(other.getItemSellerName()))) &&
            this.itemInvoiceInfo == other.getItemInvoiceInfo() &&
            ((this.itemCategoryId==null && other.getItemCategoryId()==null) || 
             (this.itemCategoryId!=null &&
              this.itemCategoryId.equals(other.getItemCategoryId())));
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
        _hashCode += new Long(getItemId()).hashCode();
        if (getItemTitle() != null) {
            _hashCode += getItemTitle().hashCode();
        }
        if (getItemThumbnail() != null) {
            _hashCode += getItemThumbnail().hashCode();
        }
        _hashCode += new Float(getItemPrice()).hashCode();
        _hashCode += getItemBoughtCount();
        _hashCode += new Float(getItemAmount()).hashCode();
        _hashCode += getItemPaymentType();
        _hashCode += new Long(getItemSellerId()).hashCode();
        if (getItemSellerName() != null) {
            _hashCode += getItemSellerName().hashCode();
        }
        _hashCode += getItemInvoiceInfo();
        if (getItemCategoryId() != null) {
            _hashCode += getItemCategoryId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelatedItemStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemThumbnail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemThumbnail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemBoughtCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemBoughtCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemSellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSellerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemSellerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemInvoiceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemInvoiceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

/**
 * SoldItemStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class SoldItemStruct  implements java.io.Serializable {
    private long itemId;

    private java.lang.String itemTitle;

    private java.lang.String itemThumbnailUrl;

    private com.allegro.webapi.ArrayOfItempricestruct itemPrice;

    private int itemStartQuantity;

    private int itemSoldQuantity;

    private int itemQuantityType;

    private long itemStartTime;

    private long itemEndTime;

    private java.lang.String itemEndTimeLeft;

    private int itemBiddersCounter;

    private com.allegro.webapi.UserInfoStruct itemHighestBidder;

    private int itemCategoryId;

    private int itemWatchersCounter;

    private int itemViewsCounter;

    private java.lang.String itemNote;

    private int itemSpecialInfo;

    private int itemShopInfo;

    private long itemProductInfo;

    private int itemPayuInfo;

    private com.allegro.webapi.DurationInfoStruct itemDurationInfo;

    public SoldItemStruct() {
    }

    public SoldItemStruct(
           long itemId,
           java.lang.String itemTitle,
           java.lang.String itemThumbnailUrl,
           com.allegro.webapi.ArrayOfItempricestruct itemPrice,
           int itemStartQuantity,
           int itemSoldQuantity,
           int itemQuantityType,
           long itemStartTime,
           long itemEndTime,
           java.lang.String itemEndTimeLeft,
           int itemBiddersCounter,
           com.allegro.webapi.UserInfoStruct itemHighestBidder,
           int itemCategoryId,
           int itemWatchersCounter,
           int itemViewsCounter,
           java.lang.String itemNote,
           int itemSpecialInfo,
           int itemShopInfo,
           long itemProductInfo,
           int itemPayuInfo,
           com.allegro.webapi.DurationInfoStruct itemDurationInfo) {
           this.itemId = itemId;
           this.itemTitle = itemTitle;
           this.itemThumbnailUrl = itemThumbnailUrl;
           this.itemPrice = itemPrice;
           this.itemStartQuantity = itemStartQuantity;
           this.itemSoldQuantity = itemSoldQuantity;
           this.itemQuantityType = itemQuantityType;
           this.itemStartTime = itemStartTime;
           this.itemEndTime = itemEndTime;
           this.itemEndTimeLeft = itemEndTimeLeft;
           this.itemBiddersCounter = itemBiddersCounter;
           this.itemHighestBidder = itemHighestBidder;
           this.itemCategoryId = itemCategoryId;
           this.itemWatchersCounter = itemWatchersCounter;
           this.itemViewsCounter = itemViewsCounter;
           this.itemNote = itemNote;
           this.itemSpecialInfo = itemSpecialInfo;
           this.itemShopInfo = itemShopInfo;
           this.itemProductInfo = itemProductInfo;
           this.itemPayuInfo = itemPayuInfo;
           this.itemDurationInfo = itemDurationInfo;
    }


    /**
     * Gets the itemId value for this SoldItemStruct.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SoldItemStruct.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemTitle value for this SoldItemStruct.
     * 
     * @return itemTitle
     */
    public java.lang.String getItemTitle() {
        return itemTitle;
    }


    /**
     * Sets the itemTitle value for this SoldItemStruct.
     * 
     * @param itemTitle
     */
    public void setItemTitle(java.lang.String itemTitle) {
        this.itemTitle = itemTitle;
    }


    /**
     * Gets the itemThumbnailUrl value for this SoldItemStruct.
     * 
     * @return itemThumbnailUrl
     */
    public java.lang.String getItemThumbnailUrl() {
        return itemThumbnailUrl;
    }


    /**
     * Sets the itemThumbnailUrl value for this SoldItemStruct.
     * 
     * @param itemThumbnailUrl
     */
    public void setItemThumbnailUrl(java.lang.String itemThumbnailUrl) {
        this.itemThumbnailUrl = itemThumbnailUrl;
    }


    /**
     * Gets the itemPrice value for this SoldItemStruct.
     * 
     * @return itemPrice
     */
    public com.allegro.webapi.ArrayOfItempricestruct getItemPrice() {
        return itemPrice;
    }


    /**
     * Sets the itemPrice value for this SoldItemStruct.
     * 
     * @param itemPrice
     */
    public void setItemPrice(com.allegro.webapi.ArrayOfItempricestruct itemPrice) {
        this.itemPrice = itemPrice;
    }


    /**
     * Gets the itemStartQuantity value for this SoldItemStruct.
     * 
     * @return itemStartQuantity
     */
    public int getItemStartQuantity() {
        return itemStartQuantity;
    }


    /**
     * Sets the itemStartQuantity value for this SoldItemStruct.
     * 
     * @param itemStartQuantity
     */
    public void setItemStartQuantity(int itemStartQuantity) {
        this.itemStartQuantity = itemStartQuantity;
    }


    /**
     * Gets the itemSoldQuantity value for this SoldItemStruct.
     * 
     * @return itemSoldQuantity
     */
    public int getItemSoldQuantity() {
        return itemSoldQuantity;
    }


    /**
     * Sets the itemSoldQuantity value for this SoldItemStruct.
     * 
     * @param itemSoldQuantity
     */
    public void setItemSoldQuantity(int itemSoldQuantity) {
        this.itemSoldQuantity = itemSoldQuantity;
    }


    /**
     * Gets the itemQuantityType value for this SoldItemStruct.
     * 
     * @return itemQuantityType
     */
    public int getItemQuantityType() {
        return itemQuantityType;
    }


    /**
     * Sets the itemQuantityType value for this SoldItemStruct.
     * 
     * @param itemQuantityType
     */
    public void setItemQuantityType(int itemQuantityType) {
        this.itemQuantityType = itemQuantityType;
    }


    /**
     * Gets the itemStartTime value for this SoldItemStruct.
     * 
     * @return itemStartTime
     */
    public long getItemStartTime() {
        return itemStartTime;
    }


    /**
     * Sets the itemStartTime value for this SoldItemStruct.
     * 
     * @param itemStartTime
     */
    public void setItemStartTime(long itemStartTime) {
        this.itemStartTime = itemStartTime;
    }


    /**
     * Gets the itemEndTime value for this SoldItemStruct.
     * 
     * @return itemEndTime
     */
    public long getItemEndTime() {
        return itemEndTime;
    }


    /**
     * Sets the itemEndTime value for this SoldItemStruct.
     * 
     * @param itemEndTime
     */
    public void setItemEndTime(long itemEndTime) {
        this.itemEndTime = itemEndTime;
    }


    /**
     * Gets the itemEndTimeLeft value for this SoldItemStruct.
     * 
     * @return itemEndTimeLeft
     */
    public java.lang.String getItemEndTimeLeft() {
        return itemEndTimeLeft;
    }


    /**
     * Sets the itemEndTimeLeft value for this SoldItemStruct.
     * 
     * @param itemEndTimeLeft
     */
    public void setItemEndTimeLeft(java.lang.String itemEndTimeLeft) {
        this.itemEndTimeLeft = itemEndTimeLeft;
    }


    /**
     * Gets the itemBiddersCounter value for this SoldItemStruct.
     * 
     * @return itemBiddersCounter
     */
    public int getItemBiddersCounter() {
        return itemBiddersCounter;
    }


    /**
     * Sets the itemBiddersCounter value for this SoldItemStruct.
     * 
     * @param itemBiddersCounter
     */
    public void setItemBiddersCounter(int itemBiddersCounter) {
        this.itemBiddersCounter = itemBiddersCounter;
    }


    /**
     * Gets the itemHighestBidder value for this SoldItemStruct.
     * 
     * @return itemHighestBidder
     */
    public com.allegro.webapi.UserInfoStruct getItemHighestBidder() {
        return itemHighestBidder;
    }


    /**
     * Sets the itemHighestBidder value for this SoldItemStruct.
     * 
     * @param itemHighestBidder
     */
    public void setItemHighestBidder(com.allegro.webapi.UserInfoStruct itemHighestBidder) {
        this.itemHighestBidder = itemHighestBidder;
    }


    /**
     * Gets the itemCategoryId value for this SoldItemStruct.
     * 
     * @return itemCategoryId
     */
    public int getItemCategoryId() {
        return itemCategoryId;
    }


    /**
     * Sets the itemCategoryId value for this SoldItemStruct.
     * 
     * @param itemCategoryId
     */
    public void setItemCategoryId(int itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }


    /**
     * Gets the itemWatchersCounter value for this SoldItemStruct.
     * 
     * @return itemWatchersCounter
     */
    public int getItemWatchersCounter() {
        return itemWatchersCounter;
    }


    /**
     * Sets the itemWatchersCounter value for this SoldItemStruct.
     * 
     * @param itemWatchersCounter
     */
    public void setItemWatchersCounter(int itemWatchersCounter) {
        this.itemWatchersCounter = itemWatchersCounter;
    }


    /**
     * Gets the itemViewsCounter value for this SoldItemStruct.
     * 
     * @return itemViewsCounter
     */
    public int getItemViewsCounter() {
        return itemViewsCounter;
    }


    /**
     * Sets the itemViewsCounter value for this SoldItemStruct.
     * 
     * @param itemViewsCounter
     */
    public void setItemViewsCounter(int itemViewsCounter) {
        this.itemViewsCounter = itemViewsCounter;
    }


    /**
     * Gets the itemNote value for this SoldItemStruct.
     * 
     * @return itemNote
     */
    public java.lang.String getItemNote() {
        return itemNote;
    }


    /**
     * Sets the itemNote value for this SoldItemStruct.
     * 
     * @param itemNote
     */
    public void setItemNote(java.lang.String itemNote) {
        this.itemNote = itemNote;
    }


    /**
     * Gets the itemSpecialInfo value for this SoldItemStruct.
     * 
     * @return itemSpecialInfo
     */
    public int getItemSpecialInfo() {
        return itemSpecialInfo;
    }


    /**
     * Sets the itemSpecialInfo value for this SoldItemStruct.
     * 
     * @param itemSpecialInfo
     */
    public void setItemSpecialInfo(int itemSpecialInfo) {
        this.itemSpecialInfo = itemSpecialInfo;
    }


    /**
     * Gets the itemShopInfo value for this SoldItemStruct.
     * 
     * @return itemShopInfo
     */
    public int getItemShopInfo() {
        return itemShopInfo;
    }


    /**
     * Sets the itemShopInfo value for this SoldItemStruct.
     * 
     * @param itemShopInfo
     */
    public void setItemShopInfo(int itemShopInfo) {
        this.itemShopInfo = itemShopInfo;
    }


    /**
     * Gets the itemProductInfo value for this SoldItemStruct.
     * 
     * @return itemProductInfo
     */
    public long getItemProductInfo() {
        return itemProductInfo;
    }


    /**
     * Sets the itemProductInfo value for this SoldItemStruct.
     * 
     * @param itemProductInfo
     */
    public void setItemProductInfo(long itemProductInfo) {
        this.itemProductInfo = itemProductInfo;
    }


    /**
     * Gets the itemPayuInfo value for this SoldItemStruct.
     * 
     * @return itemPayuInfo
     */
    public int getItemPayuInfo() {
        return itemPayuInfo;
    }


    /**
     * Sets the itemPayuInfo value for this SoldItemStruct.
     * 
     * @param itemPayuInfo
     */
    public void setItemPayuInfo(int itemPayuInfo) {
        this.itemPayuInfo = itemPayuInfo;
    }


    /**
     * Gets the itemDurationInfo value for this SoldItemStruct.
     * 
     * @return itemDurationInfo
     */
    public com.allegro.webapi.DurationInfoStruct getItemDurationInfo() {
        return itemDurationInfo;
    }


    /**
     * Sets the itemDurationInfo value for this SoldItemStruct.
     * 
     * @param itemDurationInfo
     */
    public void setItemDurationInfo(com.allegro.webapi.DurationInfoStruct itemDurationInfo) {
        this.itemDurationInfo = itemDurationInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoldItemStruct)) return false;
        SoldItemStruct other = (SoldItemStruct) obj;
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
            ((this.itemThumbnailUrl==null && other.getItemThumbnailUrl()==null) || 
             (this.itemThumbnailUrl!=null &&
              this.itemThumbnailUrl.equals(other.getItemThumbnailUrl()))) &&
            ((this.itemPrice==null && other.getItemPrice()==null) || 
             (this.itemPrice!=null &&
              this.itemPrice.equals(other.getItemPrice()))) &&
            this.itemStartQuantity == other.getItemStartQuantity() &&
            this.itemSoldQuantity == other.getItemSoldQuantity() &&
            this.itemQuantityType == other.getItemQuantityType() &&
            this.itemStartTime == other.getItemStartTime() &&
            this.itemEndTime == other.getItemEndTime() &&
            ((this.itemEndTimeLeft==null && other.getItemEndTimeLeft()==null) || 
             (this.itemEndTimeLeft!=null &&
              this.itemEndTimeLeft.equals(other.getItemEndTimeLeft()))) &&
            this.itemBiddersCounter == other.getItemBiddersCounter() &&
            ((this.itemHighestBidder==null && other.getItemHighestBidder()==null) || 
             (this.itemHighestBidder!=null &&
              this.itemHighestBidder.equals(other.getItemHighestBidder()))) &&
            this.itemCategoryId == other.getItemCategoryId() &&
            this.itemWatchersCounter == other.getItemWatchersCounter() &&
            this.itemViewsCounter == other.getItemViewsCounter() &&
            ((this.itemNote==null && other.getItemNote()==null) || 
             (this.itemNote!=null &&
              this.itemNote.equals(other.getItemNote()))) &&
            this.itemSpecialInfo == other.getItemSpecialInfo() &&
            this.itemShopInfo == other.getItemShopInfo() &&
            this.itemProductInfo == other.getItemProductInfo() &&
            this.itemPayuInfo == other.getItemPayuInfo() &&
            ((this.itemDurationInfo==null && other.getItemDurationInfo()==null) || 
             (this.itemDurationInfo!=null &&
              this.itemDurationInfo.equals(other.getItemDurationInfo())));
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
        if (getItemThumbnailUrl() != null) {
            _hashCode += getItemThumbnailUrl().hashCode();
        }
        if (getItemPrice() != null) {
            _hashCode += getItemPrice().hashCode();
        }
        _hashCode += getItemStartQuantity();
        _hashCode += getItemSoldQuantity();
        _hashCode += getItemQuantityType();
        _hashCode += new Long(getItemStartTime()).hashCode();
        _hashCode += new Long(getItemEndTime()).hashCode();
        if (getItemEndTimeLeft() != null) {
            _hashCode += getItemEndTimeLeft().hashCode();
        }
        _hashCode += getItemBiddersCounter();
        if (getItemHighestBidder() != null) {
            _hashCode += getItemHighestBidder().hashCode();
        }
        _hashCode += getItemCategoryId();
        _hashCode += getItemWatchersCounter();
        _hashCode += getItemViewsCounter();
        if (getItemNote() != null) {
            _hashCode += getItemNote().hashCode();
        }
        _hashCode += getItemSpecialInfo();
        _hashCode += getItemShopInfo();
        _hashCode += new Long(getItemProductInfo()).hashCode();
        _hashCode += getItemPayuInfo();
        if (getItemDurationInfo() != null) {
            _hashCode += getItemDurationInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoldItemStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldItemStruct"));
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
        elemField.setFieldName("itemThumbnailUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemThumbnailUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempricestruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemStartQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemStartQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSoldQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemSoldQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQuantityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemQuantityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemEndTimeLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemEndTimeLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemBiddersCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemBiddersCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemHighestBidder");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemHighestBidder"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemWatchersCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemWatchersCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemViewsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemViewsCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNote");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSpecialInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemSpecialInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemShopInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemShopInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPayuInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPayuInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDurationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemDurationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DurationInfoStruct"));
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

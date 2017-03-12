/**
 * ItemsListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ItemsListType  implements java.io.Serializable {
    private long itemId;

    private java.lang.String itemTitle;

    private int leftCount;

    private int bidsCount;

    private int biddersCount;

    private java.lang.String quantityType;

    private java.util.Calendar endingTime;

    private java.lang.String timeToEnd;

    private int categoryId;

    private java.lang.String conditionInfo;

    private int promotionInfo;

    private int additionalInfo;

    private com.allegro.webapi.UserInfoType sellerInfo;

    private com.allegro.webapi.ArrayOfPriceinfotype priceInfo;

    private com.allegro.webapi.ArrayOfPhotoinfotype photosInfo;

    private com.allegro.webapi.ArrayOfParameterinfotype parametersInfo;

    private com.allegro.webapi.AdvertInfoType advertInfo;

    public ItemsListType() {
    }

    public ItemsListType(
           long itemId,
           java.lang.String itemTitle,
           int leftCount,
           int bidsCount,
           int biddersCount,
           java.lang.String quantityType,
           java.util.Calendar endingTime,
           java.lang.String timeToEnd,
           int categoryId,
           java.lang.String conditionInfo,
           int promotionInfo,
           int additionalInfo,
           com.allegro.webapi.UserInfoType sellerInfo,
           com.allegro.webapi.ArrayOfPriceinfotype priceInfo,
           com.allegro.webapi.ArrayOfPhotoinfotype photosInfo,
           com.allegro.webapi.ArrayOfParameterinfotype parametersInfo,
           com.allegro.webapi.AdvertInfoType advertInfo) {
           this.itemId = itemId;
           this.itemTitle = itemTitle;
           this.leftCount = leftCount;
           this.bidsCount = bidsCount;
           this.biddersCount = biddersCount;
           this.quantityType = quantityType;
           this.endingTime = endingTime;
           this.timeToEnd = timeToEnd;
           this.categoryId = categoryId;
           this.conditionInfo = conditionInfo;
           this.promotionInfo = promotionInfo;
           this.additionalInfo = additionalInfo;
           this.sellerInfo = sellerInfo;
           this.priceInfo = priceInfo;
           this.photosInfo = photosInfo;
           this.parametersInfo = parametersInfo;
           this.advertInfo = advertInfo;
    }


    /**
     * Gets the itemId value for this ItemsListType.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ItemsListType.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemTitle value for this ItemsListType.
     * 
     * @return itemTitle
     */
    public java.lang.String getItemTitle() {
        return itemTitle;
    }


    /**
     * Sets the itemTitle value for this ItemsListType.
     * 
     * @param itemTitle
     */
    public void setItemTitle(java.lang.String itemTitle) {
        this.itemTitle = itemTitle;
    }


    /**
     * Gets the leftCount value for this ItemsListType.
     * 
     * @return leftCount
     */
    public int getLeftCount() {
        return leftCount;
    }


    /**
     * Sets the leftCount value for this ItemsListType.
     * 
     * @param leftCount
     */
    public void setLeftCount(int leftCount) {
        this.leftCount = leftCount;
    }


    /**
     * Gets the bidsCount value for this ItemsListType.
     * 
     * @return bidsCount
     */
    public int getBidsCount() {
        return bidsCount;
    }


    /**
     * Sets the bidsCount value for this ItemsListType.
     * 
     * @param bidsCount
     */
    public void setBidsCount(int bidsCount) {
        this.bidsCount = bidsCount;
    }


    /**
     * Gets the biddersCount value for this ItemsListType.
     * 
     * @return biddersCount
     */
    public int getBiddersCount() {
        return biddersCount;
    }


    /**
     * Sets the biddersCount value for this ItemsListType.
     * 
     * @param biddersCount
     */
    public void setBiddersCount(int biddersCount) {
        this.biddersCount = biddersCount;
    }


    /**
     * Gets the quantityType value for this ItemsListType.
     * 
     * @return quantityType
     */
    public java.lang.String getQuantityType() {
        return quantityType;
    }


    /**
     * Sets the quantityType value for this ItemsListType.
     * 
     * @param quantityType
     */
    public void setQuantityType(java.lang.String quantityType) {
        this.quantityType = quantityType;
    }


    /**
     * Gets the endingTime value for this ItemsListType.
     * 
     * @return endingTime
     */
    public java.util.Calendar getEndingTime() {
        return endingTime;
    }


    /**
     * Sets the endingTime value for this ItemsListType.
     * 
     * @param endingTime
     */
    public void setEndingTime(java.util.Calendar endingTime) {
        this.endingTime = endingTime;
    }


    /**
     * Gets the timeToEnd value for this ItemsListType.
     * 
     * @return timeToEnd
     */
    public java.lang.String getTimeToEnd() {
        return timeToEnd;
    }


    /**
     * Sets the timeToEnd value for this ItemsListType.
     * 
     * @param timeToEnd
     */
    public void setTimeToEnd(java.lang.String timeToEnd) {
        this.timeToEnd = timeToEnd;
    }


    /**
     * Gets the categoryId value for this ItemsListType.
     * 
     * @return categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this ItemsListType.
     * 
     * @param categoryId
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the conditionInfo value for this ItemsListType.
     * 
     * @return conditionInfo
     */
    public java.lang.String getConditionInfo() {
        return conditionInfo;
    }


    /**
     * Sets the conditionInfo value for this ItemsListType.
     * 
     * @param conditionInfo
     */
    public void setConditionInfo(java.lang.String conditionInfo) {
        this.conditionInfo = conditionInfo;
    }


    /**
     * Gets the promotionInfo value for this ItemsListType.
     * 
     * @return promotionInfo
     */
    public int getPromotionInfo() {
        return promotionInfo;
    }


    /**
     * Sets the promotionInfo value for this ItemsListType.
     * 
     * @param promotionInfo
     */
    public void setPromotionInfo(int promotionInfo) {
        this.promotionInfo = promotionInfo;
    }


    /**
     * Gets the additionalInfo value for this ItemsListType.
     * 
     * @return additionalInfo
     */
    public int getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this ItemsListType.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(int additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the sellerInfo value for this ItemsListType.
     * 
     * @return sellerInfo
     */
    public com.allegro.webapi.UserInfoType getSellerInfo() {
        return sellerInfo;
    }


    /**
     * Sets the sellerInfo value for this ItemsListType.
     * 
     * @param sellerInfo
     */
    public void setSellerInfo(com.allegro.webapi.UserInfoType sellerInfo) {
        this.sellerInfo = sellerInfo;
    }


    /**
     * Gets the priceInfo value for this ItemsListType.
     * 
     * @return priceInfo
     */
    public com.allegro.webapi.ArrayOfPriceinfotype getPriceInfo() {
        return priceInfo;
    }


    /**
     * Sets the priceInfo value for this ItemsListType.
     * 
     * @param priceInfo
     */
    public void setPriceInfo(com.allegro.webapi.ArrayOfPriceinfotype priceInfo) {
        this.priceInfo = priceInfo;
    }


    /**
     * Gets the photosInfo value for this ItemsListType.
     * 
     * @return photosInfo
     */
    public com.allegro.webapi.ArrayOfPhotoinfotype getPhotosInfo() {
        return photosInfo;
    }


    /**
     * Sets the photosInfo value for this ItemsListType.
     * 
     * @param photosInfo
     */
    public void setPhotosInfo(com.allegro.webapi.ArrayOfPhotoinfotype photosInfo) {
        this.photosInfo = photosInfo;
    }


    /**
     * Gets the parametersInfo value for this ItemsListType.
     * 
     * @return parametersInfo
     */
    public com.allegro.webapi.ArrayOfParameterinfotype getParametersInfo() {
        return parametersInfo;
    }


    /**
     * Sets the parametersInfo value for this ItemsListType.
     * 
     * @param parametersInfo
     */
    public void setParametersInfo(com.allegro.webapi.ArrayOfParameterinfotype parametersInfo) {
        this.parametersInfo = parametersInfo;
    }


    /**
     * Gets the advertInfo value for this ItemsListType.
     * 
     * @return advertInfo
     */
    public com.allegro.webapi.AdvertInfoType getAdvertInfo() {
        return advertInfo;
    }


    /**
     * Sets the advertInfo value for this ItemsListType.
     * 
     * @param advertInfo
     */
    public void setAdvertInfo(com.allegro.webapi.AdvertInfoType advertInfo) {
        this.advertInfo = advertInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemsListType)) return false;
        ItemsListType other = (ItemsListType) obj;
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
            this.leftCount == other.getLeftCount() &&
            this.bidsCount == other.getBidsCount() &&
            this.biddersCount == other.getBiddersCount() &&
            ((this.quantityType==null && other.getQuantityType()==null) || 
             (this.quantityType!=null &&
              this.quantityType.equals(other.getQuantityType()))) &&
            ((this.endingTime==null && other.getEndingTime()==null) || 
             (this.endingTime!=null &&
              this.endingTime.equals(other.getEndingTime()))) &&
            ((this.timeToEnd==null && other.getTimeToEnd()==null) || 
             (this.timeToEnd!=null &&
              this.timeToEnd.equals(other.getTimeToEnd()))) &&
            this.categoryId == other.getCategoryId() &&
            ((this.conditionInfo==null && other.getConditionInfo()==null) || 
             (this.conditionInfo!=null &&
              this.conditionInfo.equals(other.getConditionInfo()))) &&
            this.promotionInfo == other.getPromotionInfo() &&
            this.additionalInfo == other.getAdditionalInfo() &&
            ((this.sellerInfo==null && other.getSellerInfo()==null) || 
             (this.sellerInfo!=null &&
              this.sellerInfo.equals(other.getSellerInfo()))) &&
            ((this.priceInfo==null && other.getPriceInfo()==null) || 
             (this.priceInfo!=null &&
              this.priceInfo.equals(other.getPriceInfo()))) &&
            ((this.photosInfo==null && other.getPhotosInfo()==null) || 
             (this.photosInfo!=null &&
              this.photosInfo.equals(other.getPhotosInfo()))) &&
            ((this.parametersInfo==null && other.getParametersInfo()==null) || 
             (this.parametersInfo!=null &&
              this.parametersInfo.equals(other.getParametersInfo()))) &&
            ((this.advertInfo==null && other.getAdvertInfo()==null) || 
             (this.advertInfo!=null &&
              this.advertInfo.equals(other.getAdvertInfo())));
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
        _hashCode += getLeftCount();
        _hashCode += getBidsCount();
        _hashCode += getBiddersCount();
        if (getQuantityType() != null) {
            _hashCode += getQuantityType().hashCode();
        }
        if (getEndingTime() != null) {
            _hashCode += getEndingTime().hashCode();
        }
        if (getTimeToEnd() != null) {
            _hashCode += getTimeToEnd().hashCode();
        }
        _hashCode += getCategoryId();
        if (getConditionInfo() != null) {
            _hashCode += getConditionInfo().hashCode();
        }
        _hashCode += getPromotionInfo();
        _hashCode += getAdditionalInfo();
        if (getSellerInfo() != null) {
            _hashCode += getSellerInfo().hashCode();
        }
        if (getPriceInfo() != null) {
            _hashCode += getPriceInfo().hashCode();
        }
        if (getPhotosInfo() != null) {
            _hashCode += getPhotosInfo().hashCode();
        }
        if (getParametersInfo() != null) {
            _hashCode += getParametersInfo().hashCode();
        }
        if (getAdvertInfo() != null) {
            _hashCode += getAdvertInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemsListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsListType"));
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
        elemField.setFieldName("leftCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "leftCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "bidsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddersCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "biddersCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "quantityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "endingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeToEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "timeToEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "categoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "conditionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "promotionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "additionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "priceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPriceinfotype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photosInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "photosInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPhotoinfotype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametersInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "parametersInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfParameterinfotype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "advertInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AdvertInfoType"));
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

/**
 * ItemInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ItemInfoStruct  implements java.io.Serializable {
    private com.allegro.webapi.ItemInfo itemInfo;

    private com.allegro.webapi.ArrayOfItemcatlist itemCats;

    private com.allegro.webapi.ArrayOfItemimagelist itemImages;

    private com.allegro.webapi.ArrayOfAttribstruct itemAttribs;

    private com.allegro.webapi.ArrayOfPostagestruct itemPostageOptions;

    private com.allegro.webapi.ItemPaymentOptions itemPaymentOptions;

    private com.allegro.webapi.CompanyInfoStruct itemCompanyInfo;

    private com.allegro.webapi.ProductStruct itemProductInfo;

    private com.allegro.webapi.AfterSalesServiceConditionsStruct itemAfterSalesServiceConditions;

    public ItemInfoStruct() {
    }

    public ItemInfoStruct(
           com.allegro.webapi.ItemInfo itemInfo,
           com.allegro.webapi.ArrayOfItemcatlist itemCats,
           com.allegro.webapi.ArrayOfItemimagelist itemImages,
           com.allegro.webapi.ArrayOfAttribstruct itemAttribs,
           com.allegro.webapi.ArrayOfPostagestruct itemPostageOptions,
           com.allegro.webapi.ItemPaymentOptions itemPaymentOptions,
           com.allegro.webapi.CompanyInfoStruct itemCompanyInfo,
           com.allegro.webapi.ProductStruct itemProductInfo,
           com.allegro.webapi.AfterSalesServiceConditionsStruct itemAfterSalesServiceConditions) {
           this.itemInfo = itemInfo;
           this.itemCats = itemCats;
           this.itemImages = itemImages;
           this.itemAttribs = itemAttribs;
           this.itemPostageOptions = itemPostageOptions;
           this.itemPaymentOptions = itemPaymentOptions;
           this.itemCompanyInfo = itemCompanyInfo;
           this.itemProductInfo = itemProductInfo;
           this.itemAfterSalesServiceConditions = itemAfterSalesServiceConditions;
    }


    /**
     * Gets the itemInfo value for this ItemInfoStruct.
     * 
     * @return itemInfo
     */
    public com.allegro.webapi.ItemInfo getItemInfo() {
        return itemInfo;
    }


    /**
     * Sets the itemInfo value for this ItemInfoStruct.
     * 
     * @param itemInfo
     */
    public void setItemInfo(com.allegro.webapi.ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }


    /**
     * Gets the itemCats value for this ItemInfoStruct.
     * 
     * @return itemCats
     */
    public com.allegro.webapi.ArrayOfItemcatlist getItemCats() {
        return itemCats;
    }


    /**
     * Sets the itemCats value for this ItemInfoStruct.
     * 
     * @param itemCats
     */
    public void setItemCats(com.allegro.webapi.ArrayOfItemcatlist itemCats) {
        this.itemCats = itemCats;
    }


    /**
     * Gets the itemImages value for this ItemInfoStruct.
     * 
     * @return itemImages
     */
    public com.allegro.webapi.ArrayOfItemimagelist getItemImages() {
        return itemImages;
    }


    /**
     * Sets the itemImages value for this ItemInfoStruct.
     * 
     * @param itemImages
     */
    public void setItemImages(com.allegro.webapi.ArrayOfItemimagelist itemImages) {
        this.itemImages = itemImages;
    }


    /**
     * Gets the itemAttribs value for this ItemInfoStruct.
     * 
     * @return itemAttribs
     */
    public com.allegro.webapi.ArrayOfAttribstruct getItemAttribs() {
        return itemAttribs;
    }


    /**
     * Sets the itemAttribs value for this ItemInfoStruct.
     * 
     * @param itemAttribs
     */
    public void setItemAttribs(com.allegro.webapi.ArrayOfAttribstruct itemAttribs) {
        this.itemAttribs = itemAttribs;
    }


    /**
     * Gets the itemPostageOptions value for this ItemInfoStruct.
     * 
     * @return itemPostageOptions
     */
    public com.allegro.webapi.ArrayOfPostagestruct getItemPostageOptions() {
        return itemPostageOptions;
    }


    /**
     * Sets the itemPostageOptions value for this ItemInfoStruct.
     * 
     * @param itemPostageOptions
     */
    public void setItemPostageOptions(com.allegro.webapi.ArrayOfPostagestruct itemPostageOptions) {
        this.itemPostageOptions = itemPostageOptions;
    }


    /**
     * Gets the itemPaymentOptions value for this ItemInfoStruct.
     * 
     * @return itemPaymentOptions
     */
    public com.allegro.webapi.ItemPaymentOptions getItemPaymentOptions() {
        return itemPaymentOptions;
    }


    /**
     * Sets the itemPaymentOptions value for this ItemInfoStruct.
     * 
     * @param itemPaymentOptions
     */
    public void setItemPaymentOptions(com.allegro.webapi.ItemPaymentOptions itemPaymentOptions) {
        this.itemPaymentOptions = itemPaymentOptions;
    }


    /**
     * Gets the itemCompanyInfo value for this ItemInfoStruct.
     * 
     * @return itemCompanyInfo
     */
    public com.allegro.webapi.CompanyInfoStruct getItemCompanyInfo() {
        return itemCompanyInfo;
    }


    /**
     * Sets the itemCompanyInfo value for this ItemInfoStruct.
     * 
     * @param itemCompanyInfo
     */
    public void setItemCompanyInfo(com.allegro.webapi.CompanyInfoStruct itemCompanyInfo) {
        this.itemCompanyInfo = itemCompanyInfo;
    }


    /**
     * Gets the itemProductInfo value for this ItemInfoStruct.
     * 
     * @return itemProductInfo
     */
    public com.allegro.webapi.ProductStruct getItemProductInfo() {
        return itemProductInfo;
    }


    /**
     * Sets the itemProductInfo value for this ItemInfoStruct.
     * 
     * @param itemProductInfo
     */
    public void setItemProductInfo(com.allegro.webapi.ProductStruct itemProductInfo) {
        this.itemProductInfo = itemProductInfo;
    }


    /**
     * Gets the itemAfterSalesServiceConditions value for this ItemInfoStruct.
     * 
     * @return itemAfterSalesServiceConditions
     */
    public com.allegro.webapi.AfterSalesServiceConditionsStruct getItemAfterSalesServiceConditions() {
        return itemAfterSalesServiceConditions;
    }


    /**
     * Sets the itemAfterSalesServiceConditions value for this ItemInfoStruct.
     * 
     * @param itemAfterSalesServiceConditions
     */
    public void setItemAfterSalesServiceConditions(com.allegro.webapi.AfterSalesServiceConditionsStruct itemAfterSalesServiceConditions) {
        this.itemAfterSalesServiceConditions = itemAfterSalesServiceConditions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemInfoStruct)) return false;
        ItemInfoStruct other = (ItemInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemInfo==null && other.getItemInfo()==null) || 
             (this.itemInfo!=null &&
              this.itemInfo.equals(other.getItemInfo()))) &&
            ((this.itemCats==null && other.getItemCats()==null) || 
             (this.itemCats!=null &&
              this.itemCats.equals(other.getItemCats()))) &&
            ((this.itemImages==null && other.getItemImages()==null) || 
             (this.itemImages!=null &&
              this.itemImages.equals(other.getItemImages()))) &&
            ((this.itemAttribs==null && other.getItemAttribs()==null) || 
             (this.itemAttribs!=null &&
              this.itemAttribs.equals(other.getItemAttribs()))) &&
            ((this.itemPostageOptions==null && other.getItemPostageOptions()==null) || 
             (this.itemPostageOptions!=null &&
              this.itemPostageOptions.equals(other.getItemPostageOptions()))) &&
            ((this.itemPaymentOptions==null && other.getItemPaymentOptions()==null) || 
             (this.itemPaymentOptions!=null &&
              this.itemPaymentOptions.equals(other.getItemPaymentOptions()))) &&
            ((this.itemCompanyInfo==null && other.getItemCompanyInfo()==null) || 
             (this.itemCompanyInfo!=null &&
              this.itemCompanyInfo.equals(other.getItemCompanyInfo()))) &&
            ((this.itemProductInfo==null && other.getItemProductInfo()==null) || 
             (this.itemProductInfo!=null &&
              this.itemProductInfo.equals(other.getItemProductInfo()))) &&
            ((this.itemAfterSalesServiceConditions==null && other.getItemAfterSalesServiceConditions()==null) || 
             (this.itemAfterSalesServiceConditions!=null &&
              this.itemAfterSalesServiceConditions.equals(other.getItemAfterSalesServiceConditions())));
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
        if (getItemInfo() != null) {
            _hashCode += getItemInfo().hashCode();
        }
        if (getItemCats() != null) {
            _hashCode += getItemCats().hashCode();
        }
        if (getItemImages() != null) {
            _hashCode += getItemImages().hashCode();
        }
        if (getItemAttribs() != null) {
            _hashCode += getItemAttribs().hashCode();
        }
        if (getItemPostageOptions() != null) {
            _hashCode += getItemPostageOptions().hashCode();
        }
        if (getItemPaymentOptions() != null) {
            _hashCode += getItemPaymentOptions().hashCode();
        }
        if (getItemCompanyInfo() != null) {
            _hashCode += getItemCompanyInfo().hashCode();
        }
        if (getItemProductInfo() != null) {
            _hashCode += getItemProductInfo().hashCode();
        }
        if (getItemAfterSalesServiceConditions() != null) {
            _hashCode += getItemAfterSalesServiceConditions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemCats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemcatlist"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemImages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagelist"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAttribs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemAttribs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfAttribstruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPostageOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPostageOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostagestruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPaymentOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPaymentOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPaymentOptions"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCompanyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemCompanyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAfterSalesServiceConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemAfterSalesServiceConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AfterSalesServiceConditionsStruct"));
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

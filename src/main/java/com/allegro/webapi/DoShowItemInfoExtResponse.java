/**
 * DoShowItemInfoExtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoShowItemInfoExtResponse  implements java.io.Serializable {
    private com.allegro.webapi.ItemInfoExt itemListInfoExt;

    private com.allegro.webapi.ArrayOfItemcatlist itemCatPath;

    private com.allegro.webapi.ArrayOfItemimagelist itemImgList;

    private com.allegro.webapi.ArrayOfAttribstruct itemAttribList;

    private com.allegro.webapi.ArrayOfPostagestruct itemPostageOptions;

    private com.allegro.webapi.ItemPaymentOptions itemPaymentOptions;

    private com.allegro.webapi.CompanyInfoStruct itemCompanyInfo;

    private com.allegro.webapi.ProductStruct itemProductInfo;

    private com.allegro.webapi.ArrayOfItemvariantstruct itemVariants;

    private com.allegro.webapi.AfterSalesServiceConditionsStruct itemAfterSalesServiceConditions;

    public DoShowItemInfoExtResponse() {
    }

    public DoShowItemInfoExtResponse(
           com.allegro.webapi.ItemInfoExt itemListInfoExt,
           com.allegro.webapi.ArrayOfItemcatlist itemCatPath,
           com.allegro.webapi.ArrayOfItemimagelist itemImgList,
           com.allegro.webapi.ArrayOfAttribstruct itemAttribList,
           com.allegro.webapi.ArrayOfPostagestruct itemPostageOptions,
           com.allegro.webapi.ItemPaymentOptions itemPaymentOptions,
           com.allegro.webapi.CompanyInfoStruct itemCompanyInfo,
           com.allegro.webapi.ProductStruct itemProductInfo,
           com.allegro.webapi.ArrayOfItemvariantstruct itemVariants,
           com.allegro.webapi.AfterSalesServiceConditionsStruct itemAfterSalesServiceConditions) {
           this.itemListInfoExt = itemListInfoExt;
           this.itemCatPath = itemCatPath;
           this.itemImgList = itemImgList;
           this.itemAttribList = itemAttribList;
           this.itemPostageOptions = itemPostageOptions;
           this.itemPaymentOptions = itemPaymentOptions;
           this.itemCompanyInfo = itemCompanyInfo;
           this.itemProductInfo = itemProductInfo;
           this.itemVariants = itemVariants;
           this.itemAfterSalesServiceConditions = itemAfterSalesServiceConditions;
    }


    /**
     * Gets the itemListInfoExt value for this DoShowItemInfoExtResponse.
     * 
     * @return itemListInfoExt
     */
    public com.allegro.webapi.ItemInfoExt getItemListInfoExt() {
        return itemListInfoExt;
    }


    /**
     * Sets the itemListInfoExt value for this DoShowItemInfoExtResponse.
     * 
     * @param itemListInfoExt
     */
    public void setItemListInfoExt(com.allegro.webapi.ItemInfoExt itemListInfoExt) {
        this.itemListInfoExt = itemListInfoExt;
    }


    /**
     * Gets the itemCatPath value for this DoShowItemInfoExtResponse.
     * 
     * @return itemCatPath
     */
    public com.allegro.webapi.ArrayOfItemcatlist getItemCatPath() {
        return itemCatPath;
    }


    /**
     * Sets the itemCatPath value for this DoShowItemInfoExtResponse.
     * 
     * @param itemCatPath
     */
    public void setItemCatPath(com.allegro.webapi.ArrayOfItemcatlist itemCatPath) {
        this.itemCatPath = itemCatPath;
    }


    /**
     * Gets the itemImgList value for this DoShowItemInfoExtResponse.
     * 
     * @return itemImgList
     */
    public com.allegro.webapi.ArrayOfItemimagelist getItemImgList() {
        return itemImgList;
    }


    /**
     * Sets the itemImgList value for this DoShowItemInfoExtResponse.
     * 
     * @param itemImgList
     */
    public void setItemImgList(com.allegro.webapi.ArrayOfItemimagelist itemImgList) {
        this.itemImgList = itemImgList;
    }


    /**
     * Gets the itemAttribList value for this DoShowItemInfoExtResponse.
     * 
     * @return itemAttribList
     */
    public com.allegro.webapi.ArrayOfAttribstruct getItemAttribList() {
        return itemAttribList;
    }


    /**
     * Sets the itemAttribList value for this DoShowItemInfoExtResponse.
     * 
     * @param itemAttribList
     */
    public void setItemAttribList(com.allegro.webapi.ArrayOfAttribstruct itemAttribList) {
        this.itemAttribList = itemAttribList;
    }


    /**
     * Gets the itemPostageOptions value for this DoShowItemInfoExtResponse.
     * 
     * @return itemPostageOptions
     */
    public com.allegro.webapi.ArrayOfPostagestruct getItemPostageOptions() {
        return itemPostageOptions;
    }


    /**
     * Sets the itemPostageOptions value for this DoShowItemInfoExtResponse.
     * 
     * @param itemPostageOptions
     */
    public void setItemPostageOptions(com.allegro.webapi.ArrayOfPostagestruct itemPostageOptions) {
        this.itemPostageOptions = itemPostageOptions;
    }


    /**
     * Gets the itemPaymentOptions value for this DoShowItemInfoExtResponse.
     * 
     * @return itemPaymentOptions
     */
    public com.allegro.webapi.ItemPaymentOptions getItemPaymentOptions() {
        return itemPaymentOptions;
    }


    /**
     * Sets the itemPaymentOptions value for this DoShowItemInfoExtResponse.
     * 
     * @param itemPaymentOptions
     */
    public void setItemPaymentOptions(com.allegro.webapi.ItemPaymentOptions itemPaymentOptions) {
        this.itemPaymentOptions = itemPaymentOptions;
    }


    /**
     * Gets the itemCompanyInfo value for this DoShowItemInfoExtResponse.
     * 
     * @return itemCompanyInfo
     */
    public com.allegro.webapi.CompanyInfoStruct getItemCompanyInfo() {
        return itemCompanyInfo;
    }


    /**
     * Sets the itemCompanyInfo value for this DoShowItemInfoExtResponse.
     * 
     * @param itemCompanyInfo
     */
    public void setItemCompanyInfo(com.allegro.webapi.CompanyInfoStruct itemCompanyInfo) {
        this.itemCompanyInfo = itemCompanyInfo;
    }


    /**
     * Gets the itemProductInfo value for this DoShowItemInfoExtResponse.
     * 
     * @return itemProductInfo
     */
    public com.allegro.webapi.ProductStruct getItemProductInfo() {
        return itemProductInfo;
    }


    /**
     * Sets the itemProductInfo value for this DoShowItemInfoExtResponse.
     * 
     * @param itemProductInfo
     */
    public void setItemProductInfo(com.allegro.webapi.ProductStruct itemProductInfo) {
        this.itemProductInfo = itemProductInfo;
    }


    /**
     * Gets the itemVariants value for this DoShowItemInfoExtResponse.
     * 
     * @return itemVariants
     */
    public com.allegro.webapi.ArrayOfItemvariantstruct getItemVariants() {
        return itemVariants;
    }


    /**
     * Sets the itemVariants value for this DoShowItemInfoExtResponse.
     * 
     * @param itemVariants
     */
    public void setItemVariants(com.allegro.webapi.ArrayOfItemvariantstruct itemVariants) {
        this.itemVariants = itemVariants;
    }


    /**
     * Gets the itemAfterSalesServiceConditions value for this DoShowItemInfoExtResponse.
     * 
     * @return itemAfterSalesServiceConditions
     */
    public com.allegro.webapi.AfterSalesServiceConditionsStruct getItemAfterSalesServiceConditions() {
        return itemAfterSalesServiceConditions;
    }


    /**
     * Sets the itemAfterSalesServiceConditions value for this DoShowItemInfoExtResponse.
     * 
     * @param itemAfterSalesServiceConditions
     */
    public void setItemAfterSalesServiceConditions(com.allegro.webapi.AfterSalesServiceConditionsStruct itemAfterSalesServiceConditions) {
        this.itemAfterSalesServiceConditions = itemAfterSalesServiceConditions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoShowItemInfoExtResponse)) return false;
        DoShowItemInfoExtResponse other = (DoShowItemInfoExtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemListInfoExt==null && other.getItemListInfoExt()==null) || 
             (this.itemListInfoExt!=null &&
              this.itemListInfoExt.equals(other.getItemListInfoExt()))) &&
            ((this.itemCatPath==null && other.getItemCatPath()==null) || 
             (this.itemCatPath!=null &&
              this.itemCatPath.equals(other.getItemCatPath()))) &&
            ((this.itemImgList==null && other.getItemImgList()==null) || 
             (this.itemImgList!=null &&
              this.itemImgList.equals(other.getItemImgList()))) &&
            ((this.itemAttribList==null && other.getItemAttribList()==null) || 
             (this.itemAttribList!=null &&
              this.itemAttribList.equals(other.getItemAttribList()))) &&
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
            ((this.itemVariants==null && other.getItemVariants()==null) || 
             (this.itemVariants!=null &&
              this.itemVariants.equals(other.getItemVariants()))) &&
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
        if (getItemListInfoExt() != null) {
            _hashCode += getItemListInfoExt().hashCode();
        }
        if (getItemCatPath() != null) {
            _hashCode += getItemCatPath().hashCode();
        }
        if (getItemImgList() != null) {
            _hashCode += getItemImgList().hashCode();
        }
        if (getItemAttribList() != null) {
            _hashCode += getItemAttribList().hashCode();
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
        if (getItemVariants() != null) {
            _hashCode += getItemVariants().hashCode();
        }
        if (getItemAfterSalesServiceConditions() != null) {
            _hashCode += getItemAfterSalesServiceConditions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoShowItemInfoExtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemListInfoExt");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemListInfoExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoExt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCatPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemCatPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemcatlist"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemImgList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemImgList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagelist"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAttribList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemAttribList"));
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
        elemField.setFieldName("itemVariants");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemVariants"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemvariantstruct"));
        elemField.setMinOccurs(0);
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

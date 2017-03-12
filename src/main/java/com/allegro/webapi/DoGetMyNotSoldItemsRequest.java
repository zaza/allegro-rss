/**
 * DoGetMyNotSoldItemsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyNotSoldItemsRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private com.allegro.webapi.SortOptionsStruct sortOptions;

    private com.allegro.webapi.NotSoldFilterOptionsStruct filterOptions;

    private java.lang.String searchValue;

    private java.lang.Integer categoryId;

    private com.allegro.webapi.ArrayOfLong itemIds;

    private java.lang.Integer pageSize;

    private java.lang.Integer pageNumber;

    public DoGetMyNotSoldItemsRequest() {
    }

    public DoGetMyNotSoldItemsRequest(
           java.lang.String sessionId,
           com.allegro.webapi.SortOptionsStruct sortOptions,
           com.allegro.webapi.NotSoldFilterOptionsStruct filterOptions,
           java.lang.String searchValue,
           java.lang.Integer categoryId,
           com.allegro.webapi.ArrayOfLong itemIds,
           java.lang.Integer pageSize,
           java.lang.Integer pageNumber) {
           this.sessionId = sessionId;
           this.sortOptions = sortOptions;
           this.filterOptions = filterOptions;
           this.searchValue = searchValue;
           this.categoryId = categoryId;
           this.itemIds = itemIds;
           this.pageSize = pageSize;
           this.pageNumber = pageNumber;
    }


    /**
     * Gets the sessionId value for this DoGetMyNotSoldItemsRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DoGetMyNotSoldItemsRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the sortOptions value for this DoGetMyNotSoldItemsRequest.
     * 
     * @return sortOptions
     */
    public com.allegro.webapi.SortOptionsStruct getSortOptions() {
        return sortOptions;
    }


    /**
     * Sets the sortOptions value for this DoGetMyNotSoldItemsRequest.
     * 
     * @param sortOptions
     */
    public void setSortOptions(com.allegro.webapi.SortOptionsStruct sortOptions) {
        this.sortOptions = sortOptions;
    }


    /**
     * Gets the filterOptions value for this DoGetMyNotSoldItemsRequest.
     * 
     * @return filterOptions
     */
    public com.allegro.webapi.NotSoldFilterOptionsStruct getFilterOptions() {
        return filterOptions;
    }


    /**
     * Sets the filterOptions value for this DoGetMyNotSoldItemsRequest.
     * 
     * @param filterOptions
     */
    public void setFilterOptions(com.allegro.webapi.NotSoldFilterOptionsStruct filterOptions) {
        this.filterOptions = filterOptions;
    }


    /**
     * Gets the searchValue value for this DoGetMyNotSoldItemsRequest.
     * 
     * @return searchValue
     */
    public java.lang.String getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this DoGetMyNotSoldItemsRequest.
     * 
     * @param searchValue
     */
    public void setSearchValue(java.lang.String searchValue) {
        this.searchValue = searchValue;
    }


    /**
     * Gets the categoryId value for this DoGetMyNotSoldItemsRequest.
     * 
     * @return categoryId
     */
    public java.lang.Integer getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this DoGetMyNotSoldItemsRequest.
     * 
     * @param categoryId
     */
    public void setCategoryId(java.lang.Integer categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the itemIds value for this DoGetMyNotSoldItemsRequest.
     * 
     * @return itemIds
     */
    public com.allegro.webapi.ArrayOfLong getItemIds() {
        return itemIds;
    }


    /**
     * Sets the itemIds value for this DoGetMyNotSoldItemsRequest.
     * 
     * @param itemIds
     */
    public void setItemIds(com.allegro.webapi.ArrayOfLong itemIds) {
        this.itemIds = itemIds;
    }


    /**
     * Gets the pageSize value for this DoGetMyNotSoldItemsRequest.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this DoGetMyNotSoldItemsRequest.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the pageNumber value for this DoGetMyNotSoldItemsRequest.
     * 
     * @return pageNumber
     */
    public java.lang.Integer getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this DoGetMyNotSoldItemsRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyNotSoldItemsRequest)) return false;
        DoGetMyNotSoldItemsRequest other = (DoGetMyNotSoldItemsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.sortOptions==null && other.getSortOptions()==null) || 
             (this.sortOptions!=null &&
              this.sortOptions.equals(other.getSortOptions()))) &&
            ((this.filterOptions==null && other.getFilterOptions()==null) || 
             (this.filterOptions!=null &&
              this.filterOptions.equals(other.getFilterOptions()))) &&
            ((this.searchValue==null && other.getSearchValue()==null) || 
             (this.searchValue!=null &&
              this.searchValue.equals(other.getSearchValue()))) &&
            ((this.categoryId==null && other.getCategoryId()==null) || 
             (this.categoryId!=null &&
              this.categoryId.equals(other.getCategoryId()))) &&
            ((this.itemIds==null && other.getItemIds()==null) || 
             (this.itemIds!=null &&
              this.itemIds.equals(other.getItemIds()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber())));
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
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getSortOptions() != null) {
            _hashCode += getSortOptions().hashCode();
        }
        if (getFilterOptions() != null) {
            _hashCode += getFilterOptions().hashCode();
        }
        if (getSearchValue() != null) {
            _hashCode += getSearchValue().hashCode();
        }
        if (getCategoryId() != null) {
            _hashCode += getCategoryId().hashCode();
        }
        if (getItemIds() != null) {
            _hashCode += getItemIds().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyNotSoldItemsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sortOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldFilterOptionsStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "searchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "categoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "pageNumber"));
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

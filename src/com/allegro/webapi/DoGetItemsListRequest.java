/**
 * DoGetItemsListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetItemsListRequest  implements java.io.Serializable {
    private java.lang.String webapiKey;

    private int countryId;

    private com.allegro.webapi.ArrayOfFilteroptionstype filterOptions;

    private com.allegro.webapi.SortOptionsType sortOptions;

    private java.lang.Integer resultSize;

    private java.lang.Integer resultOffset;

    private java.lang.Integer resultScope;

    public DoGetItemsListRequest() {
    }

    public DoGetItemsListRequest(
           java.lang.String webapiKey,
           int countryId,
           com.allegro.webapi.ArrayOfFilteroptionstype filterOptions,
           com.allegro.webapi.SortOptionsType sortOptions,
           java.lang.Integer resultSize,
           java.lang.Integer resultOffset,
           java.lang.Integer resultScope) {
           this.webapiKey = webapiKey;
           this.countryId = countryId;
           this.filterOptions = filterOptions;
           this.sortOptions = sortOptions;
           this.resultSize = resultSize;
           this.resultOffset = resultOffset;
           this.resultScope = resultScope;
    }


    /**
     * Gets the webapiKey value for this DoGetItemsListRequest.
     * 
     * @return webapiKey
     */
    public java.lang.String getWebapiKey() {
        return webapiKey;
    }


    /**
     * Sets the webapiKey value for this DoGetItemsListRequest.
     * 
     * @param webapiKey
     */
    public void setWebapiKey(java.lang.String webapiKey) {
        this.webapiKey = webapiKey;
    }


    /**
     * Gets the countryId value for this DoGetItemsListRequest.
     * 
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this DoGetItemsListRequest.
     * 
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the filterOptions value for this DoGetItemsListRequest.
     * 
     * @return filterOptions
     */
    public com.allegro.webapi.ArrayOfFilteroptionstype getFilterOptions() {
        return filterOptions;
    }


    /**
     * Sets the filterOptions value for this DoGetItemsListRequest.
     * 
     * @param filterOptions
     */
    public void setFilterOptions(com.allegro.webapi.ArrayOfFilteroptionstype filterOptions) {
        this.filterOptions = filterOptions;
    }


    /**
     * Gets the sortOptions value for this DoGetItemsListRequest.
     * 
     * @return sortOptions
     */
    public com.allegro.webapi.SortOptionsType getSortOptions() {
        return sortOptions;
    }


    /**
     * Sets the sortOptions value for this DoGetItemsListRequest.
     * 
     * @param sortOptions
     */
    public void setSortOptions(com.allegro.webapi.SortOptionsType sortOptions) {
        this.sortOptions = sortOptions;
    }


    /**
     * Gets the resultSize value for this DoGetItemsListRequest.
     * 
     * @return resultSize
     */
    public java.lang.Integer getResultSize() {
        return resultSize;
    }


    /**
     * Sets the resultSize value for this DoGetItemsListRequest.
     * 
     * @param resultSize
     */
    public void setResultSize(java.lang.Integer resultSize) {
        this.resultSize = resultSize;
    }


    /**
     * Gets the resultOffset value for this DoGetItemsListRequest.
     * 
     * @return resultOffset
     */
    public java.lang.Integer getResultOffset() {
        return resultOffset;
    }


    /**
     * Sets the resultOffset value for this DoGetItemsListRequest.
     * 
     * @param resultOffset
     */
    public void setResultOffset(java.lang.Integer resultOffset) {
        this.resultOffset = resultOffset;
    }


    /**
     * Gets the resultScope value for this DoGetItemsListRequest.
     * 
     * @return resultScope
     */
    public java.lang.Integer getResultScope() {
        return resultScope;
    }


    /**
     * Sets the resultScope value for this DoGetItemsListRequest.
     * 
     * @param resultScope
     */
    public void setResultScope(java.lang.Integer resultScope) {
        this.resultScope = resultScope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetItemsListRequest)) return false;
        DoGetItemsListRequest other = (DoGetItemsListRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webapiKey==null && other.getWebapiKey()==null) || 
             (this.webapiKey!=null &&
              this.webapiKey.equals(other.getWebapiKey()))) &&
            this.countryId == other.getCountryId() &&
            ((this.filterOptions==null && other.getFilterOptions()==null) || 
             (this.filterOptions!=null &&
              this.filterOptions.equals(other.getFilterOptions()))) &&
            ((this.sortOptions==null && other.getSortOptions()==null) || 
             (this.sortOptions!=null &&
              this.sortOptions.equals(other.getSortOptions()))) &&
            ((this.resultSize==null && other.getResultSize()==null) || 
             (this.resultSize!=null &&
              this.resultSize.equals(other.getResultSize()))) &&
            ((this.resultOffset==null && other.getResultOffset()==null) || 
             (this.resultOffset!=null &&
              this.resultOffset.equals(other.getResultOffset()))) &&
            ((this.resultScope==null && other.getResultScope()==null) || 
             (this.resultScope!=null &&
              this.resultScope.equals(other.getResultScope())));
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
        if (getWebapiKey() != null) {
            _hashCode += getWebapiKey().hashCode();
        }
        _hashCode += getCountryId();
        if (getFilterOptions() != null) {
            _hashCode += getFilterOptions().hashCode();
        }
        if (getSortOptions() != null) {
            _hashCode += getSortOptions().hashCode();
        }
        if (getResultSize() != null) {
            _hashCode += getResultSize().hashCode();
        }
        if (getResultOffset() != null) {
            _hashCode += getResultOffset().hashCode();
        }
        if (getResultScope() != null) {
            _hashCode += getResultScope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetItemsListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webapiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "webapiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilteroptionstype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sortOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "resultSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "resultOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "resultScope"));
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

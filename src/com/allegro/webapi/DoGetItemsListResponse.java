/**
 * DoGetItemsListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetItemsListResponse  implements java.io.Serializable {
    private int itemsCount;

    private java.lang.Integer itemsFeaturedCount;

    private com.allegro.webapi.ArrayOfItemslisttype itemsList;

    private com.allegro.webapi.CategoriesListType categoriesList;

    private com.allegro.webapi.ArrayOfFilterslisttype filtersList;

    private com.allegro.webapi.ArrayOfString filtersRejected;

    public DoGetItemsListResponse() {
    }

    public DoGetItemsListResponse(
           int itemsCount,
           java.lang.Integer itemsFeaturedCount,
           com.allegro.webapi.ArrayOfItemslisttype itemsList,
           com.allegro.webapi.CategoriesListType categoriesList,
           com.allegro.webapi.ArrayOfFilterslisttype filtersList,
           com.allegro.webapi.ArrayOfString filtersRejected) {
           this.itemsCount = itemsCount;
           this.itemsFeaturedCount = itemsFeaturedCount;
           this.itemsList = itemsList;
           this.categoriesList = categoriesList;
           this.filtersList = filtersList;
           this.filtersRejected = filtersRejected;
    }


    /**
     * Gets the itemsCount value for this DoGetItemsListResponse.
     * 
     * @return itemsCount
     */
    public int getItemsCount() {
        return itemsCount;
    }


    /**
     * Sets the itemsCount value for this DoGetItemsListResponse.
     * 
     * @param itemsCount
     */
    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }


    /**
     * Gets the itemsFeaturedCount value for this DoGetItemsListResponse.
     * 
     * @return itemsFeaturedCount
     */
    public java.lang.Integer getItemsFeaturedCount() {
        return itemsFeaturedCount;
    }


    /**
     * Sets the itemsFeaturedCount value for this DoGetItemsListResponse.
     * 
     * @param itemsFeaturedCount
     */
    public void setItemsFeaturedCount(java.lang.Integer itemsFeaturedCount) {
        this.itemsFeaturedCount = itemsFeaturedCount;
    }


    /**
     * Gets the itemsList value for this DoGetItemsListResponse.
     * 
     * @return itemsList
     */
    public com.allegro.webapi.ArrayOfItemslisttype getItemsList() {
        return itemsList;
    }


    /**
     * Sets the itemsList value for this DoGetItemsListResponse.
     * 
     * @param itemsList
     */
    public void setItemsList(com.allegro.webapi.ArrayOfItemslisttype itemsList) {
        this.itemsList = itemsList;
    }


    /**
     * Gets the categoriesList value for this DoGetItemsListResponse.
     * 
     * @return categoriesList
     */
    public com.allegro.webapi.CategoriesListType getCategoriesList() {
        return categoriesList;
    }


    /**
     * Sets the categoriesList value for this DoGetItemsListResponse.
     * 
     * @param categoriesList
     */
    public void setCategoriesList(com.allegro.webapi.CategoriesListType categoriesList) {
        this.categoriesList = categoriesList;
    }


    /**
     * Gets the filtersList value for this DoGetItemsListResponse.
     * 
     * @return filtersList
     */
    public com.allegro.webapi.ArrayOfFilterslisttype getFiltersList() {
        return filtersList;
    }


    /**
     * Sets the filtersList value for this DoGetItemsListResponse.
     * 
     * @param filtersList
     */
    public void setFiltersList(com.allegro.webapi.ArrayOfFilterslisttype filtersList) {
        this.filtersList = filtersList;
    }


    /**
     * Gets the filtersRejected value for this DoGetItemsListResponse.
     * 
     * @return filtersRejected
     */
    public com.allegro.webapi.ArrayOfString getFiltersRejected() {
        return filtersRejected;
    }


    /**
     * Sets the filtersRejected value for this DoGetItemsListResponse.
     * 
     * @param filtersRejected
     */
    public void setFiltersRejected(com.allegro.webapi.ArrayOfString filtersRejected) {
        this.filtersRejected = filtersRejected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetItemsListResponse)) return false;
        DoGetItemsListResponse other = (DoGetItemsListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemsCount == other.getItemsCount() &&
            ((this.itemsFeaturedCount==null && other.getItemsFeaturedCount()==null) || 
             (this.itemsFeaturedCount!=null &&
              this.itemsFeaturedCount.equals(other.getItemsFeaturedCount()))) &&
            ((this.itemsList==null && other.getItemsList()==null) || 
             (this.itemsList!=null &&
              this.itemsList.equals(other.getItemsList()))) &&
            ((this.categoriesList==null && other.getCategoriesList()==null) || 
             (this.categoriesList!=null &&
              this.categoriesList.equals(other.getCategoriesList()))) &&
            ((this.filtersList==null && other.getFiltersList()==null) || 
             (this.filtersList!=null &&
              this.filtersList.equals(other.getFiltersList()))) &&
            ((this.filtersRejected==null && other.getFiltersRejected()==null) || 
             (this.filtersRejected!=null &&
              this.filtersRejected.equals(other.getFiltersRejected())));
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
        _hashCode += getItemsCount();
        if (getItemsFeaturedCount() != null) {
            _hashCode += getItemsFeaturedCount().hashCode();
        }
        if (getItemsList() != null) {
            _hashCode += getItemsList().hashCode();
        }
        if (getCategoriesList() != null) {
            _hashCode += getCategoriesList().hashCode();
        }
        if (getFiltersList() != null) {
            _hashCode += getFiltersList().hashCode();
        }
        if (getFiltersRejected() != null) {
            _hashCode += getFiltersRejected().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetItemsListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsFeaturedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsFeaturedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemslisttype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriesList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "categoriesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filtersList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filtersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilterslisttype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filtersRejected");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filtersRejected"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
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

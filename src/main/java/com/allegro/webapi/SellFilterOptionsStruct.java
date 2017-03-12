/**
 * SellFilterOptionsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class SellFilterOptionsStruct  implements java.io.Serializable {
    private java.lang.Integer filterFormat;

    private java.lang.Integer filterBids;

    private java.lang.Integer filterToEnd;

    private java.lang.Integer filterFromStart;

    private java.lang.Integer filterAutoListing;

    private com.allegro.webapi.FilterPriceStruct filterPrice;

    private java.lang.Integer filterDurationType;

    public SellFilterOptionsStruct() {
    }

    public SellFilterOptionsStruct(
           java.lang.Integer filterFormat,
           java.lang.Integer filterBids,
           java.lang.Integer filterToEnd,
           java.lang.Integer filterFromStart,
           java.lang.Integer filterAutoListing,
           com.allegro.webapi.FilterPriceStruct filterPrice,
           java.lang.Integer filterDurationType) {
           this.filterFormat = filterFormat;
           this.filterBids = filterBids;
           this.filterToEnd = filterToEnd;
           this.filterFromStart = filterFromStart;
           this.filterAutoListing = filterAutoListing;
           this.filterPrice = filterPrice;
           this.filterDurationType = filterDurationType;
    }


    /**
     * Gets the filterFormat value for this SellFilterOptionsStruct.
     * 
     * @return filterFormat
     */
    public java.lang.Integer getFilterFormat() {
        return filterFormat;
    }


    /**
     * Sets the filterFormat value for this SellFilterOptionsStruct.
     * 
     * @param filterFormat
     */
    public void setFilterFormat(java.lang.Integer filterFormat) {
        this.filterFormat = filterFormat;
    }


    /**
     * Gets the filterBids value for this SellFilterOptionsStruct.
     * 
     * @return filterBids
     */
    public java.lang.Integer getFilterBids() {
        return filterBids;
    }


    /**
     * Sets the filterBids value for this SellFilterOptionsStruct.
     * 
     * @param filterBids
     */
    public void setFilterBids(java.lang.Integer filterBids) {
        this.filterBids = filterBids;
    }


    /**
     * Gets the filterToEnd value for this SellFilterOptionsStruct.
     * 
     * @return filterToEnd
     */
    public java.lang.Integer getFilterToEnd() {
        return filterToEnd;
    }


    /**
     * Sets the filterToEnd value for this SellFilterOptionsStruct.
     * 
     * @param filterToEnd
     */
    public void setFilterToEnd(java.lang.Integer filterToEnd) {
        this.filterToEnd = filterToEnd;
    }


    /**
     * Gets the filterFromStart value for this SellFilterOptionsStruct.
     * 
     * @return filterFromStart
     */
    public java.lang.Integer getFilterFromStart() {
        return filterFromStart;
    }


    /**
     * Sets the filterFromStart value for this SellFilterOptionsStruct.
     * 
     * @param filterFromStart
     */
    public void setFilterFromStart(java.lang.Integer filterFromStart) {
        this.filterFromStart = filterFromStart;
    }


    /**
     * Gets the filterAutoListing value for this SellFilterOptionsStruct.
     * 
     * @return filterAutoListing
     */
    public java.lang.Integer getFilterAutoListing() {
        return filterAutoListing;
    }


    /**
     * Sets the filterAutoListing value for this SellFilterOptionsStruct.
     * 
     * @param filterAutoListing
     */
    public void setFilterAutoListing(java.lang.Integer filterAutoListing) {
        this.filterAutoListing = filterAutoListing;
    }


    /**
     * Gets the filterPrice value for this SellFilterOptionsStruct.
     * 
     * @return filterPrice
     */
    public com.allegro.webapi.FilterPriceStruct getFilterPrice() {
        return filterPrice;
    }


    /**
     * Sets the filterPrice value for this SellFilterOptionsStruct.
     * 
     * @param filterPrice
     */
    public void setFilterPrice(com.allegro.webapi.FilterPriceStruct filterPrice) {
        this.filterPrice = filterPrice;
    }


    /**
     * Gets the filterDurationType value for this SellFilterOptionsStruct.
     * 
     * @return filterDurationType
     */
    public java.lang.Integer getFilterDurationType() {
        return filterDurationType;
    }


    /**
     * Sets the filterDurationType value for this SellFilterOptionsStruct.
     * 
     * @param filterDurationType
     */
    public void setFilterDurationType(java.lang.Integer filterDurationType) {
        this.filterDurationType = filterDurationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellFilterOptionsStruct)) return false;
        SellFilterOptionsStruct other = (SellFilterOptionsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filterFormat==null && other.getFilterFormat()==null) || 
             (this.filterFormat!=null &&
              this.filterFormat.equals(other.getFilterFormat()))) &&
            ((this.filterBids==null && other.getFilterBids()==null) || 
             (this.filterBids!=null &&
              this.filterBids.equals(other.getFilterBids()))) &&
            ((this.filterToEnd==null && other.getFilterToEnd()==null) || 
             (this.filterToEnd!=null &&
              this.filterToEnd.equals(other.getFilterToEnd()))) &&
            ((this.filterFromStart==null && other.getFilterFromStart()==null) || 
             (this.filterFromStart!=null &&
              this.filterFromStart.equals(other.getFilterFromStart()))) &&
            ((this.filterAutoListing==null && other.getFilterAutoListing()==null) || 
             (this.filterAutoListing!=null &&
              this.filterAutoListing.equals(other.getFilterAutoListing()))) &&
            ((this.filterPrice==null && other.getFilterPrice()==null) || 
             (this.filterPrice!=null &&
              this.filterPrice.equals(other.getFilterPrice()))) &&
            ((this.filterDurationType==null && other.getFilterDurationType()==null) || 
             (this.filterDurationType!=null &&
              this.filterDurationType.equals(other.getFilterDurationType())));
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
        if (getFilterFormat() != null) {
            _hashCode += getFilterFormat().hashCode();
        }
        if (getFilterBids() != null) {
            _hashCode += getFilterBids().hashCode();
        }
        if (getFilterToEnd() != null) {
            _hashCode += getFilterToEnd().hashCode();
        }
        if (getFilterFromStart() != null) {
            _hashCode += getFilterFromStart().hashCode();
        }
        if (getFilterAutoListing() != null) {
            _hashCode += getFilterAutoListing().hashCode();
        }
        if (getFilterPrice() != null) {
            _hashCode += getFilterPrice().hashCode();
        }
        if (getFilterDurationType() != null) {
            _hashCode += getFilterDurationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellFilterOptionsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFilterOptionsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterBids");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterBids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterToEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterToEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterFromStart");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterFromStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterAutoListing");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterAutoListing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterPriceStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterDurationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterDurationType"));
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

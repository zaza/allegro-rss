/**
 * FiltersListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class FiltersListType  implements java.io.Serializable {
    private java.lang.String filterId;

    private java.lang.String filterName;

    private java.lang.String filterType;

    private java.lang.String filterControlType;

    private java.lang.String filterDataType;

    private boolean filterIsRange;

    private java.lang.Integer filterArraySize;

    private com.allegro.webapi.ArrayOfFiltervaluetype filterValues;

    private com.allegro.webapi.FilterRelationType filterRelations;

    public FiltersListType() {
    }

    public FiltersListType(
           java.lang.String filterId,
           java.lang.String filterName,
           java.lang.String filterType,
           java.lang.String filterControlType,
           java.lang.String filterDataType,
           boolean filterIsRange,
           java.lang.Integer filterArraySize,
           com.allegro.webapi.ArrayOfFiltervaluetype filterValues,
           com.allegro.webapi.FilterRelationType filterRelations) {
           this.filterId = filterId;
           this.filterName = filterName;
           this.filterType = filterType;
           this.filterControlType = filterControlType;
           this.filterDataType = filterDataType;
           this.filterIsRange = filterIsRange;
           this.filterArraySize = filterArraySize;
           this.filterValues = filterValues;
           this.filterRelations = filterRelations;
    }


    /**
     * Gets the filterId value for this FiltersListType.
     * 
     * @return filterId
     */
    public java.lang.String getFilterId() {
        return filterId;
    }


    /**
     * Sets the filterId value for this FiltersListType.
     * 
     * @param filterId
     */
    public void setFilterId(java.lang.String filterId) {
        this.filterId = filterId;
    }


    /**
     * Gets the filterName value for this FiltersListType.
     * 
     * @return filterName
     */
    public java.lang.String getFilterName() {
        return filterName;
    }


    /**
     * Sets the filterName value for this FiltersListType.
     * 
     * @param filterName
     */
    public void setFilterName(java.lang.String filterName) {
        this.filterName = filterName;
    }


    /**
     * Gets the filterType value for this FiltersListType.
     * 
     * @return filterType
     */
    public java.lang.String getFilterType() {
        return filterType;
    }


    /**
     * Sets the filterType value for this FiltersListType.
     * 
     * @param filterType
     */
    public void setFilterType(java.lang.String filterType) {
        this.filterType = filterType;
    }


    /**
     * Gets the filterControlType value for this FiltersListType.
     * 
     * @return filterControlType
     */
    public java.lang.String getFilterControlType() {
        return filterControlType;
    }


    /**
     * Sets the filterControlType value for this FiltersListType.
     * 
     * @param filterControlType
     */
    public void setFilterControlType(java.lang.String filterControlType) {
        this.filterControlType = filterControlType;
    }


    /**
     * Gets the filterDataType value for this FiltersListType.
     * 
     * @return filterDataType
     */
    public java.lang.String getFilterDataType() {
        return filterDataType;
    }


    /**
     * Sets the filterDataType value for this FiltersListType.
     * 
     * @param filterDataType
     */
    public void setFilterDataType(java.lang.String filterDataType) {
        this.filterDataType = filterDataType;
    }


    /**
     * Gets the filterIsRange value for this FiltersListType.
     * 
     * @return filterIsRange
     */
    public boolean isFilterIsRange() {
        return filterIsRange;
    }


    /**
     * Sets the filterIsRange value for this FiltersListType.
     * 
     * @param filterIsRange
     */
    public void setFilterIsRange(boolean filterIsRange) {
        this.filterIsRange = filterIsRange;
    }


    /**
     * Gets the filterArraySize value for this FiltersListType.
     * 
     * @return filterArraySize
     */
    public java.lang.Integer getFilterArraySize() {
        return filterArraySize;
    }


    /**
     * Sets the filterArraySize value for this FiltersListType.
     * 
     * @param filterArraySize
     */
    public void setFilterArraySize(java.lang.Integer filterArraySize) {
        this.filterArraySize = filterArraySize;
    }


    /**
     * Gets the filterValues value for this FiltersListType.
     * 
     * @return filterValues
     */
    public com.allegro.webapi.ArrayOfFiltervaluetype getFilterValues() {
        return filterValues;
    }


    /**
     * Sets the filterValues value for this FiltersListType.
     * 
     * @param filterValues
     */
    public void setFilterValues(com.allegro.webapi.ArrayOfFiltervaluetype filterValues) {
        this.filterValues = filterValues;
    }


    /**
     * Gets the filterRelations value for this FiltersListType.
     * 
     * @return filterRelations
     */
    public com.allegro.webapi.FilterRelationType getFilterRelations() {
        return filterRelations;
    }


    /**
     * Sets the filterRelations value for this FiltersListType.
     * 
     * @param filterRelations
     */
    public void setFilterRelations(com.allegro.webapi.FilterRelationType filterRelations) {
        this.filterRelations = filterRelations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FiltersListType)) return false;
        FiltersListType other = (FiltersListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filterId==null && other.getFilterId()==null) || 
             (this.filterId!=null &&
              this.filterId.equals(other.getFilterId()))) &&
            ((this.filterName==null && other.getFilterName()==null) || 
             (this.filterName!=null &&
              this.filterName.equals(other.getFilterName()))) &&
            ((this.filterType==null && other.getFilterType()==null) || 
             (this.filterType!=null &&
              this.filterType.equals(other.getFilterType()))) &&
            ((this.filterControlType==null && other.getFilterControlType()==null) || 
             (this.filterControlType!=null &&
              this.filterControlType.equals(other.getFilterControlType()))) &&
            ((this.filterDataType==null && other.getFilterDataType()==null) || 
             (this.filterDataType!=null &&
              this.filterDataType.equals(other.getFilterDataType()))) &&
            this.filterIsRange == other.isFilterIsRange() &&
            ((this.filterArraySize==null && other.getFilterArraySize()==null) || 
             (this.filterArraySize!=null &&
              this.filterArraySize.equals(other.getFilterArraySize()))) &&
            ((this.filterValues==null && other.getFilterValues()==null) || 
             (this.filterValues!=null &&
              this.filterValues.equals(other.getFilterValues()))) &&
            ((this.filterRelations==null && other.getFilterRelations()==null) || 
             (this.filterRelations!=null &&
              this.filterRelations.equals(other.getFilterRelations())));
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
        if (getFilterId() != null) {
            _hashCode += getFilterId().hashCode();
        }
        if (getFilterName() != null) {
            _hashCode += getFilterName().hashCode();
        }
        if (getFilterType() != null) {
            _hashCode += getFilterType().hashCode();
        }
        if (getFilterControlType() != null) {
            _hashCode += getFilterControlType().hashCode();
        }
        if (getFilterDataType() != null) {
            _hashCode += getFilterDataType().hashCode();
        }
        _hashCode += (isFilterIsRange() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFilterArraySize() != null) {
            _hashCode += getFilterArraySize().hashCode();
        }
        if (getFilterValues() != null) {
            _hashCode += getFilterValues().hashCode();
        }
        if (getFilterRelations() != null) {
            _hashCode += getFilterRelations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FiltersListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterControlType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterControlType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterIsRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterIsRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterArraySize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterArraySize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFiltervaluetype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filterRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterRelationType"));
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

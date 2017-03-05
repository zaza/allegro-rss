/**
 * DoGetPostBuyFormsIdsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetPostBuyFormsIdsResponse  implements java.io.Serializable {
    private int formsCount;

    private com.allegro.webapi.ArrayOfLong formsIds;

    private com.allegro.webapi.ArrayOfFilterslisttype filtersList;

    public DoGetPostBuyFormsIdsResponse() {
    }

    public DoGetPostBuyFormsIdsResponse(
           int formsCount,
           com.allegro.webapi.ArrayOfLong formsIds,
           com.allegro.webapi.ArrayOfFilterslisttype filtersList) {
           this.formsCount = formsCount;
           this.formsIds = formsIds;
           this.filtersList = filtersList;
    }


    /**
     * Gets the formsCount value for this DoGetPostBuyFormsIdsResponse.
     * 
     * @return formsCount
     */
    public int getFormsCount() {
        return formsCount;
    }


    /**
     * Sets the formsCount value for this DoGetPostBuyFormsIdsResponse.
     * 
     * @param formsCount
     */
    public void setFormsCount(int formsCount) {
        this.formsCount = formsCount;
    }


    /**
     * Gets the formsIds value for this DoGetPostBuyFormsIdsResponse.
     * 
     * @return formsIds
     */
    public com.allegro.webapi.ArrayOfLong getFormsIds() {
        return formsIds;
    }


    /**
     * Sets the formsIds value for this DoGetPostBuyFormsIdsResponse.
     * 
     * @param formsIds
     */
    public void setFormsIds(com.allegro.webapi.ArrayOfLong formsIds) {
        this.formsIds = formsIds;
    }


    /**
     * Gets the filtersList value for this DoGetPostBuyFormsIdsResponse.
     * 
     * @return filtersList
     */
    public com.allegro.webapi.ArrayOfFilterslisttype getFiltersList() {
        return filtersList;
    }


    /**
     * Sets the filtersList value for this DoGetPostBuyFormsIdsResponse.
     * 
     * @param filtersList
     */
    public void setFiltersList(com.allegro.webapi.ArrayOfFilterslisttype filtersList) {
        this.filtersList = filtersList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetPostBuyFormsIdsResponse)) return false;
        DoGetPostBuyFormsIdsResponse other = (DoGetPostBuyFormsIdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.formsCount == other.getFormsCount() &&
            ((this.formsIds==null && other.getFormsIds()==null) || 
             (this.formsIds!=null &&
              this.formsIds.equals(other.getFormsIds()))) &&
            ((this.filtersList==null && other.getFiltersList()==null) || 
             (this.filtersList!=null &&
              this.filtersList.equals(other.getFiltersList())));
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
        _hashCode += getFormsCount();
        if (getFormsIds() != null) {
            _hashCode += getFormsIds().hashCode();
        }
        if (getFiltersList() != null) {
            _hashCode += getFiltersList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetPostBuyFormsIdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "formsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formsIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "formsIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
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

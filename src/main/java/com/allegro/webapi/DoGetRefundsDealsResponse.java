/**
 * DoGetRefundsDealsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetRefundsDealsResponse  implements java.io.Serializable {
    private int dealsCount;

    private com.allegro.webapi.ArrayOfRefundsdealslisttype dealsList;

    private com.allegro.webapi.ArrayOfFilterslisttype filtersList;

    public DoGetRefundsDealsResponse() {
    }

    public DoGetRefundsDealsResponse(
           int dealsCount,
           com.allegro.webapi.ArrayOfRefundsdealslisttype dealsList,
           com.allegro.webapi.ArrayOfFilterslisttype filtersList) {
           this.dealsCount = dealsCount;
           this.dealsList = dealsList;
           this.filtersList = filtersList;
    }


    /**
     * Gets the dealsCount value for this DoGetRefundsDealsResponse.
     * 
     * @return dealsCount
     */
    public int getDealsCount() {
        return dealsCount;
    }


    /**
     * Sets the dealsCount value for this DoGetRefundsDealsResponse.
     * 
     * @param dealsCount
     */
    public void setDealsCount(int dealsCount) {
        this.dealsCount = dealsCount;
    }


    /**
     * Gets the dealsList value for this DoGetRefundsDealsResponse.
     * 
     * @return dealsList
     */
    public com.allegro.webapi.ArrayOfRefundsdealslisttype getDealsList() {
        return dealsList;
    }


    /**
     * Sets the dealsList value for this DoGetRefundsDealsResponse.
     * 
     * @param dealsList
     */
    public void setDealsList(com.allegro.webapi.ArrayOfRefundsdealslisttype dealsList) {
        this.dealsList = dealsList;
    }


    /**
     * Gets the filtersList value for this DoGetRefundsDealsResponse.
     * 
     * @return filtersList
     */
    public com.allegro.webapi.ArrayOfFilterslisttype getFiltersList() {
        return filtersList;
    }


    /**
     * Sets the filtersList value for this DoGetRefundsDealsResponse.
     * 
     * @param filtersList
     */
    public void setFiltersList(com.allegro.webapi.ArrayOfFilterslisttype filtersList) {
        this.filtersList = filtersList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetRefundsDealsResponse)) return false;
        DoGetRefundsDealsResponse other = (DoGetRefundsDealsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dealsCount == other.getDealsCount() &&
            ((this.dealsList==null && other.getDealsList()==null) || 
             (this.dealsList!=null &&
              this.dealsList.equals(other.getDealsList()))) &&
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
        _hashCode += getDealsCount();
        if (getDealsList() != null) {
            _hashCode += getDealsList().hashCode();
        }
        if (getFiltersList() != null) {
            _hashCode += getFiltersList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetRefundsDealsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsDealsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "dealsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "dealsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundsdealslisttype"));
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

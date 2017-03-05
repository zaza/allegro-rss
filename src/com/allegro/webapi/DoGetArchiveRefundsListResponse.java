/**
 * DoGetArchiveRefundsListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetArchiveRefundsListResponse  implements java.io.Serializable {
    private int refundsCount;

    private com.allegro.webapi.ArrayOfArchiverefundslisttypestruct refundsList;

    public DoGetArchiveRefundsListResponse() {
    }

    public DoGetArchiveRefundsListResponse(
           int refundsCount,
           com.allegro.webapi.ArrayOfArchiverefundslisttypestruct refundsList) {
           this.refundsCount = refundsCount;
           this.refundsList = refundsList;
    }


    /**
     * Gets the refundsCount value for this DoGetArchiveRefundsListResponse.
     * 
     * @return refundsCount
     */
    public int getRefundsCount() {
        return refundsCount;
    }


    /**
     * Sets the refundsCount value for this DoGetArchiveRefundsListResponse.
     * 
     * @param refundsCount
     */
    public void setRefundsCount(int refundsCount) {
        this.refundsCount = refundsCount;
    }


    /**
     * Gets the refundsList value for this DoGetArchiveRefundsListResponse.
     * 
     * @return refundsList
     */
    public com.allegro.webapi.ArrayOfArchiverefundslisttypestruct getRefundsList() {
        return refundsList;
    }


    /**
     * Sets the refundsList value for this DoGetArchiveRefundsListResponse.
     * 
     * @param refundsList
     */
    public void setRefundsList(com.allegro.webapi.ArrayOfArchiverefundslisttypestruct refundsList) {
        this.refundsList = refundsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetArchiveRefundsListResponse)) return false;
        DoGetArchiveRefundsListResponse other = (DoGetArchiveRefundsListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.refundsCount == other.getRefundsCount() &&
            ((this.refundsList==null && other.getRefundsList()==null) || 
             (this.refundsList!=null &&
              this.refundsList.equals(other.getRefundsList())));
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
        _hashCode += getRefundsCount();
        if (getRefundsList() != null) {
            _hashCode += getRefundsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetArchiveRefundsListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetArchiveRefundsListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfArchiverefundslisttypestruct"));
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

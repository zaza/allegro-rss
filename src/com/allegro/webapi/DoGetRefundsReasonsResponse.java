/**
 * DoGetRefundsReasonsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetRefundsReasonsResponse  implements java.io.Serializable {
    private int reasonsCount;

    private com.allegro.webapi.ArrayOfReasoninfotype reasonsList;

    public DoGetRefundsReasonsResponse() {
    }

    public DoGetRefundsReasonsResponse(
           int reasonsCount,
           com.allegro.webapi.ArrayOfReasoninfotype reasonsList) {
           this.reasonsCount = reasonsCount;
           this.reasonsList = reasonsList;
    }


    /**
     * Gets the reasonsCount value for this DoGetRefundsReasonsResponse.
     * 
     * @return reasonsCount
     */
    public int getReasonsCount() {
        return reasonsCount;
    }


    /**
     * Sets the reasonsCount value for this DoGetRefundsReasonsResponse.
     * 
     * @param reasonsCount
     */
    public void setReasonsCount(int reasonsCount) {
        this.reasonsCount = reasonsCount;
    }


    /**
     * Gets the reasonsList value for this DoGetRefundsReasonsResponse.
     * 
     * @return reasonsList
     */
    public com.allegro.webapi.ArrayOfReasoninfotype getReasonsList() {
        return reasonsList;
    }


    /**
     * Sets the reasonsList value for this DoGetRefundsReasonsResponse.
     * 
     * @param reasonsList
     */
    public void setReasonsList(com.allegro.webapi.ArrayOfReasoninfotype reasonsList) {
        this.reasonsList = reasonsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetRefundsReasonsResponse)) return false;
        DoGetRefundsReasonsResponse other = (DoGetRefundsReasonsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.reasonsCount == other.getReasonsCount() &&
            ((this.reasonsList==null && other.getReasonsList()==null) || 
             (this.reasonsList!=null &&
              this.reasonsList.equals(other.getReasonsList())));
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
        _hashCode += getReasonsCount();
        if (getReasonsList() != null) {
            _hashCode += getReasonsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetRefundsReasonsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsReasonsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "reasonsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "reasonsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfReasoninfotype"));
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

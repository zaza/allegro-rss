/**
 * DoGetMyPaymentsInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyPaymentsInfoResponse  implements java.io.Serializable {
    private com.allegro.webapi.PaymentsInfoStruct paymentsInfo;

    public DoGetMyPaymentsInfoResponse() {
    }

    public DoGetMyPaymentsInfoResponse(
           com.allegro.webapi.PaymentsInfoStruct paymentsInfo) {
           this.paymentsInfo = paymentsInfo;
    }


    /**
     * Gets the paymentsInfo value for this DoGetMyPaymentsInfoResponse.
     * 
     * @return paymentsInfo
     */
    public com.allegro.webapi.PaymentsInfoStruct getPaymentsInfo() {
        return paymentsInfo;
    }


    /**
     * Sets the paymentsInfo value for this DoGetMyPaymentsInfoResponse.
     * 
     * @param paymentsInfo
     */
    public void setPaymentsInfo(com.allegro.webapi.PaymentsInfoStruct paymentsInfo) {
        this.paymentsInfo = paymentsInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyPaymentsInfoResponse)) return false;
        DoGetMyPaymentsInfoResponse other = (DoGetMyPaymentsInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentsInfo==null && other.getPaymentsInfo()==null) || 
             (this.paymentsInfo!=null &&
              this.paymentsInfo.equals(other.getPaymentsInfo())));
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
        if (getPaymentsInfo() != null) {
            _hashCode += getPaymentsInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyPaymentsInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsInfoStruct"));
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

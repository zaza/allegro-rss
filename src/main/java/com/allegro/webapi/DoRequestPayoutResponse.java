/**
 * DoRequestPayoutResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoRequestPayoutResponse  implements java.io.Serializable {
    private com.allegro.webapi.RequestPayoutStruct requestPayout;

    public DoRequestPayoutResponse() {
    }

    public DoRequestPayoutResponse(
           com.allegro.webapi.RequestPayoutStruct requestPayout) {
           this.requestPayout = requestPayout;
    }


    /**
     * Gets the requestPayout value for this DoRequestPayoutResponse.
     * 
     * @return requestPayout
     */
    public com.allegro.webapi.RequestPayoutStruct getRequestPayout() {
        return requestPayout;
    }


    /**
     * Sets the requestPayout value for this DoRequestPayoutResponse.
     * 
     * @param requestPayout
     */
    public void setRequestPayout(com.allegro.webapi.RequestPayoutStruct requestPayout) {
        this.requestPayout = requestPayout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRequestPayoutResponse)) return false;
        DoRequestPayoutResponse other = (DoRequestPayoutResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestPayout==null && other.getRequestPayout()==null) || 
             (this.requestPayout!=null &&
              this.requestPayout.equals(other.getRequestPayout())));
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
        if (getRequestPayout() != null) {
            _hashCode += getRequestPayout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoRequestPayoutResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestPayout");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "requestPayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RequestPayoutStruct"));
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

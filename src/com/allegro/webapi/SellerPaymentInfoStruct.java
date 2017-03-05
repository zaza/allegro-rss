/**
 * SellerPaymentInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class SellerPaymentInfoStruct  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfShipmentpaymentinfostruct shipmentPaymentInfoPza;

    private com.allegro.webapi.ArrayOfShipmentpaymentinfostruct shipmentPaymentInfoNonPza;

    public SellerPaymentInfoStruct() {
    }

    public SellerPaymentInfoStruct(
           com.allegro.webapi.ArrayOfShipmentpaymentinfostruct shipmentPaymentInfoPza,
           com.allegro.webapi.ArrayOfShipmentpaymentinfostruct shipmentPaymentInfoNonPza) {
           this.shipmentPaymentInfoPza = shipmentPaymentInfoPza;
           this.shipmentPaymentInfoNonPza = shipmentPaymentInfoNonPza;
    }


    /**
     * Gets the shipmentPaymentInfoPza value for this SellerPaymentInfoStruct.
     * 
     * @return shipmentPaymentInfoPza
     */
    public com.allegro.webapi.ArrayOfShipmentpaymentinfostruct getShipmentPaymentInfoPza() {
        return shipmentPaymentInfoPza;
    }


    /**
     * Sets the shipmentPaymentInfoPza value for this SellerPaymentInfoStruct.
     * 
     * @param shipmentPaymentInfoPza
     */
    public void setShipmentPaymentInfoPza(com.allegro.webapi.ArrayOfShipmentpaymentinfostruct shipmentPaymentInfoPza) {
        this.shipmentPaymentInfoPza = shipmentPaymentInfoPza;
    }


    /**
     * Gets the shipmentPaymentInfoNonPza value for this SellerPaymentInfoStruct.
     * 
     * @return shipmentPaymentInfoNonPza
     */
    public com.allegro.webapi.ArrayOfShipmentpaymentinfostruct getShipmentPaymentInfoNonPza() {
        return shipmentPaymentInfoNonPza;
    }


    /**
     * Sets the shipmentPaymentInfoNonPza value for this SellerPaymentInfoStruct.
     * 
     * @param shipmentPaymentInfoNonPza
     */
    public void setShipmentPaymentInfoNonPza(com.allegro.webapi.ArrayOfShipmentpaymentinfostruct shipmentPaymentInfoNonPza) {
        this.shipmentPaymentInfoNonPza = shipmentPaymentInfoNonPza;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellerPaymentInfoStruct)) return false;
        SellerPaymentInfoStruct other = (SellerPaymentInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentPaymentInfoPza==null && other.getShipmentPaymentInfoPza()==null) || 
             (this.shipmentPaymentInfoPza!=null &&
              this.shipmentPaymentInfoPza.equals(other.getShipmentPaymentInfoPza()))) &&
            ((this.shipmentPaymentInfoNonPza==null && other.getShipmentPaymentInfoNonPza()==null) || 
             (this.shipmentPaymentInfoNonPza!=null &&
              this.shipmentPaymentInfoNonPza.equals(other.getShipmentPaymentInfoNonPza())));
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
        if (getShipmentPaymentInfoPza() != null) {
            _hashCode += getShipmentPaymentInfoPza().hashCode();
        }
        if (getShipmentPaymentInfoNonPza() != null) {
            _hashCode += getShipmentPaymentInfoNonPza().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellerPaymentInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerPaymentInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentPaymentInfoPza");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentPaymentInfoPza"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpaymentinfostruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentPaymentInfoNonPza");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentPaymentInfoNonPza"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpaymentinfostruct"));
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

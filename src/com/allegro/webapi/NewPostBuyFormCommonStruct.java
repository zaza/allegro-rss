/**
 * NewPostBuyFormCommonStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class NewPostBuyFormCommonStruct  implements java.io.Serializable {
    private java.lang.String paymentMethodId;

    private int shipmentAddressType;

    private com.allegro.webapi.AddressUserDataStruct shipmentAddressData;

    private java.lang.String contactPhone;

    private int invoiceOption;

    private com.allegro.webapi.InvoiceInfoStruct invoiceInfo;

    public NewPostBuyFormCommonStruct() {
    }

    public NewPostBuyFormCommonStruct(
           java.lang.String paymentMethodId,
           int shipmentAddressType,
           com.allegro.webapi.AddressUserDataStruct shipmentAddressData,
           java.lang.String contactPhone,
           int invoiceOption,
           com.allegro.webapi.InvoiceInfoStruct invoiceInfo) {
           this.paymentMethodId = paymentMethodId;
           this.shipmentAddressType = shipmentAddressType;
           this.shipmentAddressData = shipmentAddressData;
           this.contactPhone = contactPhone;
           this.invoiceOption = invoiceOption;
           this.invoiceInfo = invoiceInfo;
    }


    /**
     * Gets the paymentMethodId value for this NewPostBuyFormCommonStruct.
     * 
     * @return paymentMethodId
     */
    public java.lang.String getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this NewPostBuyFormCommonStruct.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(java.lang.String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the shipmentAddressType value for this NewPostBuyFormCommonStruct.
     * 
     * @return shipmentAddressType
     */
    public int getShipmentAddressType() {
        return shipmentAddressType;
    }


    /**
     * Sets the shipmentAddressType value for this NewPostBuyFormCommonStruct.
     * 
     * @param shipmentAddressType
     */
    public void setShipmentAddressType(int shipmentAddressType) {
        this.shipmentAddressType = shipmentAddressType;
    }


    /**
     * Gets the shipmentAddressData value for this NewPostBuyFormCommonStruct.
     * 
     * @return shipmentAddressData
     */
    public com.allegro.webapi.AddressUserDataStruct getShipmentAddressData() {
        return shipmentAddressData;
    }


    /**
     * Sets the shipmentAddressData value for this NewPostBuyFormCommonStruct.
     * 
     * @param shipmentAddressData
     */
    public void setShipmentAddressData(com.allegro.webapi.AddressUserDataStruct shipmentAddressData) {
        this.shipmentAddressData = shipmentAddressData;
    }


    /**
     * Gets the contactPhone value for this NewPostBuyFormCommonStruct.
     * 
     * @return contactPhone
     */
    public java.lang.String getContactPhone() {
        return contactPhone;
    }


    /**
     * Sets the contactPhone value for this NewPostBuyFormCommonStruct.
     * 
     * @param contactPhone
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }


    /**
     * Gets the invoiceOption value for this NewPostBuyFormCommonStruct.
     * 
     * @return invoiceOption
     */
    public int getInvoiceOption() {
        return invoiceOption;
    }


    /**
     * Sets the invoiceOption value for this NewPostBuyFormCommonStruct.
     * 
     * @param invoiceOption
     */
    public void setInvoiceOption(int invoiceOption) {
        this.invoiceOption = invoiceOption;
    }


    /**
     * Gets the invoiceInfo value for this NewPostBuyFormCommonStruct.
     * 
     * @return invoiceInfo
     */
    public com.allegro.webapi.InvoiceInfoStruct getInvoiceInfo() {
        return invoiceInfo;
    }


    /**
     * Sets the invoiceInfo value for this NewPostBuyFormCommonStruct.
     * 
     * @param invoiceInfo
     */
    public void setInvoiceInfo(com.allegro.webapi.InvoiceInfoStruct invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewPostBuyFormCommonStruct)) return false;
        NewPostBuyFormCommonStruct other = (NewPostBuyFormCommonStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentMethodId==null && other.getPaymentMethodId()==null) || 
             (this.paymentMethodId!=null &&
              this.paymentMethodId.equals(other.getPaymentMethodId()))) &&
            this.shipmentAddressType == other.getShipmentAddressType() &&
            ((this.shipmentAddressData==null && other.getShipmentAddressData()==null) || 
             (this.shipmentAddressData!=null &&
              this.shipmentAddressData.equals(other.getShipmentAddressData()))) &&
            ((this.contactPhone==null && other.getContactPhone()==null) || 
             (this.contactPhone!=null &&
              this.contactPhone.equals(other.getContactPhone()))) &&
            this.invoiceOption == other.getInvoiceOption() &&
            ((this.invoiceInfo==null && other.getInvoiceInfo()==null) || 
             (this.invoiceInfo!=null &&
              this.invoiceInfo.equals(other.getInvoiceInfo())));
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
        if (getPaymentMethodId() != null) {
            _hashCode += getPaymentMethodId().hashCode();
        }
        _hashCode += getShipmentAddressType();
        if (getShipmentAddressData() != null) {
            _hashCode += getShipmentAddressData().hashCode();
        }
        if (getContactPhone() != null) {
            _hashCode += getContactPhone().hashCode();
        }
        _hashCode += getInvoiceOption();
        if (getInvoiceInfo() != null) {
            _hashCode += getInvoiceInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewPostBuyFormCommonStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormCommonStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentAddressType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentAddressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentAddressData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentAddressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressUserDataStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "contactPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "invoiceOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "invoiceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceInfoStruct"));
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

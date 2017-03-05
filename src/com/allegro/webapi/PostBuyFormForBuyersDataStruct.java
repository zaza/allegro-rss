/**
 * PostBuyFormForBuyersDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PostBuyFormForBuyersDataStruct  implements java.io.Serializable {
    private long postBuyFormId;

    private int postBuyFormBuyerId;

    private com.allegro.webapi.ArrayOfPostbuyformsellersstruct postBuyFormSellers;

    private float postBuyFormTotalAmount;

    private int postBuyFormInvoiceOption;

    private com.allegro.webapi.PostBuyFormAddressStruct postBuyFormInvoiceData;

    private com.allegro.webapi.PostBuyFormAddressStruct postBuyFormShipmentAddress;

    private java.lang.String postBuyFormPayType;

    private long postBuyFormPayId;

    private java.lang.String postBuyFormPayStatus;

    private java.lang.String postBuyFormDateInit;

    private java.lang.String postBuyFormDateRecv;

    private java.lang.String postBuyFormDateCancel;

    private float postBuyFormPaymentAmount;

    public PostBuyFormForBuyersDataStruct() {
    }

    public PostBuyFormForBuyersDataStruct(
           long postBuyFormId,
           int postBuyFormBuyerId,
           com.allegro.webapi.ArrayOfPostbuyformsellersstruct postBuyFormSellers,
           float postBuyFormTotalAmount,
           int postBuyFormInvoiceOption,
           com.allegro.webapi.PostBuyFormAddressStruct postBuyFormInvoiceData,
           com.allegro.webapi.PostBuyFormAddressStruct postBuyFormShipmentAddress,
           java.lang.String postBuyFormPayType,
           long postBuyFormPayId,
           java.lang.String postBuyFormPayStatus,
           java.lang.String postBuyFormDateInit,
           java.lang.String postBuyFormDateRecv,
           java.lang.String postBuyFormDateCancel,
           float postBuyFormPaymentAmount) {
           this.postBuyFormId = postBuyFormId;
           this.postBuyFormBuyerId = postBuyFormBuyerId;
           this.postBuyFormSellers = postBuyFormSellers;
           this.postBuyFormTotalAmount = postBuyFormTotalAmount;
           this.postBuyFormInvoiceOption = postBuyFormInvoiceOption;
           this.postBuyFormInvoiceData = postBuyFormInvoiceData;
           this.postBuyFormShipmentAddress = postBuyFormShipmentAddress;
           this.postBuyFormPayType = postBuyFormPayType;
           this.postBuyFormPayId = postBuyFormPayId;
           this.postBuyFormPayStatus = postBuyFormPayStatus;
           this.postBuyFormDateInit = postBuyFormDateInit;
           this.postBuyFormDateRecv = postBuyFormDateRecv;
           this.postBuyFormDateCancel = postBuyFormDateCancel;
           this.postBuyFormPaymentAmount = postBuyFormPaymentAmount;
    }


    /**
     * Gets the postBuyFormId value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormId
     */
    public long getPostBuyFormId() {
        return postBuyFormId;
    }


    /**
     * Sets the postBuyFormId value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormId
     */
    public void setPostBuyFormId(long postBuyFormId) {
        this.postBuyFormId = postBuyFormId;
    }


    /**
     * Gets the postBuyFormBuyerId value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormBuyerId
     */
    public int getPostBuyFormBuyerId() {
        return postBuyFormBuyerId;
    }


    /**
     * Sets the postBuyFormBuyerId value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormBuyerId
     */
    public void setPostBuyFormBuyerId(int postBuyFormBuyerId) {
        this.postBuyFormBuyerId = postBuyFormBuyerId;
    }


    /**
     * Gets the postBuyFormSellers value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormSellers
     */
    public com.allegro.webapi.ArrayOfPostbuyformsellersstruct getPostBuyFormSellers() {
        return postBuyFormSellers;
    }


    /**
     * Sets the postBuyFormSellers value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormSellers
     */
    public void setPostBuyFormSellers(com.allegro.webapi.ArrayOfPostbuyformsellersstruct postBuyFormSellers) {
        this.postBuyFormSellers = postBuyFormSellers;
    }


    /**
     * Gets the postBuyFormTotalAmount value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormTotalAmount
     */
    public float getPostBuyFormTotalAmount() {
        return postBuyFormTotalAmount;
    }


    /**
     * Sets the postBuyFormTotalAmount value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormTotalAmount
     */
    public void setPostBuyFormTotalAmount(float postBuyFormTotalAmount) {
        this.postBuyFormTotalAmount = postBuyFormTotalAmount;
    }


    /**
     * Gets the postBuyFormInvoiceOption value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormInvoiceOption
     */
    public int getPostBuyFormInvoiceOption() {
        return postBuyFormInvoiceOption;
    }


    /**
     * Sets the postBuyFormInvoiceOption value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormInvoiceOption
     */
    public void setPostBuyFormInvoiceOption(int postBuyFormInvoiceOption) {
        this.postBuyFormInvoiceOption = postBuyFormInvoiceOption;
    }


    /**
     * Gets the postBuyFormInvoiceData value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormInvoiceData
     */
    public com.allegro.webapi.PostBuyFormAddressStruct getPostBuyFormInvoiceData() {
        return postBuyFormInvoiceData;
    }


    /**
     * Sets the postBuyFormInvoiceData value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormInvoiceData
     */
    public void setPostBuyFormInvoiceData(com.allegro.webapi.PostBuyFormAddressStruct postBuyFormInvoiceData) {
        this.postBuyFormInvoiceData = postBuyFormInvoiceData;
    }


    /**
     * Gets the postBuyFormShipmentAddress value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormShipmentAddress
     */
    public com.allegro.webapi.PostBuyFormAddressStruct getPostBuyFormShipmentAddress() {
        return postBuyFormShipmentAddress;
    }


    /**
     * Sets the postBuyFormShipmentAddress value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormShipmentAddress
     */
    public void setPostBuyFormShipmentAddress(com.allegro.webapi.PostBuyFormAddressStruct postBuyFormShipmentAddress) {
        this.postBuyFormShipmentAddress = postBuyFormShipmentAddress;
    }


    /**
     * Gets the postBuyFormPayType value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormPayType
     */
    public java.lang.String getPostBuyFormPayType() {
        return postBuyFormPayType;
    }


    /**
     * Sets the postBuyFormPayType value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormPayType
     */
    public void setPostBuyFormPayType(java.lang.String postBuyFormPayType) {
        this.postBuyFormPayType = postBuyFormPayType;
    }


    /**
     * Gets the postBuyFormPayId value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormPayId
     */
    public long getPostBuyFormPayId() {
        return postBuyFormPayId;
    }


    /**
     * Sets the postBuyFormPayId value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormPayId
     */
    public void setPostBuyFormPayId(long postBuyFormPayId) {
        this.postBuyFormPayId = postBuyFormPayId;
    }


    /**
     * Gets the postBuyFormPayStatus value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormPayStatus
     */
    public java.lang.String getPostBuyFormPayStatus() {
        return postBuyFormPayStatus;
    }


    /**
     * Sets the postBuyFormPayStatus value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormPayStatus
     */
    public void setPostBuyFormPayStatus(java.lang.String postBuyFormPayStatus) {
        this.postBuyFormPayStatus = postBuyFormPayStatus;
    }


    /**
     * Gets the postBuyFormDateInit value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormDateInit
     */
    public java.lang.String getPostBuyFormDateInit() {
        return postBuyFormDateInit;
    }


    /**
     * Sets the postBuyFormDateInit value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormDateInit
     */
    public void setPostBuyFormDateInit(java.lang.String postBuyFormDateInit) {
        this.postBuyFormDateInit = postBuyFormDateInit;
    }


    /**
     * Gets the postBuyFormDateRecv value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormDateRecv
     */
    public java.lang.String getPostBuyFormDateRecv() {
        return postBuyFormDateRecv;
    }


    /**
     * Sets the postBuyFormDateRecv value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormDateRecv
     */
    public void setPostBuyFormDateRecv(java.lang.String postBuyFormDateRecv) {
        this.postBuyFormDateRecv = postBuyFormDateRecv;
    }


    /**
     * Gets the postBuyFormDateCancel value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormDateCancel
     */
    public java.lang.String getPostBuyFormDateCancel() {
        return postBuyFormDateCancel;
    }


    /**
     * Sets the postBuyFormDateCancel value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormDateCancel
     */
    public void setPostBuyFormDateCancel(java.lang.String postBuyFormDateCancel) {
        this.postBuyFormDateCancel = postBuyFormDateCancel;
    }


    /**
     * Gets the postBuyFormPaymentAmount value for this PostBuyFormForBuyersDataStruct.
     * 
     * @return postBuyFormPaymentAmount
     */
    public float getPostBuyFormPaymentAmount() {
        return postBuyFormPaymentAmount;
    }


    /**
     * Sets the postBuyFormPaymentAmount value for this PostBuyFormForBuyersDataStruct.
     * 
     * @param postBuyFormPaymentAmount
     */
    public void setPostBuyFormPaymentAmount(float postBuyFormPaymentAmount) {
        this.postBuyFormPaymentAmount = postBuyFormPaymentAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormForBuyersDataStruct)) return false;
        PostBuyFormForBuyersDataStruct other = (PostBuyFormForBuyersDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.postBuyFormId == other.getPostBuyFormId() &&
            this.postBuyFormBuyerId == other.getPostBuyFormBuyerId() &&
            ((this.postBuyFormSellers==null && other.getPostBuyFormSellers()==null) || 
             (this.postBuyFormSellers!=null &&
              this.postBuyFormSellers.equals(other.getPostBuyFormSellers()))) &&
            this.postBuyFormTotalAmount == other.getPostBuyFormTotalAmount() &&
            this.postBuyFormInvoiceOption == other.getPostBuyFormInvoiceOption() &&
            ((this.postBuyFormInvoiceData==null && other.getPostBuyFormInvoiceData()==null) || 
             (this.postBuyFormInvoiceData!=null &&
              this.postBuyFormInvoiceData.equals(other.getPostBuyFormInvoiceData()))) &&
            ((this.postBuyFormShipmentAddress==null && other.getPostBuyFormShipmentAddress()==null) || 
             (this.postBuyFormShipmentAddress!=null &&
              this.postBuyFormShipmentAddress.equals(other.getPostBuyFormShipmentAddress()))) &&
            ((this.postBuyFormPayType==null && other.getPostBuyFormPayType()==null) || 
             (this.postBuyFormPayType!=null &&
              this.postBuyFormPayType.equals(other.getPostBuyFormPayType()))) &&
            this.postBuyFormPayId == other.getPostBuyFormPayId() &&
            ((this.postBuyFormPayStatus==null && other.getPostBuyFormPayStatus()==null) || 
             (this.postBuyFormPayStatus!=null &&
              this.postBuyFormPayStatus.equals(other.getPostBuyFormPayStatus()))) &&
            ((this.postBuyFormDateInit==null && other.getPostBuyFormDateInit()==null) || 
             (this.postBuyFormDateInit!=null &&
              this.postBuyFormDateInit.equals(other.getPostBuyFormDateInit()))) &&
            ((this.postBuyFormDateRecv==null && other.getPostBuyFormDateRecv()==null) || 
             (this.postBuyFormDateRecv!=null &&
              this.postBuyFormDateRecv.equals(other.getPostBuyFormDateRecv()))) &&
            ((this.postBuyFormDateCancel==null && other.getPostBuyFormDateCancel()==null) || 
             (this.postBuyFormDateCancel!=null &&
              this.postBuyFormDateCancel.equals(other.getPostBuyFormDateCancel()))) &&
            this.postBuyFormPaymentAmount == other.getPostBuyFormPaymentAmount();
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
        _hashCode += new Long(getPostBuyFormId()).hashCode();
        _hashCode += getPostBuyFormBuyerId();
        if (getPostBuyFormSellers() != null) {
            _hashCode += getPostBuyFormSellers().hashCode();
        }
        _hashCode += new Float(getPostBuyFormTotalAmount()).hashCode();
        _hashCode += getPostBuyFormInvoiceOption();
        if (getPostBuyFormInvoiceData() != null) {
            _hashCode += getPostBuyFormInvoiceData().hashCode();
        }
        if (getPostBuyFormShipmentAddress() != null) {
            _hashCode += getPostBuyFormShipmentAddress().hashCode();
        }
        if (getPostBuyFormPayType() != null) {
            _hashCode += getPostBuyFormPayType().hashCode();
        }
        _hashCode += new Long(getPostBuyFormPayId()).hashCode();
        if (getPostBuyFormPayStatus() != null) {
            _hashCode += getPostBuyFormPayStatus().hashCode();
        }
        if (getPostBuyFormDateInit() != null) {
            _hashCode += getPostBuyFormDateInit().hashCode();
        }
        if (getPostBuyFormDateRecv() != null) {
            _hashCode += getPostBuyFormDateRecv().hashCode();
        }
        if (getPostBuyFormDateCancel() != null) {
            _hashCode += getPostBuyFormDateCancel().hashCode();
        }
        _hashCode += new Float(getPostBuyFormPaymentAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostBuyFormForBuyersDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormForBuyersDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormBuyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormBuyerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormSellers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormSellers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformsellersstruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormInvoiceOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormInvoiceOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormInvoiceData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormInvoiceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormAddressStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormShipmentAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormShipmentAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormAddressStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPayType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormPayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPayId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormPayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPayStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormPayStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormDateInit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormDateInit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormDateRecv");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormDateRecv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormDateCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormDateCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormPaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

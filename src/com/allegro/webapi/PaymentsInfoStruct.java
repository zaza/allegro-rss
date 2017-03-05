/**
 * PaymentsInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PaymentsInfoStruct  implements java.io.Serializable {
    private float paymentsBalance;

    private java.lang.String paymentsBankAccount;

    private com.allegro.webapi.PaymentsUserDataStruct paymentsUserData;

    private com.allegro.webapi.PaymentsPayoutStruct paymentsPayout;

    private int paymentsNotifications;

    public PaymentsInfoStruct() {
    }

    public PaymentsInfoStruct(
           float paymentsBalance,
           java.lang.String paymentsBankAccount,
           com.allegro.webapi.PaymentsUserDataStruct paymentsUserData,
           com.allegro.webapi.PaymentsPayoutStruct paymentsPayout,
           int paymentsNotifications) {
           this.paymentsBalance = paymentsBalance;
           this.paymentsBankAccount = paymentsBankAccount;
           this.paymentsUserData = paymentsUserData;
           this.paymentsPayout = paymentsPayout;
           this.paymentsNotifications = paymentsNotifications;
    }


    /**
     * Gets the paymentsBalance value for this PaymentsInfoStruct.
     * 
     * @return paymentsBalance
     */
    public float getPaymentsBalance() {
        return paymentsBalance;
    }


    /**
     * Sets the paymentsBalance value for this PaymentsInfoStruct.
     * 
     * @param paymentsBalance
     */
    public void setPaymentsBalance(float paymentsBalance) {
        this.paymentsBalance = paymentsBalance;
    }


    /**
     * Gets the paymentsBankAccount value for this PaymentsInfoStruct.
     * 
     * @return paymentsBankAccount
     */
    public java.lang.String getPaymentsBankAccount() {
        return paymentsBankAccount;
    }


    /**
     * Sets the paymentsBankAccount value for this PaymentsInfoStruct.
     * 
     * @param paymentsBankAccount
     */
    public void setPaymentsBankAccount(java.lang.String paymentsBankAccount) {
        this.paymentsBankAccount = paymentsBankAccount;
    }


    /**
     * Gets the paymentsUserData value for this PaymentsInfoStruct.
     * 
     * @return paymentsUserData
     */
    public com.allegro.webapi.PaymentsUserDataStruct getPaymentsUserData() {
        return paymentsUserData;
    }


    /**
     * Sets the paymentsUserData value for this PaymentsInfoStruct.
     * 
     * @param paymentsUserData
     */
    public void setPaymentsUserData(com.allegro.webapi.PaymentsUserDataStruct paymentsUserData) {
        this.paymentsUserData = paymentsUserData;
    }


    /**
     * Gets the paymentsPayout value for this PaymentsInfoStruct.
     * 
     * @return paymentsPayout
     */
    public com.allegro.webapi.PaymentsPayoutStruct getPaymentsPayout() {
        return paymentsPayout;
    }


    /**
     * Sets the paymentsPayout value for this PaymentsInfoStruct.
     * 
     * @param paymentsPayout
     */
    public void setPaymentsPayout(com.allegro.webapi.PaymentsPayoutStruct paymentsPayout) {
        this.paymentsPayout = paymentsPayout;
    }


    /**
     * Gets the paymentsNotifications value for this PaymentsInfoStruct.
     * 
     * @return paymentsNotifications
     */
    public int getPaymentsNotifications() {
        return paymentsNotifications;
    }


    /**
     * Sets the paymentsNotifications value for this PaymentsInfoStruct.
     * 
     * @param paymentsNotifications
     */
    public void setPaymentsNotifications(int paymentsNotifications) {
        this.paymentsNotifications = paymentsNotifications;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentsInfoStruct)) return false;
        PaymentsInfoStruct other = (PaymentsInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.paymentsBalance == other.getPaymentsBalance() &&
            ((this.paymentsBankAccount==null && other.getPaymentsBankAccount()==null) || 
             (this.paymentsBankAccount!=null &&
              this.paymentsBankAccount.equals(other.getPaymentsBankAccount()))) &&
            ((this.paymentsUserData==null && other.getPaymentsUserData()==null) || 
             (this.paymentsUserData!=null &&
              this.paymentsUserData.equals(other.getPaymentsUserData()))) &&
            ((this.paymentsPayout==null && other.getPaymentsPayout()==null) || 
             (this.paymentsPayout!=null &&
              this.paymentsPayout.equals(other.getPaymentsPayout()))) &&
            this.paymentsNotifications == other.getPaymentsNotifications();
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
        _hashCode += new Float(getPaymentsBalance()).hashCode();
        if (getPaymentsBankAccount() != null) {
            _hashCode += getPaymentsBankAccount().hashCode();
        }
        if (getPaymentsUserData() != null) {
            _hashCode += getPaymentsUserData().hashCode();
        }
        if (getPaymentsPayout() != null) {
            _hashCode += getPaymentsPayout().hashCode();
        }
        _hashCode += getPaymentsNotifications();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentsInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentsBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentsBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentsBankAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentsBankAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentsUserData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentsUserData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsUserDataStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentsPayout");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentsPayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsPayoutStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentsNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentsNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

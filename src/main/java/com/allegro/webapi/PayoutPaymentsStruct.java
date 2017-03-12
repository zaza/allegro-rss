/**
 * PayoutPaymentsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PayoutPaymentsStruct  implements java.io.Serializable {
    private long tranasctionId;

    private java.lang.String userName;

    private long userId;

    private float amount;

    private float transportAmount;

    private float totalAmount;

    private java.lang.String paidDate;

    public PayoutPaymentsStruct() {
    }

    public PayoutPaymentsStruct(
           long tranasctionId,
           java.lang.String userName,
           long userId,
           float amount,
           float transportAmount,
           float totalAmount,
           java.lang.String paidDate) {
           this.tranasctionId = tranasctionId;
           this.userName = userName;
           this.userId = userId;
           this.amount = amount;
           this.transportAmount = transportAmount;
           this.totalAmount = totalAmount;
           this.paidDate = paidDate;
    }


    /**
     * Gets the tranasctionId value for this PayoutPaymentsStruct.
     * 
     * @return tranasctionId
     */
    public long getTranasctionId() {
        return tranasctionId;
    }


    /**
     * Sets the tranasctionId value for this PayoutPaymentsStruct.
     * 
     * @param tranasctionId
     */
    public void setTranasctionId(long tranasctionId) {
        this.tranasctionId = tranasctionId;
    }


    /**
     * Gets the userName value for this PayoutPaymentsStruct.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this PayoutPaymentsStruct.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userId value for this PayoutPaymentsStruct.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this PayoutPaymentsStruct.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the amount value for this PayoutPaymentsStruct.
     * 
     * @return amount
     */
    public float getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PayoutPaymentsStruct.
     * 
     * @param amount
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }


    /**
     * Gets the transportAmount value for this PayoutPaymentsStruct.
     * 
     * @return transportAmount
     */
    public float getTransportAmount() {
        return transportAmount;
    }


    /**
     * Sets the transportAmount value for this PayoutPaymentsStruct.
     * 
     * @param transportAmount
     */
    public void setTransportAmount(float transportAmount) {
        this.transportAmount = transportAmount;
    }


    /**
     * Gets the totalAmount value for this PayoutPaymentsStruct.
     * 
     * @return totalAmount
     */
    public float getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this PayoutPaymentsStruct.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the paidDate value for this PayoutPaymentsStruct.
     * 
     * @return paidDate
     */
    public java.lang.String getPaidDate() {
        return paidDate;
    }


    /**
     * Sets the paidDate value for this PayoutPaymentsStruct.
     * 
     * @param paidDate
     */
    public void setPaidDate(java.lang.String paidDate) {
        this.paidDate = paidDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayoutPaymentsStruct)) return false;
        PayoutPaymentsStruct other = (PayoutPaymentsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.tranasctionId == other.getTranasctionId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            this.userId == other.getUserId() &&
            this.amount == other.getAmount() &&
            this.transportAmount == other.getTransportAmount() &&
            this.totalAmount == other.getTotalAmount() &&
            ((this.paidDate==null && other.getPaidDate()==null) || 
             (this.paidDate!=null &&
              this.paidDate.equals(other.getPaidDate())));
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
        _hashCode += new Long(getTranasctionId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        _hashCode += new Float(getAmount()).hashCode();
        _hashCode += new Float(getTransportAmount()).hashCode();
        _hashCode += new Float(getTotalAmount()).hashCode();
        if (getPaidDate() != null) {
            _hashCode += getPaidDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayoutPaymentsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutPaymentsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranasctionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "tranasctionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transportAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

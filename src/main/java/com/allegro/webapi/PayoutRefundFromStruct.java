/**
 * PayoutRefundFromStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PayoutRefundFromStruct  implements java.io.Serializable {
    private long tranasctionId;

    private long refundId;

    private java.lang.String refundReason;

    private long itemId;

    private long fromUserId;

    private float amount;

    private java.lang.String paidDate;

    public PayoutRefundFromStruct() {
    }

    public PayoutRefundFromStruct(
           long tranasctionId,
           long refundId,
           java.lang.String refundReason,
           long itemId,
           long fromUserId,
           float amount,
           java.lang.String paidDate) {
           this.tranasctionId = tranasctionId;
           this.refundId = refundId;
           this.refundReason = refundReason;
           this.itemId = itemId;
           this.fromUserId = fromUserId;
           this.amount = amount;
           this.paidDate = paidDate;
    }


    /**
     * Gets the tranasctionId value for this PayoutRefundFromStruct.
     * 
     * @return tranasctionId
     */
    public long getTranasctionId() {
        return tranasctionId;
    }


    /**
     * Sets the tranasctionId value for this PayoutRefundFromStruct.
     * 
     * @param tranasctionId
     */
    public void setTranasctionId(long tranasctionId) {
        this.tranasctionId = tranasctionId;
    }


    /**
     * Gets the refundId value for this PayoutRefundFromStruct.
     * 
     * @return refundId
     */
    public long getRefundId() {
        return refundId;
    }


    /**
     * Sets the refundId value for this PayoutRefundFromStruct.
     * 
     * @param refundId
     */
    public void setRefundId(long refundId) {
        this.refundId = refundId;
    }


    /**
     * Gets the refundReason value for this PayoutRefundFromStruct.
     * 
     * @return refundReason
     */
    public java.lang.String getRefundReason() {
        return refundReason;
    }


    /**
     * Sets the refundReason value for this PayoutRefundFromStruct.
     * 
     * @param refundReason
     */
    public void setRefundReason(java.lang.String refundReason) {
        this.refundReason = refundReason;
    }


    /**
     * Gets the itemId value for this PayoutRefundFromStruct.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this PayoutRefundFromStruct.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the fromUserId value for this PayoutRefundFromStruct.
     * 
     * @return fromUserId
     */
    public long getFromUserId() {
        return fromUserId;
    }


    /**
     * Sets the fromUserId value for this PayoutRefundFromStruct.
     * 
     * @param fromUserId
     */
    public void setFromUserId(long fromUserId) {
        this.fromUserId = fromUserId;
    }


    /**
     * Gets the amount value for this PayoutRefundFromStruct.
     * 
     * @return amount
     */
    public float getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PayoutRefundFromStruct.
     * 
     * @param amount
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }


    /**
     * Gets the paidDate value for this PayoutRefundFromStruct.
     * 
     * @return paidDate
     */
    public java.lang.String getPaidDate() {
        return paidDate;
    }


    /**
     * Sets the paidDate value for this PayoutRefundFromStruct.
     * 
     * @param paidDate
     */
    public void setPaidDate(java.lang.String paidDate) {
        this.paidDate = paidDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayoutRefundFromStruct)) return false;
        PayoutRefundFromStruct other = (PayoutRefundFromStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.tranasctionId == other.getTranasctionId() &&
            this.refundId == other.getRefundId() &&
            ((this.refundReason==null && other.getRefundReason()==null) || 
             (this.refundReason!=null &&
              this.refundReason.equals(other.getRefundReason()))) &&
            this.itemId == other.getItemId() &&
            this.fromUserId == other.getFromUserId() &&
            this.amount == other.getAmount() &&
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
        _hashCode += new Long(getRefundId()).hashCode();
        if (getRefundReason() != null) {
            _hashCode += getRefundReason().hashCode();
        }
        _hashCode += new Long(getItemId()).hashCode();
        _hashCode += new Long(getFromUserId()).hashCode();
        _hashCode += new Float(getAmount()).hashCode();
        if (getPaidDate() != null) {
            _hashCode += getPaidDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayoutRefundFromStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutRefundFromStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranasctionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "tranasctionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fromUserId"));
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

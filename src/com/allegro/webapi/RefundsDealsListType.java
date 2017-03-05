/**
 * RefundsDealsListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class RefundsDealsListType  implements java.io.Serializable {
    private long dealId;

    private java.util.Calendar dealDate;

    private int timeLeft;

    private int buyerId;

    private java.lang.String buyerLogin;

    private long itemId;

    private java.lang.String itemTitle;

    private int bidsCount;

    private java.lang.String quantityType;

    private java.lang.String paymentStatus;

    public RefundsDealsListType() {
    }

    public RefundsDealsListType(
           long dealId,
           java.util.Calendar dealDate,
           int timeLeft,
           int buyerId,
           java.lang.String buyerLogin,
           long itemId,
           java.lang.String itemTitle,
           int bidsCount,
           java.lang.String quantityType,
           java.lang.String paymentStatus) {
           this.dealId = dealId;
           this.dealDate = dealDate;
           this.timeLeft = timeLeft;
           this.buyerId = buyerId;
           this.buyerLogin = buyerLogin;
           this.itemId = itemId;
           this.itemTitle = itemTitle;
           this.bidsCount = bidsCount;
           this.quantityType = quantityType;
           this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the dealId value for this RefundsDealsListType.
     * 
     * @return dealId
     */
    public long getDealId() {
        return dealId;
    }


    /**
     * Sets the dealId value for this RefundsDealsListType.
     * 
     * @param dealId
     */
    public void setDealId(long dealId) {
        this.dealId = dealId;
    }


    /**
     * Gets the dealDate value for this RefundsDealsListType.
     * 
     * @return dealDate
     */
    public java.util.Calendar getDealDate() {
        return dealDate;
    }


    /**
     * Sets the dealDate value for this RefundsDealsListType.
     * 
     * @param dealDate
     */
    public void setDealDate(java.util.Calendar dealDate) {
        this.dealDate = dealDate;
    }


    /**
     * Gets the timeLeft value for this RefundsDealsListType.
     * 
     * @return timeLeft
     */
    public int getTimeLeft() {
        return timeLeft;
    }


    /**
     * Sets the timeLeft value for this RefundsDealsListType.
     * 
     * @param timeLeft
     */
    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }


    /**
     * Gets the buyerId value for this RefundsDealsListType.
     * 
     * @return buyerId
     */
    public int getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this RefundsDealsListType.
     * 
     * @param buyerId
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the buyerLogin value for this RefundsDealsListType.
     * 
     * @return buyerLogin
     */
    public java.lang.String getBuyerLogin() {
        return buyerLogin;
    }


    /**
     * Sets the buyerLogin value for this RefundsDealsListType.
     * 
     * @param buyerLogin
     */
    public void setBuyerLogin(java.lang.String buyerLogin) {
        this.buyerLogin = buyerLogin;
    }


    /**
     * Gets the itemId value for this RefundsDealsListType.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this RefundsDealsListType.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemTitle value for this RefundsDealsListType.
     * 
     * @return itemTitle
     */
    public java.lang.String getItemTitle() {
        return itemTitle;
    }


    /**
     * Sets the itemTitle value for this RefundsDealsListType.
     * 
     * @param itemTitle
     */
    public void setItemTitle(java.lang.String itemTitle) {
        this.itemTitle = itemTitle;
    }


    /**
     * Gets the bidsCount value for this RefundsDealsListType.
     * 
     * @return bidsCount
     */
    public int getBidsCount() {
        return bidsCount;
    }


    /**
     * Sets the bidsCount value for this RefundsDealsListType.
     * 
     * @param bidsCount
     */
    public void setBidsCount(int bidsCount) {
        this.bidsCount = bidsCount;
    }


    /**
     * Gets the quantityType value for this RefundsDealsListType.
     * 
     * @return quantityType
     */
    public java.lang.String getQuantityType() {
        return quantityType;
    }


    /**
     * Sets the quantityType value for this RefundsDealsListType.
     * 
     * @param quantityType
     */
    public void setQuantityType(java.lang.String quantityType) {
        this.quantityType = quantityType;
    }


    /**
     * Gets the paymentStatus value for this RefundsDealsListType.
     * 
     * @return paymentStatus
     */
    public java.lang.String getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this RefundsDealsListType.
     * 
     * @param paymentStatus
     */
    public void setPaymentStatus(java.lang.String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundsDealsListType)) return false;
        RefundsDealsListType other = (RefundsDealsListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dealId == other.getDealId() &&
            ((this.dealDate==null && other.getDealDate()==null) || 
             (this.dealDate!=null &&
              this.dealDate.equals(other.getDealDate()))) &&
            this.timeLeft == other.getTimeLeft() &&
            this.buyerId == other.getBuyerId() &&
            ((this.buyerLogin==null && other.getBuyerLogin()==null) || 
             (this.buyerLogin!=null &&
              this.buyerLogin.equals(other.getBuyerLogin()))) &&
            this.itemId == other.getItemId() &&
            ((this.itemTitle==null && other.getItemTitle()==null) || 
             (this.itemTitle!=null &&
              this.itemTitle.equals(other.getItemTitle()))) &&
            this.bidsCount == other.getBidsCount() &&
            ((this.quantityType==null && other.getQuantityType()==null) || 
             (this.quantityType!=null &&
              this.quantityType.equals(other.getQuantityType()))) &&
            ((this.paymentStatus==null && other.getPaymentStatus()==null) || 
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus())));
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
        _hashCode += new Long(getDealId()).hashCode();
        if (getDealDate() != null) {
            _hashCode += getDealDate().hashCode();
        }
        _hashCode += getTimeLeft();
        _hashCode += getBuyerId();
        if (getBuyerLogin() != null) {
            _hashCode += getBuyerLogin().hashCode();
        }
        _hashCode += new Long(getItemId()).hashCode();
        if (getItemTitle() != null) {
            _hashCode += getItemTitle().hashCode();
        }
        _hashCode += getBidsCount();
        if (getQuantityType() != null) {
            _hashCode += getQuantityType().hashCode();
        }
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefundsDealsListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundsDealsListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "dealId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "dealDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "timeLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "buyerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "buyerLogin"));
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
        elemField.setFieldName("itemTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "bidsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "quantityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentStatus"));
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

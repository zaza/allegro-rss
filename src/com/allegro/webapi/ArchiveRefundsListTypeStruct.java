/**
 * ArchiveRefundsListTypeStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ArchiveRefundsListTypeStruct  implements java.io.Serializable {
    private int refundId;

    private int buyerId;

    private java.lang.String buyerLogin;

    public ArchiveRefundsListTypeStruct() {
    }

    public ArchiveRefundsListTypeStruct(
           int refundId,
           int buyerId,
           java.lang.String buyerLogin) {
           this.refundId = refundId;
           this.buyerId = buyerId;
           this.buyerLogin = buyerLogin;
    }


    /**
     * Gets the refundId value for this ArchiveRefundsListTypeStruct.
     * 
     * @return refundId
     */
    public int getRefundId() {
        return refundId;
    }


    /**
     * Sets the refundId value for this ArchiveRefundsListTypeStruct.
     * 
     * @param refundId
     */
    public void setRefundId(int refundId) {
        this.refundId = refundId;
    }


    /**
     * Gets the buyerId value for this ArchiveRefundsListTypeStruct.
     * 
     * @return buyerId
     */
    public int getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this ArchiveRefundsListTypeStruct.
     * 
     * @param buyerId
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the buyerLogin value for this ArchiveRefundsListTypeStruct.
     * 
     * @return buyerLogin
     */
    public java.lang.String getBuyerLogin() {
        return buyerLogin;
    }


    /**
     * Sets the buyerLogin value for this ArchiveRefundsListTypeStruct.
     * 
     * @param buyerLogin
     */
    public void setBuyerLogin(java.lang.String buyerLogin) {
        this.buyerLogin = buyerLogin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchiveRefundsListTypeStruct)) return false;
        ArchiveRefundsListTypeStruct other = (ArchiveRefundsListTypeStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.refundId == other.getRefundId() &&
            this.buyerId == other.getBuyerId() &&
            ((this.buyerLogin==null && other.getBuyerLogin()==null) || 
             (this.buyerLogin!=null &&
              this.buyerLogin.equals(other.getBuyerLogin())));
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
        _hashCode += getRefundId();
        _hashCode += getBuyerId();
        if (getBuyerLogin() != null) {
            _hashCode += getBuyerLogin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchiveRefundsListTypeStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArchiveRefundsListTypeStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundId"));
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

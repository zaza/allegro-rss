/**
 * MessageToBuyerStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class MessageToBuyerStruct  implements java.io.Serializable {
    private int messageSellerId;

    private java.lang.String messageContent;

    public MessageToBuyerStruct() {
    }

    public MessageToBuyerStruct(
           int messageSellerId,
           java.lang.String messageContent) {
           this.messageSellerId = messageSellerId;
           this.messageContent = messageContent;
    }


    /**
     * Gets the messageSellerId value for this MessageToBuyerStruct.
     * 
     * @return messageSellerId
     */
    public int getMessageSellerId() {
        return messageSellerId;
    }


    /**
     * Sets the messageSellerId value for this MessageToBuyerStruct.
     * 
     * @param messageSellerId
     */
    public void setMessageSellerId(int messageSellerId) {
        this.messageSellerId = messageSellerId;
    }


    /**
     * Gets the messageContent value for this MessageToBuyerStruct.
     * 
     * @return messageContent
     */
    public java.lang.String getMessageContent() {
        return messageContent;
    }


    /**
     * Sets the messageContent value for this MessageToBuyerStruct.
     * 
     * @param messageContent
     */
    public void setMessageContent(java.lang.String messageContent) {
        this.messageContent = messageContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageToBuyerStruct)) return false;
        MessageToBuyerStruct other = (MessageToBuyerStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.messageSellerId == other.getMessageSellerId() &&
            ((this.messageContent==null && other.getMessageContent()==null) || 
             (this.messageContent!=null &&
              this.messageContent.equals(other.getMessageContent())));
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
        _hashCode += getMessageSellerId();
        if (getMessageContent() != null) {
            _hashCode += getMessageContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageToBuyerStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MessageToBuyerStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "messageSellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageContent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "messageContent"));
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

/**
 * DoSendEmailToUserRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoSendEmailToUserRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long mailToUserItemId;

    private long mailToUserReceiverId;

    private java.lang.Integer mailToUserSubjectId;

    private java.lang.Integer mailToUserOption;

    private java.lang.String mailToUserMessage;

    public DoSendEmailToUserRequest() {
    }

    public DoSendEmailToUserRequest(
           java.lang.String sessionHandle,
           long mailToUserItemId,
           long mailToUserReceiverId,
           java.lang.Integer mailToUserSubjectId,
           java.lang.Integer mailToUserOption,
           java.lang.String mailToUserMessage) {
           this.sessionHandle = sessionHandle;
           this.mailToUserItemId = mailToUserItemId;
           this.mailToUserReceiverId = mailToUserReceiverId;
           this.mailToUserSubjectId = mailToUserSubjectId;
           this.mailToUserOption = mailToUserOption;
           this.mailToUserMessage = mailToUserMessage;
    }


    /**
     * Gets the sessionHandle value for this DoSendEmailToUserRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoSendEmailToUserRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the mailToUserItemId value for this DoSendEmailToUserRequest.
     * 
     * @return mailToUserItemId
     */
    public long getMailToUserItemId() {
        return mailToUserItemId;
    }


    /**
     * Sets the mailToUserItemId value for this DoSendEmailToUserRequest.
     * 
     * @param mailToUserItemId
     */
    public void setMailToUserItemId(long mailToUserItemId) {
        this.mailToUserItemId = mailToUserItemId;
    }


    /**
     * Gets the mailToUserReceiverId value for this DoSendEmailToUserRequest.
     * 
     * @return mailToUserReceiverId
     */
    public long getMailToUserReceiverId() {
        return mailToUserReceiverId;
    }


    /**
     * Sets the mailToUserReceiverId value for this DoSendEmailToUserRequest.
     * 
     * @param mailToUserReceiverId
     */
    public void setMailToUserReceiverId(long mailToUserReceiverId) {
        this.mailToUserReceiverId = mailToUserReceiverId;
    }


    /**
     * Gets the mailToUserSubjectId value for this DoSendEmailToUserRequest.
     * 
     * @return mailToUserSubjectId
     */
    public java.lang.Integer getMailToUserSubjectId() {
        return mailToUserSubjectId;
    }


    /**
     * Sets the mailToUserSubjectId value for this DoSendEmailToUserRequest.
     * 
     * @param mailToUserSubjectId
     */
    public void setMailToUserSubjectId(java.lang.Integer mailToUserSubjectId) {
        this.mailToUserSubjectId = mailToUserSubjectId;
    }


    /**
     * Gets the mailToUserOption value for this DoSendEmailToUserRequest.
     * 
     * @return mailToUserOption
     */
    public java.lang.Integer getMailToUserOption() {
        return mailToUserOption;
    }


    /**
     * Sets the mailToUserOption value for this DoSendEmailToUserRequest.
     * 
     * @param mailToUserOption
     */
    public void setMailToUserOption(java.lang.Integer mailToUserOption) {
        this.mailToUserOption = mailToUserOption;
    }


    /**
     * Gets the mailToUserMessage value for this DoSendEmailToUserRequest.
     * 
     * @return mailToUserMessage
     */
    public java.lang.String getMailToUserMessage() {
        return mailToUserMessage;
    }


    /**
     * Sets the mailToUserMessage value for this DoSendEmailToUserRequest.
     * 
     * @param mailToUserMessage
     */
    public void setMailToUserMessage(java.lang.String mailToUserMessage) {
        this.mailToUserMessage = mailToUserMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSendEmailToUserRequest)) return false;
        DoSendEmailToUserRequest other = (DoSendEmailToUserRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            this.mailToUserItemId == other.getMailToUserItemId() &&
            this.mailToUserReceiverId == other.getMailToUserReceiverId() &&
            ((this.mailToUserSubjectId==null && other.getMailToUserSubjectId()==null) || 
             (this.mailToUserSubjectId!=null &&
              this.mailToUserSubjectId.equals(other.getMailToUserSubjectId()))) &&
            ((this.mailToUserOption==null && other.getMailToUserOption()==null) || 
             (this.mailToUserOption!=null &&
              this.mailToUserOption.equals(other.getMailToUserOption()))) &&
            ((this.mailToUserMessage==null && other.getMailToUserMessage()==null) || 
             (this.mailToUserMessage!=null &&
              this.mailToUserMessage.equals(other.getMailToUserMessage())));
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
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        _hashCode += new Long(getMailToUserItemId()).hashCode();
        _hashCode += new Long(getMailToUserReceiverId()).hashCode();
        if (getMailToUserSubjectId() != null) {
            _hashCode += getMailToUserSubjectId().hashCode();
        }
        if (getMailToUserOption() != null) {
            _hashCode += getMailToUserOption().hashCode();
        }
        if (getMailToUserMessage() != null) {
            _hashCode += getMailToUserMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSendEmailToUserRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailToUserItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "mailToUserItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailToUserReceiverId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "mailToUserReceiverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailToUserSubjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "mailToUserSubjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailToUserOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "mailToUserOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailToUserMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "mailToUserMessage"));
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

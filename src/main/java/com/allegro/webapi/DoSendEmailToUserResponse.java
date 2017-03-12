/**
 * DoSendEmailToUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoSendEmailToUserResponse  implements java.io.Serializable {
    private long mailToUserReceiverId;

    private java.lang.String mailToUserResult;

    public DoSendEmailToUserResponse() {
    }

    public DoSendEmailToUserResponse(
           long mailToUserReceiverId,
           java.lang.String mailToUserResult) {
           this.mailToUserReceiverId = mailToUserReceiverId;
           this.mailToUserResult = mailToUserResult;
    }


    /**
     * Gets the mailToUserReceiverId value for this DoSendEmailToUserResponse.
     * 
     * @return mailToUserReceiverId
     */
    public long getMailToUserReceiverId() {
        return mailToUserReceiverId;
    }


    /**
     * Sets the mailToUserReceiverId value for this DoSendEmailToUserResponse.
     * 
     * @param mailToUserReceiverId
     */
    public void setMailToUserReceiverId(long mailToUserReceiverId) {
        this.mailToUserReceiverId = mailToUserReceiverId;
    }


    /**
     * Gets the mailToUserResult value for this DoSendEmailToUserResponse.
     * 
     * @return mailToUserResult
     */
    public java.lang.String getMailToUserResult() {
        return mailToUserResult;
    }


    /**
     * Sets the mailToUserResult value for this DoSendEmailToUserResponse.
     * 
     * @param mailToUserResult
     */
    public void setMailToUserResult(java.lang.String mailToUserResult) {
        this.mailToUserResult = mailToUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSendEmailToUserResponse)) return false;
        DoSendEmailToUserResponse other = (DoSendEmailToUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.mailToUserReceiverId == other.getMailToUserReceiverId() &&
            ((this.mailToUserResult==null && other.getMailToUserResult()==null) || 
             (this.mailToUserResult!=null &&
              this.mailToUserResult.equals(other.getMailToUserResult())));
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
        _hashCode += new Long(getMailToUserReceiverId()).hashCode();
        if (getMailToUserResult() != null) {
            _hashCode += getMailToUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSendEmailToUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailToUserReceiverId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "mailToUserReceiverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailToUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "mailToUserResult"));
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

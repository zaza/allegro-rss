/**
 * DoLoginResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoLoginResponse  implements java.io.Serializable {
    private java.lang.String sessionHandlePart;

    private long userId;

    private long serverTime;

    public DoLoginResponse() {
    }

    public DoLoginResponse(
           java.lang.String sessionHandlePart,
           long userId,
           long serverTime) {
           this.sessionHandlePart = sessionHandlePart;
           this.userId = userId;
           this.serverTime = serverTime;
    }


    /**
     * Gets the sessionHandlePart value for this DoLoginResponse.
     * 
     * @return sessionHandlePart
     */
    public java.lang.String getSessionHandlePart() {
        return sessionHandlePart;
    }


    /**
     * Sets the sessionHandlePart value for this DoLoginResponse.
     * 
     * @param sessionHandlePart
     */
    public void setSessionHandlePart(java.lang.String sessionHandlePart) {
        this.sessionHandlePart = sessionHandlePart;
    }


    /**
     * Gets the userId value for this DoLoginResponse.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this DoLoginResponse.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the serverTime value for this DoLoginResponse.
     * 
     * @return serverTime
     */
    public long getServerTime() {
        return serverTime;
    }


    /**
     * Sets the serverTime value for this DoLoginResponse.
     * 
     * @param serverTime
     */
    public void setServerTime(long serverTime) {
        this.serverTime = serverTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoLoginResponse)) return false;
        DoLoginResponse other = (DoLoginResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandlePart==null && other.getSessionHandlePart()==null) || 
             (this.sessionHandlePart!=null &&
              this.sessionHandlePart.equals(other.getSessionHandlePart()))) &&
            this.userId == other.getUserId() &&
            this.serverTime == other.getServerTime();
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
        if (getSessionHandlePart() != null) {
            _hashCode += getSessionHandlePart().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        _hashCode += new Long(getServerTime()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoLoginResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandlePart");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandlePart"));
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
        elemField.setFieldName("serverTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "serverTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

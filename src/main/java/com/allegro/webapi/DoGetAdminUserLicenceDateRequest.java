/**
 * DoGetAdminUserLicenceDateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetAdminUserLicenceDateRequest  implements java.io.Serializable {
    private java.lang.String adminSessionHandle;

    private java.lang.String userLicLogin;

    public DoGetAdminUserLicenceDateRequest() {
    }

    public DoGetAdminUserLicenceDateRequest(
           java.lang.String adminSessionHandle,
           java.lang.String userLicLogin) {
           this.adminSessionHandle = adminSessionHandle;
           this.userLicLogin = userLicLogin;
    }


    /**
     * Gets the adminSessionHandle value for this DoGetAdminUserLicenceDateRequest.
     * 
     * @return adminSessionHandle
     */
    public java.lang.String getAdminSessionHandle() {
        return adminSessionHandle;
    }


    /**
     * Sets the adminSessionHandle value for this DoGetAdminUserLicenceDateRequest.
     * 
     * @param adminSessionHandle
     */
    public void setAdminSessionHandle(java.lang.String adminSessionHandle) {
        this.adminSessionHandle = adminSessionHandle;
    }


    /**
     * Gets the userLicLogin value for this DoGetAdminUserLicenceDateRequest.
     * 
     * @return userLicLogin
     */
    public java.lang.String getUserLicLogin() {
        return userLicLogin;
    }


    /**
     * Sets the userLicLogin value for this DoGetAdminUserLicenceDateRequest.
     * 
     * @param userLicLogin
     */
    public void setUserLicLogin(java.lang.String userLicLogin) {
        this.userLicLogin = userLicLogin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetAdminUserLicenceDateRequest)) return false;
        DoGetAdminUserLicenceDateRequest other = (DoGetAdminUserLicenceDateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adminSessionHandle==null && other.getAdminSessionHandle()==null) || 
             (this.adminSessionHandle!=null &&
              this.adminSessionHandle.equals(other.getAdminSessionHandle()))) &&
            ((this.userLicLogin==null && other.getUserLicLogin()==null) || 
             (this.userLicLogin!=null &&
              this.userLicLogin.equals(other.getUserLicLogin())));
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
        if (getAdminSessionHandle() != null) {
            _hashCode += getAdminSessionHandle().hashCode();
        }
        if (getUserLicLogin() != null) {
            _hashCode += getUserLicLogin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetAdminUserLicenceDateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetAdminUserLicenceDateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminSessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "adminSessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userLicLogin"));
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

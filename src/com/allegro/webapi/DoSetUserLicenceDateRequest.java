/**
 * DoSetUserLicenceDateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoSetUserLicenceDateRequest  implements java.io.Serializable {
    private java.lang.String adminSessionHandle;

    private java.lang.String userLicLogin;

    private int userLicCountry;

    private float userLicDate;

    public DoSetUserLicenceDateRequest() {
    }

    public DoSetUserLicenceDateRequest(
           java.lang.String adminSessionHandle,
           java.lang.String userLicLogin,
           int userLicCountry,
           float userLicDate) {
           this.adminSessionHandle = adminSessionHandle;
           this.userLicLogin = userLicLogin;
           this.userLicCountry = userLicCountry;
           this.userLicDate = userLicDate;
    }


    /**
     * Gets the adminSessionHandle value for this DoSetUserLicenceDateRequest.
     * 
     * @return adminSessionHandle
     */
    public java.lang.String getAdminSessionHandle() {
        return adminSessionHandle;
    }


    /**
     * Sets the adminSessionHandle value for this DoSetUserLicenceDateRequest.
     * 
     * @param adminSessionHandle
     */
    public void setAdminSessionHandle(java.lang.String adminSessionHandle) {
        this.adminSessionHandle = adminSessionHandle;
    }


    /**
     * Gets the userLicLogin value for this DoSetUserLicenceDateRequest.
     * 
     * @return userLicLogin
     */
    public java.lang.String getUserLicLogin() {
        return userLicLogin;
    }


    /**
     * Sets the userLicLogin value for this DoSetUserLicenceDateRequest.
     * 
     * @param userLicLogin
     */
    public void setUserLicLogin(java.lang.String userLicLogin) {
        this.userLicLogin = userLicLogin;
    }


    /**
     * Gets the userLicCountry value for this DoSetUserLicenceDateRequest.
     * 
     * @return userLicCountry
     */
    public int getUserLicCountry() {
        return userLicCountry;
    }


    /**
     * Sets the userLicCountry value for this DoSetUserLicenceDateRequest.
     * 
     * @param userLicCountry
     */
    public void setUserLicCountry(int userLicCountry) {
        this.userLicCountry = userLicCountry;
    }


    /**
     * Gets the userLicDate value for this DoSetUserLicenceDateRequest.
     * 
     * @return userLicDate
     */
    public float getUserLicDate() {
        return userLicDate;
    }


    /**
     * Sets the userLicDate value for this DoSetUserLicenceDateRequest.
     * 
     * @param userLicDate
     */
    public void setUserLicDate(float userLicDate) {
        this.userLicDate = userLicDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSetUserLicenceDateRequest)) return false;
        DoSetUserLicenceDateRequest other = (DoSetUserLicenceDateRequest) obj;
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
              this.userLicLogin.equals(other.getUserLicLogin()))) &&
            this.userLicCountry == other.getUserLicCountry() &&
            this.userLicDate == other.getUserLicDate();
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
        _hashCode += getUserLicCountry();
        _hashCode += new Float(getUserLicDate()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSetUserLicenceDateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetUserLicenceDateRequest"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userLicCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userLicDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

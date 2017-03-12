/**
 * DoGetUserIDRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetUserIDRequest  implements java.io.Serializable {
    private int countryId;

    private java.lang.String userLogin;

    private java.lang.String userEmail;

    private java.lang.String webapiKey;

    public DoGetUserIDRequest() {
    }

    public DoGetUserIDRequest(
           int countryId,
           java.lang.String userLogin,
           java.lang.String userEmail,
           java.lang.String webapiKey) {
           this.countryId = countryId;
           this.userLogin = userLogin;
           this.userEmail = userEmail;
           this.webapiKey = webapiKey;
    }


    /**
     * Gets the countryId value for this DoGetUserIDRequest.
     * 
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this DoGetUserIDRequest.
     * 
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the userLogin value for this DoGetUserIDRequest.
     * 
     * @return userLogin
     */
    public java.lang.String getUserLogin() {
        return userLogin;
    }


    /**
     * Sets the userLogin value for this DoGetUserIDRequest.
     * 
     * @param userLogin
     */
    public void setUserLogin(java.lang.String userLogin) {
        this.userLogin = userLogin;
    }


    /**
     * Gets the userEmail value for this DoGetUserIDRequest.
     * 
     * @return userEmail
     */
    public java.lang.String getUserEmail() {
        return userEmail;
    }


    /**
     * Sets the userEmail value for this DoGetUserIDRequest.
     * 
     * @param userEmail
     */
    public void setUserEmail(java.lang.String userEmail) {
        this.userEmail = userEmail;
    }


    /**
     * Gets the webapiKey value for this DoGetUserIDRequest.
     * 
     * @return webapiKey
     */
    public java.lang.String getWebapiKey() {
        return webapiKey;
    }


    /**
     * Sets the webapiKey value for this DoGetUserIDRequest.
     * 
     * @param webapiKey
     */
    public void setWebapiKey(java.lang.String webapiKey) {
        this.webapiKey = webapiKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetUserIDRequest)) return false;
        DoGetUserIDRequest other = (DoGetUserIDRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.countryId == other.getCountryId() &&
            ((this.userLogin==null && other.getUserLogin()==null) || 
             (this.userLogin!=null &&
              this.userLogin.equals(other.getUserLogin()))) &&
            ((this.userEmail==null && other.getUserEmail()==null) || 
             (this.userEmail!=null &&
              this.userEmail.equals(other.getUserEmail()))) &&
            ((this.webapiKey==null && other.getWebapiKey()==null) || 
             (this.webapiKey!=null &&
              this.webapiKey.equals(other.getWebapiKey())));
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
        _hashCode += getCountryId();
        if (getUserLogin() != null) {
            _hashCode += getUserLogin().hashCode();
        }
        if (getUserEmail() != null) {
            _hashCode += getUserEmail().hashCode();
        }
        if (getWebapiKey() != null) {
            _hashCode += getWebapiKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetUserIDRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webapiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "webapiKey"));
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

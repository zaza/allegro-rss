/**
 * UserPostBuyDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class UserPostBuyDataStruct  implements java.io.Serializable {
    private com.allegro.webapi.UserDataStruct userData;

    private com.allegro.webapi.UserSentToDataStruct userSentToData;

    private com.allegro.webapi.ArrayOfString userBankAccounts;

    private com.allegro.webapi.CompanySecondAddressStruct companySecondAddress;

    public UserPostBuyDataStruct() {
    }

    public UserPostBuyDataStruct(
           com.allegro.webapi.UserDataStruct userData,
           com.allegro.webapi.UserSentToDataStruct userSentToData,
           com.allegro.webapi.ArrayOfString userBankAccounts,
           com.allegro.webapi.CompanySecondAddressStruct companySecondAddress) {
           this.userData = userData;
           this.userSentToData = userSentToData;
           this.userBankAccounts = userBankAccounts;
           this.companySecondAddress = companySecondAddress;
    }


    /**
     * Gets the userData value for this UserPostBuyDataStruct.
     * 
     * @return userData
     */
    public com.allegro.webapi.UserDataStruct getUserData() {
        return userData;
    }


    /**
     * Sets the userData value for this UserPostBuyDataStruct.
     * 
     * @param userData
     */
    public void setUserData(com.allegro.webapi.UserDataStruct userData) {
        this.userData = userData;
    }


    /**
     * Gets the userSentToData value for this UserPostBuyDataStruct.
     * 
     * @return userSentToData
     */
    public com.allegro.webapi.UserSentToDataStruct getUserSentToData() {
        return userSentToData;
    }


    /**
     * Sets the userSentToData value for this UserPostBuyDataStruct.
     * 
     * @param userSentToData
     */
    public void setUserSentToData(com.allegro.webapi.UserSentToDataStruct userSentToData) {
        this.userSentToData = userSentToData;
    }


    /**
     * Gets the userBankAccounts value for this UserPostBuyDataStruct.
     * 
     * @return userBankAccounts
     */
    public com.allegro.webapi.ArrayOfString getUserBankAccounts() {
        return userBankAccounts;
    }


    /**
     * Sets the userBankAccounts value for this UserPostBuyDataStruct.
     * 
     * @param userBankAccounts
     */
    public void setUserBankAccounts(com.allegro.webapi.ArrayOfString userBankAccounts) {
        this.userBankAccounts = userBankAccounts;
    }


    /**
     * Gets the companySecondAddress value for this UserPostBuyDataStruct.
     * 
     * @return companySecondAddress
     */
    public com.allegro.webapi.CompanySecondAddressStruct getCompanySecondAddress() {
        return companySecondAddress;
    }


    /**
     * Sets the companySecondAddress value for this UserPostBuyDataStruct.
     * 
     * @param companySecondAddress
     */
    public void setCompanySecondAddress(com.allegro.webapi.CompanySecondAddressStruct companySecondAddress) {
        this.companySecondAddress = companySecondAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPostBuyDataStruct)) return false;
        UserPostBuyDataStruct other = (UserPostBuyDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userData==null && other.getUserData()==null) || 
             (this.userData!=null &&
              this.userData.equals(other.getUserData()))) &&
            ((this.userSentToData==null && other.getUserSentToData()==null) || 
             (this.userSentToData!=null &&
              this.userSentToData.equals(other.getUserSentToData()))) &&
            ((this.userBankAccounts==null && other.getUserBankAccounts()==null) || 
             (this.userBankAccounts!=null &&
              this.userBankAccounts.equals(other.getUserBankAccounts()))) &&
            ((this.companySecondAddress==null && other.getCompanySecondAddress()==null) || 
             (this.companySecondAddress!=null &&
              this.companySecondAddress.equals(other.getCompanySecondAddress())));
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
        if (getUserData() != null) {
            _hashCode += getUserData().hashCode();
        }
        if (getUserSentToData() != null) {
            _hashCode += getUserSentToData().hashCode();
        }
        if (getUserBankAccounts() != null) {
            _hashCode += getUserBankAccounts().hashCode();
        }
        if (getCompanySecondAddress() != null) {
            _hashCode += getCompanySecondAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserPostBuyDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPostBuyDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserDataStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSentToData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userSentToData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserSentToDataStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userBankAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userBankAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companySecondAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "companySecondAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanySecondAddressStruct"));
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

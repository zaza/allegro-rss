/**
 * PaymentsUserDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PaymentsUserDataStruct  implements java.io.Serializable {
    private java.lang.String userFullName;

    private java.lang.String userAddress;

    private java.lang.String userPostcode;

    private java.lang.String userCity;

    private int userCountry;

    private java.lang.String userPhone;

    public PaymentsUserDataStruct() {
    }

    public PaymentsUserDataStruct(
           java.lang.String userFullName,
           java.lang.String userAddress,
           java.lang.String userPostcode,
           java.lang.String userCity,
           int userCountry,
           java.lang.String userPhone) {
           this.userFullName = userFullName;
           this.userAddress = userAddress;
           this.userPostcode = userPostcode;
           this.userCity = userCity;
           this.userCountry = userCountry;
           this.userPhone = userPhone;
    }


    /**
     * Gets the userFullName value for this PaymentsUserDataStruct.
     * 
     * @return userFullName
     */
    public java.lang.String getUserFullName() {
        return userFullName;
    }


    /**
     * Sets the userFullName value for this PaymentsUserDataStruct.
     * 
     * @param userFullName
     */
    public void setUserFullName(java.lang.String userFullName) {
        this.userFullName = userFullName;
    }


    /**
     * Gets the userAddress value for this PaymentsUserDataStruct.
     * 
     * @return userAddress
     */
    public java.lang.String getUserAddress() {
        return userAddress;
    }


    /**
     * Sets the userAddress value for this PaymentsUserDataStruct.
     * 
     * @param userAddress
     */
    public void setUserAddress(java.lang.String userAddress) {
        this.userAddress = userAddress;
    }


    /**
     * Gets the userPostcode value for this PaymentsUserDataStruct.
     * 
     * @return userPostcode
     */
    public java.lang.String getUserPostcode() {
        return userPostcode;
    }


    /**
     * Sets the userPostcode value for this PaymentsUserDataStruct.
     * 
     * @param userPostcode
     */
    public void setUserPostcode(java.lang.String userPostcode) {
        this.userPostcode = userPostcode;
    }


    /**
     * Gets the userCity value for this PaymentsUserDataStruct.
     * 
     * @return userCity
     */
    public java.lang.String getUserCity() {
        return userCity;
    }


    /**
     * Sets the userCity value for this PaymentsUserDataStruct.
     * 
     * @param userCity
     */
    public void setUserCity(java.lang.String userCity) {
        this.userCity = userCity;
    }


    /**
     * Gets the userCountry value for this PaymentsUserDataStruct.
     * 
     * @return userCountry
     */
    public int getUserCountry() {
        return userCountry;
    }


    /**
     * Sets the userCountry value for this PaymentsUserDataStruct.
     * 
     * @param userCountry
     */
    public void setUserCountry(int userCountry) {
        this.userCountry = userCountry;
    }


    /**
     * Gets the userPhone value for this PaymentsUserDataStruct.
     * 
     * @return userPhone
     */
    public java.lang.String getUserPhone() {
        return userPhone;
    }


    /**
     * Sets the userPhone value for this PaymentsUserDataStruct.
     * 
     * @param userPhone
     */
    public void setUserPhone(java.lang.String userPhone) {
        this.userPhone = userPhone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentsUserDataStruct)) return false;
        PaymentsUserDataStruct other = (PaymentsUserDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userFullName==null && other.getUserFullName()==null) || 
             (this.userFullName!=null &&
              this.userFullName.equals(other.getUserFullName()))) &&
            ((this.userAddress==null && other.getUserAddress()==null) || 
             (this.userAddress!=null &&
              this.userAddress.equals(other.getUserAddress()))) &&
            ((this.userPostcode==null && other.getUserPostcode()==null) || 
             (this.userPostcode!=null &&
              this.userPostcode.equals(other.getUserPostcode()))) &&
            ((this.userCity==null && other.getUserCity()==null) || 
             (this.userCity!=null &&
              this.userCity.equals(other.getUserCity()))) &&
            this.userCountry == other.getUserCountry() &&
            ((this.userPhone==null && other.getUserPhone()==null) || 
             (this.userPhone!=null &&
              this.userPhone.equals(other.getUserPhone())));
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
        if (getUserFullName() != null) {
            _hashCode += getUserFullName().hashCode();
        }
        if (getUserAddress() != null) {
            _hashCode += getUserAddress().hashCode();
        }
        if (getUserPostcode() != null) {
            _hashCode += getUserPostcode().hashCode();
        }
        if (getUserCity() != null) {
            _hashCode += getUserCity().hashCode();
        }
        _hashCode += getUserCountry();
        if (getUserPhone() != null) {
            _hashCode += getUserPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentsUserDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsUserDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPostcode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userPostcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userPhone"));
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

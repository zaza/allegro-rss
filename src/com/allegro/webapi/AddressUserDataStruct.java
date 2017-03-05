/**
 * AddressUserDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class AddressUserDataStruct  implements java.io.Serializable {
    private java.lang.String userCompany;

    private java.lang.String userFullName;

    private java.lang.String userAddress;

    private java.lang.String userPostcode;

    private java.lang.String userCity;

    public AddressUserDataStruct() {
    }

    public AddressUserDataStruct(
           java.lang.String userCompany,
           java.lang.String userFullName,
           java.lang.String userAddress,
           java.lang.String userPostcode,
           java.lang.String userCity) {
           this.userCompany = userCompany;
           this.userFullName = userFullName;
           this.userAddress = userAddress;
           this.userPostcode = userPostcode;
           this.userCity = userCity;
    }


    /**
     * Gets the userCompany value for this AddressUserDataStruct.
     * 
     * @return userCompany
     */
    public java.lang.String getUserCompany() {
        return userCompany;
    }


    /**
     * Sets the userCompany value for this AddressUserDataStruct.
     * 
     * @param userCompany
     */
    public void setUserCompany(java.lang.String userCompany) {
        this.userCompany = userCompany;
    }


    /**
     * Gets the userFullName value for this AddressUserDataStruct.
     * 
     * @return userFullName
     */
    public java.lang.String getUserFullName() {
        return userFullName;
    }


    /**
     * Sets the userFullName value for this AddressUserDataStruct.
     * 
     * @param userFullName
     */
    public void setUserFullName(java.lang.String userFullName) {
        this.userFullName = userFullName;
    }


    /**
     * Gets the userAddress value for this AddressUserDataStruct.
     * 
     * @return userAddress
     */
    public java.lang.String getUserAddress() {
        return userAddress;
    }


    /**
     * Sets the userAddress value for this AddressUserDataStruct.
     * 
     * @param userAddress
     */
    public void setUserAddress(java.lang.String userAddress) {
        this.userAddress = userAddress;
    }


    /**
     * Gets the userPostcode value for this AddressUserDataStruct.
     * 
     * @return userPostcode
     */
    public java.lang.String getUserPostcode() {
        return userPostcode;
    }


    /**
     * Sets the userPostcode value for this AddressUserDataStruct.
     * 
     * @param userPostcode
     */
    public void setUserPostcode(java.lang.String userPostcode) {
        this.userPostcode = userPostcode;
    }


    /**
     * Gets the userCity value for this AddressUserDataStruct.
     * 
     * @return userCity
     */
    public java.lang.String getUserCity() {
        return userCity;
    }


    /**
     * Sets the userCity value for this AddressUserDataStruct.
     * 
     * @param userCity
     */
    public void setUserCity(java.lang.String userCity) {
        this.userCity = userCity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressUserDataStruct)) return false;
        AddressUserDataStruct other = (AddressUserDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userCompany==null && other.getUserCompany()==null) || 
             (this.userCompany!=null &&
              this.userCompany.equals(other.getUserCompany()))) &&
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
              this.userCity.equals(other.getUserCity())));
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
        if (getUserCompany() != null) {
            _hashCode += getUserCompany().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressUserDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressUserDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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

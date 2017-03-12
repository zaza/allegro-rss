/**
 * DoGetBlackListUsersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetBlackListUsersResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfBlackliststruct blackListUsers;

    public DoGetBlackListUsersResponse() {
    }

    public DoGetBlackListUsersResponse(
           com.allegro.webapi.ArrayOfBlackliststruct blackListUsers) {
           this.blackListUsers = blackListUsers;
    }


    /**
     * Gets the blackListUsers value for this DoGetBlackListUsersResponse.
     * 
     * @return blackListUsers
     */
    public com.allegro.webapi.ArrayOfBlackliststruct getBlackListUsers() {
        return blackListUsers;
    }


    /**
     * Sets the blackListUsers value for this DoGetBlackListUsersResponse.
     * 
     * @param blackListUsers
     */
    public void setBlackListUsers(com.allegro.webapi.ArrayOfBlackliststruct blackListUsers) {
        this.blackListUsers = blackListUsers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetBlackListUsersResponse)) return false;
        DoGetBlackListUsersResponse other = (DoGetBlackListUsersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blackListUsers==null && other.getBlackListUsers()==null) || 
             (this.blackListUsers!=null &&
              this.blackListUsers.equals(other.getBlackListUsers())));
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
        if (getBlackListUsers() != null) {
            _hashCode += getBlackListUsers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetBlackListUsersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blackListUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "blackListUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlackliststruct"));
        elemField.setMinOccurs(0);
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

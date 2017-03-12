/**
 * DoMyAccount2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoMyAccount2Response  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfMyaccountstruct2 myaccountList;

    public DoMyAccount2Response() {
    }

    public DoMyAccount2Response(
           com.allegro.webapi.ArrayOfMyaccountstruct2 myaccountList) {
           this.myaccountList = myaccountList;
    }


    /**
     * Gets the myaccountList value for this DoMyAccount2Response.
     * 
     * @return myaccountList
     */
    public com.allegro.webapi.ArrayOfMyaccountstruct2 getMyaccountList() {
        return myaccountList;
    }


    /**
     * Sets the myaccountList value for this DoMyAccount2Response.
     * 
     * @param myaccountList
     */
    public void setMyaccountList(com.allegro.webapi.ArrayOfMyaccountstruct2 myaccountList) {
        this.myaccountList = myaccountList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoMyAccount2Response)) return false;
        DoMyAccount2Response other = (DoMyAccount2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.myaccountList==null && other.getMyaccountList()==null) || 
             (this.myaccountList!=null &&
              this.myaccountList.equals(other.getMyaccountList())));
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
        if (getMyaccountList() != null) {
            _hashCode += getMyaccountList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoMyAccount2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myaccountList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "myaccountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyaccountstruct2"));
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

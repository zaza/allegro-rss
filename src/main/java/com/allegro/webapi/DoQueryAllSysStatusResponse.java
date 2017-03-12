/**
 * DoQueryAllSysStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoQueryAllSysStatusResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfSysstatustype sysCountryStatus;

    public DoQueryAllSysStatusResponse() {
    }

    public DoQueryAllSysStatusResponse(
           com.allegro.webapi.ArrayOfSysstatustype sysCountryStatus) {
           this.sysCountryStatus = sysCountryStatus;
    }


    /**
     * Gets the sysCountryStatus value for this DoQueryAllSysStatusResponse.
     * 
     * @return sysCountryStatus
     */
    public com.allegro.webapi.ArrayOfSysstatustype getSysCountryStatus() {
        return sysCountryStatus;
    }


    /**
     * Sets the sysCountryStatus value for this DoQueryAllSysStatusResponse.
     * 
     * @param sysCountryStatus
     */
    public void setSysCountryStatus(com.allegro.webapi.ArrayOfSysstatustype sysCountryStatus) {
        this.sysCountryStatus = sysCountryStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAllSysStatusResponse)) return false;
        DoQueryAllSysStatusResponse other = (DoQueryAllSysStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sysCountryStatus==null && other.getSysCountryStatus()==null) || 
             (this.sysCountryStatus!=null &&
              this.sysCountryStatus.equals(other.getSysCountryStatus())));
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
        if (getSysCountryStatus() != null) {
            _hashCode += getSysCountryStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryAllSysStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysCountryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sysCountryStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSysstatustype"));
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

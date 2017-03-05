/**
 * DoGetShipmentDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetShipmentDataResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfShipmentdatastruct shipmentDataList;

    private long localVersion;

    public DoGetShipmentDataResponse() {
    }

    public DoGetShipmentDataResponse(
           com.allegro.webapi.ArrayOfShipmentdatastruct shipmentDataList,
           long localVersion) {
           this.shipmentDataList = shipmentDataList;
           this.localVersion = localVersion;
    }


    /**
     * Gets the shipmentDataList value for this DoGetShipmentDataResponse.
     * 
     * @return shipmentDataList
     */
    public com.allegro.webapi.ArrayOfShipmentdatastruct getShipmentDataList() {
        return shipmentDataList;
    }


    /**
     * Sets the shipmentDataList value for this DoGetShipmentDataResponse.
     * 
     * @param shipmentDataList
     */
    public void setShipmentDataList(com.allegro.webapi.ArrayOfShipmentdatastruct shipmentDataList) {
        this.shipmentDataList = shipmentDataList;
    }


    /**
     * Gets the localVersion value for this DoGetShipmentDataResponse.
     * 
     * @return localVersion
     */
    public long getLocalVersion() {
        return localVersion;
    }


    /**
     * Sets the localVersion value for this DoGetShipmentDataResponse.
     * 
     * @param localVersion
     */
    public void setLocalVersion(long localVersion) {
        this.localVersion = localVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetShipmentDataResponse)) return false;
        DoGetShipmentDataResponse other = (DoGetShipmentDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentDataList==null && other.getShipmentDataList()==null) || 
             (this.shipmentDataList!=null &&
              this.shipmentDataList.equals(other.getShipmentDataList()))) &&
            this.localVersion == other.getLocalVersion();
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
        if (getShipmentDataList() != null) {
            _hashCode += getShipmentDataList().hashCode();
        }
        _hashCode += new Long(getLocalVersion()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetShipmentDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentdatastruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "localVersion"));
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

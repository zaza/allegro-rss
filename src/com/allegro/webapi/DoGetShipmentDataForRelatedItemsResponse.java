/**
 * DoGetShipmentDataForRelatedItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetShipmentDataForRelatedItemsResponse  implements java.io.Serializable {
    private com.allegro.webapi.RelatedItemsShipmentDataStruct relatedItemsShipmentData;

    public DoGetShipmentDataForRelatedItemsResponse() {
    }

    public DoGetShipmentDataForRelatedItemsResponse(
           com.allegro.webapi.RelatedItemsShipmentDataStruct relatedItemsShipmentData) {
           this.relatedItemsShipmentData = relatedItemsShipmentData;
    }


    /**
     * Gets the relatedItemsShipmentData value for this DoGetShipmentDataForRelatedItemsResponse.
     * 
     * @return relatedItemsShipmentData
     */
    public com.allegro.webapi.RelatedItemsShipmentDataStruct getRelatedItemsShipmentData() {
        return relatedItemsShipmentData;
    }


    /**
     * Sets the relatedItemsShipmentData value for this DoGetShipmentDataForRelatedItemsResponse.
     * 
     * @param relatedItemsShipmentData
     */
    public void setRelatedItemsShipmentData(com.allegro.webapi.RelatedItemsShipmentDataStruct relatedItemsShipmentData) {
        this.relatedItemsShipmentData = relatedItemsShipmentData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetShipmentDataForRelatedItemsResponse)) return false;
        DoGetShipmentDataForRelatedItemsResponse other = (DoGetShipmentDataForRelatedItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relatedItemsShipmentData==null && other.getRelatedItemsShipmentData()==null) || 
             (this.relatedItemsShipmentData!=null &&
              this.relatedItemsShipmentData.equals(other.getRelatedItemsShipmentData())));
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
        if (getRelatedItemsShipmentData() != null) {
            _hashCode += getRelatedItemsShipmentData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetShipmentDataForRelatedItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataForRelatedItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemsShipmentData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "relatedItemsShipmentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemsShipmentDataStruct"));
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

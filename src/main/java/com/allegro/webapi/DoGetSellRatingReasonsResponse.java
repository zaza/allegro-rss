/**
 * DoGetSellRatingReasonsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetSellRatingReasonsResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfSellratinginfostruct sellRatingInfo;

    public DoGetSellRatingReasonsResponse() {
    }

    public DoGetSellRatingReasonsResponse(
           com.allegro.webapi.ArrayOfSellratinginfostruct sellRatingInfo) {
           this.sellRatingInfo = sellRatingInfo;
    }


    /**
     * Gets the sellRatingInfo value for this DoGetSellRatingReasonsResponse.
     * 
     * @return sellRatingInfo
     */
    public com.allegro.webapi.ArrayOfSellratinginfostruct getSellRatingInfo() {
        return sellRatingInfo;
    }


    /**
     * Sets the sellRatingInfo value for this DoGetSellRatingReasonsResponse.
     * 
     * @param sellRatingInfo
     */
    public void setSellRatingInfo(com.allegro.webapi.ArrayOfSellratinginfostruct sellRatingInfo) {
        this.sellRatingInfo = sellRatingInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSellRatingReasonsResponse)) return false;
        DoGetSellRatingReasonsResponse other = (DoGetSellRatingReasonsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellRatingInfo==null && other.getSellRatingInfo()==null) || 
             (this.sellRatingInfo!=null &&
              this.sellRatingInfo.equals(other.getSellRatingInfo())));
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
        if (getSellRatingInfo() != null) {
            _hashCode += getSellRatingInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSellRatingReasonsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellRatingReasonsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratinginfostruct"));
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

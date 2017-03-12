/**
 * DoGetPostBuyDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetPostBuyDataResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfItempostbuydatastruct itemsPostBuyData;

    public DoGetPostBuyDataResponse() {
    }

    public DoGetPostBuyDataResponse(
           com.allegro.webapi.ArrayOfItempostbuydatastruct itemsPostBuyData) {
           this.itemsPostBuyData = itemsPostBuyData;
    }


    /**
     * Gets the itemsPostBuyData value for this DoGetPostBuyDataResponse.
     * 
     * @return itemsPostBuyData
     */
    public com.allegro.webapi.ArrayOfItempostbuydatastruct getItemsPostBuyData() {
        return itemsPostBuyData;
    }


    /**
     * Sets the itemsPostBuyData value for this DoGetPostBuyDataResponse.
     * 
     * @param itemsPostBuyData
     */
    public void setItemsPostBuyData(com.allegro.webapi.ArrayOfItempostbuydatastruct itemsPostBuyData) {
        this.itemsPostBuyData = itemsPostBuyData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetPostBuyDataResponse)) return false;
        DoGetPostBuyDataResponse other = (DoGetPostBuyDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemsPostBuyData==null && other.getItemsPostBuyData()==null) || 
             (this.itemsPostBuyData!=null &&
              this.itemsPostBuyData.equals(other.getItemsPostBuyData())));
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
        if (getItemsPostBuyData() != null) {
            _hashCode += getItemsPostBuyData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetPostBuyDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsPostBuyData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsPostBuyData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempostbuydatastruct"));
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

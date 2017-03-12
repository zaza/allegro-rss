/**
 * DoGetItemTemplatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetItemTemplatesResponse  implements java.io.Serializable {
    private com.allegro.webapi.ItemTemplatesStruct itemTemplates;

    public DoGetItemTemplatesResponse() {
    }

    public DoGetItemTemplatesResponse(
           com.allegro.webapi.ItemTemplatesStruct itemTemplates) {
           this.itemTemplates = itemTemplates;
    }


    /**
     * Gets the itemTemplates value for this DoGetItemTemplatesResponse.
     * 
     * @return itemTemplates
     */
    public com.allegro.webapi.ItemTemplatesStruct getItemTemplates() {
        return itemTemplates;
    }


    /**
     * Sets the itemTemplates value for this DoGetItemTemplatesResponse.
     * 
     * @param itemTemplates
     */
    public void setItemTemplates(com.allegro.webapi.ItemTemplatesStruct itemTemplates) {
        this.itemTemplates = itemTemplates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetItemTemplatesResponse)) return false;
        DoGetItemTemplatesResponse other = (DoGetItemTemplatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemTemplates==null && other.getItemTemplates()==null) || 
             (this.itemTemplates!=null &&
              this.itemTemplates.equals(other.getItemTemplates())));
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
        if (getItemTemplates() != null) {
            _hashCode += getItemTemplates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetItemTemplatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemTemplatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplatesStruct"));
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

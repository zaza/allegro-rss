/**
 * DoRemoveItemTemplatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoRemoveItemTemplatesResponse  implements java.io.Serializable {
    private com.allegro.webapi.RemovedItemTemplatesStruct removedItemTemplates;

    public DoRemoveItemTemplatesResponse() {
    }

    public DoRemoveItemTemplatesResponse(
           com.allegro.webapi.RemovedItemTemplatesStruct removedItemTemplates) {
           this.removedItemTemplates = removedItemTemplates;
    }


    /**
     * Gets the removedItemTemplates value for this DoRemoveItemTemplatesResponse.
     * 
     * @return removedItemTemplates
     */
    public com.allegro.webapi.RemovedItemTemplatesStruct getRemovedItemTemplates() {
        return removedItemTemplates;
    }


    /**
     * Sets the removedItemTemplates value for this DoRemoveItemTemplatesResponse.
     * 
     * @param removedItemTemplates
     */
    public void setRemovedItemTemplates(com.allegro.webapi.RemovedItemTemplatesStruct removedItemTemplates) {
        this.removedItemTemplates = removedItemTemplates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRemoveItemTemplatesResponse)) return false;
        DoRemoveItemTemplatesResponse other = (DoRemoveItemTemplatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removedItemTemplates==null && other.getRemovedItemTemplates()==null) || 
             (this.removedItemTemplates!=null &&
              this.removedItemTemplates.equals(other.getRemovedItemTemplates())));
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
        if (getRemovedItemTemplates() != null) {
            _hashCode += getRemovedItemTemplates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoRemoveItemTemplatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveItemTemplatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedItemTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "removedItemTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RemovedItemTemplatesStruct"));
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

/**
 * RemovedItemTemplatesStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class RemovedItemTemplatesStruct  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfInt itemTemplateIds;

    private com.allegro.webapi.ArrayOfInt itemTemplateIncorrectIds;

    public RemovedItemTemplatesStruct() {
    }

    public RemovedItemTemplatesStruct(
           com.allegro.webapi.ArrayOfInt itemTemplateIds,
           com.allegro.webapi.ArrayOfInt itemTemplateIncorrectIds) {
           this.itemTemplateIds = itemTemplateIds;
           this.itemTemplateIncorrectIds = itemTemplateIncorrectIds;
    }


    /**
     * Gets the itemTemplateIds value for this RemovedItemTemplatesStruct.
     * 
     * @return itemTemplateIds
     */
    public com.allegro.webapi.ArrayOfInt getItemTemplateIds() {
        return itemTemplateIds;
    }


    /**
     * Sets the itemTemplateIds value for this RemovedItemTemplatesStruct.
     * 
     * @param itemTemplateIds
     */
    public void setItemTemplateIds(com.allegro.webapi.ArrayOfInt itemTemplateIds) {
        this.itemTemplateIds = itemTemplateIds;
    }


    /**
     * Gets the itemTemplateIncorrectIds value for this RemovedItemTemplatesStruct.
     * 
     * @return itemTemplateIncorrectIds
     */
    public com.allegro.webapi.ArrayOfInt getItemTemplateIncorrectIds() {
        return itemTemplateIncorrectIds;
    }


    /**
     * Sets the itemTemplateIncorrectIds value for this RemovedItemTemplatesStruct.
     * 
     * @param itemTemplateIncorrectIds
     */
    public void setItemTemplateIncorrectIds(com.allegro.webapi.ArrayOfInt itemTemplateIncorrectIds) {
        this.itemTemplateIncorrectIds = itemTemplateIncorrectIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemovedItemTemplatesStruct)) return false;
        RemovedItemTemplatesStruct other = (RemovedItemTemplatesStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemTemplateIds==null && other.getItemTemplateIds()==null) || 
             (this.itemTemplateIds!=null &&
              this.itemTemplateIds.equals(other.getItemTemplateIds()))) &&
            ((this.itemTemplateIncorrectIds==null && other.getItemTemplateIncorrectIds()==null) || 
             (this.itemTemplateIncorrectIds!=null &&
              this.itemTemplateIncorrectIds.equals(other.getItemTemplateIncorrectIds())));
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
        if (getItemTemplateIds() != null) {
            _hashCode += getItemTemplateIds().hashCode();
        }
        if (getItemTemplateIncorrectIds() != null) {
            _hashCode += getItemTemplateIncorrectIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemovedItemTemplatesStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RemovedItemTemplatesStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateIncorrectIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateIncorrectIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInt"));
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

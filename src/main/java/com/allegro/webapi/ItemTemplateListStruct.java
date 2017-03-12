/**
 * ItemTemplateListStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ItemTemplateListStruct  implements java.io.Serializable {
    private int itemTemplateId;

    private java.lang.String itemTemplateName;

    private com.allegro.webapi.ArrayOfFieldsvalue itemTemplateFields;

    public ItemTemplateListStruct() {
    }

    public ItemTemplateListStruct(
           int itemTemplateId,
           java.lang.String itemTemplateName,
           com.allegro.webapi.ArrayOfFieldsvalue itemTemplateFields) {
           this.itemTemplateId = itemTemplateId;
           this.itemTemplateName = itemTemplateName;
           this.itemTemplateFields = itemTemplateFields;
    }


    /**
     * Gets the itemTemplateId value for this ItemTemplateListStruct.
     * 
     * @return itemTemplateId
     */
    public int getItemTemplateId() {
        return itemTemplateId;
    }


    /**
     * Sets the itemTemplateId value for this ItemTemplateListStruct.
     * 
     * @param itemTemplateId
     */
    public void setItemTemplateId(int itemTemplateId) {
        this.itemTemplateId = itemTemplateId;
    }


    /**
     * Gets the itemTemplateName value for this ItemTemplateListStruct.
     * 
     * @return itemTemplateName
     */
    public java.lang.String getItemTemplateName() {
        return itemTemplateName;
    }


    /**
     * Sets the itemTemplateName value for this ItemTemplateListStruct.
     * 
     * @param itemTemplateName
     */
    public void setItemTemplateName(java.lang.String itemTemplateName) {
        this.itemTemplateName = itemTemplateName;
    }


    /**
     * Gets the itemTemplateFields value for this ItemTemplateListStruct.
     * 
     * @return itemTemplateFields
     */
    public com.allegro.webapi.ArrayOfFieldsvalue getItemTemplateFields() {
        return itemTemplateFields;
    }


    /**
     * Sets the itemTemplateFields value for this ItemTemplateListStruct.
     * 
     * @param itemTemplateFields
     */
    public void setItemTemplateFields(com.allegro.webapi.ArrayOfFieldsvalue itemTemplateFields) {
        this.itemTemplateFields = itemTemplateFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemTemplateListStruct)) return false;
        ItemTemplateListStruct other = (ItemTemplateListStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemTemplateId == other.getItemTemplateId() &&
            ((this.itemTemplateName==null && other.getItemTemplateName()==null) || 
             (this.itemTemplateName!=null &&
              this.itemTemplateName.equals(other.getItemTemplateName()))) &&
            ((this.itemTemplateFields==null && other.getItemTemplateFields()==null) || 
             (this.itemTemplateFields!=null &&
              this.itemTemplateFields.equals(other.getItemTemplateFields())));
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
        _hashCode += getItemTemplateId();
        if (getItemTemplateName() != null) {
            _hashCode += getItemTemplateName().hashCode();
        }
        if (getItemTemplateFields() != null) {
            _hashCode += getItemTemplateFields().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemTemplateListStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateListStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateFields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFieldsvalue"));
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

/**
 * ItemTemplateCreateStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ItemTemplateCreateStruct  implements java.io.Serializable {
    private int itemTemplateOption;

    private java.lang.String itemTemplateName;

    public ItemTemplateCreateStruct() {
    }

    public ItemTemplateCreateStruct(
           int itemTemplateOption,
           java.lang.String itemTemplateName) {
           this.itemTemplateOption = itemTemplateOption;
           this.itemTemplateName = itemTemplateName;
    }


    /**
     * Gets the itemTemplateOption value for this ItemTemplateCreateStruct.
     * 
     * @return itemTemplateOption
     */
    public int getItemTemplateOption() {
        return itemTemplateOption;
    }


    /**
     * Sets the itemTemplateOption value for this ItemTemplateCreateStruct.
     * 
     * @param itemTemplateOption
     */
    public void setItemTemplateOption(int itemTemplateOption) {
        this.itemTemplateOption = itemTemplateOption;
    }


    /**
     * Gets the itemTemplateName value for this ItemTemplateCreateStruct.
     * 
     * @return itemTemplateName
     */
    public java.lang.String getItemTemplateName() {
        return itemTemplateName;
    }


    /**
     * Sets the itemTemplateName value for this ItemTemplateCreateStruct.
     * 
     * @param itemTemplateName
     */
    public void setItemTemplateName(java.lang.String itemTemplateName) {
        this.itemTemplateName = itemTemplateName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemTemplateCreateStruct)) return false;
        ItemTemplateCreateStruct other = (ItemTemplateCreateStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemTemplateOption == other.getItemTemplateOption() &&
            ((this.itemTemplateName==null && other.getItemTemplateName()==null) || 
             (this.itemTemplateName!=null &&
              this.itemTemplateName.equals(other.getItemTemplateName())));
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
        _hashCode += getItemTemplateOption();
        if (getItemTemplateName() != null) {
            _hashCode += getItemTemplateName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemTemplateCreateStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateCreateStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

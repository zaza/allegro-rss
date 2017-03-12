/**
 * DoChangeItemFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoChangeItemFieldsResponse  implements java.io.Serializable {
    private com.allegro.webapi.ChangedItemStruct changedItem;

    public DoChangeItemFieldsResponse() {
    }

    public DoChangeItemFieldsResponse(
           com.allegro.webapi.ChangedItemStruct changedItem) {
           this.changedItem = changedItem;
    }


    /**
     * Gets the changedItem value for this DoChangeItemFieldsResponse.
     * 
     * @return changedItem
     */
    public com.allegro.webapi.ChangedItemStruct getChangedItem() {
        return changedItem;
    }


    /**
     * Sets the changedItem value for this DoChangeItemFieldsResponse.
     * 
     * @param changedItem
     */
    public void setChangedItem(com.allegro.webapi.ChangedItemStruct changedItem) {
        this.changedItem = changedItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoChangeItemFieldsResponse)) return false;
        DoChangeItemFieldsResponse other = (DoChangeItemFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changedItem==null && other.getChangedItem()==null) || 
             (this.changedItem!=null &&
              this.changedItem.equals(other.getChangedItem())));
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
        if (getChangedItem() != null) {
            _hashCode += getChangedItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoChangeItemFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedItem");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "changedItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ChangedItemStruct"));
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

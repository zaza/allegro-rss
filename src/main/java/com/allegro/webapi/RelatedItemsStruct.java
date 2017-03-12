/**
 * RelatedItemsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class RelatedItemsStruct  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfRelateditemstruct relatedItemsInfo;

    private float relatedItemsAmount;

    public RelatedItemsStruct() {
    }

    public RelatedItemsStruct(
           com.allegro.webapi.ArrayOfRelateditemstruct relatedItemsInfo,
           float relatedItemsAmount) {
           this.relatedItemsInfo = relatedItemsInfo;
           this.relatedItemsAmount = relatedItemsAmount;
    }


    /**
     * Gets the relatedItemsInfo value for this RelatedItemsStruct.
     * 
     * @return relatedItemsInfo
     */
    public com.allegro.webapi.ArrayOfRelateditemstruct getRelatedItemsInfo() {
        return relatedItemsInfo;
    }


    /**
     * Sets the relatedItemsInfo value for this RelatedItemsStruct.
     * 
     * @param relatedItemsInfo
     */
    public void setRelatedItemsInfo(com.allegro.webapi.ArrayOfRelateditemstruct relatedItemsInfo) {
        this.relatedItemsInfo = relatedItemsInfo;
    }


    /**
     * Gets the relatedItemsAmount value for this RelatedItemsStruct.
     * 
     * @return relatedItemsAmount
     */
    public float getRelatedItemsAmount() {
        return relatedItemsAmount;
    }


    /**
     * Sets the relatedItemsAmount value for this RelatedItemsStruct.
     * 
     * @param relatedItemsAmount
     */
    public void setRelatedItemsAmount(float relatedItemsAmount) {
        this.relatedItemsAmount = relatedItemsAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedItemsStruct)) return false;
        RelatedItemsStruct other = (RelatedItemsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relatedItemsInfo==null && other.getRelatedItemsInfo()==null) || 
             (this.relatedItemsInfo!=null &&
              this.relatedItemsInfo.equals(other.getRelatedItemsInfo()))) &&
            this.relatedItemsAmount == other.getRelatedItemsAmount();
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
        if (getRelatedItemsInfo() != null) {
            _hashCode += getRelatedItemsInfo().hashCode();
        }
        _hashCode += new Float(getRelatedItemsAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelatedItemsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "relatedItemsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRelateditemstruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemsAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "relatedItemsAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

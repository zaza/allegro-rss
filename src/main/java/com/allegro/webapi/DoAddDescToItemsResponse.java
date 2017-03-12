/**
 * DoAddDescToItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoAddDescToItemsResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfLong arrayItemsAddId;

    private com.allegro.webapi.ArrayOfLong arrayItemsDescToLong;

    private com.allegro.webapi.ArrayOfLong arrayItemsNotFound;

    public DoAddDescToItemsResponse() {
    }

    public DoAddDescToItemsResponse(
           com.allegro.webapi.ArrayOfLong arrayItemsAddId,
           com.allegro.webapi.ArrayOfLong arrayItemsDescToLong,
           com.allegro.webapi.ArrayOfLong arrayItemsNotFound) {
           this.arrayItemsAddId = arrayItemsAddId;
           this.arrayItemsDescToLong = arrayItemsDescToLong;
           this.arrayItemsNotFound = arrayItemsNotFound;
    }


    /**
     * Gets the arrayItemsAddId value for this DoAddDescToItemsResponse.
     * 
     * @return arrayItemsAddId
     */
    public com.allegro.webapi.ArrayOfLong getArrayItemsAddId() {
        return arrayItemsAddId;
    }


    /**
     * Sets the arrayItemsAddId value for this DoAddDescToItemsResponse.
     * 
     * @param arrayItemsAddId
     */
    public void setArrayItemsAddId(com.allegro.webapi.ArrayOfLong arrayItemsAddId) {
        this.arrayItemsAddId = arrayItemsAddId;
    }


    /**
     * Gets the arrayItemsDescToLong value for this DoAddDescToItemsResponse.
     * 
     * @return arrayItemsDescToLong
     */
    public com.allegro.webapi.ArrayOfLong getArrayItemsDescToLong() {
        return arrayItemsDescToLong;
    }


    /**
     * Sets the arrayItemsDescToLong value for this DoAddDescToItemsResponse.
     * 
     * @param arrayItemsDescToLong
     */
    public void setArrayItemsDescToLong(com.allegro.webapi.ArrayOfLong arrayItemsDescToLong) {
        this.arrayItemsDescToLong = arrayItemsDescToLong;
    }


    /**
     * Gets the arrayItemsNotFound value for this DoAddDescToItemsResponse.
     * 
     * @return arrayItemsNotFound
     */
    public com.allegro.webapi.ArrayOfLong getArrayItemsNotFound() {
        return arrayItemsNotFound;
    }


    /**
     * Sets the arrayItemsNotFound value for this DoAddDescToItemsResponse.
     * 
     * @param arrayItemsNotFound
     */
    public void setArrayItemsNotFound(com.allegro.webapi.ArrayOfLong arrayItemsNotFound) {
        this.arrayItemsNotFound = arrayItemsNotFound;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAddDescToItemsResponse)) return false;
        DoAddDescToItemsResponse other = (DoAddDescToItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrayItemsAddId==null && other.getArrayItemsAddId()==null) || 
             (this.arrayItemsAddId!=null &&
              this.arrayItemsAddId.equals(other.getArrayItemsAddId()))) &&
            ((this.arrayItemsDescToLong==null && other.getArrayItemsDescToLong()==null) || 
             (this.arrayItemsDescToLong!=null &&
              this.arrayItemsDescToLong.equals(other.getArrayItemsDescToLong()))) &&
            ((this.arrayItemsNotFound==null && other.getArrayItemsNotFound()==null) || 
             (this.arrayItemsNotFound!=null &&
              this.arrayItemsNotFound.equals(other.getArrayItemsNotFound())));
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
        if (getArrayItemsAddId() != null) {
            _hashCode += getArrayItemsAddId().hashCode();
        }
        if (getArrayItemsDescToLong() != null) {
            _hashCode += getArrayItemsDescToLong().hashCode();
        }
        if (getArrayItemsNotFound() != null) {
            _hashCode += getArrayItemsNotFound().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAddDescToItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddDescToItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayItemsAddId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "arrayItemsAddId"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayItemsDescToLong");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "arrayItemsDescToLong"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayItemsNotFound");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "arrayItemsNotFound"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
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

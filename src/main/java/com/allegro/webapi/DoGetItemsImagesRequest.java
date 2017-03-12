/**
 * DoGetItemsImagesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetItemsImagesRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private com.allegro.webapi.ArrayOfItemgetimage itemsArray;

    private int imageType;

    public DoGetItemsImagesRequest() {
    }

    public DoGetItemsImagesRequest(
           java.lang.String sessionHandle,
           com.allegro.webapi.ArrayOfItemgetimage itemsArray,
           int imageType) {
           this.sessionHandle = sessionHandle;
           this.itemsArray = itemsArray;
           this.imageType = imageType;
    }


    /**
     * Gets the sessionHandle value for this DoGetItemsImagesRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetItemsImagesRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the itemsArray value for this DoGetItemsImagesRequest.
     * 
     * @return itemsArray
     */
    public com.allegro.webapi.ArrayOfItemgetimage getItemsArray() {
        return itemsArray;
    }


    /**
     * Sets the itemsArray value for this DoGetItemsImagesRequest.
     * 
     * @param itemsArray
     */
    public void setItemsArray(com.allegro.webapi.ArrayOfItemgetimage itemsArray) {
        this.itemsArray = itemsArray;
    }


    /**
     * Gets the imageType value for this DoGetItemsImagesRequest.
     * 
     * @return imageType
     */
    public int getImageType() {
        return imageType;
    }


    /**
     * Sets the imageType value for this DoGetItemsImagesRequest.
     * 
     * @param imageType
     */
    public void setImageType(int imageType) {
        this.imageType = imageType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetItemsImagesRequest)) return false;
        DoGetItemsImagesRequest other = (DoGetItemsImagesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            ((this.itemsArray==null && other.getItemsArray()==null) || 
             (this.itemsArray!=null &&
              this.itemsArray.equals(other.getItemsArray()))) &&
            this.imageType == other.getImageType();
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
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        if (getItemsArray() != null) {
            _hashCode += getItemsArray().hashCode();
        }
        _hashCode += getImageType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetItemsImagesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsImagesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemgetimage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "imageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

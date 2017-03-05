/**
 * DoAddDescToItemsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoAddDescToItemsRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private com.allegro.webapi.ArrayOfLong itemsIdArray;

    private java.lang.String itDescription;

    public DoAddDescToItemsRequest() {
    }

    public DoAddDescToItemsRequest(
           java.lang.String sessionHandle,
           com.allegro.webapi.ArrayOfLong itemsIdArray,
           java.lang.String itDescription) {
           this.sessionHandle = sessionHandle;
           this.itemsIdArray = itemsIdArray;
           this.itDescription = itDescription;
    }


    /**
     * Gets the sessionHandle value for this DoAddDescToItemsRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoAddDescToItemsRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the itemsIdArray value for this DoAddDescToItemsRequest.
     * 
     * @return itemsIdArray
     */
    public com.allegro.webapi.ArrayOfLong getItemsIdArray() {
        return itemsIdArray;
    }


    /**
     * Sets the itemsIdArray value for this DoAddDescToItemsRequest.
     * 
     * @param itemsIdArray
     */
    public void setItemsIdArray(com.allegro.webapi.ArrayOfLong itemsIdArray) {
        this.itemsIdArray = itemsIdArray;
    }


    /**
     * Gets the itDescription value for this DoAddDescToItemsRequest.
     * 
     * @return itDescription
     */
    public java.lang.String getItDescription() {
        return itDescription;
    }


    /**
     * Sets the itDescription value for this DoAddDescToItemsRequest.
     * 
     * @param itDescription
     */
    public void setItDescription(java.lang.String itDescription) {
        this.itDescription = itDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAddDescToItemsRequest)) return false;
        DoAddDescToItemsRequest other = (DoAddDescToItemsRequest) obj;
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
            ((this.itemsIdArray==null && other.getItemsIdArray()==null) || 
             (this.itemsIdArray!=null &&
              this.itemsIdArray.equals(other.getItemsIdArray()))) &&
            ((this.itDescription==null && other.getItDescription()==null) || 
             (this.itDescription!=null &&
              this.itDescription.equals(other.getItDescription())));
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
        if (getItemsIdArray() != null) {
            _hashCode += getItemsIdArray().hashCode();
        }
        if (getItDescription() != null) {
            _hashCode += getItDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAddDescToItemsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddDescToItemsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsIdArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsIdArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itDescription"));
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

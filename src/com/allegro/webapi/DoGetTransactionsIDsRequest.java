/**
 * DoGetTransactionsIDsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetTransactionsIDsRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private com.allegro.webapi.ArrayOfLong itemsIdArray;

    private java.lang.String userRole;

    private com.allegro.webapi.ArrayOfLong shipmentIdArray;

    public DoGetTransactionsIDsRequest() {
    }

    public DoGetTransactionsIDsRequest(
           java.lang.String sessionHandle,
           com.allegro.webapi.ArrayOfLong itemsIdArray,
           java.lang.String userRole,
           com.allegro.webapi.ArrayOfLong shipmentIdArray) {
           this.sessionHandle = sessionHandle;
           this.itemsIdArray = itemsIdArray;
           this.userRole = userRole;
           this.shipmentIdArray = shipmentIdArray;
    }


    /**
     * Gets the sessionHandle value for this DoGetTransactionsIDsRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetTransactionsIDsRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the itemsIdArray value for this DoGetTransactionsIDsRequest.
     * 
     * @return itemsIdArray
     */
    public com.allegro.webapi.ArrayOfLong getItemsIdArray() {
        return itemsIdArray;
    }


    /**
     * Sets the itemsIdArray value for this DoGetTransactionsIDsRequest.
     * 
     * @param itemsIdArray
     */
    public void setItemsIdArray(com.allegro.webapi.ArrayOfLong itemsIdArray) {
        this.itemsIdArray = itemsIdArray;
    }


    /**
     * Gets the userRole value for this DoGetTransactionsIDsRequest.
     * 
     * @return userRole
     */
    public java.lang.String getUserRole() {
        return userRole;
    }


    /**
     * Sets the userRole value for this DoGetTransactionsIDsRequest.
     * 
     * @param userRole
     */
    public void setUserRole(java.lang.String userRole) {
        this.userRole = userRole;
    }


    /**
     * Gets the shipmentIdArray value for this DoGetTransactionsIDsRequest.
     * 
     * @return shipmentIdArray
     */
    public com.allegro.webapi.ArrayOfLong getShipmentIdArray() {
        return shipmentIdArray;
    }


    /**
     * Sets the shipmentIdArray value for this DoGetTransactionsIDsRequest.
     * 
     * @param shipmentIdArray
     */
    public void setShipmentIdArray(com.allegro.webapi.ArrayOfLong shipmentIdArray) {
        this.shipmentIdArray = shipmentIdArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetTransactionsIDsRequest)) return false;
        DoGetTransactionsIDsRequest other = (DoGetTransactionsIDsRequest) obj;
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
            ((this.userRole==null && other.getUserRole()==null) || 
             (this.userRole!=null &&
              this.userRole.equals(other.getUserRole()))) &&
            ((this.shipmentIdArray==null && other.getShipmentIdArray()==null) || 
             (this.shipmentIdArray!=null &&
              this.shipmentIdArray.equals(other.getShipmentIdArray())));
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
        if (getUserRole() != null) {
            _hashCode += getUserRole().hashCode();
        }
        if (getShipmentIdArray() != null) {
            _hashCode += getShipmentIdArray().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetTransactionsIDsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest"));
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
        elemField.setFieldName("userRole");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentIdArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentIdArray"));
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

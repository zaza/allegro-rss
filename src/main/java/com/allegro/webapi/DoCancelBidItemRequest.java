/**
 * DoCancelBidItemRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoCancelBidItemRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long cancelItemId;

    private com.allegro.webapi.ArrayOfInt cancelBidsArray;

    private java.lang.String cancelBidsReason;

    private java.lang.Long cancelAddToBlackList;

    public DoCancelBidItemRequest() {
    }

    public DoCancelBidItemRequest(
           java.lang.String sessionHandle,
           long cancelItemId,
           com.allegro.webapi.ArrayOfInt cancelBidsArray,
           java.lang.String cancelBidsReason,
           java.lang.Long cancelAddToBlackList) {
           this.sessionHandle = sessionHandle;
           this.cancelItemId = cancelItemId;
           this.cancelBidsArray = cancelBidsArray;
           this.cancelBidsReason = cancelBidsReason;
           this.cancelAddToBlackList = cancelAddToBlackList;
    }


    /**
     * Gets the sessionHandle value for this DoCancelBidItemRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoCancelBidItemRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the cancelItemId value for this DoCancelBidItemRequest.
     * 
     * @return cancelItemId
     */
    public long getCancelItemId() {
        return cancelItemId;
    }


    /**
     * Sets the cancelItemId value for this DoCancelBidItemRequest.
     * 
     * @param cancelItemId
     */
    public void setCancelItemId(long cancelItemId) {
        this.cancelItemId = cancelItemId;
    }


    /**
     * Gets the cancelBidsArray value for this DoCancelBidItemRequest.
     * 
     * @return cancelBidsArray
     */
    public com.allegro.webapi.ArrayOfInt getCancelBidsArray() {
        return cancelBidsArray;
    }


    /**
     * Sets the cancelBidsArray value for this DoCancelBidItemRequest.
     * 
     * @param cancelBidsArray
     */
    public void setCancelBidsArray(com.allegro.webapi.ArrayOfInt cancelBidsArray) {
        this.cancelBidsArray = cancelBidsArray;
    }


    /**
     * Gets the cancelBidsReason value for this DoCancelBidItemRequest.
     * 
     * @return cancelBidsReason
     */
    public java.lang.String getCancelBidsReason() {
        return cancelBidsReason;
    }


    /**
     * Sets the cancelBidsReason value for this DoCancelBidItemRequest.
     * 
     * @param cancelBidsReason
     */
    public void setCancelBidsReason(java.lang.String cancelBidsReason) {
        this.cancelBidsReason = cancelBidsReason;
    }


    /**
     * Gets the cancelAddToBlackList value for this DoCancelBidItemRequest.
     * 
     * @return cancelAddToBlackList
     */
    public java.lang.Long getCancelAddToBlackList() {
        return cancelAddToBlackList;
    }


    /**
     * Sets the cancelAddToBlackList value for this DoCancelBidItemRequest.
     * 
     * @param cancelAddToBlackList
     */
    public void setCancelAddToBlackList(java.lang.Long cancelAddToBlackList) {
        this.cancelAddToBlackList = cancelAddToBlackList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCancelBidItemRequest)) return false;
        DoCancelBidItemRequest other = (DoCancelBidItemRequest) obj;
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
            this.cancelItemId == other.getCancelItemId() &&
            ((this.cancelBidsArray==null && other.getCancelBidsArray()==null) || 
             (this.cancelBidsArray!=null &&
              this.cancelBidsArray.equals(other.getCancelBidsArray()))) &&
            ((this.cancelBidsReason==null && other.getCancelBidsReason()==null) || 
             (this.cancelBidsReason!=null &&
              this.cancelBidsReason.equals(other.getCancelBidsReason()))) &&
            ((this.cancelAddToBlackList==null && other.getCancelAddToBlackList()==null) || 
             (this.cancelAddToBlackList!=null &&
              this.cancelAddToBlackList.equals(other.getCancelAddToBlackList())));
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
        _hashCode += new Long(getCancelItemId()).hashCode();
        if (getCancelBidsArray() != null) {
            _hashCode += getCancelBidsArray().hashCode();
        }
        if (getCancelBidsReason() != null) {
            _hashCode += getCancelBidsReason().hashCode();
        }
        if (getCancelAddToBlackList() != null) {
            _hashCode += getCancelAddToBlackList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCancelBidItemRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelBidItemRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "cancelItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelBidsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "cancelBidsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelBidsReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "cancelBidsReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelAddToBlackList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "cancelAddToBlackList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

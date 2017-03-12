/**
 * DoSellSomeAgainInShopRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoSellSomeAgainInShopRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private com.allegro.webapi.ArrayOfLong sellItemsArray;

    private java.lang.Long sellStartingTime;

    private int sellShopDuration;

    private java.lang.Integer sellShopOptions;

    private java.lang.Integer sellProlongOptions;

    private java.lang.Long sellShopCategory;

    private com.allegro.webapi.ArrayOfInt localIds;

    public DoSellSomeAgainInShopRequest() {
    }

    public DoSellSomeAgainInShopRequest(
           java.lang.String sessionHandle,
           com.allegro.webapi.ArrayOfLong sellItemsArray,
           java.lang.Long sellStartingTime,
           int sellShopDuration,
           java.lang.Integer sellShopOptions,
           java.lang.Integer sellProlongOptions,
           java.lang.Long sellShopCategory,
           com.allegro.webapi.ArrayOfInt localIds) {
           this.sessionHandle = sessionHandle;
           this.sellItemsArray = sellItemsArray;
           this.sellStartingTime = sellStartingTime;
           this.sellShopDuration = sellShopDuration;
           this.sellShopOptions = sellShopOptions;
           this.sellProlongOptions = sellProlongOptions;
           this.sellShopCategory = sellShopCategory;
           this.localIds = localIds;
    }


    /**
     * Gets the sessionHandle value for this DoSellSomeAgainInShopRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoSellSomeAgainInShopRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the sellItemsArray value for this DoSellSomeAgainInShopRequest.
     * 
     * @return sellItemsArray
     */
    public com.allegro.webapi.ArrayOfLong getSellItemsArray() {
        return sellItemsArray;
    }


    /**
     * Sets the sellItemsArray value for this DoSellSomeAgainInShopRequest.
     * 
     * @param sellItemsArray
     */
    public void setSellItemsArray(com.allegro.webapi.ArrayOfLong sellItemsArray) {
        this.sellItemsArray = sellItemsArray;
    }


    /**
     * Gets the sellStartingTime value for this DoSellSomeAgainInShopRequest.
     * 
     * @return sellStartingTime
     */
    public java.lang.Long getSellStartingTime() {
        return sellStartingTime;
    }


    /**
     * Sets the sellStartingTime value for this DoSellSomeAgainInShopRequest.
     * 
     * @param sellStartingTime
     */
    public void setSellStartingTime(java.lang.Long sellStartingTime) {
        this.sellStartingTime = sellStartingTime;
    }


    /**
     * Gets the sellShopDuration value for this DoSellSomeAgainInShopRequest.
     * 
     * @return sellShopDuration
     */
    public int getSellShopDuration() {
        return sellShopDuration;
    }


    /**
     * Sets the sellShopDuration value for this DoSellSomeAgainInShopRequest.
     * 
     * @param sellShopDuration
     */
    public void setSellShopDuration(int sellShopDuration) {
        this.sellShopDuration = sellShopDuration;
    }


    /**
     * Gets the sellShopOptions value for this DoSellSomeAgainInShopRequest.
     * 
     * @return sellShopOptions
     */
    public java.lang.Integer getSellShopOptions() {
        return sellShopOptions;
    }


    /**
     * Sets the sellShopOptions value for this DoSellSomeAgainInShopRequest.
     * 
     * @param sellShopOptions
     */
    public void setSellShopOptions(java.lang.Integer sellShopOptions) {
        this.sellShopOptions = sellShopOptions;
    }


    /**
     * Gets the sellProlongOptions value for this DoSellSomeAgainInShopRequest.
     * 
     * @return sellProlongOptions
     */
    public java.lang.Integer getSellProlongOptions() {
        return sellProlongOptions;
    }


    /**
     * Sets the sellProlongOptions value for this DoSellSomeAgainInShopRequest.
     * 
     * @param sellProlongOptions
     */
    public void setSellProlongOptions(java.lang.Integer sellProlongOptions) {
        this.sellProlongOptions = sellProlongOptions;
    }


    /**
     * Gets the sellShopCategory value for this DoSellSomeAgainInShopRequest.
     * 
     * @return sellShopCategory
     */
    public java.lang.Long getSellShopCategory() {
        return sellShopCategory;
    }


    /**
     * Sets the sellShopCategory value for this DoSellSomeAgainInShopRequest.
     * 
     * @param sellShopCategory
     */
    public void setSellShopCategory(java.lang.Long sellShopCategory) {
        this.sellShopCategory = sellShopCategory;
    }


    /**
     * Gets the localIds value for this DoSellSomeAgainInShopRequest.
     * 
     * @return localIds
     */
    public com.allegro.webapi.ArrayOfInt getLocalIds() {
        return localIds;
    }


    /**
     * Sets the localIds value for this DoSellSomeAgainInShopRequest.
     * 
     * @param localIds
     */
    public void setLocalIds(com.allegro.webapi.ArrayOfInt localIds) {
        this.localIds = localIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSellSomeAgainInShopRequest)) return false;
        DoSellSomeAgainInShopRequest other = (DoSellSomeAgainInShopRequest) obj;
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
            ((this.sellItemsArray==null && other.getSellItemsArray()==null) || 
             (this.sellItemsArray!=null &&
              this.sellItemsArray.equals(other.getSellItemsArray()))) &&
            ((this.sellStartingTime==null && other.getSellStartingTime()==null) || 
             (this.sellStartingTime!=null &&
              this.sellStartingTime.equals(other.getSellStartingTime()))) &&
            this.sellShopDuration == other.getSellShopDuration() &&
            ((this.sellShopOptions==null && other.getSellShopOptions()==null) || 
             (this.sellShopOptions!=null &&
              this.sellShopOptions.equals(other.getSellShopOptions()))) &&
            ((this.sellProlongOptions==null && other.getSellProlongOptions()==null) || 
             (this.sellProlongOptions!=null &&
              this.sellProlongOptions.equals(other.getSellProlongOptions()))) &&
            ((this.sellShopCategory==null && other.getSellShopCategory()==null) || 
             (this.sellShopCategory!=null &&
              this.sellShopCategory.equals(other.getSellShopCategory()))) &&
            ((this.localIds==null && other.getLocalIds()==null) || 
             (this.localIds!=null &&
              this.localIds.equals(other.getLocalIds())));
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
        if (getSellItemsArray() != null) {
            _hashCode += getSellItemsArray().hashCode();
        }
        if (getSellStartingTime() != null) {
            _hashCode += getSellStartingTime().hashCode();
        }
        _hashCode += getSellShopDuration();
        if (getSellShopOptions() != null) {
            _hashCode += getSellShopOptions().hashCode();
        }
        if (getSellProlongOptions() != null) {
            _hashCode += getSellProlongOptions().hashCode();
        }
        if (getSellShopCategory() != null) {
            _hashCode += getSellShopCategory().hashCode();
        }
        if (getLocalIds() != null) {
            _hashCode += getLocalIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSellSomeAgainInShopRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellItemsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellItemsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellStartingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellStartingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellShopDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellShopDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellShopOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellShopOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellProlongOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellProlongOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellShopCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellShopCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "localIds"));
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

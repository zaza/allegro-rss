/**
 * DoSellSomeAgainRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoSellSomeAgainRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private com.allegro.webapi.ArrayOfLong sellItemsArray;

    private java.lang.Long sellStartingTime;

    private int sellAuctionDuration;

    private java.lang.Integer sellOptions;

    private com.allegro.webapi.ArrayOfInt localIds;

    private java.lang.Integer sellProlongOptions;

    public DoSellSomeAgainRequest() {
    }

    public DoSellSomeAgainRequest(
           java.lang.String sessionHandle,
           com.allegro.webapi.ArrayOfLong sellItemsArray,
           java.lang.Long sellStartingTime,
           int sellAuctionDuration,
           java.lang.Integer sellOptions,
           com.allegro.webapi.ArrayOfInt localIds,
           java.lang.Integer sellProlongOptions) {
           this.sessionHandle = sessionHandle;
           this.sellItemsArray = sellItemsArray;
           this.sellStartingTime = sellStartingTime;
           this.sellAuctionDuration = sellAuctionDuration;
           this.sellOptions = sellOptions;
           this.localIds = localIds;
           this.sellProlongOptions = sellProlongOptions;
    }


    /**
     * Gets the sessionHandle value for this DoSellSomeAgainRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoSellSomeAgainRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the sellItemsArray value for this DoSellSomeAgainRequest.
     * 
     * @return sellItemsArray
     */
    public com.allegro.webapi.ArrayOfLong getSellItemsArray() {
        return sellItemsArray;
    }


    /**
     * Sets the sellItemsArray value for this DoSellSomeAgainRequest.
     * 
     * @param sellItemsArray
     */
    public void setSellItemsArray(com.allegro.webapi.ArrayOfLong sellItemsArray) {
        this.sellItemsArray = sellItemsArray;
    }


    /**
     * Gets the sellStartingTime value for this DoSellSomeAgainRequest.
     * 
     * @return sellStartingTime
     */
    public java.lang.Long getSellStartingTime() {
        return sellStartingTime;
    }


    /**
     * Sets the sellStartingTime value for this DoSellSomeAgainRequest.
     * 
     * @param sellStartingTime
     */
    public void setSellStartingTime(java.lang.Long sellStartingTime) {
        this.sellStartingTime = sellStartingTime;
    }


    /**
     * Gets the sellAuctionDuration value for this DoSellSomeAgainRequest.
     * 
     * @return sellAuctionDuration
     */
    public int getSellAuctionDuration() {
        return sellAuctionDuration;
    }


    /**
     * Sets the sellAuctionDuration value for this DoSellSomeAgainRequest.
     * 
     * @param sellAuctionDuration
     */
    public void setSellAuctionDuration(int sellAuctionDuration) {
        this.sellAuctionDuration = sellAuctionDuration;
    }


    /**
     * Gets the sellOptions value for this DoSellSomeAgainRequest.
     * 
     * @return sellOptions
     */
    public java.lang.Integer getSellOptions() {
        return sellOptions;
    }


    /**
     * Sets the sellOptions value for this DoSellSomeAgainRequest.
     * 
     * @param sellOptions
     */
    public void setSellOptions(java.lang.Integer sellOptions) {
        this.sellOptions = sellOptions;
    }


    /**
     * Gets the localIds value for this DoSellSomeAgainRequest.
     * 
     * @return localIds
     */
    public com.allegro.webapi.ArrayOfInt getLocalIds() {
        return localIds;
    }


    /**
     * Sets the localIds value for this DoSellSomeAgainRequest.
     * 
     * @param localIds
     */
    public void setLocalIds(com.allegro.webapi.ArrayOfInt localIds) {
        this.localIds = localIds;
    }


    /**
     * Gets the sellProlongOptions value for this DoSellSomeAgainRequest.
     * 
     * @return sellProlongOptions
     */
    public java.lang.Integer getSellProlongOptions() {
        return sellProlongOptions;
    }


    /**
     * Sets the sellProlongOptions value for this DoSellSomeAgainRequest.
     * 
     * @param sellProlongOptions
     */
    public void setSellProlongOptions(java.lang.Integer sellProlongOptions) {
        this.sellProlongOptions = sellProlongOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSellSomeAgainRequest)) return false;
        DoSellSomeAgainRequest other = (DoSellSomeAgainRequest) obj;
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
            this.sellAuctionDuration == other.getSellAuctionDuration() &&
            ((this.sellOptions==null && other.getSellOptions()==null) || 
             (this.sellOptions!=null &&
              this.sellOptions.equals(other.getSellOptions()))) &&
            ((this.localIds==null && other.getLocalIds()==null) || 
             (this.localIds!=null &&
              this.localIds.equals(other.getLocalIds()))) &&
            ((this.sellProlongOptions==null && other.getSellProlongOptions()==null) || 
             (this.sellProlongOptions!=null &&
              this.sellProlongOptions.equals(other.getSellProlongOptions())));
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
        _hashCode += getSellAuctionDuration();
        if (getSellOptions() != null) {
            _hashCode += getSellOptions().hashCode();
        }
        if (getLocalIds() != null) {
            _hashCode += getLocalIds().hashCode();
        }
        if (getSellProlongOptions() != null) {
            _hashCode += getSellProlongOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSellSomeAgainRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest"));
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
        elemField.setFieldName("sellAuctionDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellAuctionDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellProlongOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellProlongOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

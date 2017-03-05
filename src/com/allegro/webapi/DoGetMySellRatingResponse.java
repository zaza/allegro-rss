/**
 * DoGetMySellRatingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMySellRatingResponse  implements java.io.Serializable {
    private int sellRatingTotalCount;

    private com.allegro.webapi.ArrayOfSellratingaveragestruct sellRatingAverage;

    private com.allegro.webapi.ArrayOfSellratingdetailstruct sellRatingDetails;

    private com.allegro.webapi.ArrayOfSellratingaveragepermonthstruct sellRatingStatsPerMonth;

    public DoGetMySellRatingResponse() {
    }

    public DoGetMySellRatingResponse(
           int sellRatingTotalCount,
           com.allegro.webapi.ArrayOfSellratingaveragestruct sellRatingAverage,
           com.allegro.webapi.ArrayOfSellratingdetailstruct sellRatingDetails,
           com.allegro.webapi.ArrayOfSellratingaveragepermonthstruct sellRatingStatsPerMonth) {
           this.sellRatingTotalCount = sellRatingTotalCount;
           this.sellRatingAverage = sellRatingAverage;
           this.sellRatingDetails = sellRatingDetails;
           this.sellRatingStatsPerMonth = sellRatingStatsPerMonth;
    }


    /**
     * Gets the sellRatingTotalCount value for this DoGetMySellRatingResponse.
     * 
     * @return sellRatingTotalCount
     */
    public int getSellRatingTotalCount() {
        return sellRatingTotalCount;
    }


    /**
     * Sets the sellRatingTotalCount value for this DoGetMySellRatingResponse.
     * 
     * @param sellRatingTotalCount
     */
    public void setSellRatingTotalCount(int sellRatingTotalCount) {
        this.sellRatingTotalCount = sellRatingTotalCount;
    }


    /**
     * Gets the sellRatingAverage value for this DoGetMySellRatingResponse.
     * 
     * @return sellRatingAverage
     */
    public com.allegro.webapi.ArrayOfSellratingaveragestruct getSellRatingAverage() {
        return sellRatingAverage;
    }


    /**
     * Sets the sellRatingAverage value for this DoGetMySellRatingResponse.
     * 
     * @param sellRatingAverage
     */
    public void setSellRatingAverage(com.allegro.webapi.ArrayOfSellratingaveragestruct sellRatingAverage) {
        this.sellRatingAverage = sellRatingAverage;
    }


    /**
     * Gets the sellRatingDetails value for this DoGetMySellRatingResponse.
     * 
     * @return sellRatingDetails
     */
    public com.allegro.webapi.ArrayOfSellratingdetailstruct getSellRatingDetails() {
        return sellRatingDetails;
    }


    /**
     * Sets the sellRatingDetails value for this DoGetMySellRatingResponse.
     * 
     * @param sellRatingDetails
     */
    public void setSellRatingDetails(com.allegro.webapi.ArrayOfSellratingdetailstruct sellRatingDetails) {
        this.sellRatingDetails = sellRatingDetails;
    }


    /**
     * Gets the sellRatingStatsPerMonth value for this DoGetMySellRatingResponse.
     * 
     * @return sellRatingStatsPerMonth
     */
    public com.allegro.webapi.ArrayOfSellratingaveragepermonthstruct getSellRatingStatsPerMonth() {
        return sellRatingStatsPerMonth;
    }


    /**
     * Sets the sellRatingStatsPerMonth value for this DoGetMySellRatingResponse.
     * 
     * @param sellRatingStatsPerMonth
     */
    public void setSellRatingStatsPerMonth(com.allegro.webapi.ArrayOfSellratingaveragepermonthstruct sellRatingStatsPerMonth) {
        this.sellRatingStatsPerMonth = sellRatingStatsPerMonth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMySellRatingResponse)) return false;
        DoGetMySellRatingResponse other = (DoGetMySellRatingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sellRatingTotalCount == other.getSellRatingTotalCount() &&
            ((this.sellRatingAverage==null && other.getSellRatingAverage()==null) || 
             (this.sellRatingAverage!=null &&
              this.sellRatingAverage.equals(other.getSellRatingAverage()))) &&
            ((this.sellRatingDetails==null && other.getSellRatingDetails()==null) || 
             (this.sellRatingDetails!=null &&
              this.sellRatingDetails.equals(other.getSellRatingDetails()))) &&
            ((this.sellRatingStatsPerMonth==null && other.getSellRatingStatsPerMonth()==null) || 
             (this.sellRatingStatsPerMonth!=null &&
              this.sellRatingStatsPerMonth.equals(other.getSellRatingStatsPerMonth())));
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
        _hashCode += getSellRatingTotalCount();
        if (getSellRatingAverage() != null) {
            _hashCode += getSellRatingAverage().hashCode();
        }
        if (getSellRatingDetails() != null) {
            _hashCode += getSellRatingDetails().hashCode();
        }
        if (getSellRatingStatsPerMonth() != null) {
            _hashCode += getSellRatingStatsPerMonth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMySellRatingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellRatingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingTotalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingTotalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingAverage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingAverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragestruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingdetailstruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingStatsPerMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingStatsPerMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragepermonthstruct"));
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

/**
 * DoGetSiteJournalDealsInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetSiteJournalDealsInfoResponse  implements java.io.Serializable {
    private com.allegro.webapi.SiteJournalDealsInfoStruct siteJournalDealsInfo;

    public DoGetSiteJournalDealsInfoResponse() {
    }

    public DoGetSiteJournalDealsInfoResponse(
           com.allegro.webapi.SiteJournalDealsInfoStruct siteJournalDealsInfo) {
           this.siteJournalDealsInfo = siteJournalDealsInfo;
    }


    /**
     * Gets the siteJournalDealsInfo value for this DoGetSiteJournalDealsInfoResponse.
     * 
     * @return siteJournalDealsInfo
     */
    public com.allegro.webapi.SiteJournalDealsInfoStruct getSiteJournalDealsInfo() {
        return siteJournalDealsInfo;
    }


    /**
     * Sets the siteJournalDealsInfo value for this DoGetSiteJournalDealsInfoResponse.
     * 
     * @param siteJournalDealsInfo
     */
    public void setSiteJournalDealsInfo(com.allegro.webapi.SiteJournalDealsInfoStruct siteJournalDealsInfo) {
        this.siteJournalDealsInfo = siteJournalDealsInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSiteJournalDealsInfoResponse)) return false;
        DoGetSiteJournalDealsInfoResponse other = (DoGetSiteJournalDealsInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.siteJournalDealsInfo==null && other.getSiteJournalDealsInfo()==null) || 
             (this.siteJournalDealsInfo!=null &&
              this.siteJournalDealsInfo.equals(other.getSiteJournalDealsInfo())));
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
        if (getSiteJournalDealsInfo() != null) {
            _hashCode += getSiteJournalDealsInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSiteJournalDealsInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteJournalDealsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "siteJournalDealsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsInfoStruct"));
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

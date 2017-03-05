/**
 * DoGetSiteJournalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetSiteJournalResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfSitejournal siteJournalArray;

    public DoGetSiteJournalResponse() {
    }

    public DoGetSiteJournalResponse(
           com.allegro.webapi.ArrayOfSitejournal siteJournalArray) {
           this.siteJournalArray = siteJournalArray;
    }


    /**
     * Gets the siteJournalArray value for this DoGetSiteJournalResponse.
     * 
     * @return siteJournalArray
     */
    public com.allegro.webapi.ArrayOfSitejournal getSiteJournalArray() {
        return siteJournalArray;
    }


    /**
     * Sets the siteJournalArray value for this DoGetSiteJournalResponse.
     * 
     * @param siteJournalArray
     */
    public void setSiteJournalArray(com.allegro.webapi.ArrayOfSitejournal siteJournalArray) {
        this.siteJournalArray = siteJournalArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSiteJournalResponse)) return false;
        DoGetSiteJournalResponse other = (DoGetSiteJournalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.siteJournalArray==null && other.getSiteJournalArray()==null) || 
             (this.siteJournalArray!=null &&
              this.siteJournalArray.equals(other.getSiteJournalArray())));
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
        if (getSiteJournalArray() != null) {
            _hashCode += getSiteJournalArray().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSiteJournalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteJournalArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "siteJournalArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournal"));
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

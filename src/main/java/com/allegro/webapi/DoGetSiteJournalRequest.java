/**
 * DoGetSiteJournalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetSiteJournalRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private java.lang.Long startingPoint;

    private java.lang.Integer infoType;

    public DoGetSiteJournalRequest() {
    }

    public DoGetSiteJournalRequest(
           java.lang.String sessionHandle,
           java.lang.Long startingPoint,
           java.lang.Integer infoType) {
           this.sessionHandle = sessionHandle;
           this.startingPoint = startingPoint;
           this.infoType = infoType;
    }


    /**
     * Gets the sessionHandle value for this DoGetSiteJournalRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetSiteJournalRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the startingPoint value for this DoGetSiteJournalRequest.
     * 
     * @return startingPoint
     */
    public java.lang.Long getStartingPoint() {
        return startingPoint;
    }


    /**
     * Sets the startingPoint value for this DoGetSiteJournalRequest.
     * 
     * @param startingPoint
     */
    public void setStartingPoint(java.lang.Long startingPoint) {
        this.startingPoint = startingPoint;
    }


    /**
     * Gets the infoType value for this DoGetSiteJournalRequest.
     * 
     * @return infoType
     */
    public java.lang.Integer getInfoType() {
        return infoType;
    }


    /**
     * Sets the infoType value for this DoGetSiteJournalRequest.
     * 
     * @param infoType
     */
    public void setInfoType(java.lang.Integer infoType) {
        this.infoType = infoType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSiteJournalRequest)) return false;
        DoGetSiteJournalRequest other = (DoGetSiteJournalRequest) obj;
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
            ((this.startingPoint==null && other.getStartingPoint()==null) || 
             (this.startingPoint!=null &&
              this.startingPoint.equals(other.getStartingPoint()))) &&
            ((this.infoType==null && other.getInfoType()==null) || 
             (this.infoType!=null &&
              this.infoType.equals(other.getInfoType())));
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
        if (getStartingPoint() != null) {
            _hashCode += getStartingPoint().hashCode();
        }
        if (getInfoType() != null) {
            _hashCode += getInfoType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSiteJournalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "startingPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "infoType"));
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

/**
 * DoGetMyPayoutsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyPayoutsRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private java.lang.Long transCreateDateFrom;

    private java.lang.Long transCreateDateTo;

    private java.lang.Integer transPageLimit;

    private java.lang.Integer transOffset;

    public DoGetMyPayoutsRequest() {
    }

    public DoGetMyPayoutsRequest(
           java.lang.String sessionHandle,
           java.lang.Long transCreateDateFrom,
           java.lang.Long transCreateDateTo,
           java.lang.Integer transPageLimit,
           java.lang.Integer transOffset) {
           this.sessionHandle = sessionHandle;
           this.transCreateDateFrom = transCreateDateFrom;
           this.transCreateDateTo = transCreateDateTo;
           this.transPageLimit = transPageLimit;
           this.transOffset = transOffset;
    }


    /**
     * Gets the sessionHandle value for this DoGetMyPayoutsRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetMyPayoutsRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the transCreateDateFrom value for this DoGetMyPayoutsRequest.
     * 
     * @return transCreateDateFrom
     */
    public java.lang.Long getTransCreateDateFrom() {
        return transCreateDateFrom;
    }


    /**
     * Sets the transCreateDateFrom value for this DoGetMyPayoutsRequest.
     * 
     * @param transCreateDateFrom
     */
    public void setTransCreateDateFrom(java.lang.Long transCreateDateFrom) {
        this.transCreateDateFrom = transCreateDateFrom;
    }


    /**
     * Gets the transCreateDateTo value for this DoGetMyPayoutsRequest.
     * 
     * @return transCreateDateTo
     */
    public java.lang.Long getTransCreateDateTo() {
        return transCreateDateTo;
    }


    /**
     * Sets the transCreateDateTo value for this DoGetMyPayoutsRequest.
     * 
     * @param transCreateDateTo
     */
    public void setTransCreateDateTo(java.lang.Long transCreateDateTo) {
        this.transCreateDateTo = transCreateDateTo;
    }


    /**
     * Gets the transPageLimit value for this DoGetMyPayoutsRequest.
     * 
     * @return transPageLimit
     */
    public java.lang.Integer getTransPageLimit() {
        return transPageLimit;
    }


    /**
     * Sets the transPageLimit value for this DoGetMyPayoutsRequest.
     * 
     * @param transPageLimit
     */
    public void setTransPageLimit(java.lang.Integer transPageLimit) {
        this.transPageLimit = transPageLimit;
    }


    /**
     * Gets the transOffset value for this DoGetMyPayoutsRequest.
     * 
     * @return transOffset
     */
    public java.lang.Integer getTransOffset() {
        return transOffset;
    }


    /**
     * Sets the transOffset value for this DoGetMyPayoutsRequest.
     * 
     * @param transOffset
     */
    public void setTransOffset(java.lang.Integer transOffset) {
        this.transOffset = transOffset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyPayoutsRequest)) return false;
        DoGetMyPayoutsRequest other = (DoGetMyPayoutsRequest) obj;
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
            ((this.transCreateDateFrom==null && other.getTransCreateDateFrom()==null) || 
             (this.transCreateDateFrom!=null &&
              this.transCreateDateFrom.equals(other.getTransCreateDateFrom()))) &&
            ((this.transCreateDateTo==null && other.getTransCreateDateTo()==null) || 
             (this.transCreateDateTo!=null &&
              this.transCreateDateTo.equals(other.getTransCreateDateTo()))) &&
            ((this.transPageLimit==null && other.getTransPageLimit()==null) || 
             (this.transPageLimit!=null &&
              this.transPageLimit.equals(other.getTransPageLimit()))) &&
            ((this.transOffset==null && other.getTransOffset()==null) || 
             (this.transOffset!=null &&
              this.transOffset.equals(other.getTransOffset())));
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
        if (getTransCreateDateFrom() != null) {
            _hashCode += getTransCreateDateFrom().hashCode();
        }
        if (getTransCreateDateTo() != null) {
            _hashCode += getTransCreateDateTo().hashCode();
        }
        if (getTransPageLimit() != null) {
            _hashCode += getTransPageLimit().hashCode();
        }
        if (getTransOffset() != null) {
            _hashCode += getTransOffset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyPayoutsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transCreateDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transCreateDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transCreateDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transCreateDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transPageLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transPageLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transOffset"));
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

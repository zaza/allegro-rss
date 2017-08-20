/**
 * DoGetCatsDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetCatsDataRequest  implements java.io.Serializable {
    private int countryId;

    private java.lang.Long localVersion;

    private java.lang.String webapiKey;

    private java.lang.Boolean onlyLeaf;

    public DoGetCatsDataRequest() {
    }

    public DoGetCatsDataRequest(
           int countryId,
           java.lang.Long localVersion,
           java.lang.String webapiKey,
           java.lang.Boolean onlyLeaf) {
           this.countryId = countryId;
           this.localVersion = localVersion;
           this.webapiKey = webapiKey;
           this.onlyLeaf = onlyLeaf;
    }


    /**
     * Gets the countryId value for this DoGetCatsDataRequest.
     * 
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this DoGetCatsDataRequest.
     * 
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the localVersion value for this DoGetCatsDataRequest.
     * 
     * @return localVersion
     */
    public java.lang.Long getLocalVersion() {
        return localVersion;
    }


    /**
     * Sets the localVersion value for this DoGetCatsDataRequest.
     * 
     * @param localVersion
     */
    public void setLocalVersion(java.lang.Long localVersion) {
        this.localVersion = localVersion;
    }


    /**
     * Gets the webapiKey value for this DoGetCatsDataRequest.
     * 
     * @return webapiKey
     */
    public java.lang.String getWebapiKey() {
        return webapiKey;
    }


    /**
     * Sets the webapiKey value for this DoGetCatsDataRequest.
     * 
     * @param webapiKey
     */
    public void setWebapiKey(java.lang.String webapiKey) {
        this.webapiKey = webapiKey;
    }


    /**
     * Gets the onlyLeaf value for this DoGetCatsDataRequest.
     * 
     * @return onlyLeaf
     */
    public java.lang.Boolean getOnlyLeaf() {
        return onlyLeaf;
    }


    /**
     * Sets the onlyLeaf value for this DoGetCatsDataRequest.
     * 
     * @param onlyLeaf
     */
    public void setOnlyLeaf(java.lang.Boolean onlyLeaf) {
        this.onlyLeaf = onlyLeaf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetCatsDataRequest)) return false;
        DoGetCatsDataRequest other = (DoGetCatsDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.countryId == other.getCountryId() &&
            ((this.localVersion==null && other.getLocalVersion()==null) || 
             (this.localVersion!=null &&
              this.localVersion.equals(other.getLocalVersion()))) &&
            ((this.webapiKey==null && other.getWebapiKey()==null) || 
             (this.webapiKey!=null &&
              this.webapiKey.equals(other.getWebapiKey()))) &&
            ((this.onlyLeaf==null && other.getOnlyLeaf()==null) || 
             (this.onlyLeaf!=null &&
              this.onlyLeaf.equals(other.getOnlyLeaf())));
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
        _hashCode += getCountryId();
        if (getLocalVersion() != null) {
            _hashCode += getLocalVersion().hashCode();
        }
        if (getWebapiKey() != null) {
            _hashCode += getWebapiKey().hashCode();
        }
        if (getOnlyLeaf() != null) {
            _hashCode += getOnlyLeaf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetCatsDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "localVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webapiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "webapiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlyLeaf");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "onlyLeaf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

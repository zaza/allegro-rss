/**
 * DoGetSellFormFieldsLimitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetSellFormFieldsLimitRequest  implements java.io.Serializable {
    private int countryCode;

    private long localVersion;

    private java.lang.String webapiKey;

    private int offset;

    private int packageElement;

    public DoGetSellFormFieldsLimitRequest() {
    }

    public DoGetSellFormFieldsLimitRequest(
           int countryCode,
           long localVersion,
           java.lang.String webapiKey,
           int offset,
           int packageElement) {
           this.countryCode = countryCode;
           this.localVersion = localVersion;
           this.webapiKey = webapiKey;
           this.offset = offset;
           this.packageElement = packageElement;
    }


    /**
     * Gets the countryCode value for this DoGetSellFormFieldsLimitRequest.
     * 
     * @return countryCode
     */
    public int getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this DoGetSellFormFieldsLimitRequest.
     * 
     * @param countryCode
     */
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the localVersion value for this DoGetSellFormFieldsLimitRequest.
     * 
     * @return localVersion
     */
    public long getLocalVersion() {
        return localVersion;
    }


    /**
     * Sets the localVersion value for this DoGetSellFormFieldsLimitRequest.
     * 
     * @param localVersion
     */
    public void setLocalVersion(long localVersion) {
        this.localVersion = localVersion;
    }


    /**
     * Gets the webapiKey value for this DoGetSellFormFieldsLimitRequest.
     * 
     * @return webapiKey
     */
    public java.lang.String getWebapiKey() {
        return webapiKey;
    }


    /**
     * Sets the webapiKey value for this DoGetSellFormFieldsLimitRequest.
     * 
     * @param webapiKey
     */
    public void setWebapiKey(java.lang.String webapiKey) {
        this.webapiKey = webapiKey;
    }


    /**
     * Gets the offset value for this DoGetSellFormFieldsLimitRequest.
     * 
     * @return offset
     */
    public int getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this DoGetSellFormFieldsLimitRequest.
     * 
     * @param offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }


    /**
     * Gets the packageElement value for this DoGetSellFormFieldsLimitRequest.
     * 
     * @return packageElement
     */
    public int getPackageElement() {
        return packageElement;
    }


    /**
     * Sets the packageElement value for this DoGetSellFormFieldsLimitRequest.
     * 
     * @param packageElement
     */
    public void setPackageElement(int packageElement) {
        this.packageElement = packageElement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSellFormFieldsLimitRequest)) return false;
        DoGetSellFormFieldsLimitRequest other = (DoGetSellFormFieldsLimitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.countryCode == other.getCountryCode() &&
            this.localVersion == other.getLocalVersion() &&
            ((this.webapiKey==null && other.getWebapiKey()==null) || 
             (this.webapiKey!=null &&
              this.webapiKey.equals(other.getWebapiKey()))) &&
            this.offset == other.getOffset() &&
            this.packageElement == other.getPackageElement();
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
        _hashCode += getCountryCode();
        _hashCode += new Long(getLocalVersion()).hashCode();
        if (getWebapiKey() != null) {
            _hashCode += getWebapiKey().hashCode();
        }
        _hashCode += getOffset();
        _hashCode += getPackageElement();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSellFormFieldsLimitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsLimitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "localVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webapiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "webapiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageElement");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "packageElement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

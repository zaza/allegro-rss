/**
 * PhotoInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PhotoInfoType  implements java.io.Serializable {
    private java.lang.String photoSize;

    private java.lang.String photoUrl;

    private boolean photoIsMain;

    public PhotoInfoType() {
    }

    public PhotoInfoType(
           java.lang.String photoSize,
           java.lang.String photoUrl,
           boolean photoIsMain) {
           this.photoSize = photoSize;
           this.photoUrl = photoUrl;
           this.photoIsMain = photoIsMain;
    }


    /**
     * Gets the photoSize value for this PhotoInfoType.
     * 
     * @return photoSize
     */
    public java.lang.String getPhotoSize() {
        return photoSize;
    }


    /**
     * Sets the photoSize value for this PhotoInfoType.
     * 
     * @param photoSize
     */
    public void setPhotoSize(java.lang.String photoSize) {
        this.photoSize = photoSize;
    }


    /**
     * Gets the photoUrl value for this PhotoInfoType.
     * 
     * @return photoUrl
     */
    public java.lang.String getPhotoUrl() {
        return photoUrl;
    }


    /**
     * Sets the photoUrl value for this PhotoInfoType.
     * 
     * @param photoUrl
     */
    public void setPhotoUrl(java.lang.String photoUrl) {
        this.photoUrl = photoUrl;
    }


    /**
     * Gets the photoIsMain value for this PhotoInfoType.
     * 
     * @return photoIsMain
     */
    public boolean isPhotoIsMain() {
        return photoIsMain;
    }


    /**
     * Sets the photoIsMain value for this PhotoInfoType.
     * 
     * @param photoIsMain
     */
    public void setPhotoIsMain(boolean photoIsMain) {
        this.photoIsMain = photoIsMain;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhotoInfoType)) return false;
        PhotoInfoType other = (PhotoInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.photoSize==null && other.getPhotoSize()==null) || 
             (this.photoSize!=null &&
              this.photoSize.equals(other.getPhotoSize()))) &&
            ((this.photoUrl==null && other.getPhotoUrl()==null) || 
             (this.photoUrl!=null &&
              this.photoUrl.equals(other.getPhotoUrl()))) &&
            this.photoIsMain == other.isPhotoIsMain();
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
        if (getPhotoSize() != null) {
            _hashCode += getPhotoSize().hashCode();
        }
        if (getPhotoUrl() != null) {
            _hashCode += getPhotoUrl().hashCode();
        }
        _hashCode += (isPhotoIsMain() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhotoInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PhotoInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "photoSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "photoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoIsMain");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "photoIsMain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

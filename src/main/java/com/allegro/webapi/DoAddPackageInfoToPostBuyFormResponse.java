/**
 * DoAddPackageInfoToPostBuyFormResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoAddPackageInfoToPostBuyFormResponse  implements java.io.Serializable {
    private com.allegro.webapi.PostBuyFormPackageInfoStruct postBuyFormPackageInfo;

    public DoAddPackageInfoToPostBuyFormResponse() {
    }

    public DoAddPackageInfoToPostBuyFormResponse(
           com.allegro.webapi.PostBuyFormPackageInfoStruct postBuyFormPackageInfo) {
           this.postBuyFormPackageInfo = postBuyFormPackageInfo;
    }


    /**
     * Gets the postBuyFormPackageInfo value for this DoAddPackageInfoToPostBuyFormResponse.
     * 
     * @return postBuyFormPackageInfo
     */
    public com.allegro.webapi.PostBuyFormPackageInfoStruct getPostBuyFormPackageInfo() {
        return postBuyFormPackageInfo;
    }


    /**
     * Sets the postBuyFormPackageInfo value for this DoAddPackageInfoToPostBuyFormResponse.
     * 
     * @param postBuyFormPackageInfo
     */
    public void setPostBuyFormPackageInfo(com.allegro.webapi.PostBuyFormPackageInfoStruct postBuyFormPackageInfo) {
        this.postBuyFormPackageInfo = postBuyFormPackageInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAddPackageInfoToPostBuyFormResponse)) return false;
        DoAddPackageInfoToPostBuyFormResponse other = (DoAddPackageInfoToPostBuyFormResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postBuyFormPackageInfo==null && other.getPostBuyFormPackageInfo()==null) || 
             (this.postBuyFormPackageInfo!=null &&
              this.postBuyFormPackageInfo.equals(other.getPostBuyFormPackageInfo())));
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
        if (getPostBuyFormPackageInfo() != null) {
            _hashCode += getPostBuyFormPackageInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAddPackageInfoToPostBuyFormResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPackageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "postBuyFormPackageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormPackageInfoStruct"));
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

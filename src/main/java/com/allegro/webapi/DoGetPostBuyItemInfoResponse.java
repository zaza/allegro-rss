/**
 * DoGetPostBuyItemInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetPostBuyItemInfoResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfPostbuyiteminfostruct itemPostBuyFormInfo;

    public DoGetPostBuyItemInfoResponse() {
    }

    public DoGetPostBuyItemInfoResponse(
           com.allegro.webapi.ArrayOfPostbuyiteminfostruct itemPostBuyFormInfo) {
           this.itemPostBuyFormInfo = itemPostBuyFormInfo;
    }


    /**
     * Gets the itemPostBuyFormInfo value for this DoGetPostBuyItemInfoResponse.
     * 
     * @return itemPostBuyFormInfo
     */
    public com.allegro.webapi.ArrayOfPostbuyiteminfostruct getItemPostBuyFormInfo() {
        return itemPostBuyFormInfo;
    }


    /**
     * Sets the itemPostBuyFormInfo value for this DoGetPostBuyItemInfoResponse.
     * 
     * @param itemPostBuyFormInfo
     */
    public void setItemPostBuyFormInfo(com.allegro.webapi.ArrayOfPostbuyiteminfostruct itemPostBuyFormInfo) {
        this.itemPostBuyFormInfo = itemPostBuyFormInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetPostBuyItemInfoResponse)) return false;
        DoGetPostBuyItemInfoResponse other = (DoGetPostBuyItemInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemPostBuyFormInfo==null && other.getItemPostBuyFormInfo()==null) || 
             (this.itemPostBuyFormInfo!=null &&
              this.itemPostBuyFormInfo.equals(other.getItemPostBuyFormInfo())));
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
        if (getItemPostBuyFormInfo() != null) {
            _hashCode += getItemPostBuyFormInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetPostBuyItemInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPostBuyFormInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPostBuyFormInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyiteminfostruct"));
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

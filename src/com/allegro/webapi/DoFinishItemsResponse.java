/**
 * DoFinishItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoFinishItemsResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfLong finishItemsSucceed;

    private com.allegro.webapi.ArrayOfFinishfailurestruct finishItemsFailed;

    public DoFinishItemsResponse() {
    }

    public DoFinishItemsResponse(
           com.allegro.webapi.ArrayOfLong finishItemsSucceed,
           com.allegro.webapi.ArrayOfFinishfailurestruct finishItemsFailed) {
           this.finishItemsSucceed = finishItemsSucceed;
           this.finishItemsFailed = finishItemsFailed;
    }


    /**
     * Gets the finishItemsSucceed value for this DoFinishItemsResponse.
     * 
     * @return finishItemsSucceed
     */
    public com.allegro.webapi.ArrayOfLong getFinishItemsSucceed() {
        return finishItemsSucceed;
    }


    /**
     * Sets the finishItemsSucceed value for this DoFinishItemsResponse.
     * 
     * @param finishItemsSucceed
     */
    public void setFinishItemsSucceed(com.allegro.webapi.ArrayOfLong finishItemsSucceed) {
        this.finishItemsSucceed = finishItemsSucceed;
    }


    /**
     * Gets the finishItemsFailed value for this DoFinishItemsResponse.
     * 
     * @return finishItemsFailed
     */
    public com.allegro.webapi.ArrayOfFinishfailurestruct getFinishItemsFailed() {
        return finishItemsFailed;
    }


    /**
     * Sets the finishItemsFailed value for this DoFinishItemsResponse.
     * 
     * @param finishItemsFailed
     */
    public void setFinishItemsFailed(com.allegro.webapi.ArrayOfFinishfailurestruct finishItemsFailed) {
        this.finishItemsFailed = finishItemsFailed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoFinishItemsResponse)) return false;
        DoFinishItemsResponse other = (DoFinishItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.finishItemsSucceed==null && other.getFinishItemsSucceed()==null) || 
             (this.finishItemsSucceed!=null &&
              this.finishItemsSucceed.equals(other.getFinishItemsSucceed()))) &&
            ((this.finishItemsFailed==null && other.getFinishItemsFailed()==null) || 
             (this.finishItemsFailed!=null &&
              this.finishItemsFailed.equals(other.getFinishItemsFailed())));
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
        if (getFinishItemsSucceed() != null) {
            _hashCode += getFinishItemsSucceed().hashCode();
        }
        if (getFinishItemsFailed() != null) {
            _hashCode += getFinishItemsFailed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoFinishItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishItemsSucceed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "finishItemsSucceed"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishItemsFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "finishItemsFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishfailurestruct"));
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

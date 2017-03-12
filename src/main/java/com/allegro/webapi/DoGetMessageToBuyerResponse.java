/**
 * DoGetMessageToBuyerResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMessageToBuyerResponse  implements java.io.Serializable {
    private com.allegro.webapi.MessageToBuyerStruct messageToBuyer;

    public DoGetMessageToBuyerResponse() {
    }

    public DoGetMessageToBuyerResponse(
           com.allegro.webapi.MessageToBuyerStruct messageToBuyer) {
           this.messageToBuyer = messageToBuyer;
    }


    /**
     * Gets the messageToBuyer value for this DoGetMessageToBuyerResponse.
     * 
     * @return messageToBuyer
     */
    public com.allegro.webapi.MessageToBuyerStruct getMessageToBuyer() {
        return messageToBuyer;
    }


    /**
     * Sets the messageToBuyer value for this DoGetMessageToBuyerResponse.
     * 
     * @param messageToBuyer
     */
    public void setMessageToBuyer(com.allegro.webapi.MessageToBuyerStruct messageToBuyer) {
        this.messageToBuyer = messageToBuyer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMessageToBuyerResponse)) return false;
        DoGetMessageToBuyerResponse other = (DoGetMessageToBuyerResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageToBuyer==null && other.getMessageToBuyer()==null) || 
             (this.messageToBuyer!=null &&
              this.messageToBuyer.equals(other.getMessageToBuyer())));
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
        if (getMessageToBuyer() != null) {
            _hashCode += getMessageToBuyer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMessageToBuyerResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMessageToBuyerResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageToBuyer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "messageToBuyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MessageToBuyerStruct"));
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

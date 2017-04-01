/**
 * AfterSalesServiceConditionsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class AfterSalesServiceConditionsStruct  implements java.io.Serializable {
    private java.lang.String impliedWarranty;

    private java.lang.String returnPolicy;

    private java.lang.String warranty;

    public AfterSalesServiceConditionsStruct() {
    }

    public AfterSalesServiceConditionsStruct(
           java.lang.String impliedWarranty,
           java.lang.String returnPolicy,
           java.lang.String warranty) {
           this.impliedWarranty = impliedWarranty;
           this.returnPolicy = returnPolicy;
           this.warranty = warranty;
    }


    /**
     * Gets the impliedWarranty value for this AfterSalesServiceConditionsStruct.
     * 
     * @return impliedWarranty
     */
    public java.lang.String getImpliedWarranty() {
        return impliedWarranty;
    }


    /**
     * Sets the impliedWarranty value for this AfterSalesServiceConditionsStruct.
     * 
     * @param impliedWarranty
     */
    public void setImpliedWarranty(java.lang.String impliedWarranty) {
        this.impliedWarranty = impliedWarranty;
    }


    /**
     * Gets the returnPolicy value for this AfterSalesServiceConditionsStruct.
     * 
     * @return returnPolicy
     */
    public java.lang.String getReturnPolicy() {
        return returnPolicy;
    }


    /**
     * Sets the returnPolicy value for this AfterSalesServiceConditionsStruct.
     * 
     * @param returnPolicy
     */
    public void setReturnPolicy(java.lang.String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }


    /**
     * Gets the warranty value for this AfterSalesServiceConditionsStruct.
     * 
     * @return warranty
     */
    public java.lang.String getWarranty() {
        return warranty;
    }


    /**
     * Sets the warranty value for this AfterSalesServiceConditionsStruct.
     * 
     * @param warranty
     */
    public void setWarranty(java.lang.String warranty) {
        this.warranty = warranty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AfterSalesServiceConditionsStruct)) return false;
        AfterSalesServiceConditionsStruct other = (AfterSalesServiceConditionsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.impliedWarranty==null && other.getImpliedWarranty()==null) || 
             (this.impliedWarranty!=null &&
              this.impliedWarranty.equals(other.getImpliedWarranty()))) &&
            ((this.returnPolicy==null && other.getReturnPolicy()==null) || 
             (this.returnPolicy!=null &&
              this.returnPolicy.equals(other.getReturnPolicy()))) &&
            ((this.warranty==null && other.getWarranty()==null) || 
             (this.warranty!=null &&
              this.warranty.equals(other.getWarranty())));
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
        if (getImpliedWarranty() != null) {
            _hashCode += getImpliedWarranty().hashCode();
        }
        if (getReturnPolicy() != null) {
            _hashCode += getReturnPolicy().hashCode();
        }
        if (getWarranty() != null) {
            _hashCode += getWarranty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AfterSalesServiceConditionsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AfterSalesServiceConditionsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impliedWarranty");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "impliedWarranty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "returnPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warranty");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "warranty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

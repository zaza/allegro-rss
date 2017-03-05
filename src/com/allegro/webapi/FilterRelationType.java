/**
 * FilterRelationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class FilterRelationType  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfString relationAnd;

    private com.allegro.webapi.ArrayOfString relationOr;

    private com.allegro.webapi.ArrayOfString relationExclude;

    public FilterRelationType() {
    }

    public FilterRelationType(
           com.allegro.webapi.ArrayOfString relationAnd,
           com.allegro.webapi.ArrayOfString relationOr,
           com.allegro.webapi.ArrayOfString relationExclude) {
           this.relationAnd = relationAnd;
           this.relationOr = relationOr;
           this.relationExclude = relationExclude;
    }


    /**
     * Gets the relationAnd value for this FilterRelationType.
     * 
     * @return relationAnd
     */
    public com.allegro.webapi.ArrayOfString getRelationAnd() {
        return relationAnd;
    }


    /**
     * Sets the relationAnd value for this FilterRelationType.
     * 
     * @param relationAnd
     */
    public void setRelationAnd(com.allegro.webapi.ArrayOfString relationAnd) {
        this.relationAnd = relationAnd;
    }


    /**
     * Gets the relationOr value for this FilterRelationType.
     * 
     * @return relationOr
     */
    public com.allegro.webapi.ArrayOfString getRelationOr() {
        return relationOr;
    }


    /**
     * Sets the relationOr value for this FilterRelationType.
     * 
     * @param relationOr
     */
    public void setRelationOr(com.allegro.webapi.ArrayOfString relationOr) {
        this.relationOr = relationOr;
    }


    /**
     * Gets the relationExclude value for this FilterRelationType.
     * 
     * @return relationExclude
     */
    public com.allegro.webapi.ArrayOfString getRelationExclude() {
        return relationExclude;
    }


    /**
     * Sets the relationExclude value for this FilterRelationType.
     * 
     * @param relationExclude
     */
    public void setRelationExclude(com.allegro.webapi.ArrayOfString relationExclude) {
        this.relationExclude = relationExclude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterRelationType)) return false;
        FilterRelationType other = (FilterRelationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relationAnd==null && other.getRelationAnd()==null) || 
             (this.relationAnd!=null &&
              this.relationAnd.equals(other.getRelationAnd()))) &&
            ((this.relationOr==null && other.getRelationOr()==null) || 
             (this.relationOr!=null &&
              this.relationOr.equals(other.getRelationOr()))) &&
            ((this.relationExclude==null && other.getRelationExclude()==null) || 
             (this.relationExclude!=null &&
              this.relationExclude.equals(other.getRelationExclude())));
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
        if (getRelationAnd() != null) {
            _hashCode += getRelationAnd().hashCode();
        }
        if (getRelationOr() != null) {
            _hashCode += getRelationOr().hashCode();
        }
        if (getRelationExclude() != null) {
            _hashCode += getRelationExclude().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterRelationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterRelationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationAnd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "relationAnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationOr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "relationOr"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationExclude");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "relationExclude"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
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

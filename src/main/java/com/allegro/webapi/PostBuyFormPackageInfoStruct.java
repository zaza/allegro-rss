/**
 * PostBuyFormPackageInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PostBuyFormPackageInfoStruct  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfString packageIdsAdded;

    private com.allegro.webapi.ArrayOfString packageIdsNotAddedIncorrectOperatorId;

    private com.allegro.webapi.ArrayOfString packageIdsNotAddedIncorrectPackageId;

    public PostBuyFormPackageInfoStruct() {
    }

    public PostBuyFormPackageInfoStruct(
           com.allegro.webapi.ArrayOfString packageIdsAdded,
           com.allegro.webapi.ArrayOfString packageIdsNotAddedIncorrectOperatorId,
           com.allegro.webapi.ArrayOfString packageIdsNotAddedIncorrectPackageId) {
           this.packageIdsAdded = packageIdsAdded;
           this.packageIdsNotAddedIncorrectOperatorId = packageIdsNotAddedIncorrectOperatorId;
           this.packageIdsNotAddedIncorrectPackageId = packageIdsNotAddedIncorrectPackageId;
    }


    /**
     * Gets the packageIdsAdded value for this PostBuyFormPackageInfoStruct.
     * 
     * @return packageIdsAdded
     */
    public com.allegro.webapi.ArrayOfString getPackageIdsAdded() {
        return packageIdsAdded;
    }


    /**
     * Sets the packageIdsAdded value for this PostBuyFormPackageInfoStruct.
     * 
     * @param packageIdsAdded
     */
    public void setPackageIdsAdded(com.allegro.webapi.ArrayOfString packageIdsAdded) {
        this.packageIdsAdded = packageIdsAdded;
    }


    /**
     * Gets the packageIdsNotAddedIncorrectOperatorId value for this PostBuyFormPackageInfoStruct.
     * 
     * @return packageIdsNotAddedIncorrectOperatorId
     */
    public com.allegro.webapi.ArrayOfString getPackageIdsNotAddedIncorrectOperatorId() {
        return packageIdsNotAddedIncorrectOperatorId;
    }


    /**
     * Sets the packageIdsNotAddedIncorrectOperatorId value for this PostBuyFormPackageInfoStruct.
     * 
     * @param packageIdsNotAddedIncorrectOperatorId
     */
    public void setPackageIdsNotAddedIncorrectOperatorId(com.allegro.webapi.ArrayOfString packageIdsNotAddedIncorrectOperatorId) {
        this.packageIdsNotAddedIncorrectOperatorId = packageIdsNotAddedIncorrectOperatorId;
    }


    /**
     * Gets the packageIdsNotAddedIncorrectPackageId value for this PostBuyFormPackageInfoStruct.
     * 
     * @return packageIdsNotAddedIncorrectPackageId
     */
    public com.allegro.webapi.ArrayOfString getPackageIdsNotAddedIncorrectPackageId() {
        return packageIdsNotAddedIncorrectPackageId;
    }


    /**
     * Sets the packageIdsNotAddedIncorrectPackageId value for this PostBuyFormPackageInfoStruct.
     * 
     * @param packageIdsNotAddedIncorrectPackageId
     */
    public void setPackageIdsNotAddedIncorrectPackageId(com.allegro.webapi.ArrayOfString packageIdsNotAddedIncorrectPackageId) {
        this.packageIdsNotAddedIncorrectPackageId = packageIdsNotAddedIncorrectPackageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormPackageInfoStruct)) return false;
        PostBuyFormPackageInfoStruct other = (PostBuyFormPackageInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageIdsAdded==null && other.getPackageIdsAdded()==null) || 
             (this.packageIdsAdded!=null &&
              this.packageIdsAdded.equals(other.getPackageIdsAdded()))) &&
            ((this.packageIdsNotAddedIncorrectOperatorId==null && other.getPackageIdsNotAddedIncorrectOperatorId()==null) || 
             (this.packageIdsNotAddedIncorrectOperatorId!=null &&
              this.packageIdsNotAddedIncorrectOperatorId.equals(other.getPackageIdsNotAddedIncorrectOperatorId()))) &&
            ((this.packageIdsNotAddedIncorrectPackageId==null && other.getPackageIdsNotAddedIncorrectPackageId()==null) || 
             (this.packageIdsNotAddedIncorrectPackageId!=null &&
              this.packageIdsNotAddedIncorrectPackageId.equals(other.getPackageIdsNotAddedIncorrectPackageId())));
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
        if (getPackageIdsAdded() != null) {
            _hashCode += getPackageIdsAdded().hashCode();
        }
        if (getPackageIdsNotAddedIncorrectOperatorId() != null) {
            _hashCode += getPackageIdsNotAddedIncorrectOperatorId().hashCode();
        }
        if (getPackageIdsNotAddedIncorrectPackageId() != null) {
            _hashCode += getPackageIdsNotAddedIncorrectPackageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostBuyFormPackageInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormPackageInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageIdsAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "packageIdsAdded"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageIdsNotAddedIncorrectOperatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "packageIdsNotAddedIncorrectOperatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageIdsNotAddedIncorrectPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "packageIdsNotAddedIncorrectPackageId"));
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

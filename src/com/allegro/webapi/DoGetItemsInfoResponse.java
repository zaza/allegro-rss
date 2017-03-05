/**
 * DoGetItemsInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetItemsInfoResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfIteminfostruct arrayItemListInfo;

    private com.allegro.webapi.ArrayOfLong arrayItemsNotFound;

    private com.allegro.webapi.ArrayOfLong arrayItemsAdminKilled;

    public DoGetItemsInfoResponse() {
    }

    public DoGetItemsInfoResponse(
           com.allegro.webapi.ArrayOfIteminfostruct arrayItemListInfo,
           com.allegro.webapi.ArrayOfLong arrayItemsNotFound,
           com.allegro.webapi.ArrayOfLong arrayItemsAdminKilled) {
           this.arrayItemListInfo = arrayItemListInfo;
           this.arrayItemsNotFound = arrayItemsNotFound;
           this.arrayItemsAdminKilled = arrayItemsAdminKilled;
    }


    /**
     * Gets the arrayItemListInfo value for this DoGetItemsInfoResponse.
     * 
     * @return arrayItemListInfo
     */
    public com.allegro.webapi.ArrayOfIteminfostruct getArrayItemListInfo() {
        return arrayItemListInfo;
    }


    /**
     * Sets the arrayItemListInfo value for this DoGetItemsInfoResponse.
     * 
     * @param arrayItemListInfo
     */
    public void setArrayItemListInfo(com.allegro.webapi.ArrayOfIteminfostruct arrayItemListInfo) {
        this.arrayItemListInfo = arrayItemListInfo;
    }


    /**
     * Gets the arrayItemsNotFound value for this DoGetItemsInfoResponse.
     * 
     * @return arrayItemsNotFound
     */
    public com.allegro.webapi.ArrayOfLong getArrayItemsNotFound() {
        return arrayItemsNotFound;
    }


    /**
     * Sets the arrayItemsNotFound value for this DoGetItemsInfoResponse.
     * 
     * @param arrayItemsNotFound
     */
    public void setArrayItemsNotFound(com.allegro.webapi.ArrayOfLong arrayItemsNotFound) {
        this.arrayItemsNotFound = arrayItemsNotFound;
    }


    /**
     * Gets the arrayItemsAdminKilled value for this DoGetItemsInfoResponse.
     * 
     * @return arrayItemsAdminKilled
     */
    public com.allegro.webapi.ArrayOfLong getArrayItemsAdminKilled() {
        return arrayItemsAdminKilled;
    }


    /**
     * Sets the arrayItemsAdminKilled value for this DoGetItemsInfoResponse.
     * 
     * @param arrayItemsAdminKilled
     */
    public void setArrayItemsAdminKilled(com.allegro.webapi.ArrayOfLong arrayItemsAdminKilled) {
        this.arrayItemsAdminKilled = arrayItemsAdminKilled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetItemsInfoResponse)) return false;
        DoGetItemsInfoResponse other = (DoGetItemsInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrayItemListInfo==null && other.getArrayItemListInfo()==null) || 
             (this.arrayItemListInfo!=null &&
              this.arrayItemListInfo.equals(other.getArrayItemListInfo()))) &&
            ((this.arrayItemsNotFound==null && other.getArrayItemsNotFound()==null) || 
             (this.arrayItemsNotFound!=null &&
              this.arrayItemsNotFound.equals(other.getArrayItemsNotFound()))) &&
            ((this.arrayItemsAdminKilled==null && other.getArrayItemsAdminKilled()==null) || 
             (this.arrayItemsAdminKilled!=null &&
              this.arrayItemsAdminKilled.equals(other.getArrayItemsAdminKilled())));
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
        if (getArrayItemListInfo() != null) {
            _hashCode += getArrayItemListInfo().hashCode();
        }
        if (getArrayItemsNotFound() != null) {
            _hashCode += getArrayItemsNotFound().hashCode();
        }
        if (getArrayItemsAdminKilled() != null) {
            _hashCode += getArrayItemsAdminKilled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetItemsInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayItemListInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "arrayItemListInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfIteminfostruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayItemsNotFound");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "arrayItemsNotFound"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayItemsAdminKilled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "arrayItemsAdminKilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
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

/**
 * DoShowItemInfoExtRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoShowItemInfoExtRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long itemId;

    private java.lang.Integer getDesc;

    private java.lang.Integer getImageUrl;

    private java.lang.Integer getAttribs;

    private java.lang.Integer getPostageOptions;

    private java.lang.Integer getCompanyInfo;

    private java.lang.Integer getProductInfo;

    private java.lang.Integer getAfterSalesServiceConditions;

    public DoShowItemInfoExtRequest() {
    }

    public DoShowItemInfoExtRequest(
           java.lang.String sessionHandle,
           long itemId,
           java.lang.Integer getDesc,
           java.lang.Integer getImageUrl,
           java.lang.Integer getAttribs,
           java.lang.Integer getPostageOptions,
           java.lang.Integer getCompanyInfo,
           java.lang.Integer getProductInfo,
           java.lang.Integer getAfterSalesServiceConditions) {
           this.sessionHandle = sessionHandle;
           this.itemId = itemId;
           this.getDesc = getDesc;
           this.getImageUrl = getImageUrl;
           this.getAttribs = getAttribs;
           this.getPostageOptions = getPostageOptions;
           this.getCompanyInfo = getCompanyInfo;
           this.getProductInfo = getProductInfo;
           this.getAfterSalesServiceConditions = getAfterSalesServiceConditions;
    }


    /**
     * Gets the sessionHandle value for this DoShowItemInfoExtRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoShowItemInfoExtRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the itemId value for this DoShowItemInfoExtRequest.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this DoShowItemInfoExtRequest.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the getDesc value for this DoShowItemInfoExtRequest.
     * 
     * @return getDesc
     */
    public java.lang.Integer getGetDesc() {
        return getDesc;
    }


    /**
     * Sets the getDesc value for this DoShowItemInfoExtRequest.
     * 
     * @param getDesc
     */
    public void setGetDesc(java.lang.Integer getDesc) {
        this.getDesc = getDesc;
    }


    /**
     * Gets the getImageUrl value for this DoShowItemInfoExtRequest.
     * 
     * @return getImageUrl
     */
    public java.lang.Integer getGetImageUrl() {
        return getImageUrl;
    }


    /**
     * Sets the getImageUrl value for this DoShowItemInfoExtRequest.
     * 
     * @param getImageUrl
     */
    public void setGetImageUrl(java.lang.Integer getImageUrl) {
        this.getImageUrl = getImageUrl;
    }


    /**
     * Gets the getAttribs value for this DoShowItemInfoExtRequest.
     * 
     * @return getAttribs
     */
    public java.lang.Integer getGetAttribs() {
        return getAttribs;
    }


    /**
     * Sets the getAttribs value for this DoShowItemInfoExtRequest.
     * 
     * @param getAttribs
     */
    public void setGetAttribs(java.lang.Integer getAttribs) {
        this.getAttribs = getAttribs;
    }


    /**
     * Gets the getPostageOptions value for this DoShowItemInfoExtRequest.
     * 
     * @return getPostageOptions
     */
    public java.lang.Integer getGetPostageOptions() {
        return getPostageOptions;
    }


    /**
     * Sets the getPostageOptions value for this DoShowItemInfoExtRequest.
     * 
     * @param getPostageOptions
     */
    public void setGetPostageOptions(java.lang.Integer getPostageOptions) {
        this.getPostageOptions = getPostageOptions;
    }


    /**
     * Gets the getCompanyInfo value for this DoShowItemInfoExtRequest.
     * 
     * @return getCompanyInfo
     */
    public java.lang.Integer getGetCompanyInfo() {
        return getCompanyInfo;
    }


    /**
     * Sets the getCompanyInfo value for this DoShowItemInfoExtRequest.
     * 
     * @param getCompanyInfo
     */
    public void setGetCompanyInfo(java.lang.Integer getCompanyInfo) {
        this.getCompanyInfo = getCompanyInfo;
    }


    /**
     * Gets the getProductInfo value for this DoShowItemInfoExtRequest.
     * 
     * @return getProductInfo
     */
    public java.lang.Integer getGetProductInfo() {
        return getProductInfo;
    }


    /**
     * Sets the getProductInfo value for this DoShowItemInfoExtRequest.
     * 
     * @param getProductInfo
     */
    public void setGetProductInfo(java.lang.Integer getProductInfo) {
        this.getProductInfo = getProductInfo;
    }


    /**
     * Gets the getAfterSalesServiceConditions value for this DoShowItemInfoExtRequest.
     * 
     * @return getAfterSalesServiceConditions
     */
    public java.lang.Integer getGetAfterSalesServiceConditions() {
        return getAfterSalesServiceConditions;
    }


    /**
     * Sets the getAfterSalesServiceConditions value for this DoShowItemInfoExtRequest.
     * 
     * @param getAfterSalesServiceConditions
     */
    public void setGetAfterSalesServiceConditions(java.lang.Integer getAfterSalesServiceConditions) {
        this.getAfterSalesServiceConditions = getAfterSalesServiceConditions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoShowItemInfoExtRequest)) return false;
        DoShowItemInfoExtRequest other = (DoShowItemInfoExtRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            this.itemId == other.getItemId() &&
            ((this.getDesc==null && other.getGetDesc()==null) || 
             (this.getDesc!=null &&
              this.getDesc.equals(other.getGetDesc()))) &&
            ((this.getImageUrl==null && other.getGetImageUrl()==null) || 
             (this.getImageUrl!=null &&
              this.getImageUrl.equals(other.getGetImageUrl()))) &&
            ((this.getAttribs==null && other.getGetAttribs()==null) || 
             (this.getAttribs!=null &&
              this.getAttribs.equals(other.getGetAttribs()))) &&
            ((this.getPostageOptions==null && other.getGetPostageOptions()==null) || 
             (this.getPostageOptions!=null &&
              this.getPostageOptions.equals(other.getGetPostageOptions()))) &&
            ((this.getCompanyInfo==null && other.getGetCompanyInfo()==null) || 
             (this.getCompanyInfo!=null &&
              this.getCompanyInfo.equals(other.getGetCompanyInfo()))) &&
            ((this.getProductInfo==null && other.getGetProductInfo()==null) || 
             (this.getProductInfo!=null &&
              this.getProductInfo.equals(other.getGetProductInfo()))) &&
            ((this.getAfterSalesServiceConditions==null && other.getGetAfterSalesServiceConditions()==null) || 
             (this.getAfterSalesServiceConditions!=null &&
              this.getAfterSalesServiceConditions.equals(other.getGetAfterSalesServiceConditions())));
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
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        _hashCode += new Long(getItemId()).hashCode();
        if (getGetDesc() != null) {
            _hashCode += getGetDesc().hashCode();
        }
        if (getGetImageUrl() != null) {
            _hashCode += getGetImageUrl().hashCode();
        }
        if (getGetAttribs() != null) {
            _hashCode += getGetAttribs().hashCode();
        }
        if (getGetPostageOptions() != null) {
            _hashCode += getGetPostageOptions().hashCode();
        }
        if (getGetCompanyInfo() != null) {
            _hashCode += getGetCompanyInfo().hashCode();
        }
        if (getGetProductInfo() != null) {
            _hashCode += getGetProductInfo().hashCode();
        }
        if (getGetAfterSalesServiceConditions() != null) {
            _hashCode += getGetAfterSalesServiceConditions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoShowItemInfoExtRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "getDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "getImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAttribs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "getAttribs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPostageOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "getPostageOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCompanyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "getCompanyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "getProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAfterSalesServiceConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "getAfterSalesServiceConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

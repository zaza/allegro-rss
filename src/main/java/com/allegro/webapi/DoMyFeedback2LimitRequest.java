/**
 * DoMyFeedback2LimitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoMyFeedback2LimitRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private java.lang.String feedbackType;

    private java.lang.Integer offset;

    private java.lang.Integer desc;

    private com.allegro.webapi.ArrayOfLong itemsArray;

    private java.lang.Integer packageElement;

    public DoMyFeedback2LimitRequest() {
    }

    public DoMyFeedback2LimitRequest(
           java.lang.String sessionHandle,
           java.lang.String feedbackType,
           java.lang.Integer offset,
           java.lang.Integer desc,
           com.allegro.webapi.ArrayOfLong itemsArray,
           java.lang.Integer packageElement) {
           this.sessionHandle = sessionHandle;
           this.feedbackType = feedbackType;
           this.offset = offset;
           this.desc = desc;
           this.itemsArray = itemsArray;
           this.packageElement = packageElement;
    }


    /**
     * Gets the sessionHandle value for this DoMyFeedback2LimitRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoMyFeedback2LimitRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the feedbackType value for this DoMyFeedback2LimitRequest.
     * 
     * @return feedbackType
     */
    public java.lang.String getFeedbackType() {
        return feedbackType;
    }


    /**
     * Sets the feedbackType value for this DoMyFeedback2LimitRequest.
     * 
     * @param feedbackType
     */
    public void setFeedbackType(java.lang.String feedbackType) {
        this.feedbackType = feedbackType;
    }


    /**
     * Gets the offset value for this DoMyFeedback2LimitRequest.
     * 
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this DoMyFeedback2LimitRequest.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }


    /**
     * Gets the desc value for this DoMyFeedback2LimitRequest.
     * 
     * @return desc
     */
    public java.lang.Integer getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this DoMyFeedback2LimitRequest.
     * 
     * @param desc
     */
    public void setDesc(java.lang.Integer desc) {
        this.desc = desc;
    }


    /**
     * Gets the itemsArray value for this DoMyFeedback2LimitRequest.
     * 
     * @return itemsArray
     */
    public com.allegro.webapi.ArrayOfLong getItemsArray() {
        return itemsArray;
    }


    /**
     * Sets the itemsArray value for this DoMyFeedback2LimitRequest.
     * 
     * @param itemsArray
     */
    public void setItemsArray(com.allegro.webapi.ArrayOfLong itemsArray) {
        this.itemsArray = itemsArray;
    }


    /**
     * Gets the packageElement value for this DoMyFeedback2LimitRequest.
     * 
     * @return packageElement
     */
    public java.lang.Integer getPackageElement() {
        return packageElement;
    }


    /**
     * Sets the packageElement value for this DoMyFeedback2LimitRequest.
     * 
     * @param packageElement
     */
    public void setPackageElement(java.lang.Integer packageElement) {
        this.packageElement = packageElement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoMyFeedback2LimitRequest)) return false;
        DoMyFeedback2LimitRequest other = (DoMyFeedback2LimitRequest) obj;
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
            ((this.feedbackType==null && other.getFeedbackType()==null) || 
             (this.feedbackType!=null &&
              this.feedbackType.equals(other.getFeedbackType()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.itemsArray==null && other.getItemsArray()==null) || 
             (this.itemsArray!=null &&
              this.itemsArray.equals(other.getItemsArray()))) &&
            ((this.packageElement==null && other.getPackageElement()==null) || 
             (this.packageElement!=null &&
              this.packageElement.equals(other.getPackageElement())));
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
        if (getFeedbackType() != null) {
            _hashCode += getFeedbackType().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getItemsArray() != null) {
            _hashCode += getItemsArray().hashCode();
        }
        if (getPackageElement() != null) {
            _hashCode += getPackageElement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoMyFeedback2LimitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2LimitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feedbackType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageElement");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "packageElement"));
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

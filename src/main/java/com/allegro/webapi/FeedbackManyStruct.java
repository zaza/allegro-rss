/**
 * FeedbackManyStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class FeedbackManyStruct  implements java.io.Serializable {
    private long feItemId;

    private java.lang.Integer feUseCommentTemplate;

    private int feToUserId;

    private java.lang.String feComment;

    private java.lang.String feCommentType;

    private int feOp;

    private com.allegro.webapi.ArrayOfSellratingestimationstruct feRating;

    public FeedbackManyStruct() {
    }

    public FeedbackManyStruct(
           long feItemId,
           java.lang.Integer feUseCommentTemplate,
           int feToUserId,
           java.lang.String feComment,
           java.lang.String feCommentType,
           int feOp,
           com.allegro.webapi.ArrayOfSellratingestimationstruct feRating) {
           this.feItemId = feItemId;
           this.feUseCommentTemplate = feUseCommentTemplate;
           this.feToUserId = feToUserId;
           this.feComment = feComment;
           this.feCommentType = feCommentType;
           this.feOp = feOp;
           this.feRating = feRating;
    }


    /**
     * Gets the feItemId value for this FeedbackManyStruct.
     * 
     * @return feItemId
     */
    public long getFeItemId() {
        return feItemId;
    }


    /**
     * Sets the feItemId value for this FeedbackManyStruct.
     * 
     * @param feItemId
     */
    public void setFeItemId(long feItemId) {
        this.feItemId = feItemId;
    }


    /**
     * Gets the feUseCommentTemplate value for this FeedbackManyStruct.
     * 
     * @return feUseCommentTemplate
     */
    public java.lang.Integer getFeUseCommentTemplate() {
        return feUseCommentTemplate;
    }


    /**
     * Sets the feUseCommentTemplate value for this FeedbackManyStruct.
     * 
     * @param feUseCommentTemplate
     */
    public void setFeUseCommentTemplate(java.lang.Integer feUseCommentTemplate) {
        this.feUseCommentTemplate = feUseCommentTemplate;
    }


    /**
     * Gets the feToUserId value for this FeedbackManyStruct.
     * 
     * @return feToUserId
     */
    public int getFeToUserId() {
        return feToUserId;
    }


    /**
     * Sets the feToUserId value for this FeedbackManyStruct.
     * 
     * @param feToUserId
     */
    public void setFeToUserId(int feToUserId) {
        this.feToUserId = feToUserId;
    }


    /**
     * Gets the feComment value for this FeedbackManyStruct.
     * 
     * @return feComment
     */
    public java.lang.String getFeComment() {
        return feComment;
    }


    /**
     * Sets the feComment value for this FeedbackManyStruct.
     * 
     * @param feComment
     */
    public void setFeComment(java.lang.String feComment) {
        this.feComment = feComment;
    }


    /**
     * Gets the feCommentType value for this FeedbackManyStruct.
     * 
     * @return feCommentType
     */
    public java.lang.String getFeCommentType() {
        return feCommentType;
    }


    /**
     * Sets the feCommentType value for this FeedbackManyStruct.
     * 
     * @param feCommentType
     */
    public void setFeCommentType(java.lang.String feCommentType) {
        this.feCommentType = feCommentType;
    }


    /**
     * Gets the feOp value for this FeedbackManyStruct.
     * 
     * @return feOp
     */
    public int getFeOp() {
        return feOp;
    }


    /**
     * Sets the feOp value for this FeedbackManyStruct.
     * 
     * @param feOp
     */
    public void setFeOp(int feOp) {
        this.feOp = feOp;
    }


    /**
     * Gets the feRating value for this FeedbackManyStruct.
     * 
     * @return feRating
     */
    public com.allegro.webapi.ArrayOfSellratingestimationstruct getFeRating() {
        return feRating;
    }


    /**
     * Sets the feRating value for this FeedbackManyStruct.
     * 
     * @param feRating
     */
    public void setFeRating(com.allegro.webapi.ArrayOfSellratingestimationstruct feRating) {
        this.feRating = feRating;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedbackManyStruct)) return false;
        FeedbackManyStruct other = (FeedbackManyStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.feItemId == other.getFeItemId() &&
            ((this.feUseCommentTemplate==null && other.getFeUseCommentTemplate()==null) || 
             (this.feUseCommentTemplate!=null &&
              this.feUseCommentTemplate.equals(other.getFeUseCommentTemplate()))) &&
            this.feToUserId == other.getFeToUserId() &&
            ((this.feComment==null && other.getFeComment()==null) || 
             (this.feComment!=null &&
              this.feComment.equals(other.getFeComment()))) &&
            ((this.feCommentType==null && other.getFeCommentType()==null) || 
             (this.feCommentType!=null &&
              this.feCommentType.equals(other.getFeCommentType()))) &&
            this.feOp == other.getFeOp() &&
            ((this.feRating==null && other.getFeRating()==null) || 
             (this.feRating!=null &&
              this.feRating.equals(other.getFeRating())));
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
        _hashCode += new Long(getFeItemId()).hashCode();
        if (getFeUseCommentTemplate() != null) {
            _hashCode += getFeUseCommentTemplate().hashCode();
        }
        _hashCode += getFeToUserId();
        if (getFeComment() != null) {
            _hashCode += getFeComment().hashCode();
        }
        if (getFeCommentType() != null) {
            _hashCode += getFeCommentType().hashCode();
        }
        _hashCode += getFeOp();
        if (getFeRating() != null) {
            _hashCode += getFeRating().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedbackManyStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackManyStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feUseCommentTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feUseCommentTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feToUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feToUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feComment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feCommentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feCommentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feOp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feRating");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "feRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingestimationstruct"));
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

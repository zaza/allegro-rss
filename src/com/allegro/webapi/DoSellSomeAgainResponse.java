/**
 * DoSellSomeAgainResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoSellSomeAgainResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfStructsellagain itemsSellAgain;

    private com.allegro.webapi.ArrayOfStructsellfailed itemsSellFailed;

    private com.allegro.webapi.ArrayOfLong itemsSellNotFound;

    public DoSellSomeAgainResponse() {
    }

    public DoSellSomeAgainResponse(
           com.allegro.webapi.ArrayOfStructsellagain itemsSellAgain,
           com.allegro.webapi.ArrayOfStructsellfailed itemsSellFailed,
           com.allegro.webapi.ArrayOfLong itemsSellNotFound) {
           this.itemsSellAgain = itemsSellAgain;
           this.itemsSellFailed = itemsSellFailed;
           this.itemsSellNotFound = itemsSellNotFound;
    }


    /**
     * Gets the itemsSellAgain value for this DoSellSomeAgainResponse.
     * 
     * @return itemsSellAgain
     */
    public com.allegro.webapi.ArrayOfStructsellagain getItemsSellAgain() {
        return itemsSellAgain;
    }


    /**
     * Sets the itemsSellAgain value for this DoSellSomeAgainResponse.
     * 
     * @param itemsSellAgain
     */
    public void setItemsSellAgain(com.allegro.webapi.ArrayOfStructsellagain itemsSellAgain) {
        this.itemsSellAgain = itemsSellAgain;
    }


    /**
     * Gets the itemsSellFailed value for this DoSellSomeAgainResponse.
     * 
     * @return itemsSellFailed
     */
    public com.allegro.webapi.ArrayOfStructsellfailed getItemsSellFailed() {
        return itemsSellFailed;
    }


    /**
     * Sets the itemsSellFailed value for this DoSellSomeAgainResponse.
     * 
     * @param itemsSellFailed
     */
    public void setItemsSellFailed(com.allegro.webapi.ArrayOfStructsellfailed itemsSellFailed) {
        this.itemsSellFailed = itemsSellFailed;
    }


    /**
     * Gets the itemsSellNotFound value for this DoSellSomeAgainResponse.
     * 
     * @return itemsSellNotFound
     */
    public com.allegro.webapi.ArrayOfLong getItemsSellNotFound() {
        return itemsSellNotFound;
    }


    /**
     * Sets the itemsSellNotFound value for this DoSellSomeAgainResponse.
     * 
     * @param itemsSellNotFound
     */
    public void setItemsSellNotFound(com.allegro.webapi.ArrayOfLong itemsSellNotFound) {
        this.itemsSellNotFound = itemsSellNotFound;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSellSomeAgainResponse)) return false;
        DoSellSomeAgainResponse other = (DoSellSomeAgainResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemsSellAgain==null && other.getItemsSellAgain()==null) || 
             (this.itemsSellAgain!=null &&
              this.itemsSellAgain.equals(other.getItemsSellAgain()))) &&
            ((this.itemsSellFailed==null && other.getItemsSellFailed()==null) || 
             (this.itemsSellFailed!=null &&
              this.itemsSellFailed.equals(other.getItemsSellFailed()))) &&
            ((this.itemsSellNotFound==null && other.getItemsSellNotFound()==null) || 
             (this.itemsSellNotFound!=null &&
              this.itemsSellNotFound.equals(other.getItemsSellNotFound())));
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
        if (getItemsSellAgain() != null) {
            _hashCode += getItemsSellAgain().hashCode();
        }
        if (getItemsSellFailed() != null) {
            _hashCode += getItemsSellFailed().hashCode();
        }
        if (getItemsSellNotFound() != null) {
            _hashCode += getItemsSellNotFound().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSellSomeAgainResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsSellAgain");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsSellAgain"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellagain"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsSellFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsSellFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellfailed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsSellNotFound");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsSellNotFound"));
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

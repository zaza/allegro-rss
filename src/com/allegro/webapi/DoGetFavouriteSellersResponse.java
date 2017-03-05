/**
 * DoGetFavouriteSellersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetFavouriteSellersResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfFavouritessellersstruct sFavouriteSellersList;

    public DoGetFavouriteSellersResponse() {
    }

    public DoGetFavouriteSellersResponse(
           com.allegro.webapi.ArrayOfFavouritessellersstruct sFavouriteSellersList) {
           this.sFavouriteSellersList = sFavouriteSellersList;
    }


    /**
     * Gets the sFavouriteSellersList value for this DoGetFavouriteSellersResponse.
     * 
     * @return sFavouriteSellersList
     */
    public com.allegro.webapi.ArrayOfFavouritessellersstruct getSFavouriteSellersList() {
        return sFavouriteSellersList;
    }


    /**
     * Sets the sFavouriteSellersList value for this DoGetFavouriteSellersResponse.
     * 
     * @param sFavouriteSellersList
     */
    public void setSFavouriteSellersList(com.allegro.webapi.ArrayOfFavouritessellersstruct sFavouriteSellersList) {
        this.sFavouriteSellersList = sFavouriteSellersList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetFavouriteSellersResponse)) return false;
        DoGetFavouriteSellersResponse other = (DoGetFavouriteSellersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sFavouriteSellersList==null && other.getSFavouriteSellersList()==null) || 
             (this.sFavouriteSellersList!=null &&
              this.sFavouriteSellersList.equals(other.getSFavouriteSellersList())));
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
        if (getSFavouriteSellersList() != null) {
            _hashCode += getSFavouriteSellersList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetFavouriteSellersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteSellersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFavouriteSellersList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sFavouriteSellersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFavouritessellersstruct"));
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

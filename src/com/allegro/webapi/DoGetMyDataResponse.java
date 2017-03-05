/**
 * DoGetMyDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetMyDataResponse  implements java.io.Serializable {
    private com.allegro.webapi.UserDataStruct userData;

    private com.allegro.webapi.InvoiceDataStruct invoiceData;

    private com.allegro.webapi.CompanyExtraDataStruct companyExtraData;

    private com.allegro.webapi.CompanySecondAddressStruct companySecondAddress;

    private com.allegro.webapi.PharmacyDataStruct pharmacyData;

    private com.allegro.webapi.AlcoholDataStruct alcoholData;

    private com.allegro.webapi.RelatedPersonsStruct relatedPersons;

    public DoGetMyDataResponse() {
    }

    public DoGetMyDataResponse(
           com.allegro.webapi.UserDataStruct userData,
           com.allegro.webapi.InvoiceDataStruct invoiceData,
           com.allegro.webapi.CompanyExtraDataStruct companyExtraData,
           com.allegro.webapi.CompanySecondAddressStruct companySecondAddress,
           com.allegro.webapi.PharmacyDataStruct pharmacyData,
           com.allegro.webapi.AlcoholDataStruct alcoholData,
           com.allegro.webapi.RelatedPersonsStruct relatedPersons) {
           this.userData = userData;
           this.invoiceData = invoiceData;
           this.companyExtraData = companyExtraData;
           this.companySecondAddress = companySecondAddress;
           this.pharmacyData = pharmacyData;
           this.alcoholData = alcoholData;
           this.relatedPersons = relatedPersons;
    }


    /**
     * Gets the userData value for this DoGetMyDataResponse.
     * 
     * @return userData
     */
    public com.allegro.webapi.UserDataStruct getUserData() {
        return userData;
    }


    /**
     * Sets the userData value for this DoGetMyDataResponse.
     * 
     * @param userData
     */
    public void setUserData(com.allegro.webapi.UserDataStruct userData) {
        this.userData = userData;
    }


    /**
     * Gets the invoiceData value for this DoGetMyDataResponse.
     * 
     * @return invoiceData
     */
    public com.allegro.webapi.InvoiceDataStruct getInvoiceData() {
        return invoiceData;
    }


    /**
     * Sets the invoiceData value for this DoGetMyDataResponse.
     * 
     * @param invoiceData
     */
    public void setInvoiceData(com.allegro.webapi.InvoiceDataStruct invoiceData) {
        this.invoiceData = invoiceData;
    }


    /**
     * Gets the companyExtraData value for this DoGetMyDataResponse.
     * 
     * @return companyExtraData
     */
    public com.allegro.webapi.CompanyExtraDataStruct getCompanyExtraData() {
        return companyExtraData;
    }


    /**
     * Sets the companyExtraData value for this DoGetMyDataResponse.
     * 
     * @param companyExtraData
     */
    public void setCompanyExtraData(com.allegro.webapi.CompanyExtraDataStruct companyExtraData) {
        this.companyExtraData = companyExtraData;
    }


    /**
     * Gets the companySecondAddress value for this DoGetMyDataResponse.
     * 
     * @return companySecondAddress
     */
    public com.allegro.webapi.CompanySecondAddressStruct getCompanySecondAddress() {
        return companySecondAddress;
    }


    /**
     * Sets the companySecondAddress value for this DoGetMyDataResponse.
     * 
     * @param companySecondAddress
     */
    public void setCompanySecondAddress(com.allegro.webapi.CompanySecondAddressStruct companySecondAddress) {
        this.companySecondAddress = companySecondAddress;
    }


    /**
     * Gets the pharmacyData value for this DoGetMyDataResponse.
     * 
     * @return pharmacyData
     */
    public com.allegro.webapi.PharmacyDataStruct getPharmacyData() {
        return pharmacyData;
    }


    /**
     * Sets the pharmacyData value for this DoGetMyDataResponse.
     * 
     * @param pharmacyData
     */
    public void setPharmacyData(com.allegro.webapi.PharmacyDataStruct pharmacyData) {
        this.pharmacyData = pharmacyData;
    }


    /**
     * Gets the alcoholData value for this DoGetMyDataResponse.
     * 
     * @return alcoholData
     */
    public com.allegro.webapi.AlcoholDataStruct getAlcoholData() {
        return alcoholData;
    }


    /**
     * Sets the alcoholData value for this DoGetMyDataResponse.
     * 
     * @param alcoholData
     */
    public void setAlcoholData(com.allegro.webapi.AlcoholDataStruct alcoholData) {
        this.alcoholData = alcoholData;
    }


    /**
     * Gets the relatedPersons value for this DoGetMyDataResponse.
     * 
     * @return relatedPersons
     */
    public com.allegro.webapi.RelatedPersonsStruct getRelatedPersons() {
        return relatedPersons;
    }


    /**
     * Sets the relatedPersons value for this DoGetMyDataResponse.
     * 
     * @param relatedPersons
     */
    public void setRelatedPersons(com.allegro.webapi.RelatedPersonsStruct relatedPersons) {
        this.relatedPersons = relatedPersons;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyDataResponse)) return false;
        DoGetMyDataResponse other = (DoGetMyDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userData==null && other.getUserData()==null) || 
             (this.userData!=null &&
              this.userData.equals(other.getUserData()))) &&
            ((this.invoiceData==null && other.getInvoiceData()==null) || 
             (this.invoiceData!=null &&
              this.invoiceData.equals(other.getInvoiceData()))) &&
            ((this.companyExtraData==null && other.getCompanyExtraData()==null) || 
             (this.companyExtraData!=null &&
              this.companyExtraData.equals(other.getCompanyExtraData()))) &&
            ((this.companySecondAddress==null && other.getCompanySecondAddress()==null) || 
             (this.companySecondAddress!=null &&
              this.companySecondAddress.equals(other.getCompanySecondAddress()))) &&
            ((this.pharmacyData==null && other.getPharmacyData()==null) || 
             (this.pharmacyData!=null &&
              this.pharmacyData.equals(other.getPharmacyData()))) &&
            ((this.alcoholData==null && other.getAlcoholData()==null) || 
             (this.alcoholData!=null &&
              this.alcoholData.equals(other.getAlcoholData()))) &&
            ((this.relatedPersons==null && other.getRelatedPersons()==null) || 
             (this.relatedPersons!=null &&
              this.relatedPersons.equals(other.getRelatedPersons())));
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
        if (getUserData() != null) {
            _hashCode += getUserData().hashCode();
        }
        if (getInvoiceData() != null) {
            _hashCode += getInvoiceData().hashCode();
        }
        if (getCompanyExtraData() != null) {
            _hashCode += getCompanyExtraData().hashCode();
        }
        if (getCompanySecondAddress() != null) {
            _hashCode += getCompanySecondAddress().hashCode();
        }
        if (getPharmacyData() != null) {
            _hashCode += getPharmacyData().hashCode();
        }
        if (getAlcoholData() != null) {
            _hashCode += getAlcoholData().hashCode();
        }
        if (getRelatedPersons() != null) {
            _hashCode += getRelatedPersons().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserDataStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "invoiceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceDataStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyExtraData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "companyExtraData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyExtraDataStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companySecondAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "companySecondAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanySecondAddressStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pharmacyData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "pharmacyData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyDataStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alcoholData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "alcoholData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AlcoholDataStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedPersons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "relatedPersons"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedPersonsStruct"));
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

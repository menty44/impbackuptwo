/**
 * CheckStatusReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CheckStatusReq  implements java.io.Serializable {
    private org.tempuri.Authenticate credentials;

    private java.lang.String partnerTransactionNo;

    private java.lang.String MTRefNo;

    private int productID;

    public CheckStatusReq() {
    }

    public CheckStatusReq(
           org.tempuri.Authenticate credentials,
           java.lang.String partnerTransactionNo,
           java.lang.String MTRefNo,
           int productID) {
           this.credentials = credentials;
           this.partnerTransactionNo = partnerTransactionNo;
           this.MTRefNo = MTRefNo;
           this.productID = productID;
    }


    /**
     * Gets the credentials value for this CheckStatusReq.
     * 
     * @return credentials
     */
    public org.tempuri.Authenticate getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this CheckStatusReq.
     * 
     * @param credentials
     */
    public void setCredentials(org.tempuri.Authenticate credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the partnerTransactionNo value for this CheckStatusReq.
     * 
     * @return partnerTransactionNo
     */
    public java.lang.String getPartnerTransactionNo() {
        return partnerTransactionNo;
    }


    /**
     * Sets the partnerTransactionNo value for this CheckStatusReq.
     * 
     * @param partnerTransactionNo
     */
    public void setPartnerTransactionNo(java.lang.String partnerTransactionNo) {
        this.partnerTransactionNo = partnerTransactionNo;
    }


    /**
     * Gets the MTRefNo value for this CheckStatusReq.
     * 
     * @return MTRefNo
     */
    public java.lang.String getMTRefNo() {
        return MTRefNo;
    }


    /**
     * Sets the MTRefNo value for this CheckStatusReq.
     * 
     * @param MTRefNo
     */
    public void setMTRefNo(java.lang.String MTRefNo) {
        this.MTRefNo = MTRefNo;
    }


    /**
     * Gets the productID value for this CheckStatusReq.
     * 
     * @return productID
     */
    public int getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this CheckStatusReq.
     * 
     * @param productID
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckStatusReq)) return false;
        CheckStatusReq other = (CheckStatusReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.partnerTransactionNo==null && other.getPartnerTransactionNo()==null) || 
             (this.partnerTransactionNo!=null &&
              this.partnerTransactionNo.equals(other.getPartnerTransactionNo()))) &&
            ((this.MTRefNo==null && other.getMTRefNo()==null) || 
             (this.MTRefNo!=null &&
              this.MTRefNo.equals(other.getMTRefNo()))) &&
            this.productID == other.getProductID();
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
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        if (getPartnerTransactionNo() != null) {
            _hashCode += getPartnerTransactionNo().hashCode();
        }
        if (getMTRefNo() != null) {
            _hashCode += getMTRefNo().hashCode();
        }
        _hashCode += getProductID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckStatusReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "CheckStatusReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Authenticate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTransactionNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PartnerTransactionNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MTRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

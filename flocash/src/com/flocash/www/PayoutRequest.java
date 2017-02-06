/**
 * PayoutRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flocash.www;

public class PayoutRequest  implements java.io.Serializable {
    private com.flocash.www.Authentication authentication;

    private com.flocash.www.Transaction transaction;

    public PayoutRequest() {
    }

    public PayoutRequest(
           com.flocash.www.Authentication authentication,
           com.flocash.www.Transaction transaction) {
           this.authentication = authentication;
           this.transaction = transaction;
    }


    /**
     * Gets the authentication value for this PayoutRequest.
     * 
     * @return authentication
     */
    public com.flocash.www.Authentication getAuthentication() {
        return authentication;
    }


    /**
     * Sets the authentication value for this PayoutRequest.
     * 
     * @param authentication
     */
    public void setAuthentication(com.flocash.www.Authentication authentication) {
        this.authentication = authentication;
    }


    /**
     * Gets the transaction value for this PayoutRequest.
     * 
     * @return transaction
     */
    public com.flocash.www.Transaction getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this PayoutRequest.
     * 
     * @param transaction
     */
    public void setTransaction(com.flocash.www.Transaction transaction) {
        this.transaction = transaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayoutRequest)) return false;
        PayoutRequest other = (PayoutRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authentication==null && other.getAuthentication()==null) || 
             (this.authentication!=null &&
              this.authentication.equals(other.getAuthentication()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction())));
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
        if (getAuthentication() != null) {
            _hashCode += getAuthentication().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayoutRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.flocash.com", ">PayoutRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "Authentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.flocash.com", "Authentication"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "Transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.flocash.com", "Transaction"));
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

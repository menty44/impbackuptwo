/**
 * GetExchangeRatesReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetExchangeRatesReq  implements java.io.Serializable {
    private org.tempuri.Authenticate credentials;

    private int productID;

    private java.lang.String destinationCurrency;

    private java.lang.String sourceCurrency;

    public GetExchangeRatesReq() {
    }

    public GetExchangeRatesReq(
           org.tempuri.Authenticate credentials,
           int productID,
           java.lang.String destinationCurrency,
           java.lang.String sourceCurrency) {
           this.credentials = credentials;
           this.productID = productID;
           this.destinationCurrency = destinationCurrency;
           this.sourceCurrency = sourceCurrency;
    }


    /**
     * Gets the credentials value for this GetExchangeRatesReq.
     * 
     * @return credentials
     */
    public org.tempuri.Authenticate getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this GetExchangeRatesReq.
     * 
     * @param credentials
     */
    public void setCredentials(org.tempuri.Authenticate credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the productID value for this GetExchangeRatesReq.
     * 
     * @return productID
     */
    public int getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this GetExchangeRatesReq.
     * 
     * @param productID
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }


    /**
     * Gets the destinationCurrency value for this GetExchangeRatesReq.
     * 
     * @return destinationCurrency
     */
    public java.lang.String getDestinationCurrency() {
        return destinationCurrency;
    }


    /**
     * Sets the destinationCurrency value for this GetExchangeRatesReq.
     * 
     * @param destinationCurrency
     */
    public void setDestinationCurrency(java.lang.String destinationCurrency) {
        this.destinationCurrency = destinationCurrency;
    }


    /**
     * Gets the sourceCurrency value for this GetExchangeRatesReq.
     * 
     * @return sourceCurrency
     */
    public java.lang.String getSourceCurrency() {
        return sourceCurrency;
    }


    /**
     * Sets the sourceCurrency value for this GetExchangeRatesReq.
     * 
     * @param sourceCurrency
     */
    public void setSourceCurrency(java.lang.String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExchangeRatesReq)) return false;
        GetExchangeRatesReq other = (GetExchangeRatesReq) obj;
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
            this.productID == other.getProductID() &&
            ((this.destinationCurrency==null && other.getDestinationCurrency()==null) || 
             (this.destinationCurrency!=null &&
              this.destinationCurrency.equals(other.getDestinationCurrency()))) &&
            ((this.sourceCurrency==null && other.getSourceCurrency()==null) || 
             (this.sourceCurrency!=null &&
              this.sourceCurrency.equals(other.getSourceCurrency())));
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
        _hashCode += getProductID();
        if (getDestinationCurrency() != null) {
            _hashCode += getDestinationCurrency().hashCode();
        }
        if (getSourceCurrency() != null) {
            _hashCode += getSourceCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExchangeRatesReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "GetExchangeRatesReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Authenticate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DestinationCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SourceCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

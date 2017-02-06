/**
 * Authentication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flocash.www;

public class Authentication  implements java.io.Serializable {
    private java.lang.String apiUsername;

    private java.lang.String apiPassword;

    private java.lang.String control;

    public Authentication() {
    }

    public Authentication(
           java.lang.String apiUsername,
           java.lang.String apiPassword,
           java.lang.String control) {
           this.apiUsername = apiUsername;
           this.apiPassword = apiPassword;
           this.control = control;
    }


    /**
     * Gets the apiUsername value for this Authentication.
     * 
     * @return apiUsername
     */
    public java.lang.String getApiUsername() {
        return apiUsername;
    }


    /**
     * Sets the apiUsername value for this Authentication.
     * 
     * @param apiUsername
     */
    public void setApiUsername(java.lang.String apiUsername) {
        this.apiUsername = apiUsername;
    }


    /**
     * Gets the apiPassword value for this Authentication.
     * 
     * @return apiPassword
     */
    public java.lang.String getApiPassword() {
        return apiPassword;
    }


    /**
     * Sets the apiPassword value for this Authentication.
     * 
     * @param apiPassword
     */
    public void setApiPassword(java.lang.String apiPassword) {
        this.apiPassword = apiPassword;
    }


    /**
     * Gets the control value for this Authentication.
     * 
     * @return control
     */
    public java.lang.String getControl() {
        return control;
    }


    /**
     * Sets the control value for this Authentication.
     * 
     * @param control
     */
    public void setControl(java.lang.String control) {
        this.control = control;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authentication)) return false;
        Authentication other = (Authentication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apiUsername==null && other.getApiUsername()==null) || 
             (this.apiUsername!=null &&
              this.apiUsername.equals(other.getApiUsername()))) &&
            ((this.apiPassword==null && other.getApiPassword()==null) || 
             (this.apiPassword!=null &&
              this.apiPassword.equals(other.getApiPassword()))) &&
            ((this.control==null && other.getControl()==null) || 
             (this.control!=null &&
              this.control.equals(other.getControl())));
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
        if (getApiUsername() != null) {
            _hashCode += getApiUsername().hashCode();
        }
        if (getApiPassword() != null) {
            _hashCode += getApiPassword().hashCode();
        }
        if (getControl() != null) {
            _hashCode += getControl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Authentication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.flocash.com", "Authentication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "apiUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "apiPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("control");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "control"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

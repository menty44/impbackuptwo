/**
 * RemittanceReQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class RemittanceReQ  implements java.io.Serializable {
    private org.tempuri.Authenticate credentials;

    private org.tempuri.SenderCreateREQ CBCR;

    private java.lang.String partnerTransactionNo;

    private java.util.Calendar processDateTime;

    private java.lang.String sourceCountry;

    private java.lang.String sourceCurrency;

    private java.lang.String destinationCountry;

    private java.lang.String destinationCurrency;

    private int productId;

    private java.math.BigDecimal localAmount;

    private java.math.BigDecimal payoutAmount;

    private java.math.BigDecimal exchangeRate;

    private java.lang.String payoutAgentID;

    private java.math.BigDecimal transferCharge;

    public RemittanceReQ() {
    }

    public RemittanceReQ(
           org.tempuri.Authenticate credentials,
           org.tempuri.SenderCreateREQ CBCR,
           java.lang.String partnerTransactionNo,
           java.util.Calendar processDateTime,
           java.lang.String sourceCountry,
           java.lang.String sourceCurrency,
           java.lang.String destinationCountry,
           java.lang.String destinationCurrency,
           int productId,
           java.math.BigDecimal localAmount,
           java.math.BigDecimal payoutAmount,
           java.math.BigDecimal exchangeRate,
           java.lang.String payoutAgentID,
           java.math.BigDecimal transferCharge) {
           this.credentials = credentials;
           this.CBCR = CBCR;
           this.partnerTransactionNo = partnerTransactionNo;
           this.processDateTime = processDateTime;
           this.sourceCountry = sourceCountry;
           this.sourceCurrency = sourceCurrency;
           this.destinationCountry = destinationCountry;
           this.destinationCurrency = destinationCurrency;
           this.productId = productId;
           this.localAmount = localAmount;
           this.payoutAmount = payoutAmount;
           this.exchangeRate = exchangeRate;
           this.payoutAgentID = payoutAgentID;
           this.transferCharge = transferCharge;
    }


    /**
     * Gets the credentials value for this RemittanceReQ.
     * 
     * @return credentials
     */
    public org.tempuri.Authenticate getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this RemittanceReQ.
     * 
     * @param credentials
     */
    public void setCredentials(org.tempuri.Authenticate credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the CBCR value for this RemittanceReQ.
     * 
     * @return CBCR
     */
    public org.tempuri.SenderCreateREQ getCBCR() {
        return CBCR;
    }


    /**
     * Sets the CBCR value for this RemittanceReQ.
     * 
     * @param CBCR
     */
    public void setCBCR(org.tempuri.SenderCreateREQ CBCR) {
        this.CBCR = CBCR;
    }


    /**
     * Gets the partnerTransactionNo value for this RemittanceReQ.
     * 
     * @return partnerTransactionNo
     */
    public java.lang.String getPartnerTransactionNo() {
        return partnerTransactionNo;
    }


    /**
     * Sets the partnerTransactionNo value for this RemittanceReQ.
     * 
     * @param partnerTransactionNo
     */
    public void setPartnerTransactionNo(java.lang.String partnerTransactionNo) {
        this.partnerTransactionNo = partnerTransactionNo;
    }


    /**
     * Gets the processDateTime value for this RemittanceReQ.
     * 
     * @return processDateTime
     */
    public java.util.Calendar getProcessDateTime() {
        return processDateTime;
    }


    /**
     * Sets the processDateTime value for this RemittanceReQ.
     * 
     * @param processDateTime
     */
    public void setProcessDateTime(java.util.Calendar processDateTime) {
        this.processDateTime = processDateTime;
    }


    /**
     * Gets the sourceCountry value for this RemittanceReQ.
     * 
     * @return sourceCountry
     */
    public java.lang.String getSourceCountry() {
        return sourceCountry;
    }


    /**
     * Sets the sourceCountry value for this RemittanceReQ.
     * 
     * @param sourceCountry
     */
    public void setSourceCountry(java.lang.String sourceCountry) {
        this.sourceCountry = sourceCountry;
    }


    /**
     * Gets the sourceCurrency value for this RemittanceReQ.
     * 
     * @return sourceCurrency
     */
    public java.lang.String getSourceCurrency() {
        return sourceCurrency;
    }


    /**
     * Sets the sourceCurrency value for this RemittanceReQ.
     * 
     * @param sourceCurrency
     */
    public void setSourceCurrency(java.lang.String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }


    /**
     * Gets the destinationCountry value for this RemittanceReQ.
     * 
     * @return destinationCountry
     */
    public java.lang.String getDestinationCountry() {
        return destinationCountry;
    }


    /**
     * Sets the destinationCountry value for this RemittanceReQ.
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(java.lang.String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }


    /**
     * Gets the destinationCurrency value for this RemittanceReQ.
     * 
     * @return destinationCurrency
     */
    public java.lang.String getDestinationCurrency() {
        return destinationCurrency;
    }


    /**
     * Sets the destinationCurrency value for this RemittanceReQ.
     * 
     * @param destinationCurrency
     */
    public void setDestinationCurrency(java.lang.String destinationCurrency) {
        this.destinationCurrency = destinationCurrency;
    }


    /**
     * Gets the productId value for this RemittanceReQ.
     * 
     * @return productId
     */
    public int getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this RemittanceReQ.
     * 
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }


    /**
     * Gets the localAmount value for this RemittanceReQ.
     * 
     * @return localAmount
     */
    public java.math.BigDecimal getLocalAmount() {
        return localAmount;
    }


    /**
     * Sets the localAmount value for this RemittanceReQ.
     * 
     * @param localAmount
     */
    public void setLocalAmount(java.math.BigDecimal localAmount) {
        this.localAmount = localAmount;
    }


    /**
     * Gets the payoutAmount value for this RemittanceReQ.
     * 
     * @return payoutAmount
     */
    public java.math.BigDecimal getPayoutAmount() {
        return payoutAmount;
    }


    /**
     * Sets the payoutAmount value for this RemittanceReQ.
     * 
     * @param payoutAmount
     */
    public void setPayoutAmount(java.math.BigDecimal payoutAmount) {
        this.payoutAmount = payoutAmount;
    }


    /**
     * Gets the exchangeRate value for this RemittanceReQ.
     * 
     * @return exchangeRate
     */
    public java.math.BigDecimal getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this RemittanceReQ.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.math.BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the payoutAgentID value for this RemittanceReQ.
     * 
     * @return payoutAgentID
     */
    public java.lang.String getPayoutAgentID() {
        return payoutAgentID;
    }


    /**
     * Sets the payoutAgentID value for this RemittanceReQ.
     * 
     * @param payoutAgentID
     */
    public void setPayoutAgentID(java.lang.String payoutAgentID) {
        this.payoutAgentID = payoutAgentID;
    }


    /**
     * Gets the transferCharge value for this RemittanceReQ.
     * 
     * @return transferCharge
     */
    public java.math.BigDecimal getTransferCharge() {
        return transferCharge;
    }


    /**
     * Sets the transferCharge value for this RemittanceReQ.
     * 
     * @param transferCharge
     */
    public void setTransferCharge(java.math.BigDecimal transferCharge) {
        this.transferCharge = transferCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemittanceReQ)) return false;
        RemittanceReQ other = (RemittanceReQ) obj;
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
            ((this.CBCR==null && other.getCBCR()==null) || 
             (this.CBCR!=null &&
              this.CBCR.equals(other.getCBCR()))) &&
            ((this.partnerTransactionNo==null && other.getPartnerTransactionNo()==null) || 
             (this.partnerTransactionNo!=null &&
              this.partnerTransactionNo.equals(other.getPartnerTransactionNo()))) &&
            ((this.processDateTime==null && other.getProcessDateTime()==null) || 
             (this.processDateTime!=null &&
              this.processDateTime.equals(other.getProcessDateTime()))) &&
            ((this.sourceCountry==null && other.getSourceCountry()==null) || 
             (this.sourceCountry!=null &&
              this.sourceCountry.equals(other.getSourceCountry()))) &&
            ((this.sourceCurrency==null && other.getSourceCurrency()==null) || 
             (this.sourceCurrency!=null &&
              this.sourceCurrency.equals(other.getSourceCurrency()))) &&
            ((this.destinationCountry==null && other.getDestinationCountry()==null) || 
             (this.destinationCountry!=null &&
              this.destinationCountry.equals(other.getDestinationCountry()))) &&
            ((this.destinationCurrency==null && other.getDestinationCurrency()==null) || 
             (this.destinationCurrency!=null &&
              this.destinationCurrency.equals(other.getDestinationCurrency()))) &&
            this.productId == other.getProductId() &&
            ((this.localAmount==null && other.getLocalAmount()==null) || 
             (this.localAmount!=null &&
              this.localAmount.equals(other.getLocalAmount()))) &&
            ((this.payoutAmount==null && other.getPayoutAmount()==null) || 
             (this.payoutAmount!=null &&
              this.payoutAmount.equals(other.getPayoutAmount()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.payoutAgentID==null && other.getPayoutAgentID()==null) || 
             (this.payoutAgentID!=null &&
              this.payoutAgentID.equals(other.getPayoutAgentID()))) &&
            ((this.transferCharge==null && other.getTransferCharge()==null) || 
             (this.transferCharge!=null &&
              this.transferCharge.equals(other.getTransferCharge())));
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
        if (getCBCR() != null) {
            _hashCode += getCBCR().hashCode();
        }
        if (getPartnerTransactionNo() != null) {
            _hashCode += getPartnerTransactionNo().hashCode();
        }
        if (getProcessDateTime() != null) {
            _hashCode += getProcessDateTime().hashCode();
        }
        if (getSourceCountry() != null) {
            _hashCode += getSourceCountry().hashCode();
        }
        if (getSourceCurrency() != null) {
            _hashCode += getSourceCurrency().hashCode();
        }
        if (getDestinationCountry() != null) {
            _hashCode += getDestinationCountry().hashCode();
        }
        if (getDestinationCurrency() != null) {
            _hashCode += getDestinationCurrency().hashCode();
        }
        _hashCode += getProductId();
        if (getLocalAmount() != null) {
            _hashCode += getLocalAmount().hashCode();
        }
        if (getPayoutAmount() != null) {
            _hashCode += getPayoutAmount().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getPayoutAgentID() != null) {
            _hashCode += getPayoutAgentID().hashCode();
        }
        if (getTransferCharge() != null) {
            _hashCode += getTransferCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemittanceReQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "RemittanceReQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Authenticate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CBCR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CBCR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SenderCreateREQ"));
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
        elemField.setFieldName("processDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProcessDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SourceCountry"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DestinationCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LocalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PayoutAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutAgentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PayoutAgentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TransferCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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

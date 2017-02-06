/**
 * Transaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flocash.www;

public class Transaction  implements java.io.Serializable {
    private java.lang.String requestID;

    private java.lang.String custom;

    private java.lang.String type;

    private java.math.BigDecimal amount;

    private java.math.BigDecimal settlementAmount;

    private java.lang.String settlementCurrency;

    private java.math.BigDecimal fee;

    private java.math.BigDecimal sendFee;

    private java.lang.String currency;

    private java.lang.String detail;

    private com.flocash.www.SenderInfo sender;

    private com.flocash.www.ReceiverInfo receiver;

    public Transaction() {
    }

    public Transaction(
           java.lang.String requestID,
           java.lang.String custom,
           java.lang.String type,
           java.math.BigDecimal amount,
           java.math.BigDecimal settlementAmount,
           java.lang.String settlementCurrency,
           java.math.BigDecimal fee,
           java.math.BigDecimal sendFee,
           java.lang.String currency,
           java.lang.String detail,
           com.flocash.www.SenderInfo sender,
           com.flocash.www.ReceiverInfo receiver) {
           this.requestID = requestID;
           this.custom = custom;
           this.type = type;
           this.amount = amount;
           this.settlementAmount = settlementAmount;
           this.settlementCurrency = settlementCurrency;
           this.fee = fee;
           this.sendFee = sendFee;
           this.currency = currency;
           this.detail = detail;
           this.sender = sender;
           this.receiver = receiver;
    }


    /**
     * Gets the requestID value for this Transaction.
     * 
     * @return requestID
     */
    public java.lang.String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this Transaction.
     * 
     * @param requestID
     */
    public void setRequestID(java.lang.String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the custom value for this Transaction.
     * 
     * @return custom
     */
    public java.lang.String getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this Transaction.
     * 
     * @param custom
     */
    public void setCustom(java.lang.String custom) {
        this.custom = custom;
    }


    /**
     * Gets the type value for this Transaction.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Transaction.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the amount value for this Transaction.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Transaction.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the settlementAmount value for this Transaction.
     * 
     * @return settlementAmount
     */
    public java.math.BigDecimal getSettlementAmount() {
        return settlementAmount;
    }


    /**
     * Sets the settlementAmount value for this Transaction.
     * 
     * @param settlementAmount
     */
    public void setSettlementAmount(java.math.BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
    }


    /**
     * Gets the settlementCurrency value for this Transaction.
     * 
     * @return settlementCurrency
     */
    public java.lang.String getSettlementCurrency() {
        return settlementCurrency;
    }


    /**
     * Sets the settlementCurrency value for this Transaction.
     * 
     * @param settlementCurrency
     */
    public void setSettlementCurrency(java.lang.String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }


    /**
     * Gets the fee value for this Transaction.
     * 
     * @return fee
     */
    public java.math.BigDecimal getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this Transaction.
     * 
     * @param fee
     */
    public void setFee(java.math.BigDecimal fee) {
        this.fee = fee;
    }


    /**
     * Gets the sendFee value for this Transaction.
     * 
     * @return sendFee
     */
    public java.math.BigDecimal getSendFee() {
        return sendFee;
    }


    /**
     * Sets the sendFee value for this Transaction.
     * 
     * @param sendFee
     */
    public void setSendFee(java.math.BigDecimal sendFee) {
        this.sendFee = sendFee;
    }


    /**
     * Gets the currency value for this Transaction.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Transaction.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the detail value for this Transaction.
     * 
     * @return detail
     */
    public java.lang.String getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this Transaction.
     * 
     * @param detail
     */
    public void setDetail(java.lang.String detail) {
        this.detail = detail;
    }


    /**
     * Gets the sender value for this Transaction.
     * 
     * @return sender
     */
    public com.flocash.www.SenderInfo getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this Transaction.
     * 
     * @param sender
     */
    public void setSender(com.flocash.www.SenderInfo sender) {
        this.sender = sender;
    }


    /**
     * Gets the receiver value for this Transaction.
     * 
     * @return receiver
     */
    public com.flocash.www.ReceiverInfo getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this Transaction.
     * 
     * @param receiver
     */
    public void setReceiver(com.flocash.www.ReceiverInfo receiver) {
        this.receiver = receiver;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transaction)) return false;
        Transaction other = (Transaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.settlementAmount==null && other.getSettlementAmount()==null) || 
             (this.settlementAmount!=null &&
              this.settlementAmount.equals(other.getSettlementAmount()))) &&
            ((this.settlementCurrency==null && other.getSettlementCurrency()==null) || 
             (this.settlementCurrency!=null &&
              this.settlementCurrency.equals(other.getSettlementCurrency()))) &&
            ((this.fee==null && other.getFee()==null) || 
             (this.fee!=null &&
              this.fee.equals(other.getFee()))) &&
            ((this.sendFee==null && other.getSendFee()==null) || 
             (this.sendFee!=null &&
              this.sendFee.equals(other.getSendFee()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver())));
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
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getSettlementAmount() != null) {
            _hashCode += getSettlementAmount().hashCode();
        }
        if (getSettlementCurrency() != null) {
            _hashCode += getSettlementCurrency().hashCode();
        }
        if (getFee() != null) {
            _hashCode += getFee().hashCode();
        }
        if (getSendFee() != null) {
            _hashCode += getSendFee().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Transaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.flocash.com", "Transaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "settlementAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "settlementCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "sendFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.flocash.com", "SenderInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.flocash.com", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.flocash.com", "ReceiverInfo"));
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

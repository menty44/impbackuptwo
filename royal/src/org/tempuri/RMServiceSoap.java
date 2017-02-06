/**
 * RMServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface RMServiceSoap extends java.rmi.Remote {
    public org.tempuri.RemittanceReS RMSendTransaction(org.tempuri.RemittanceReQ remReQ) throws java.rmi.RemoteException;
    public org.tempuri.CheckStatusRes RMStatusCheck(org.tempuri.CheckStatusReq scReQ) throws java.rmi.RemoteException;
    public org.tempuri.GetTransactionRes RMGetTransaction(org.tempuri.GetTransactionReq getTrnReQ) throws java.rmi.RemoteException;
    public org.tempuri.CancelTransactionRes RMCancelTransaction(org.tempuri.CancelTransactionReq canslTrnReq) throws java.rmi.RemoteException;
    public org.tempuri.GetExchangeRatesRes RMGetExchangeRates(org.tempuri.GetExchangeRatesReq getExchReQ) throws java.rmi.RemoteException;
}

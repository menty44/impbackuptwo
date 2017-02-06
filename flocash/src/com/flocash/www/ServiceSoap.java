/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flocash.www;

public interface ServiceSoap extends java.rmi.Remote {
    public com.flocash.www.CancelResponse cancelPayout(com.flocash.www.CancelRequest input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler;
    public com.flocash.www.FeeResponse getFee(com.flocash.www.FeeQuery input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler;
    public com.flocash.www.RateResponse getRate(com.flocash.www.RateQuery input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler;
    public com.flocash.www.Response payout(com.flocash.www.PayoutRequest input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler;
    public com.flocash.www.ValidateUserResponse validateUser(com.flocash.www.ValidateUserRequest input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler;
    public com.flocash.www.Response queryTrans(com.flocash.www.TransactionQuery input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler;
}

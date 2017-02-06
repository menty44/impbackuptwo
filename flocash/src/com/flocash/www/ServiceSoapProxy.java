package com.flocash.www;

public class ServiceSoapProxy implements com.flocash.www.ServiceSoap {
  private String _endpoint = null;
  private com.flocash.www.ServiceSoap serviceSoap = null;
  
  public ServiceSoapProxy() {
    _initServiceSoapProxy();
  }
  
  public ServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceSoapProxy();
  }
  
  private void _initServiceSoapProxy() {
    try {
      serviceSoap = (new com.flocash.payout.PayoutAPIServiceImplServiceLocator()).getPayoutAPIServiceImplPort();
      if (serviceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceSoap != null)
      ((javax.xml.rpc.Stub)serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.flocash.www.ServiceSoap getServiceSoap() {
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap;
  }
  
  public com.flocash.www.CancelResponse cancelPayout(com.flocash.www.CancelRequest input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.cancelPayout(input);
  }
  
  public com.flocash.www.FeeResponse getFee(com.flocash.www.FeeQuery input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getFee(input);
  }
  
  public com.flocash.www.RateResponse getRate(com.flocash.www.RateQuery input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getRate(input);
  }
  
  public com.flocash.www.Response payout(com.flocash.www.PayoutRequest input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.payout(input);
  }
  
  public com.flocash.www.ValidateUserResponse validateUser(com.flocash.www.ValidateUserRequest input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.validateUser(input);
  }
  
  public com.flocash.www.Response queryTrans(com.flocash.www.TransactionQuery input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.queryTrans(input);
  }
  
  
}
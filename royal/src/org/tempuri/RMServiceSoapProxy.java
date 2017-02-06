package org.tempuri;

public class RMServiceSoapProxy implements org.tempuri.RMServiceSoap {
  private String _endpoint = null;
  private org.tempuri.RMServiceSoap rMServiceSoap = null;
  
  public RMServiceSoapProxy() {
    _initRMServiceSoapProxy();
  }
  
  public RMServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initRMServiceSoapProxy();
  }
  
  private void _initRMServiceSoapProxy() {
    try {
      rMServiceSoap = (new org.tempuri.RMServiceLocator()).getRMServiceSoap();
      if (rMServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)rMServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)rMServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (rMServiceSoap != null)
      ((javax.xml.rpc.Stub)rMServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.RMServiceSoap getRMServiceSoap() {
    if (rMServiceSoap == null)
      _initRMServiceSoapProxy();
    return rMServiceSoap;
  }
  
  public org.tempuri.RemittanceReS RMSendTransaction(org.tempuri.RemittanceReQ remReQ) throws java.rmi.RemoteException{
    if (rMServiceSoap == null)
      _initRMServiceSoapProxy();
    return rMServiceSoap.RMSendTransaction(remReQ);
  }
  
  public org.tempuri.CheckStatusRes RMStatusCheck(org.tempuri.CheckStatusReq scReQ) throws java.rmi.RemoteException{
    if (rMServiceSoap == null)
      _initRMServiceSoapProxy();
    return rMServiceSoap.RMStatusCheck(scReQ);
  }
  
  public org.tempuri.GetTransactionRes RMGetTransaction(org.tempuri.GetTransactionReq getTrnReQ) throws java.rmi.RemoteException{
    if (rMServiceSoap == null)
      _initRMServiceSoapProxy();
    return rMServiceSoap.RMGetTransaction(getTrnReQ);
  }
  
  public org.tempuri.CancelTransactionRes RMCancelTransaction(org.tempuri.CancelTransactionReq canslTrnReq) throws java.rmi.RemoteException{
    if (rMServiceSoap == null)
      _initRMServiceSoapProxy();
    return rMServiceSoap.RMCancelTransaction(canslTrnReq);
  }
  
  public org.tempuri.GetExchangeRatesRes RMGetExchangeRates(org.tempuri.GetExchangeRatesReq getExchReQ) throws java.rmi.RemoteException{
    if (rMServiceSoap == null)
      _initRMServiceSoapProxy();
    return rMServiceSoap.RMGetExchangeRates(getExchReQ);
  }
  
  
}
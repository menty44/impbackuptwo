/**
 * PayoutAPIServiceImplPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flocash.payout;

public class PayoutAPIServiceImplPortBindingStub extends org.apache.axis.client.Stub implements com.flocash.www.ServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelPayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.flocash.com", "CancelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.flocash.com", ">CancelRequest"), com.flocash.www.CancelRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.flocash.com", ">CancelResponse"));
        oper.setReturnClass(com.flocash.www.CancelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.flocash.com", "CancelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"),
                      "com.flocash.www.ExceptionHandler",
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.flocash.com", "FeeQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.flocash.com", ">FeeQuery"), com.flocash.www.FeeQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.flocash.com", ">FeeResponse"));
        oper.setReturnClass(com.flocash.www.FeeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.flocash.com", "FeeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"),
                      "com.flocash.www.ExceptionHandler",
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.flocash.com", "RateQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.flocash.com", ">RateQuery"), com.flocash.www.RateQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.flocash.com", ">RateResponse"));
        oper.setReturnClass(com.flocash.www.RateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.flocash.com", "RateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"),
                      "com.flocash.www.ExceptionHandler",
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Payout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.flocash.com", "PayoutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.flocash.com", ">PayoutRequest"), com.flocash.www.PayoutRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.flocash.com", "Response"));
        oper.setReturnClass(com.flocash.www.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.flocash.com", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"),
                      "com.flocash.www.ExceptionHandler",
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidateUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.flocash.com", "ValidateUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.flocash.com", ">ValidateUserRequest"), com.flocash.www.ValidateUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.flocash.com", ">ValidateUserResponse"));
        oper.setReturnClass(com.flocash.www.ValidateUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.flocash.com", "ValidateUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"),
                      "com.flocash.www.ExceptionHandler",
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryTrans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.flocash.com", "TransactionQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.flocash.com", ">TransactionQuery"), com.flocash.www.TransactionQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.flocash.com", "Response"));
        oper.setReturnClass(com.flocash.www.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.flocash.com", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"),
                      "com.flocash.www.ExceptionHandler",
                      new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler"), 
                      true
                     ));
        _operations[5] = oper;

    }

    public PayoutAPIServiceImplPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PayoutAPIServiceImplPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PayoutAPIServiceImplPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.flocash.com", ">CancelRequest");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.CancelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", ">CancelResponse");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.CancelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", ">FeeQuery");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.FeeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", ">FeeResponse");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.FeeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", ">PayoutRequest");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.PayoutRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", ">RateQuery");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.RateQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", ">RateResponse");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.RateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", ">TransactionQuery");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.TransactionQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", ">ValidateUserRequest");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.ValidateUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", ">ValidateUserResponse");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.ValidateUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "Authentication");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.Authentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "ExceptionHandler");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.ExceptionHandler.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "Query");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "ReceiverInfo");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.ReceiverInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "Response");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "SenderInfo");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.SenderInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "Transaction");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.Transaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "TypeCancelRequest");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.TypeCancelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "TypeCancelResponse");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.TypeCancelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "TypeFeeQuery");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.TypeFeeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "TypeFeeResponse");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.TypeFeeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "TypeRateQuery");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.TypeRateQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "TypeRateResponse");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.TypeRateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "TypeValidateRequest");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.TypeValidateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.flocash.com", "TypeValidateResponse");
            cachedSerQNames.add(qName);
            cls = com.flocash.www.TypeValidateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.flocash.www.CancelResponse cancelPayout(com.flocash.www.CancelRequest input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CancelPayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flocash.www.CancelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flocash.www.CancelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.flocash.www.CancelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.flocash.www.ExceptionHandler) {
              throw (com.flocash.www.ExceptionHandler) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.flocash.www.FeeResponse getFee(com.flocash.www.FeeQuery input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flocash.www.FeeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flocash.www.FeeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.flocash.www.FeeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.flocash.www.ExceptionHandler) {
              throw (com.flocash.www.ExceptionHandler) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.flocash.www.RateResponse getRate(com.flocash.www.RateQuery input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flocash.www.RateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flocash.www.RateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.flocash.www.RateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.flocash.www.ExceptionHandler) {
              throw (com.flocash.www.ExceptionHandler) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.flocash.www.Response payout(com.flocash.www.PayoutRequest input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Payout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flocash.www.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flocash.www.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.flocash.www.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.flocash.www.ExceptionHandler) {
              throw (com.flocash.www.ExceptionHandler) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.flocash.www.ValidateUserResponse validateUser(com.flocash.www.ValidateUserRequest input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ValidateUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flocash.www.ValidateUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flocash.www.ValidateUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.flocash.www.ValidateUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.flocash.www.ExceptionHandler) {
              throw (com.flocash.www.ExceptionHandler) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.flocash.www.Response queryTrans(com.flocash.www.TransactionQuery input) throws java.rmi.RemoteException, com.flocash.www.ExceptionHandler {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryTrans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flocash.www.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flocash.www.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.flocash.www.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.flocash.www.ExceptionHandler) {
              throw (com.flocash.www.ExceptionHandler) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

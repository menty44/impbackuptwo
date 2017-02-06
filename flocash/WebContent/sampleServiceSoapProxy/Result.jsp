<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceSoapProxyid" scope="session" class="com.flocash.www.ServiceSoapProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceSoapProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleServiceSoapProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleServiceSoapProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.flocash.www.ServiceSoap getServiceSoap10mtemp = sampleServiceSoapProxyid.getServiceSoap();
if(getServiceSoap10mtemp == null){
%>
<%=getServiceSoap10mtemp %>
<%
}else{
        if(getServiceSoap10mtemp!= null){
        String tempreturnp11 = getServiceSoap10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String apiUsername_3id=  request.getParameter("apiUsername30");
            java.lang.String apiUsername_3idTemp = null;
        if(!apiUsername_3id.equals("")){
         apiUsername_3idTemp  = apiUsername_3id;
        }
        String apiPassword_4id=  request.getParameter("apiPassword32");
            java.lang.String apiPassword_4idTemp = null;
        if(!apiPassword_4id.equals("")){
         apiPassword_4idTemp  = apiPassword_4id;
        }
        String control_5id=  request.getParameter("control34");
            java.lang.String control_5idTemp = null;
        if(!control_5id.equals("")){
         control_5idTemp  = control_5id;
        }
        %>
        <jsp:useBean id="com1flocash1www1Authentication_2id" scope="session" class="com.flocash.www.Authentication" />
        <%
        com1flocash1www1Authentication_2id.setApiUsername(apiUsername_3idTemp);
        com1flocash1www1Authentication_2id.setApiPassword(apiPassword_4idTemp);
        com1flocash1www1Authentication_2id.setControl(control_5idTemp);
        String requestID_7id=  request.getParameter("requestID38");
            java.lang.String requestID_7idTemp = null;
        if(!requestID_7id.equals("")){
         requestID_7idTemp  = requestID_7id;
        }
        String remark_8id=  request.getParameter("remark40");
            java.lang.String remark_8idTemp = null;
        if(!remark_8id.equals("")){
         remark_8idTemp  = remark_8id;
        }
        String transactionID_9id=  request.getParameter("transactionID42");
            java.lang.String transactionID_9idTemp = null;
        if(!transactionID_9id.equals("")){
         transactionID_9idTemp  = transactionID_9id;
        }
        %>
        <jsp:useBean id="com1flocash1www1TypeCancelRequest_6id" scope="session" class="com.flocash.www.TypeCancelRequest" />
        <%
        com1flocash1www1TypeCancelRequest_6id.setRequestID(requestID_7idTemp);
        com1flocash1www1TypeCancelRequest_6id.setRemark(remark_8idTemp);
        com1flocash1www1TypeCancelRequest_6id.setTransactionID(transactionID_9idTemp);
        %>
        <jsp:useBean id="com1flocash1www1CancelRequest_1id" scope="session" class="com.flocash.www.CancelRequest" />
        <%
        com1flocash1www1CancelRequest_1id.setAuthentication(com1flocash1www1Authentication_2id);
        com1flocash1www1CancelRequest_1id.setTransaction(com1flocash1www1TypeCancelRequest_6id);
        com.flocash.www.CancelResponse cancelPayout13mtemp = sampleServiceSoapProxyid.cancelPayout(com1flocash1www1CancelRequest_1id);
if(cancelPayout13mtemp == null){
%>
<%=cancelPayout13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">response:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">status:</TD>
<TD>
<%
if(cancelPayout13mtemp != null){
com.flocash.www.TypeCancelResponse tebece0=cancelPayout13mtemp.getResponse();
if(tebece0 != null){
java.lang.String typestatus18 = tebece0.getStatus();
        String tempResultstatus18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus18));
        %>
        <%= tempResultstatus18 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">cancelMsg:</TD>
<TD>
<%
if(cancelPayout13mtemp != null){
com.flocash.www.TypeCancelResponse tebece0=cancelPayout13mtemp.getResponse();
if(tebece0 != null){
java.lang.String typecancelMsg20 = tebece0.getCancelMsg();
        String tempResultcancelMsg20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecancelMsg20));
        %>
        <%= tempResultcancelMsg20 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">requestID:</TD>
<TD>
<%
if(cancelPayout13mtemp != null){
com.flocash.www.TypeCancelResponse tebece0=cancelPayout13mtemp.getResponse();
if(tebece0 != null){
java.lang.String typerequestID22 = tebece0.getRequestID();
        String tempResultrequestID22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerequestID22));
        %>
        <%= tempResultrequestID22 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(cancelPayout13mtemp != null){
com.flocash.www.TypeCancelResponse tebece0=cancelPayout13mtemp.getResponse();
if(tebece0 != null){
java.lang.String typetransactionID24 = tebece0.getTransactionID();
        String tempResulttransactionID24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID24));
        %>
        <%= tempResulttransactionID24 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 44:
        gotMethod = true;
        String apiUsername_12id=  request.getParameter("apiUsername63");
            java.lang.String apiUsername_12idTemp = null;
        if(!apiUsername_12id.equals("")){
         apiUsername_12idTemp  = apiUsername_12id;
        }
        String apiPassword_13id=  request.getParameter("apiPassword65");
            java.lang.String apiPassword_13idTemp = null;
        if(!apiPassword_13id.equals("")){
         apiPassword_13idTemp  = apiPassword_13id;
        }
        String control_14id=  request.getParameter("control67");
            java.lang.String control_14idTemp = null;
        if(!control_14id.equals("")){
         control_14idTemp  = control_14id;
        }
        %>
        <jsp:useBean id="com1flocash1www1Authentication_11id" scope="session" class="com.flocash.www.Authentication" />
        <%
        com1flocash1www1Authentication_11id.setApiUsername(apiUsername_12idTemp);
        com1flocash1www1Authentication_11id.setApiPassword(apiPassword_13idTemp);
        com1flocash1www1Authentication_11id.setControl(control_14idTemp);
        String currency_16id=  request.getParameter("currency71");
            java.lang.String currency_16idTemp = null;
        if(!currency_16id.equals("")){
         currency_16idTemp  = currency_16id;
        }
        String amount_17id=  request.getParameter("amount73");
            java.math.BigDecimal amount_17idTemp = null;
        if(!amount_17id.equals("")){
         amount_17idTemp  = new java.math.BigDecimal(amount_17id);
        }
        String type_18id=  request.getParameter("type75");
            java.lang.String type_18idTemp = null;
        if(!type_18id.equals("")){
         type_18idTemp  = type_18id;
        }
        String requestID_19id=  request.getParameter("requestID77");
            java.lang.String requestID_19idTemp = null;
        if(!requestID_19id.equals("")){
         requestID_19idTemp  = requestID_19id;
        }
        String country_20id=  request.getParameter("country79");
            java.lang.String country_20idTemp = null;
        if(!country_20id.equals("")){
         country_20idTemp  = country_20id;
        }
        %>
        <jsp:useBean id="com1flocash1www1TypeFeeQuery_15id" scope="session" class="com.flocash.www.TypeFeeQuery" />
        <%
        com1flocash1www1TypeFeeQuery_15id.setCurrency(currency_16idTemp);
        com1flocash1www1TypeFeeQuery_15id.setAmount(amount_17idTemp);
        com1flocash1www1TypeFeeQuery_15id.setType(type_18idTemp);
        com1flocash1www1TypeFeeQuery_15id.setRequestID(requestID_19idTemp);
        com1flocash1www1TypeFeeQuery_15id.setCountry(country_20idTemp);
        %>
        <jsp:useBean id="com1flocash1www1FeeQuery_10id" scope="session" class="com.flocash.www.FeeQuery" />
        <%
        com1flocash1www1FeeQuery_10id.setAuthentication(com1flocash1www1Authentication_11id);
        com1flocash1www1FeeQuery_10id.setQuery(com1flocash1www1TypeFeeQuery_15id);
        com.flocash.www.FeeResponse getFee44mtemp = sampleServiceSoapProxyid.getFee(com1flocash1www1FeeQuery_10id);
if(getFee44mtemp == null){
%>
<%=getFee44mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">response:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">exchangeRate:</TD>
<TD>
<%
if(getFee44mtemp != null){
com.flocash.www.TypeFeeResponse tebece0=getFee44mtemp.getResponse();
if(tebece0 != null){
java.math.BigDecimal typeexchangeRate49 = tebece0.getExchangeRate();
        String tempResultexchangeRate49 = org.eclipse.jst.ws.util.JspUtils.markup(typeexchangeRate49.toString());
        %>
        <%= tempResultexchangeRate49 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">fee:</TD>
<TD>
<%
if(getFee44mtemp != null){
com.flocash.www.TypeFeeResponse tebece0=getFee44mtemp.getResponse();
if(tebece0 != null){
java.math.BigDecimal typefee51 = tebece0.getFee();
        String tempResultfee51 = org.eclipse.jst.ws.util.JspUtils.markup(typefee51.toString());
        %>
        <%= tempResultfee51 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">currency:</TD>
<TD>
<%
if(getFee44mtemp != null){
com.flocash.www.TypeFeeResponse tebece0=getFee44mtemp.getResponse();
if(tebece0 != null){
java.lang.String typecurrency53 = tebece0.getCurrency();
        String tempResultcurrency53 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecurrency53));
        %>
        <%= tempResultcurrency53 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">destCurrency:</TD>
<TD>
<%
if(getFee44mtemp != null){
com.flocash.www.TypeFeeResponse tebece0=getFee44mtemp.getResponse();
if(tebece0 != null){
java.lang.String typedestCurrency55 = tebece0.getDestCurrency();
        String tempResultdestCurrency55 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedestCurrency55));
        %>
        <%= tempResultdestCurrency55 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">requestID:</TD>
<TD>
<%
if(getFee44mtemp != null){
com.flocash.www.TypeFeeResponse tebece0=getFee44mtemp.getResponse();
if(tebece0 != null){
java.lang.String typerequestID57 = tebece0.getRequestID();
        String tempResultrequestID57 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerequestID57));
        %>
        <%= tempResultrequestID57 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 81:
        gotMethod = true;
        String apiUsername_23id=  request.getParameter("apiUsername100");
            java.lang.String apiUsername_23idTemp = null;
        if(!apiUsername_23id.equals("")){
         apiUsername_23idTemp  = apiUsername_23id;
        }
        String apiPassword_24id=  request.getParameter("apiPassword102");
            java.lang.String apiPassword_24idTemp = null;
        if(!apiPassword_24id.equals("")){
         apiPassword_24idTemp  = apiPassword_24id;
        }
        String control_25id=  request.getParameter("control104");
            java.lang.String control_25idTemp = null;
        if(!control_25id.equals("")){
         control_25idTemp  = control_25id;
        }
        %>
        <jsp:useBean id="com1flocash1www1Authentication_22id" scope="session" class="com.flocash.www.Authentication" />
        <%
        com1flocash1www1Authentication_22id.setApiUsername(apiUsername_23idTemp);
        com1flocash1www1Authentication_22id.setApiPassword(apiPassword_24idTemp);
        com1flocash1www1Authentication_22id.setControl(control_25idTemp);
        String destination_27id=  request.getParameter("destination108");
            java.lang.String destination_27idTemp = null;
        if(!destination_27id.equals("")){
         destination_27idTemp  = destination_27id;
        }
        String source_28id=  request.getParameter("source110");
            java.lang.String source_28idTemp = null;
        if(!source_28id.equals("")){
         source_28idTemp  = source_28id;
        }
        String requestID_29id=  request.getParameter("requestID112");
            java.lang.String requestID_29idTemp = null;
        if(!requestID_29id.equals("")){
         requestID_29idTemp  = requestID_29id;
        }
        %>
        <jsp:useBean id="com1flocash1www1TypeRateQuery_26id" scope="session" class="com.flocash.www.TypeRateQuery" />
        <%
        com1flocash1www1TypeRateQuery_26id.setDestination(destination_27idTemp);
        com1flocash1www1TypeRateQuery_26id.setSource(source_28idTemp);
        com1flocash1www1TypeRateQuery_26id.setRequestID(requestID_29idTemp);
        %>
        <jsp:useBean id="com1flocash1www1RateQuery_21id" scope="session" class="com.flocash.www.RateQuery" />
        <%
        com1flocash1www1RateQuery_21id.setAuthentication(com1flocash1www1Authentication_22id);
        com1flocash1www1RateQuery_21id.setQuery(com1flocash1www1TypeRateQuery_26id);
        com.flocash.www.RateResponse getRate81mtemp = sampleServiceSoapProxyid.getRate(com1flocash1www1RateQuery_21id);
if(getRate81mtemp == null){
%>
<%=getRate81mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">response:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">destination:</TD>
<TD>
<%
if(getRate81mtemp != null){
com.flocash.www.TypeRateResponse tebece0=getRate81mtemp.getResponse();
if(tebece0 != null){
java.lang.String typedestination86 = tebece0.getDestination();
        String tempResultdestination86 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedestination86));
        %>
        <%= tempResultdestination86 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">updateTime:</TD>
<TD>
<%
if(getRate81mtemp != null){
com.flocash.www.TypeRateResponse tebece0=getRate81mtemp.getResponse();
if(tebece0 != null){
java.lang.String typeupdateTime88 = tebece0.getUpdateTime();
        String tempResultupdateTime88 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeupdateTime88));
        %>
        <%= tempResultupdateTime88 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">rate:</TD>
<TD>
<%
if(getRate81mtemp != null){
com.flocash.www.TypeRateResponse tebece0=getRate81mtemp.getResponse();
if(tebece0 != null){
java.lang.String typerate90 = tebece0.getRate();
        String tempResultrate90 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerate90));
        %>
        <%= tempResultrate90 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">source:</TD>
<TD>
<%
if(getRate81mtemp != null){
com.flocash.www.TypeRateResponse tebece0=getRate81mtemp.getResponse();
if(tebece0 != null){
java.lang.String typesource92 = tebece0.getSource();
        String tempResultsource92 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesource92));
        %>
        <%= tempResultsource92 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">requestID:</TD>
<TD>
<%
if(getRate81mtemp != null){
com.flocash.www.TypeRateResponse tebece0=getRate81mtemp.getResponse();
if(tebece0 != null){
java.lang.String typerequestID94 = tebece0.getRequestID();
        String tempResultrequestID94 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerequestID94));
        %>
        <%= tempResultrequestID94 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 114:
        gotMethod = true;
        String apiUsername_32id=  request.getParameter("apiUsername141");
            java.lang.String apiUsername_32idTemp = null;
        if(!apiUsername_32id.equals("")){
         apiUsername_32idTemp  = apiUsername_32id;
        }
        String apiPassword_33id=  request.getParameter("apiPassword143");
            java.lang.String apiPassword_33idTemp = null;
        if(!apiPassword_33id.equals("")){
         apiPassword_33idTemp  = apiPassword_33id;
        }
        String control_34id=  request.getParameter("control145");
            java.lang.String control_34idTemp = null;
        if(!control_34id.equals("")){
         control_34idTemp  = control_34id;
        }
        %>
        <jsp:useBean id="com1flocash1www1Authentication_31id" scope="session" class="com.flocash.www.Authentication" />
        <%
        com1flocash1www1Authentication_31id.setApiUsername(apiUsername_32idTemp);
        com1flocash1www1Authentication_31id.setApiPassword(apiPassword_33idTemp);
        com1flocash1www1Authentication_31id.setControl(control_34idTemp);
        String postalCode_37id=  request.getParameter("postalCode151");
            java.lang.String postalCode_37idTemp = null;
        if(!postalCode_37id.equals("")){
         postalCode_37idTemp  = postalCode_37id;
        }
        String mobile_38id=  request.getParameter("mobile153");
            java.lang.String mobile_38idTemp = null;
        if(!mobile_38id.equals("")){
         mobile_38idTemp  = mobile_38id;
        }
        String country_39id=  request.getParameter("country155");
            java.lang.String country_39idTemp = null;
        if(!country_39id.equals("")){
         country_39idTemp  = country_39id;
        }
        String street2_40id=  request.getParameter("street2157");
            java.lang.String street2_40idTemp = null;
        if(!street2_40id.equals("")){
         street2_40idTemp  = street2_40id;
        }
        String street1_41id=  request.getParameter("street1159");
            java.lang.String street1_41idTemp = null;
        if(!street1_41id.equals("")){
         street1_41idTemp  = street1_41id;
        }
        String city_42id=  request.getParameter("city161");
            java.lang.String city_42idTemp = null;
        if(!city_42id.equals("")){
         city_42idTemp  = city_42id;
        }
        String firstname_43id=  request.getParameter("firstname163");
            java.lang.String firstname_43idTemp = null;
        if(!firstname_43id.equals("")){
         firstname_43idTemp  = firstname_43id;
        }
        String businessName_44id=  request.getParameter("businessName165");
            java.lang.String businessName_44idTemp = null;
        if(!businessName_44id.equals("")){
         businessName_44idTemp  = businessName_44id;
        }
        String notes_45id=  request.getParameter("notes167");
            java.lang.String notes_45idTemp = null;
        if(!notes_45id.equals("")){
         notes_45idTemp  = notes_45id;
        }
        String lastname_46id=  request.getParameter("lastname169");
            java.lang.String lastname_46idTemp = null;
        if(!lastname_46id.equals("")){
         lastname_46idTemp  = lastname_46id;
        }
        String swiftcode_47id=  request.getParameter("swiftcode171");
            java.lang.String swiftcode_47idTemp = null;
        if(!swiftcode_47id.equals("")){
         swiftcode_47idTemp  = swiftcode_47id;
        }
        String email_48id=  request.getParameter("email173");
            java.lang.String email_48idTemp = null;
        if(!email_48id.equals("")){
         email_48idTemp  = email_48id;
        }
        String type_49id=  request.getParameter("type175");
            java.lang.String type_49idTemp = null;
        if(!type_49id.equals("")){
         type_49idTemp  = type_49id;
        }
        String bankAccount_50id=  request.getParameter("bankAccount177");
            java.lang.String bankAccount_50idTemp = null;
        if(!bankAccount_50id.equals("")){
         bankAccount_50idTemp  = bankAccount_50id;
        }
        String cardNo_51id=  request.getParameter("cardNo179");
            java.lang.String cardNo_51idTemp = null;
        if(!cardNo_51id.equals("")){
         cardNo_51idTemp  = cardNo_51id;
        }
        String bankName_52id=  request.getParameter("bankName181");
            java.lang.String bankName_52idTemp = null;
        if(!bankName_52id.equals("")){
         bankName_52idTemp  = bankName_52id;
        }
        %>
        <jsp:useBean id="com1flocash1www1ReceiverInfo_36id" scope="session" class="com.flocash.www.ReceiverInfo" />
        <%
        com1flocash1www1ReceiverInfo_36id.setPostalCode(postalCode_37idTemp);
        com1flocash1www1ReceiverInfo_36id.setMobile(mobile_38idTemp);
        com1flocash1www1ReceiverInfo_36id.setCountry(country_39idTemp);
        com1flocash1www1ReceiverInfo_36id.setStreet2(street2_40idTemp);
        com1flocash1www1ReceiverInfo_36id.setStreet1(street1_41idTemp);
        com1flocash1www1ReceiverInfo_36id.setCity(city_42idTemp);
        com1flocash1www1ReceiverInfo_36id.setFirstname(firstname_43idTemp);
        com1flocash1www1ReceiverInfo_36id.setBusinessName(businessName_44idTemp);
        com1flocash1www1ReceiverInfo_36id.setNotes(notes_45idTemp);
        com1flocash1www1ReceiverInfo_36id.setLastname(lastname_46idTemp);
        com1flocash1www1ReceiverInfo_36id.setSwiftcode(swiftcode_47idTemp);
        com1flocash1www1ReceiverInfo_36id.setEmail(email_48idTemp);
        com1flocash1www1ReceiverInfo_36id.setType(type_49idTemp);
        com1flocash1www1ReceiverInfo_36id.setBankAccount(bankAccount_50idTemp);
        com1flocash1www1ReceiverInfo_36id.setCardNo(cardNo_51idTemp);
        com1flocash1www1ReceiverInfo_36id.setBankName(bankName_52idTemp);
        String settlementCurrency_53id=  request.getParameter("settlementCurrency183");
            java.lang.String settlementCurrency_53idTemp = null;
        if(!settlementCurrency_53id.equals("")){
         settlementCurrency_53idTemp  = settlementCurrency_53id;
        }
        String custom_54id=  request.getParameter("custom185");
            java.lang.String custom_54idTemp = null;
        if(!custom_54id.equals("")){
         custom_54idTemp  = custom_54id;
        }
        String sendFee_55id=  request.getParameter("sendFee187");
            java.math.BigDecimal sendFee_55idTemp = null;
        if(!sendFee_55id.equals("")){
         sendFee_55idTemp  = new java.math.BigDecimal(sendFee_55id);
        }
        String settlementAmount_56id=  request.getParameter("settlementAmount189");
            java.math.BigDecimal settlementAmount_56idTemp = null;
        if(!settlementAmount_56id.equals("")){
         settlementAmount_56idTemp  = new java.math.BigDecimal(settlementAmount_56id);
        }
        String postalCode_58id=  request.getParameter("postalCode193");
            java.lang.String postalCode_58idTemp = null;
        if(!postalCode_58id.equals("")){
         postalCode_58idTemp  = postalCode_58id;
        }
        String mobile_59id=  request.getParameter("mobile195");
            java.lang.String mobile_59idTemp = null;
        if(!mobile_59id.equals("")){
         mobile_59idTemp  = mobile_59id;
        }
        String country_60id=  request.getParameter("country197");
            java.lang.String country_60idTemp = null;
        if(!country_60id.equals("")){
         country_60idTemp  = country_60id;
        }
        String street2_61id=  request.getParameter("street2199");
            java.lang.String street2_61idTemp = null;
        if(!street2_61id.equals("")){
         street2_61idTemp  = street2_61id;
        }
        String street1_62id=  request.getParameter("street1201");
            java.lang.String street1_62idTemp = null;
        if(!street1_62id.equals("")){
         street1_62idTemp  = street1_62id;
        }
        String city_63id=  request.getParameter("city203");
            java.lang.String city_63idTemp = null;
        if(!city_63id.equals("")){
         city_63idTemp  = city_63id;
        }
        String notes_64id=  request.getParameter("notes205");
            java.lang.String notes_64idTemp = null;
        if(!notes_64id.equals("")){
         notes_64idTemp  = notes_64id;
        }
        String email_65id=  request.getParameter("email207");
            java.lang.String email_65idTemp = null;
        if(!email_65id.equals("")){
         email_65idTemp  = email_65id;
        }
        String company_66id=  request.getParameter("company209");
            java.lang.String company_66idTemp = null;
        if(!company_66id.equals("")){
         company_66idTemp  = company_66id;
        }
        String firstName_67id=  request.getParameter("firstName211");
            java.lang.String firstName_67idTemp = null;
        if(!firstName_67id.equals("")){
         firstName_67idTemp  = firstName_67id;
        }
        String lastName_68id=  request.getParameter("lastName213");
            java.lang.String lastName_68idTemp = null;
        if(!lastName_68id.equals("")){
         lastName_68idTemp  = lastName_68id;
        }
        %>
        <jsp:useBean id="com1flocash1www1SenderInfo_57id" scope="session" class="com.flocash.www.SenderInfo" />
        <%
        com1flocash1www1SenderInfo_57id.setPostalCode(postalCode_58idTemp);
        com1flocash1www1SenderInfo_57id.setMobile(mobile_59idTemp);
        com1flocash1www1SenderInfo_57id.setCountry(country_60idTemp);
        com1flocash1www1SenderInfo_57id.setStreet2(street2_61idTemp);
        com1flocash1www1SenderInfo_57id.setStreet1(street1_62idTemp);
        com1flocash1www1SenderInfo_57id.setCity(city_63idTemp);
        com1flocash1www1SenderInfo_57id.setNotes(notes_64idTemp);
        com1flocash1www1SenderInfo_57id.setEmail(email_65idTemp);
        com1flocash1www1SenderInfo_57id.setCompany(company_66idTemp);
        com1flocash1www1SenderInfo_57id.setFirstName(firstName_67idTemp);
        com1flocash1www1SenderInfo_57id.setLastName(lastName_68idTemp);
        String amount_69id=  request.getParameter("amount215");
            java.math.BigDecimal amount_69idTemp = null;
        if(!amount_69id.equals("")){
         amount_69idTemp  = new java.math.BigDecimal(amount_69id);
        }
        String detail_70id=  request.getParameter("detail217");
            java.lang.String detail_70idTemp = null;
        if(!detail_70id.equals("")){
         detail_70idTemp  = detail_70id;
        }
        String requestID_71id=  request.getParameter("requestID219");
            java.lang.String requestID_71idTemp = null;
        if(!requestID_71id.equals("")){
         requestID_71idTemp  = requestID_71id;
        }
        String fee_72id=  request.getParameter("fee221");
            java.math.BigDecimal fee_72idTemp = null;
        if(!fee_72id.equals("")){
         fee_72idTemp  = new java.math.BigDecimal(fee_72id);
        }
        String currency_73id=  request.getParameter("currency223");
            java.lang.String currency_73idTemp = null;
        if(!currency_73id.equals("")){
         currency_73idTemp  = currency_73id;
        }
        String type_74id=  request.getParameter("type225");
            java.lang.String type_74idTemp = null;
        if(!type_74id.equals("")){
         type_74idTemp  = type_74id;
        }
        %>
        <jsp:useBean id="com1flocash1www1Transaction_35id" scope="session" class="com.flocash.www.Transaction" />
        <%
        com1flocash1www1Transaction_35id.setReceiver(com1flocash1www1ReceiverInfo_36id);
        com1flocash1www1Transaction_35id.setSettlementCurrency(settlementCurrency_53idTemp);
        com1flocash1www1Transaction_35id.setCustom(custom_54idTemp);
        com1flocash1www1Transaction_35id.setSendFee(sendFee_55idTemp);
        com1flocash1www1Transaction_35id.setSettlementAmount(settlementAmount_56idTemp);
        com1flocash1www1Transaction_35id.setSender(com1flocash1www1SenderInfo_57id);
        com1flocash1www1Transaction_35id.setAmount(amount_69idTemp);
        com1flocash1www1Transaction_35id.setDetail(detail_70idTemp);
        com1flocash1www1Transaction_35id.setRequestID(requestID_71idTemp);
        com1flocash1www1Transaction_35id.setFee(fee_72idTemp);
        com1flocash1www1Transaction_35id.setCurrency(currency_73idTemp);
        com1flocash1www1Transaction_35id.setType(type_74idTemp);
        %>
        <jsp:useBean id="com1flocash1www1PayoutRequest_30id" scope="session" class="com.flocash.www.PayoutRequest" />
        <%
        com1flocash1www1PayoutRequest_30id.setAuthentication(com1flocash1www1Authentication_31id);
        com1flocash1www1PayoutRequest_30id.setTransaction(com1flocash1www1Transaction_35id);
        com.flocash.www.Response payout114mtemp = sampleServiceSoapProxyid.payout(com1flocash1www1PayoutRequest_30id);
if(payout114mtemp == null){
%>
<%=payout114mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(payout114mtemp != null){
java.lang.String typetransactionID117 = payout114mtemp.getTransactionID();
        String tempResulttransactionID117 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID117));
        %>
        <%= tempResulttransactionID117 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(payout114mtemp != null){
java.lang.String typestatus119 = payout114mtemp.getStatus();
        String tempResultstatus119 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus119));
        %>
        <%= tempResultstatus119 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">amount:</TD>
<TD>
<%
if(payout114mtemp != null){
java.lang.String typeamount121 = payout114mtemp.getAmount();
        String tempResultamount121 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeamount121));
        %>
        <%= tempResultamount121 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">detail:</TD>
<TD>
<%
if(payout114mtemp != null){
java.lang.String typedetail123 = payout114mtemp.getDetail();
        String tempResultdetail123 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedetail123));
        %>
        <%= tempResultdetail123 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">requestID:</TD>
<TD>
<%
if(payout114mtemp != null){
java.lang.String typerequestID125 = payout114mtemp.getRequestID();
        String tempResultrequestID125 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerequestID125));
        %>
        <%= tempResultrequestID125 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reqTime:</TD>
<TD>
<%
if(payout114mtemp != null){
java.lang.String typereqTime127 = payout114mtemp.getReqTime();
        String tempResultreqTime127 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereqTime127));
        %>
        <%= tempResultreqTime127 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fee:</TD>
<TD>
<%
if(payout114mtemp != null){
java.lang.String typefee129 = payout114mtemp.getFee();
        String tempResultfee129 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefee129));
        %>
        <%= tempResultfee129 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">exchangeRate:</TD>
<TD>
<%
if(payout114mtemp != null){
java.lang.String typeexchangeRate131 = payout114mtemp.getExchangeRate();
        String tempResultexchangeRate131 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexchangeRate131));
        %>
        <%= tempResultexchangeRate131 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">currency:</TD>
<TD>
<%
if(payout114mtemp != null){
java.lang.String typecurrency133 = payout114mtemp.getCurrency();
        String tempResultcurrency133 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecurrency133));
        %>
        <%= tempResultcurrency133 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">destCurrency:</TD>
<TD>
<%
if(payout114mtemp != null){
java.lang.String typedestCurrency135 = payout114mtemp.getDestCurrency();
        String tempResultdestCurrency135 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedestCurrency135));
        %>
        <%= tempResultdestCurrency135 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 227:
        gotMethod = true;
        String apiUsername_77id=  request.getParameter("apiUsername240");
            java.lang.String apiUsername_77idTemp = null;
        if(!apiUsername_77id.equals("")){
         apiUsername_77idTemp  = apiUsername_77id;
        }
        String apiPassword_78id=  request.getParameter("apiPassword242");
            java.lang.String apiPassword_78idTemp = null;
        if(!apiPassword_78id.equals("")){
         apiPassword_78idTemp  = apiPassword_78id;
        }
        String control_79id=  request.getParameter("control244");
            java.lang.String control_79idTemp = null;
        if(!control_79id.equals("")){
         control_79idTemp  = control_79id;
        }
        %>
        <jsp:useBean id="com1flocash1www1Authentication_76id" scope="session" class="com.flocash.www.Authentication" />
        <%
        com1flocash1www1Authentication_76id.setApiUsername(apiUsername_77idTemp);
        com1flocash1www1Authentication_76id.setApiPassword(apiPassword_78idTemp);
        com1flocash1www1Authentication_76id.setControl(control_79idTemp);
        String mobile_81id=  request.getParameter("mobile248");
            java.lang.String mobile_81idTemp = null;
        if(!mobile_81id.equals("")){
         mobile_81idTemp  = mobile_81id;
        }
        String email_82id=  request.getParameter("email250");
            java.lang.String email_82idTemp = null;
        if(!email_82id.equals("")){
         email_82idTemp  = email_82id;
        }
        String requestID_83id=  request.getParameter("requestID252");
            java.lang.String requestID_83idTemp = null;
        if(!requestID_83id.equals("")){
         requestID_83idTemp  = requestID_83id;
        }
        String country_84id=  request.getParameter("country254");
            java.lang.String country_84idTemp = null;
        if(!country_84id.equals("")){
         country_84idTemp  = country_84id;
        }
        %>
        <jsp:useBean id="com1flocash1www1TypeValidateRequest_80id" scope="session" class="com.flocash.www.TypeValidateRequest" />
        <%
        com1flocash1www1TypeValidateRequest_80id.setMobile(mobile_81idTemp);
        com1flocash1www1TypeValidateRequest_80id.setEmail(email_82idTemp);
        com1flocash1www1TypeValidateRequest_80id.setRequestID(requestID_83idTemp);
        com1flocash1www1TypeValidateRequest_80id.setCountry(country_84idTemp);
        %>
        <jsp:useBean id="com1flocash1www1ValidateUserRequest_75id" scope="session" class="com.flocash.www.ValidateUserRequest" />
        <%
        com1flocash1www1ValidateUserRequest_75id.setAuthentication(com1flocash1www1Authentication_76id);
        com1flocash1www1ValidateUserRequest_75id.setQuery(com1flocash1www1TypeValidateRequest_80id);
        com.flocash.www.ValidateUserResponse validateUser227mtemp = sampleServiceSoapProxyid.validateUser(com1flocash1www1ValidateUserRequest_75id);
if(validateUser227mtemp == null){
%>
<%=validateUser227mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">response:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">status:</TD>
<TD>
<%
if(validateUser227mtemp != null){
com.flocash.www.TypeValidateResponse tebece0=validateUser227mtemp.getResponse();
if(tebece0 != null){
java.lang.String typestatus232 = tebece0.getStatus();
        String tempResultstatus232 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus232));
        %>
        <%= tempResultstatus232 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">requestID:</TD>
<TD>
<%
if(validateUser227mtemp != null){
com.flocash.www.TypeValidateResponse tebece0=validateUser227mtemp.getResponse();
if(tebece0 != null){
java.lang.String typerequestID234 = tebece0.getRequestID();
        String tempResultrequestID234 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerequestID234));
        %>
        <%= tempResultrequestID234 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 256:
        gotMethod = true;
        String apiUsername_87id=  request.getParameter("apiUsername283");
            java.lang.String apiUsername_87idTemp = null;
        if(!apiUsername_87id.equals("")){
         apiUsername_87idTemp  = apiUsername_87id;
        }
        String apiPassword_88id=  request.getParameter("apiPassword285");
            java.lang.String apiPassword_88idTemp = null;
        if(!apiPassword_88id.equals("")){
         apiPassword_88idTemp  = apiPassword_88id;
        }
        String control_89id=  request.getParameter("control287");
            java.lang.String control_89idTemp = null;
        if(!control_89id.equals("")){
         control_89idTemp  = control_89id;
        }
        %>
        <jsp:useBean id="com1flocash1www1Authentication_86id" scope="session" class="com.flocash.www.Authentication" />
        <%
        com1flocash1www1Authentication_86id.setApiUsername(apiUsername_87idTemp);
        com1flocash1www1Authentication_86id.setApiPassword(apiPassword_88idTemp);
        com1flocash1www1Authentication_86id.setControl(control_89idTemp);
        String requestID_91id=  request.getParameter("requestID291");
            java.lang.String requestID_91idTemp = null;
        if(!requestID_91id.equals("")){
         requestID_91idTemp  = requestID_91id;
        }
        String transactionID_92id=  request.getParameter("transactionID293");
            java.lang.String transactionID_92idTemp = null;
        if(!transactionID_92id.equals("")){
         transactionID_92idTemp  = transactionID_92id;
        }
        %>
        <jsp:useBean id="com1flocash1www1Query_90id" scope="session" class="com.flocash.www.Query" />
        <%
        com1flocash1www1Query_90id.setRequestID(requestID_91idTemp);
        com1flocash1www1Query_90id.setTransactionID(transactionID_92idTemp);
        %>
        <jsp:useBean id="com1flocash1www1TransactionQuery_85id" scope="session" class="com.flocash.www.TransactionQuery" />
        <%
        com1flocash1www1TransactionQuery_85id.setAuthentication(com1flocash1www1Authentication_86id);
        com1flocash1www1TransactionQuery_85id.setQuery(com1flocash1www1Query_90id);
        com.flocash.www.Response queryTrans256mtemp = sampleServiceSoapProxyid.queryTrans(com1flocash1www1TransactionQuery_85id);
if(queryTrans256mtemp == null){
%>
<%=queryTrans256mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(queryTrans256mtemp != null){
java.lang.String typetransactionID259 = queryTrans256mtemp.getTransactionID();
        String tempResulttransactionID259 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID259));
        %>
        <%= tempResulttransactionID259 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(queryTrans256mtemp != null){
java.lang.String typestatus261 = queryTrans256mtemp.getStatus();
        String tempResultstatus261 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus261));
        %>
        <%= tempResultstatus261 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">amount:</TD>
<TD>
<%
if(queryTrans256mtemp != null){
java.lang.String typeamount263 = queryTrans256mtemp.getAmount();
        String tempResultamount263 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeamount263));
        %>
        <%= tempResultamount263 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">detail:</TD>
<TD>
<%
if(queryTrans256mtemp != null){
java.lang.String typedetail265 = queryTrans256mtemp.getDetail();
        String tempResultdetail265 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedetail265));
        %>
        <%= tempResultdetail265 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">requestID:</TD>
<TD>
<%
if(queryTrans256mtemp != null){
java.lang.String typerequestID267 = queryTrans256mtemp.getRequestID();
        String tempResultrequestID267 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerequestID267));
        %>
        <%= tempResultrequestID267 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reqTime:</TD>
<TD>
<%
if(queryTrans256mtemp != null){
java.lang.String typereqTime269 = queryTrans256mtemp.getReqTime();
        String tempResultreqTime269 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereqTime269));
        %>
        <%= tempResultreqTime269 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fee:</TD>
<TD>
<%
if(queryTrans256mtemp != null){
java.lang.String typefee271 = queryTrans256mtemp.getFee();
        String tempResultfee271 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefee271));
        %>
        <%= tempResultfee271 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">exchangeRate:</TD>
<TD>
<%
if(queryTrans256mtemp != null){
java.lang.String typeexchangeRate273 = queryTrans256mtemp.getExchangeRate();
        String tempResultexchangeRate273 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexchangeRate273));
        %>
        <%= tempResultexchangeRate273 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">currency:</TD>
<TD>
<%
if(queryTrans256mtemp != null){
java.lang.String typecurrency275 = queryTrans256mtemp.getCurrency();
        String tempResultcurrency275 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecurrency275));
        %>
        <%= tempResultcurrency275 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">destCurrency:</TD>
<TD>
<%
if(queryTrans256mtemp != null){
java.lang.String typedestCurrency277 = queryTrans256mtemp.getDestCurrency();
        String tempResultdestCurrency277 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedestCurrency277));
        %>
        <%= tempResultdestCurrency277 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>
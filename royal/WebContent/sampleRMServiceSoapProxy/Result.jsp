<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleRMServiceSoapProxyid" scope="session" class="org.tempuri.RMServiceSoapProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleRMServiceSoapProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleRMServiceSoapProxyid.getEndpoint();
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
        sampleRMServiceSoapProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        org.tempuri.RMServiceSoap getRMServiceSoap10mtemp = sampleRMServiceSoapProxyid.getRMServiceSoap();
if(getRMServiceSoap10mtemp == null){
%>
<%=getRMServiceSoap10mtemp %>
<%
}else{
        if(getRMServiceSoap10mtemp!= null){
        String tempreturnp11 = getRMServiceSoap10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String destinationCurrency_2id=  request.getParameter("destinationCurrency34");
            java.lang.String destinationCurrency_2idTemp = null;
        if(!destinationCurrency_2id.equals("")){
         destinationCurrency_2idTemp  = destinationCurrency_2id;
        }
        String productId_3id=  request.getParameter("productId36");
        int productId_3idTemp  = Integer.parseInt(productId_3id);
        String agentCode_5id=  request.getParameter("agentCode40");
            java.lang.String agentCode_5idTemp = null;
        if(!agentCode_5id.equals("")){
         agentCode_5idTemp  = agentCode_5id;
        }
        String password_6id=  request.getParameter("password42");
            java.lang.String password_6idTemp = null;
        if(!password_6id.equals("")){
         password_6idTemp  = password_6id;
        }
        String userCode_7id=  request.getParameter("userCode44");
            java.lang.String userCode_7idTemp = null;
        if(!userCode_7id.equals("")){
         userCode_7idTemp  = userCode_7id;
        }
        String loginCode_8id=  request.getParameter("loginCode46");
            java.lang.String loginCode_8idTemp = null;
        if(!loginCode_8id.equals("")){
         loginCode_8idTemp  = loginCode_8id;
        }
        %>
        <jsp:useBean id="org1tempuri1Authenticate_4id" scope="session" class="org.tempuri.Authenticate" />
        <%
        org1tempuri1Authenticate_4id.setAgentCode(agentCode_5idTemp);
        org1tempuri1Authenticate_4id.setPassword(password_6idTemp);
        org1tempuri1Authenticate_4id.setUserCode(userCode_7idTemp);
        org1tempuri1Authenticate_4id.setLoginCode(loginCode_8idTemp);
        String processDateTime_9id=  request.getParameter("processDateTime48");
            java.util.Calendar processDateTime_9idTemp = null;
        if(!processDateTime_9id.equals("")){
        java.text.DateFormat dateFormatprocessDateTime48 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempprocessDateTime48  = dateFormatprocessDateTime48.parse(processDateTime_9id);
         processDateTime_9idTemp = new java.util.GregorianCalendar();
        processDateTime_9idTemp.setTime(dateTempprocessDateTime48);
        }
        String destinationCountry_10id=  request.getParameter("destinationCountry50");
            java.lang.String destinationCountry_10idTemp = null;
        if(!destinationCountry_10id.equals("")){
         destinationCountry_10idTemp  = destinationCountry_10id;
        }
        String payoutAgentID_11id=  request.getParameter("payoutAgentID52");
            java.lang.String payoutAgentID_11idTemp = null;
        if(!payoutAgentID_11id.equals("")){
         payoutAgentID_11idTemp  = payoutAgentID_11id;
        }
        String sourceCurrency_12id=  request.getParameter("sourceCurrency54");
            java.lang.String sourceCurrency_12idTemp = null;
        if(!sourceCurrency_12id.equals("")){
         sourceCurrency_12idTemp  = sourceCurrency_12id;
        }
        String exchangeRate_13id=  request.getParameter("exchangeRate56");
            java.math.BigDecimal exchangeRate_13idTemp = null;
        if(!exchangeRate_13id.equals("")){
         exchangeRate_13idTemp  = new java.math.BigDecimal(exchangeRate_13id);
        }
        String senderDocType_15id=  request.getParameter("senderDocType60");
        int senderDocType_15idTemp  = Integer.parseInt(senderDocType_15id);
        String senderDOCDateOfIssue_16id=  request.getParameter("senderDOCDateOfIssue62");
            java.util.Calendar senderDOCDateOfIssue_16idTemp = null;
        if(!senderDOCDateOfIssue_16id.equals("")){
        java.text.DateFormat dateFormatsenderDOCDateOfIssue62 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempsenderDOCDateOfIssue62  = dateFormatsenderDOCDateOfIssue62.parse(senderDOCDateOfIssue_16id);
         senderDOCDateOfIssue_16idTemp = new java.util.GregorianCalendar();
        senderDOCDateOfIssue_16idTemp.setTime(dateTempsenderDOCDateOfIssue62);
        }
        String receiverGender_17id=  request.getParameter("receiverGender64");
            java.lang.String receiverGender_17idTemp = null;
        if(!receiverGender_17id.equals("")){
         receiverGender_17idTemp  = receiverGender_17id;
        }
        String receiverPostorZipCode_18id=  request.getParameter("receiverPostorZipCode66");
            java.lang.String receiverPostorZipCode_18idTemp = null;
        if(!receiverPostorZipCode_18id.equals("")){
         receiverPostorZipCode_18idTemp  = receiverPostorZipCode_18id;
        }
        String cPFNumber_19id=  request.getParameter("cPFNumber68");
            java.lang.String cPFNumber_19idTemp = null;
        if(!cPFNumber_19id.equals("")){
         cPFNumber_19idTemp  = cPFNumber_19id;
        }
        String bankBranch_20id=  request.getParameter("bankBranch70");
            java.lang.String bankBranch_20idTemp = null;
        if(!bankBranch_20id.equals("")){
         bankBranch_20idTemp  = bankBranch_20id;
        }
        String senderTelephone_21id=  request.getParameter("senderTelephone72");
            java.lang.String senderTelephone_21idTemp = null;
        if(!senderTelephone_21id.equals("")){
         senderTelephone_21idTemp  = senderTelephone_21id;
        }
        String testAnswer_22id=  request.getParameter("testAnswer74");
            java.lang.String testAnswer_22idTemp = null;
        if(!testAnswer_22id.equals("")){
         testAnswer_22idTemp  = testAnswer_22id;
        }
        String senderLastName_23id=  request.getParameter("senderLastName76");
            java.lang.String senderLastName_23idTemp = null;
        if(!senderLastName_23id.equals("")){
         senderLastName_23idTemp  = senderLastName_23id;
        }
        String senderGender_24id=  request.getParameter("senderGender78");
            java.lang.String senderGender_24idTemp = null;
        if(!senderGender_24id.equals("")){
         senderGender_24idTemp  = senderGender_24id;
        }
        String receiverFirstName_25id=  request.getParameter("receiverFirstName80");
            java.lang.String receiverFirstName_25idTemp = null;
        if(!receiverFirstName_25id.equals("")){
         receiverFirstName_25idTemp  = receiverFirstName_25id;
        }
        String bankAccount_26id=  request.getParameter("bankAccount82");
            java.lang.String bankAccount_26idTemp = null;
        if(!bankAccount_26id.equals("")){
         bankAccount_26idTemp  = bankAccount_26id;
        }
        String receiverNo_27id=  request.getParameter("receiverNo84");
        int receiverNo_27idTemp  = Integer.parseInt(receiverNo_27id);
        String testQuestion_28id=  request.getParameter("testQuestion86");
            java.lang.String testQuestion_28idTemp = null;
        if(!testQuestion_28id.equals("")){
         testQuestion_28idTemp  = testQuestion_28id;
        }
        String receiverAddress_29id=  request.getParameter("receiverAddress88");
            java.lang.String receiverAddress_29idTemp = null;
        if(!receiverAddress_29id.equals("")){
         receiverAddress_29idTemp  = receiverAddress_29id;
        }
        String reasonForPayment_30id=  request.getParameter("reasonForPayment90");
            java.lang.String reasonForPayment_30idTemp = null;
        if(!reasonForPayment_30id.equals("")){
         reasonForPayment_30idTemp  = reasonForPayment_30id;
        }
        String receiverCountryCode_31id=  request.getParameter("receiverCountryCode92");
            java.lang.String receiverCountryCode_31idTemp = null;
        if(!receiverCountryCode_31id.equals("")){
         receiverCountryCode_31idTemp  = receiverCountryCode_31id;
        }
        String senderDOCDateOfExpiry_32id=  request.getParameter("senderDOCDateOfExpiry94");
            java.util.Calendar senderDOCDateOfExpiry_32idTemp = null;
        if(!senderDOCDateOfExpiry_32id.equals("")){
        java.text.DateFormat dateFormatsenderDOCDateOfExpiry94 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempsenderDOCDateOfExpiry94  = dateFormatsenderDOCDateOfExpiry94.parse(senderDOCDateOfExpiry_32id);
         senderDOCDateOfExpiry_32idTemp = new java.util.GregorianCalendar();
        senderDOCDateOfExpiry_32idTemp.setTime(dateTempsenderDOCDateOfExpiry94);
        }
        String sourceOfFund_33id=  request.getParameter("sourceOfFund96");
            java.lang.String sourceOfFund_33idTemp = null;
        if(!sourceOfFund_33id.equals("")){
         sourceOfFund_33idTemp  = sourceOfFund_33id;
        }
        String receiverTelephone_34id=  request.getParameter("receiverTelephone98");
            java.lang.String receiverTelephone_34idTemp = null;
        if(!receiverTelephone_34id.equals("")){
         receiverTelephone_34idTemp  = receiverTelephone_34id;
        }
        String bankAccountType_35id=  request.getParameter("bankAccountType100");
            java.lang.String bankAccountType_35idTemp = null;
        if(!bankAccountType_35id.equals("")){
         bankAccountType_35idTemp  = bankAccountType_35id;
        }
        String iBAN_36id=  request.getParameter("iBAN102");
            java.lang.String iBAN_36idTemp = null;
        if(!iBAN_36id.equals("")){
         iBAN_36idTemp  = iBAN_36id;
        }
        String receiverPlaceOfBirth_37id=  request.getParameter("receiverPlaceOfBirth104");
            java.lang.String receiverPlaceOfBirth_37idTemp = null;
        if(!receiverPlaceOfBirth_37id.equals("")){
         receiverPlaceOfBirth_37idTemp  = receiverPlaceOfBirth_37id;
        }
        String receiverStateorCounty_38id=  request.getParameter("receiverStateorCounty106");
            java.lang.String receiverStateorCounty_38idTemp = null;
        if(!receiverStateorCounty_38id.equals("")){
         receiverStateorCounty_38idTemp  = receiverStateorCounty_38id;
        }
        String senderPostorZipCode_39id=  request.getParameter("senderPostorZipCode108");
            java.lang.String senderPostorZipCode_39idTemp = null;
        if(!senderPostorZipCode_39id.equals("")){
         senderPostorZipCode_39idTemp  = senderPostorZipCode_39id;
        }
        String agentCode_41id=  request.getParameter("agentCode112");
            java.lang.String agentCode_41idTemp = null;
        if(!agentCode_41id.equals("")){
         agentCode_41idTemp  = agentCode_41id;
        }
        String password_42id=  request.getParameter("password114");
            java.lang.String password_42idTemp = null;
        if(!password_42id.equals("")){
         password_42idTemp  = password_42id;
        }
        String userCode_43id=  request.getParameter("userCode116");
            java.lang.String userCode_43idTemp = null;
        if(!userCode_43id.equals("")){
         userCode_43idTemp  = userCode_43id;
        }
        String loginCode_44id=  request.getParameter("loginCode118");
            java.lang.String loginCode_44idTemp = null;
        if(!loginCode_44id.equals("")){
         loginCode_44idTemp  = loginCode_44id;
        }
        %>
        <jsp:useBean id="org1tempuri1Authenticate_40id" scope="session" class="org.tempuri.Authenticate" />
        <%
        org1tempuri1Authenticate_40id.setAgentCode(agentCode_41idTemp);
        org1tempuri1Authenticate_40id.setPassword(password_42idTemp);
        org1tempuri1Authenticate_40id.setUserCode(userCode_43idTemp);
        org1tempuri1Authenticate_40id.setLoginCode(loginCode_44idTemp);
        String senderAddress_45id=  request.getParameter("senderAddress120");
            java.lang.String senderAddress_45idTemp = null;
        if(!senderAddress_45id.equals("")){
         senderAddress_45idTemp  = senderAddress_45id;
        }
        String receiverDOCCountryOfIssue_46id=  request.getParameter("receiverDOCCountryOfIssue122");
            java.lang.String receiverDOCCountryOfIssue_46idTemp = null;
        if(!receiverDOCCountryOfIssue_46id.equals("")){
         receiverDOCCountryOfIssue_46idTemp  = receiverDOCCountryOfIssue_46id;
        }
        String senderNationality_47id=  request.getParameter("senderNationality124");
            java.lang.String senderNationality_47idTemp = null;
        if(!senderNationality_47id.equals("")){
         senderNationality_47idTemp  = senderNationality_47id;
        }
        String senderDOC_48id=  request.getParameter("senderDOC126");
            java.lang.String senderDOC_48idTemp = null;
        if(!senderDOC_48id.equals("")){
         senderDOC_48idTemp  = senderDOC_48id;
        }
        String bankState_49id=  request.getParameter("bankState128");
            java.lang.String bankState_49idTemp = null;
        if(!bankState_49id.equals("")){
         bankState_49idTemp  = bankState_49id;
        }
        String senderDOB_50id=  request.getParameter("senderDOB130");
            java.util.Calendar senderDOB_50idTemp = null;
        if(!senderDOB_50id.equals("")){
        java.text.DateFormat dateFormatsenderDOB130 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempsenderDOB130  = dateFormatsenderDOB130.parse(senderDOB_50id);
         senderDOB_50idTemp = new java.util.GregorianCalendar();
        senderDOB_50idTemp.setTime(dateTempsenderDOB130);
        }
        String bankCity_51id=  request.getParameter("bankCity132");
            java.lang.String bankCity_51idTemp = null;
        if(!bankCity_51id.equals("")){
         bankCity_51idTemp  = bankCity_51id;
        }
        String senderPlaceOfBirth_52id=  request.getParameter("senderPlaceOfBirth134");
            java.lang.String senderPlaceOfBirth_52idTemp = null;
        if(!senderPlaceOfBirth_52id.equals("")){
         senderPlaceOfBirth_52idTemp  = senderPlaceOfBirth_52id;
        }
        String localBankCode_53id=  request.getParameter("localBankCode136");
            java.lang.String localBankCode_53idTemp = null;
        if(!localBankCode_53id.equals("")){
         localBankCode_53idTemp  = localBankCode_53id;
        }
        String receiverDocType_54id=  request.getParameter("receiverDocType138");
        int receiverDocType_54idTemp  = Integer.parseInt(receiverDocType_54id);
        String senderOccupation_55id=  request.getParameter("senderOccupation140");
            java.lang.String senderOccupation_55idTemp = null;
        if(!senderOccupation_55id.equals("")){
         senderOccupation_55idTemp  = senderOccupation_55id;
        }
        String receiverDOCDateOfIssue_56id=  request.getParameter("receiverDOCDateOfIssue142");
            java.util.Calendar receiverDOCDateOfIssue_56idTemp = null;
        if(!receiverDOCDateOfIssue_56id.equals("")){
        java.text.DateFormat dateFormatreceiverDOCDateOfIssue142 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempreceiverDOCDateOfIssue142  = dateFormatreceiverDOCDateOfIssue142.parse(receiverDOCDateOfIssue_56id);
         receiverDOCDateOfIssue_56idTemp = new java.util.GregorianCalendar();
        receiverDOCDateOfIssue_56idTemp.setTime(dateTempreceiverDOCDateOfIssue142);
        }
        String senderStateOfIssue_57id=  request.getParameter("senderStateOfIssue144");
            java.lang.String senderStateOfIssue_57idTemp = null;
        if(!senderStateOfIssue_57id.equals("")){
         senderStateOfIssue_57idTemp  = senderStateOfIssue_57id;
        }
        String customerNo_58id=  request.getParameter("customerNo146");
        int customerNo_58idTemp  = Integer.parseInt(customerNo_58id);
        String senderStateorCounty_59id=  request.getParameter("senderStateorCounty148");
            java.lang.String senderStateorCounty_59idTemp = null;
        if(!senderStateorCounty_59id.equals("")){
         senderStateorCounty_59idTemp  = senderStateorCounty_59id;
        }
        String receiverDOC_60id=  request.getParameter("receiverDOC150");
            java.lang.String receiverDOC_60idTemp = null;
        if(!receiverDOC_60id.equals("")){
         receiverDOC_60idTemp  = receiverDOC_60id;
        }
        String receiverDOB_61id=  request.getParameter("receiverDOB152");
            java.util.Calendar receiverDOB_61idTemp = null;
        if(!receiverDOB_61id.equals("")){
        java.text.DateFormat dateFormatreceiverDOB152 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempreceiverDOB152  = dateFormatreceiverDOB152.parse(receiverDOB_61id);
         receiverDOB_61idTemp = new java.util.GregorianCalendar();
        receiverDOB_61idTemp.setTime(dateTempreceiverDOB152);
        }
        String receiverEmail_62id=  request.getParameter("receiverEmail154");
            java.lang.String receiverEmail_62idTemp = null;
        if(!receiverEmail_62id.equals("")){
         receiverEmail_62idTemp  = receiverEmail_62id;
        }
        String senderFirstName_63id=  request.getParameter("senderFirstName156");
            java.lang.String senderFirstName_63idTemp = null;
        if(!senderFirstName_63id.equals("")){
         senderFirstName_63idTemp  = senderFirstName_63id;
        }
        String bankCountry_64id=  request.getParameter("bankCountry158");
            java.lang.String bankCountry_64idTemp = null;
        if(!bankCountry_64id.equals("")){
         bankCountry_64idTemp  = bankCountry_64id;
        }
        String senderCountryCode_65id=  request.getParameter("senderCountryCode160");
            java.lang.String senderCountryCode_65idTemp = null;
        if(!senderCountryCode_65id.equals("")){
         senderCountryCode_65idTemp  = senderCountryCode_65id;
        }
        String senderSocialSecurityNo_66id=  request.getParameter("senderSocialSecurityNo162");
            java.lang.String senderSocialSecurityNo_66idTemp = null;
        if(!senderSocialSecurityNo_66id.equals("")){
         senderSocialSecurityNo_66idTemp  = senderSocialSecurityNo_66id;
        }
        String receiverLastName_67id=  request.getParameter("receiverLastName164");
            java.lang.String receiverLastName_67idTemp = null;
        if(!receiverLastName_67id.equals("")){
         receiverLastName_67idTemp  = receiverLastName_67id;
        }
        String bankAddress_68id=  request.getParameter("bankAddress166");
            java.lang.String bankAddress_68idTemp = null;
        if(!bankAddress_68id.equals("")){
         bankAddress_68idTemp  = bankAddress_68id;
        }
        String senderDOCCountryOfIssue_69id=  request.getParameter("senderDOCCountryOfIssue168");
            java.lang.String senderDOCCountryOfIssue_69idTemp = null;
        if(!senderDOCCountryOfIssue_69id.equals("")){
         senderDOCCountryOfIssue_69idTemp  = senderDOCCountryOfIssue_69id;
        }
        String receiverDOCDateOfExpiry_70id=  request.getParameter("receiverDOCDateOfExpiry170");
            java.util.Calendar receiverDOCDateOfExpiry_70idTemp = null;
        if(!receiverDOCDateOfExpiry_70id.equals("")){
        java.text.DateFormat dateFormatreceiverDOCDateOfExpiry170 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempreceiverDOCDateOfExpiry170  = dateFormatreceiverDOCDateOfExpiry170.parse(receiverDOCDateOfExpiry_70id);
         receiverDOCDateOfExpiry_70idTemp = new java.util.GregorianCalendar();
        receiverDOCDateOfExpiry_70idTemp.setTime(dateTempreceiverDOCDateOfExpiry170);
        }
        String bank_71id=  request.getParameter("bank172");
            java.lang.String bank_71idTemp = null;
        if(!bank_71id.equals("")){
         bank_71idTemp  = bank_71id;
        }
        %>
        <jsp:useBean id="org1tempuri1SenderCreateREQ_14id" scope="session" class="org.tempuri.SenderCreateREQ" />
        <%
        org1tempuri1SenderCreateREQ_14id.setSenderDocType(senderDocType_15idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderDOCDateOfIssue(senderDOCDateOfIssue_16idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverGender(receiverGender_17idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverPostorZipCode(receiverPostorZipCode_18idTemp);
        org1tempuri1SenderCreateREQ_14id.setCPFNumber(cPFNumber_19idTemp);
        org1tempuri1SenderCreateREQ_14id.setBankBranch(bankBranch_20idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderTelephone(senderTelephone_21idTemp);
        org1tempuri1SenderCreateREQ_14id.setTestAnswer(testAnswer_22idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderLastName(senderLastName_23idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderGender(senderGender_24idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverFirstName(receiverFirstName_25idTemp);
        org1tempuri1SenderCreateREQ_14id.setBankAccount(bankAccount_26idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverNo(receiverNo_27idTemp);
        org1tempuri1SenderCreateREQ_14id.setTestQuestion(testQuestion_28idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverAddress(receiverAddress_29idTemp);
        org1tempuri1SenderCreateREQ_14id.setReasonForPayment(reasonForPayment_30idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverCountryCode(receiverCountryCode_31idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderDOCDateOfExpiry(senderDOCDateOfExpiry_32idTemp);
        org1tempuri1SenderCreateREQ_14id.setSourceOfFund(sourceOfFund_33idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverTelephone(receiverTelephone_34idTemp);
        org1tempuri1SenderCreateREQ_14id.setBankAccountType(bankAccountType_35idTemp);
        org1tempuri1SenderCreateREQ_14id.setIBAN(iBAN_36idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverPlaceOfBirth(receiverPlaceOfBirth_37idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverStateorCounty(receiverStateorCounty_38idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderPostorZipCode(senderPostorZipCode_39idTemp);
        org1tempuri1SenderCreateREQ_14id.setCredentials(org1tempuri1Authenticate_40id);
        org1tempuri1SenderCreateREQ_14id.setSenderAddress(senderAddress_45idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverDOCCountryOfIssue(receiverDOCCountryOfIssue_46idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderNationality(senderNationality_47idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderDOC(senderDOC_48idTemp);
        org1tempuri1SenderCreateREQ_14id.setBankState(bankState_49idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderDOB(senderDOB_50idTemp);
        org1tempuri1SenderCreateREQ_14id.setBankCity(bankCity_51idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderPlaceOfBirth(senderPlaceOfBirth_52idTemp);
        org1tempuri1SenderCreateREQ_14id.setLocalBankCode(localBankCode_53idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverDocType(receiverDocType_54idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderOccupation(senderOccupation_55idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverDOCDateOfIssue(receiverDOCDateOfIssue_56idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderStateOfIssue(senderStateOfIssue_57idTemp);
        org1tempuri1SenderCreateREQ_14id.setCustomerNo(customerNo_58idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderStateorCounty(senderStateorCounty_59idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverDOC(receiverDOC_60idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverDOB(receiverDOB_61idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverEmail(receiverEmail_62idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderFirstName(senderFirstName_63idTemp);
        org1tempuri1SenderCreateREQ_14id.setBankCountry(bankCountry_64idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderCountryCode(senderCountryCode_65idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderSocialSecurityNo(senderSocialSecurityNo_66idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverLastName(receiverLastName_67idTemp);
        org1tempuri1SenderCreateREQ_14id.setBankAddress(bankAddress_68idTemp);
        org1tempuri1SenderCreateREQ_14id.setSenderDOCCountryOfIssue(senderDOCCountryOfIssue_69idTemp);
        org1tempuri1SenderCreateREQ_14id.setReceiverDOCDateOfExpiry(receiverDOCDateOfExpiry_70idTemp);
        org1tempuri1SenderCreateREQ_14id.setBank(bank_71idTemp);
        String partnerTransactionNo_72id=  request.getParameter("partnerTransactionNo174");
            java.lang.String partnerTransactionNo_72idTemp = null;
        if(!partnerTransactionNo_72id.equals("")){
         partnerTransactionNo_72idTemp  = partnerTransactionNo_72id;
        }
        String payoutAmount_73id=  request.getParameter("payoutAmount176");
            java.math.BigDecimal payoutAmount_73idTemp = null;
        if(!payoutAmount_73id.equals("")){
         payoutAmount_73idTemp  = new java.math.BigDecimal(payoutAmount_73id);
        }
        String sourceCountry_74id=  request.getParameter("sourceCountry178");
            java.lang.String sourceCountry_74idTemp = null;
        if(!sourceCountry_74id.equals("")){
         sourceCountry_74idTemp  = sourceCountry_74id;
        }
        String localAmount_75id=  request.getParameter("localAmount180");
            java.math.BigDecimal localAmount_75idTemp = null;
        if(!localAmount_75id.equals("")){
         localAmount_75idTemp  = new java.math.BigDecimal(localAmount_75id);
        }
        String transferCharge_76id=  request.getParameter("transferCharge182");
            java.math.BigDecimal transferCharge_76idTemp = null;
        if(!transferCharge_76id.equals("")){
         transferCharge_76idTemp  = new java.math.BigDecimal(transferCharge_76id);
        }
        %>
        <jsp:useBean id="org1tempuri1RemittanceReQ_1id" scope="session" class="org.tempuri.RemittanceReQ" />
        <%
        org1tempuri1RemittanceReQ_1id.setDestinationCurrency(destinationCurrency_2idTemp);
        org1tempuri1RemittanceReQ_1id.setProductId(productId_3idTemp);
        org1tempuri1RemittanceReQ_1id.setCredentials(org1tempuri1Authenticate_4id);
        org1tempuri1RemittanceReQ_1id.setProcessDateTime(processDateTime_9idTemp);
        org1tempuri1RemittanceReQ_1id.setDestinationCountry(destinationCountry_10idTemp);
        org1tempuri1RemittanceReQ_1id.setPayoutAgentID(payoutAgentID_11idTemp);
        org1tempuri1RemittanceReQ_1id.setSourceCurrency(sourceCurrency_12idTemp);
        org1tempuri1RemittanceReQ_1id.setExchangeRate(exchangeRate_13idTemp);
        org1tempuri1RemittanceReQ_1id.setCBCR(org1tempuri1SenderCreateREQ_14id);
        org1tempuri1RemittanceReQ_1id.setPartnerTransactionNo(partnerTransactionNo_72idTemp);
        org1tempuri1RemittanceReQ_1id.setPayoutAmount(payoutAmount_73idTemp);
        org1tempuri1RemittanceReQ_1id.setSourceCountry(sourceCountry_74idTemp);
        org1tempuri1RemittanceReQ_1id.setLocalAmount(localAmount_75idTemp);
        org1tempuri1RemittanceReQ_1id.setTransferCharge(transferCharge_76idTemp);
        org.tempuri.RemittanceReS RMSendTransaction13mtemp = sampleRMServiceSoapProxyid.RMSendTransaction(org1tempuri1RemittanceReQ_1id);
if(RMSendTransaction13mtemp == null){
%>
<%=RMSendTransaction13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(RMSendTransaction13mtemp != null){
java.lang.String typecode16 = RMSendTransaction13mtemp.getCode();
        String tempResultcode16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode16));
        %>
        <%= tempResultcode16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">beneficiaryId:</TD>
<TD>
<%
if(RMSendTransaction13mtemp != null){
java.lang.String typebeneficiaryId18 = RMSendTransaction13mtemp.getBeneficiaryId();
        String tempResultbeneficiaryId18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebeneficiaryId18));
        %>
        <%= tempResultbeneficiaryId18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(RMSendTransaction13mtemp != null){
java.lang.String typestatus20 = RMSendTransaction13mtemp.getStatus();
        String tempResultstatus20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus20));
        %>
        <%= tempResultstatus20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">readMe:</TD>
<TD>
<%
if(RMSendTransaction13mtemp != null){
java.lang.String typereadMe22 = RMSendTransaction13mtemp.getReadMe();
        String tempResultreadMe22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereadMe22));
        %>
        <%= tempResultreadMe22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">remarks:</TD>
<TD>
<%
if(RMSendTransaction13mtemp != null){
java.lang.String typeremarks24 = RMSendTransaction13mtemp.getRemarks();
        String tempResultremarks24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeremarks24));
        %>
        <%= tempResultremarks24 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">mTRefNo:</TD>
<TD>
<%
if(RMSendTransaction13mtemp != null){
java.lang.String typemTRefNo26 = RMSendTransaction13mtemp.getMTRefNo();
        String tempResultmTRefNo26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemTRefNo26));
        %>
        <%= tempResultmTRefNo26 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(RMSendTransaction13mtemp != null){
java.lang.String typedescription28 = RMSendTransaction13mtemp.getDescription();
        String tempResultdescription28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription28));
        %>
        <%= tempResultdescription28 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">customerId:</TD>
<TD>
<%
if(RMSendTransaction13mtemp != null){
java.lang.String typecustomerId30 = RMSendTransaction13mtemp.getCustomerId();
        String tempResultcustomerId30 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecustomerId30));
        %>
        <%= tempResultcustomerId30 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 184:
        gotMethod = true;
        String productID_78id=  request.getParameter("productID195");
        int productID_78idTemp  = Integer.parseInt(productID_78id);
        String agentCode_80id=  request.getParameter("agentCode199");
            java.lang.String agentCode_80idTemp = null;
        if(!agentCode_80id.equals("")){
         agentCode_80idTemp  = agentCode_80id;
        }
        String password_81id=  request.getParameter("password201");
            java.lang.String password_81idTemp = null;
        if(!password_81id.equals("")){
         password_81idTemp  = password_81id;
        }
        String userCode_82id=  request.getParameter("userCode203");
            java.lang.String userCode_82idTemp = null;
        if(!userCode_82id.equals("")){
         userCode_82idTemp  = userCode_82id;
        }
        String loginCode_83id=  request.getParameter("loginCode205");
            java.lang.String loginCode_83idTemp = null;
        if(!loginCode_83id.equals("")){
         loginCode_83idTemp  = loginCode_83id;
        }
        %>
        <jsp:useBean id="org1tempuri1Authenticate_79id" scope="session" class="org.tempuri.Authenticate" />
        <%
        org1tempuri1Authenticate_79id.setAgentCode(agentCode_80idTemp);
        org1tempuri1Authenticate_79id.setPassword(password_81idTemp);
        org1tempuri1Authenticate_79id.setUserCode(userCode_82idTemp);
        org1tempuri1Authenticate_79id.setLoginCode(loginCode_83idTemp);
        String mTRefNo_84id=  request.getParameter("mTRefNo207");
            java.lang.String mTRefNo_84idTemp = null;
        if(!mTRefNo_84id.equals("")){
         mTRefNo_84idTemp  = mTRefNo_84id;
        }
        String partnerTransactionNo_85id=  request.getParameter("partnerTransactionNo209");
            java.lang.String partnerTransactionNo_85idTemp = null;
        if(!partnerTransactionNo_85id.equals("")){
         partnerTransactionNo_85idTemp  = partnerTransactionNo_85id;
        }
        %>
        <jsp:useBean id="org1tempuri1CheckStatusReq_77id" scope="session" class="org.tempuri.CheckStatusReq" />
        <%
        org1tempuri1CheckStatusReq_77id.setProductID(productID_78idTemp);
        org1tempuri1CheckStatusReq_77id.setCredentials(org1tempuri1Authenticate_79id);
        org1tempuri1CheckStatusReq_77id.setMTRefNo(mTRefNo_84idTemp);
        org1tempuri1CheckStatusReq_77id.setPartnerTransactionNo(partnerTransactionNo_85idTemp);
        org.tempuri.CheckStatusRes RMStatusCheck184mtemp = sampleRMServiceSoapProxyid.RMStatusCheck(org1tempuri1CheckStatusReq_77id);
if(RMStatusCheck184mtemp == null){
%>
<%=RMStatusCheck184mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(RMStatusCheck184mtemp != null){
java.lang.String typestatus187 = RMStatusCheck184mtemp.getStatus();
        String tempResultstatus187 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus187));
        %>
        <%= tempResultstatus187 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">message:</TD>
<TD>
<%
if(RMStatusCheck184mtemp != null){
java.lang.String typemessage189 = RMStatusCheck184mtemp.getMessage();
        String tempResultmessage189 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemessage189));
        %>
        <%= tempResultmessage189 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">partnerTransactionNo:</TD>
<TD>
<%
if(RMStatusCheck184mtemp != null){
java.lang.String typepartnerTransactionNo191 = RMStatusCheck184mtemp.getPartnerTransactionNo();
        String tempResultpartnerTransactionNo191 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepartnerTransactionNo191));
        %>
        <%= tempResultpartnerTransactionNo191 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 211:
        gotMethod = true;
        String agentCode_88id=  request.getParameter("agentCode350");
            java.lang.String agentCode_88idTemp = null;
        if(!agentCode_88id.equals("")){
         agentCode_88idTemp  = agentCode_88id;
        }
        String password_89id=  request.getParameter("password352");
            java.lang.String password_89idTemp = null;
        if(!password_89id.equals("")){
         password_89idTemp  = password_89id;
        }
        String userCode_90id=  request.getParameter("userCode354");
            java.lang.String userCode_90idTemp = null;
        if(!userCode_90id.equals("")){
         userCode_90idTemp  = userCode_90id;
        }
        String loginCode_91id=  request.getParameter("loginCode356");
            java.lang.String loginCode_91idTemp = null;
        if(!loginCode_91id.equals("")){
         loginCode_91idTemp  = loginCode_91id;
        }
        %>
        <jsp:useBean id="org1tempuri1Authenticate_87id" scope="session" class="org.tempuri.Authenticate" />
        <%
        org1tempuri1Authenticate_87id.setAgentCode(agentCode_88idTemp);
        org1tempuri1Authenticate_87id.setPassword(password_89idTemp);
        org1tempuri1Authenticate_87id.setUserCode(userCode_90idTemp);
        org1tempuri1Authenticate_87id.setLoginCode(loginCode_91idTemp);
        String partnerTransactionNo_92id=  request.getParameter("partnerTransactionNo358");
            java.lang.String partnerTransactionNo_92idTemp = null;
        if(!partnerTransactionNo_92id.equals("")){
         partnerTransactionNo_92idTemp  = partnerTransactionNo_92id;
        }
        %>
        <jsp:useBean id="org1tempuri1GetTransactionReq_86id" scope="session" class="org.tempuri.GetTransactionReq" />
        <%
        org1tempuri1GetTransactionReq_86id.setCredentials(org1tempuri1Authenticate_87id);
        org1tempuri1GetTransactionReq_86id.setPartnerTransactionNo(partnerTransactionNo_92idTemp);
        org.tempuri.GetTransactionRes RMGetTransaction211mtemp = sampleRMServiceSoapProxyid.RMGetTransaction(org1tempuri1GetTransactionReq_86id);
if(RMGetTransaction211mtemp == null){
%>
<%=RMGetTransaction211mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">destinationCurrency:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
java.lang.String typedestinationCurrency214 = RMGetTransaction211mtemp.getDestinationCurrency();
        String tempResultdestinationCurrency214 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedestinationCurrency214));
        %>
        <%= tempResultdestinationCurrency214 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">productId:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
%>
<%=RMGetTransaction211mtemp.getProductId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">processDateTime:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
java.util.Calendar typeprocessDateTime218 = RMGetTransaction211mtemp.getProcessDateTime();
        java.text.DateFormat dateFormatprocessDateTime218 = java.text.DateFormat.getDateInstance();
        java.util.Date dateprocessDateTime218 = typeprocessDateTime218.getTime();
        String tempResultprocessDateTime218 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatprocessDateTime218.format(dateprocessDateTime218));
        %>
        <%= tempResultprocessDateTime218 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">destinationCountry:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
java.lang.String typedestinationCountry220 = RMGetTransaction211mtemp.getDestinationCountry();
        String tempResultdestinationCountry220 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedestinationCountry220));
        %>
        <%= tempResultdestinationCountry220 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">payoutAgentID:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
%>
<%=RMGetTransaction211mtemp.getPayoutAgentID()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">cBCR:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDocType:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
%>
<%=tebece0.getSenderDocType()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDOCDateOfIssue:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.util.Calendar typesenderDOCDateOfIssue228 = tebece0.getSenderDOCDateOfIssue();
        java.text.DateFormat dateFormatsenderDOCDateOfIssue228 = java.text.DateFormat.getDateInstance();
        java.util.Date datesenderDOCDateOfIssue228 = typesenderDOCDateOfIssue228.getTime();
        String tempResultsenderDOCDateOfIssue228 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatsenderDOCDateOfIssue228.format(datesenderDOCDateOfIssue228));
        %>
        <%= tempResultsenderDOCDateOfIssue228 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverGender:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverGender230 = tebece0.getReceiverGender();
        String tempResultreceiverGender230 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverGender230));
        %>
        <%= tempResultreceiverGender230 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverPostorZipCode:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverPostorZipCode232 = tebece0.getReceiverPostorZipCode();
        String tempResultreceiverPostorZipCode232 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverPostorZipCode232));
        %>
        <%= tempResultreceiverPostorZipCode232 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">cPFNumber:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typecPFNumber234 = tebece0.getCPFNumber();
        String tempResultcPFNumber234 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecPFNumber234));
        %>
        <%= tempResultcPFNumber234 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankBranch:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typebankBranch236 = tebece0.getBankBranch();
        String tempResultbankBranch236 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebankBranch236));
        %>
        <%= tempResultbankBranch236 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderTelephone:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderTelephone238 = tebece0.getSenderTelephone();
        String tempResultsenderTelephone238 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderTelephone238));
        %>
        <%= tempResultsenderTelephone238 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">testAnswer:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typetestAnswer240 = tebece0.getTestAnswer();
        String tempResulttestAnswer240 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetestAnswer240));
        %>
        <%= tempResulttestAnswer240 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderLastName:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderLastName242 = tebece0.getSenderLastName();
        String tempResultsenderLastName242 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderLastName242));
        %>
        <%= tempResultsenderLastName242 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderGender:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderGender244 = tebece0.getSenderGender();
        String tempResultsenderGender244 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderGender244));
        %>
        <%= tempResultsenderGender244 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverFirstName:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverFirstName246 = tebece0.getReceiverFirstName();
        String tempResultreceiverFirstName246 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverFirstName246));
        %>
        <%= tempResultreceiverFirstName246 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankAccount:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typebankAccount248 = tebece0.getBankAccount();
        String tempResultbankAccount248 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebankAccount248));
        %>
        <%= tempResultbankAccount248 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverNo:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
%>
<%=tebece0.getReceiverNo()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">testQuestion:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typetestQuestion252 = tebece0.getTestQuestion();
        String tempResulttestQuestion252 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetestQuestion252));
        %>
        <%= tempResulttestQuestion252 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverAddress:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverAddress254 = tebece0.getReceiverAddress();
        String tempResultreceiverAddress254 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverAddress254));
        %>
        <%= tempResultreceiverAddress254 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">reasonForPayment:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereasonForPayment256 = tebece0.getReasonForPayment();
        String tempResultreasonForPayment256 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereasonForPayment256));
        %>
        <%= tempResultreasonForPayment256 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverCountryCode:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverCountryCode258 = tebece0.getReceiverCountryCode();
        String tempResultreceiverCountryCode258 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverCountryCode258));
        %>
        <%= tempResultreceiverCountryCode258 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDOCDateOfExpiry:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.util.Calendar typesenderDOCDateOfExpiry260 = tebece0.getSenderDOCDateOfExpiry();
        java.text.DateFormat dateFormatsenderDOCDateOfExpiry260 = java.text.DateFormat.getDateInstance();
        java.util.Date datesenderDOCDateOfExpiry260 = typesenderDOCDateOfExpiry260.getTime();
        String tempResultsenderDOCDateOfExpiry260 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatsenderDOCDateOfExpiry260.format(datesenderDOCDateOfExpiry260));
        %>
        <%= tempResultsenderDOCDateOfExpiry260 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">sourceOfFund:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesourceOfFund262 = tebece0.getSourceOfFund();
        String tempResultsourceOfFund262 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesourceOfFund262));
        %>
        <%= tempResultsourceOfFund262 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverTelephone:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverTelephone264 = tebece0.getReceiverTelephone();
        String tempResultreceiverTelephone264 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverTelephone264));
        %>
        <%= tempResultreceiverTelephone264 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankAccountType:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typebankAccountType266 = tebece0.getBankAccountType();
        String tempResultbankAccountType266 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebankAccountType266));
        %>
        <%= tempResultbankAccountType266 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">iBAN:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typeiBAN268 = tebece0.getIBAN();
        String tempResultiBAN268 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeiBAN268));
        %>
        <%= tempResultiBAN268 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverPlaceOfBirth:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverPlaceOfBirth270 = tebece0.getReceiverPlaceOfBirth();
        String tempResultreceiverPlaceOfBirth270 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverPlaceOfBirth270));
        %>
        <%= tempResultreceiverPlaceOfBirth270 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverStateorCounty:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverStateorCounty272 = tebece0.getReceiverStateorCounty();
        String tempResultreceiverStateorCounty272 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverStateorCounty272));
        %>
        <%= tempResultreceiverStateorCounty272 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderPostorZipCode:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderPostorZipCode274 = tebece0.getSenderPostorZipCode();
        String tempResultsenderPostorZipCode274 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderPostorZipCode274));
        %>
        <%= tempResultsenderPostorZipCode274 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">credentials:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">agentCode:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
org.tempuri.Authenticate tebece1=tebece0.getCredentials();
if(tebece1 != null){
java.lang.String typeagentCode278 = tebece1.getAgentCode();
        String tempResultagentCode278 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeagentCode278));
        %>
        <%= tempResultagentCode278 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">password:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
org.tempuri.Authenticate tebece1=tebece0.getCredentials();
if(tebece1 != null){
java.lang.String typepassword280 = tebece1.getPassword();
        String tempResultpassword280 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword280));
        %>
        <%= tempResultpassword280 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">userCode:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
org.tempuri.Authenticate tebece1=tebece0.getCredentials();
if(tebece1 != null){
java.lang.String typeuserCode282 = tebece1.getUserCode();
        String tempResultuserCode282 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuserCode282));
        %>
        <%= tempResultuserCode282 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">loginCode:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
org.tempuri.Authenticate tebece1=tebece0.getCredentials();
if(tebece1 != null){
java.lang.String typeloginCode284 = tebece1.getLoginCode();
        String tempResultloginCode284 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeloginCode284));
        %>
        <%= tempResultloginCode284 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderAddress:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderAddress286 = tebece0.getSenderAddress();
        String tempResultsenderAddress286 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderAddress286));
        %>
        <%= tempResultsenderAddress286 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDOCCountryOfIssue:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverDOCCountryOfIssue288 = tebece0.getReceiverDOCCountryOfIssue();
        String tempResultreceiverDOCCountryOfIssue288 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverDOCCountryOfIssue288));
        %>
        <%= tempResultreceiverDOCCountryOfIssue288 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderNationality:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderNationality290 = tebece0.getSenderNationality();
        String tempResultsenderNationality290 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderNationality290));
        %>
        <%= tempResultsenderNationality290 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDOC:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderDOC292 = tebece0.getSenderDOC();
        String tempResultsenderDOC292 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderDOC292));
        %>
        <%= tempResultsenderDOC292 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankState:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typebankState294 = tebece0.getBankState();
        String tempResultbankState294 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebankState294));
        %>
        <%= tempResultbankState294 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDOB:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.util.Calendar typesenderDOB296 = tebece0.getSenderDOB();
        java.text.DateFormat dateFormatsenderDOB296 = java.text.DateFormat.getDateInstance();
        java.util.Date datesenderDOB296 = typesenderDOB296.getTime();
        String tempResultsenderDOB296 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatsenderDOB296.format(datesenderDOB296));
        %>
        <%= tempResultsenderDOB296 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankCity:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typebankCity298 = tebece0.getBankCity();
        String tempResultbankCity298 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebankCity298));
        %>
        <%= tempResultbankCity298 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderPlaceOfBirth:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderPlaceOfBirth300 = tebece0.getSenderPlaceOfBirth();
        String tempResultsenderPlaceOfBirth300 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderPlaceOfBirth300));
        %>
        <%= tempResultsenderPlaceOfBirth300 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">localBankCode:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typelocalBankCode302 = tebece0.getLocalBankCode();
        String tempResultlocalBankCode302 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelocalBankCode302));
        %>
        <%= tempResultlocalBankCode302 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDocType:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
%>
<%=tebece0.getReceiverDocType()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderOccupation:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderOccupation306 = tebece0.getSenderOccupation();
        String tempResultsenderOccupation306 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderOccupation306));
        %>
        <%= tempResultsenderOccupation306 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDOCDateOfIssue:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.util.Calendar typereceiverDOCDateOfIssue308 = tebece0.getReceiverDOCDateOfIssue();
        java.text.DateFormat dateFormatreceiverDOCDateOfIssue308 = java.text.DateFormat.getDateInstance();
        java.util.Date datereceiverDOCDateOfIssue308 = typereceiverDOCDateOfIssue308.getTime();
        String tempResultreceiverDOCDateOfIssue308 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatreceiverDOCDateOfIssue308.format(datereceiverDOCDateOfIssue308));
        %>
        <%= tempResultreceiverDOCDateOfIssue308 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderStateOfIssue:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderStateOfIssue310 = tebece0.getSenderStateOfIssue();
        String tempResultsenderStateOfIssue310 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderStateOfIssue310));
        %>
        <%= tempResultsenderStateOfIssue310 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">customerNo:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
%>
<%=tebece0.getCustomerNo()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderStateorCounty:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderStateorCounty314 = tebece0.getSenderStateorCounty();
        String tempResultsenderStateorCounty314 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderStateorCounty314));
        %>
        <%= tempResultsenderStateorCounty314 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDOC:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverDOC316 = tebece0.getReceiverDOC();
        String tempResultreceiverDOC316 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverDOC316));
        %>
        <%= tempResultreceiverDOC316 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDOB:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.util.Calendar typereceiverDOB318 = tebece0.getReceiverDOB();
        java.text.DateFormat dateFormatreceiverDOB318 = java.text.DateFormat.getDateInstance();
        java.util.Date datereceiverDOB318 = typereceiverDOB318.getTime();
        String tempResultreceiverDOB318 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatreceiverDOB318.format(datereceiverDOB318));
        %>
        <%= tempResultreceiverDOB318 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverEmail:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverEmail320 = tebece0.getReceiverEmail();
        String tempResultreceiverEmail320 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverEmail320));
        %>
        <%= tempResultreceiverEmail320 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderFirstName:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderFirstName322 = tebece0.getSenderFirstName();
        String tempResultsenderFirstName322 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderFirstName322));
        %>
        <%= tempResultsenderFirstName322 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankCountry:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typebankCountry324 = tebece0.getBankCountry();
        String tempResultbankCountry324 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebankCountry324));
        %>
        <%= tempResultbankCountry324 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderCountryCode:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderCountryCode326 = tebece0.getSenderCountryCode();
        String tempResultsenderCountryCode326 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderCountryCode326));
        %>
        <%= tempResultsenderCountryCode326 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderSocialSecurityNo:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderSocialSecurityNo328 = tebece0.getSenderSocialSecurityNo();
        String tempResultsenderSocialSecurityNo328 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderSocialSecurityNo328));
        %>
        <%= tempResultsenderSocialSecurityNo328 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverLastName:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typereceiverLastName330 = tebece0.getReceiverLastName();
        String tempResultreceiverLastName330 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiverLastName330));
        %>
        <%= tempResultreceiverLastName330 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankAddress:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typebankAddress332 = tebece0.getBankAddress();
        String tempResultbankAddress332 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebankAddress332));
        %>
        <%= tempResultbankAddress332 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDOCCountryOfIssue:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typesenderDOCCountryOfIssue334 = tebece0.getSenderDOCCountryOfIssue();
        String tempResultsenderDOCCountryOfIssue334 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesenderDOCCountryOfIssue334));
        %>
        <%= tempResultsenderDOCCountryOfIssue334 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDOCDateOfExpiry:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.util.Calendar typereceiverDOCDateOfExpiry336 = tebece0.getReceiverDOCDateOfExpiry();
        java.text.DateFormat dateFormatreceiverDOCDateOfExpiry336 = java.text.DateFormat.getDateInstance();
        java.util.Date datereceiverDOCDateOfExpiry336 = typereceiverDOCDateOfExpiry336.getTime();
        String tempResultreceiverDOCDateOfExpiry336 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatreceiverDOCDateOfExpiry336.format(datereceiverDOCDateOfExpiry336));
        %>
        <%= tempResultreceiverDOCDateOfExpiry336 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bank:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
org.tempuri.SenderCreateREQ tebece0=RMGetTransaction211mtemp.getCBCR();
if(tebece0 != null){
java.lang.String typebank338 = tebece0.getBank();
        String tempResultbank338 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebank338));
        %>
        <%= tempResultbank338 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">partnerTransactionNo:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
java.lang.String typepartnerTransactionNo340 = RMGetTransaction211mtemp.getPartnerTransactionNo();
        String tempResultpartnerTransactionNo340 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepartnerTransactionNo340));
        %>
        <%= tempResultpartnerTransactionNo340 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">payoutAmount:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
java.math.BigDecimal typepayoutAmount342 = RMGetTransaction211mtemp.getPayoutAmount();
        String tempResultpayoutAmount342 = org.eclipse.jst.ws.util.JspUtils.markup(typepayoutAmount342.toString());
        %>
        <%= tempResultpayoutAmount342 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">localAmount:</TD>
<TD>
<%
if(RMGetTransaction211mtemp != null){
java.math.BigDecimal typelocalAmount344 = RMGetTransaction211mtemp.getLocalAmount();
        String tempResultlocalAmount344 = org.eclipse.jst.ws.util.JspUtils.markup(typelocalAmount344.toString());
        %>
        <%= tempResultlocalAmount344 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 360:
        gotMethod = true;
        String productID_94id=  request.getParameter("productID371");
        int productID_94idTemp  = Integer.parseInt(productID_94id);
        String agentCode_96id=  request.getParameter("agentCode375");
            java.lang.String agentCode_96idTemp = null;
        if(!agentCode_96id.equals("")){
         agentCode_96idTemp  = agentCode_96id;
        }
        String password_97id=  request.getParameter("password377");
            java.lang.String password_97idTemp = null;
        if(!password_97id.equals("")){
         password_97idTemp  = password_97id;
        }
        String userCode_98id=  request.getParameter("userCode379");
            java.lang.String userCode_98idTemp = null;
        if(!userCode_98id.equals("")){
         userCode_98idTemp  = userCode_98id;
        }
        String loginCode_99id=  request.getParameter("loginCode381");
            java.lang.String loginCode_99idTemp = null;
        if(!loginCode_99id.equals("")){
         loginCode_99idTemp  = loginCode_99id;
        }
        %>
        <jsp:useBean id="org1tempuri1Authenticate_95id" scope="session" class="org.tempuri.Authenticate" />
        <%
        org1tempuri1Authenticate_95id.setAgentCode(agentCode_96idTemp);
        org1tempuri1Authenticate_95id.setPassword(password_97idTemp);
        org1tempuri1Authenticate_95id.setUserCode(userCode_98idTemp);
        org1tempuri1Authenticate_95id.setLoginCode(loginCode_99idTemp);
        String partnerTransactionNo_100id=  request.getParameter("partnerTransactionNo383");
            java.lang.String partnerTransactionNo_100idTemp = null;
        if(!partnerTransactionNo_100id.equals("")){
         partnerTransactionNo_100idTemp  = partnerTransactionNo_100id;
        }
        String remark_101id=  request.getParameter("remark385");
            java.lang.String remark_101idTemp = null;
        if(!remark_101id.equals("")){
         remark_101idTemp  = remark_101id;
        }
        %>
        <jsp:useBean id="org1tempuri1CancelTransactionReq_93id" scope="session" class="org.tempuri.CancelTransactionReq" />
        <%
        org1tempuri1CancelTransactionReq_93id.setProductID(productID_94idTemp);
        org1tempuri1CancelTransactionReq_93id.setCredentials(org1tempuri1Authenticate_95id);
        org1tempuri1CancelTransactionReq_93id.setPartnerTransactionNo(partnerTransactionNo_100idTemp);
        org1tempuri1CancelTransactionReq_93id.setRemark(remark_101idTemp);
        org.tempuri.CancelTransactionRes RMCancelTransaction360mtemp = sampleRMServiceSoapProxyid.RMCancelTransaction(org1tempuri1CancelTransactionReq_93id);
if(RMCancelTransaction360mtemp == null){
%>
<%=RMCancelTransaction360mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(RMCancelTransaction360mtemp != null){
java.lang.String typestatus363 = RMCancelTransaction360mtemp.getStatus();
        String tempResultstatus363 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus363));
        %>
        <%= tempResultstatus363 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">message:</TD>
<TD>
<%
if(RMCancelTransaction360mtemp != null){
java.lang.String typemessage365 = RMCancelTransaction360mtemp.getMessage();
        String tempResultmessage365 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemessage365));
        %>
        <%= tempResultmessage365 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">partnerTransactionNo:</TD>
<TD>
<%
if(RMCancelTransaction360mtemp != null){
java.lang.String typepartnerTransactionNo367 = RMCancelTransaction360mtemp.getPartnerTransactionNo();
        String tempResultpartnerTransactionNo367 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepartnerTransactionNo367));
        %>
        <%= tempResultpartnerTransactionNo367 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 387:
        gotMethod = true;
        String destinationCurrency_103id=  request.getParameter("destinationCurrency398");
            java.lang.String destinationCurrency_103idTemp = null;
        if(!destinationCurrency_103id.equals("")){
         destinationCurrency_103idTemp  = destinationCurrency_103id;
        }
        String productID_104id=  request.getParameter("productID400");
        int productID_104idTemp  = Integer.parseInt(productID_104id);
        String agentCode_106id=  request.getParameter("agentCode404");
            java.lang.String agentCode_106idTemp = null;
        if(!agentCode_106id.equals("")){
         agentCode_106idTemp  = agentCode_106id;
        }
        String password_107id=  request.getParameter("password406");
            java.lang.String password_107idTemp = null;
        if(!password_107id.equals("")){
         password_107idTemp  = password_107id;
        }
        String userCode_108id=  request.getParameter("userCode408");
            java.lang.String userCode_108idTemp = null;
        if(!userCode_108id.equals("")){
         userCode_108idTemp  = userCode_108id;
        }
        String loginCode_109id=  request.getParameter("loginCode410");
            java.lang.String loginCode_109idTemp = null;
        if(!loginCode_109id.equals("")){
         loginCode_109idTemp  = loginCode_109id;
        }
        %>
        <jsp:useBean id="org1tempuri1Authenticate_105id" scope="session" class="org.tempuri.Authenticate" />
        <%
        org1tempuri1Authenticate_105id.setAgentCode(agentCode_106idTemp);
        org1tempuri1Authenticate_105id.setPassword(password_107idTemp);
        org1tempuri1Authenticate_105id.setUserCode(userCode_108idTemp);
        org1tempuri1Authenticate_105id.setLoginCode(loginCode_109idTemp);
        String sourceCurrency_110id=  request.getParameter("sourceCurrency412");
            java.lang.String sourceCurrency_110idTemp = null;
        if(!sourceCurrency_110id.equals("")){
         sourceCurrency_110idTemp  = sourceCurrency_110id;
        }
        %>
        <jsp:useBean id="org1tempuri1GetExchangeRatesReq_102id" scope="session" class="org.tempuri.GetExchangeRatesReq" />
        <%
        org1tempuri1GetExchangeRatesReq_102id.setDestinationCurrency(destinationCurrency_103idTemp);
        org1tempuri1GetExchangeRatesReq_102id.setProductID(productID_104idTemp);
        org1tempuri1GetExchangeRatesReq_102id.setCredentials(org1tempuri1Authenticate_105id);
        org1tempuri1GetExchangeRatesReq_102id.setSourceCurrency(sourceCurrency_110idTemp);
        org.tempuri.GetExchangeRatesRes RMGetExchangeRates387mtemp = sampleRMServiceSoapProxyid.RMGetExchangeRates(org1tempuri1GetExchangeRatesReq_102id);
if(RMGetExchangeRates387mtemp == null){
%>
<%=RMGetExchangeRates387mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">exchangeRate:</TD>
<TD>
<%
if(RMGetExchangeRates387mtemp != null){
java.math.BigDecimal typeexchangeRate390 = RMGetExchangeRates387mtemp.getExchangeRate();
        String tempResultexchangeRate390 = org.eclipse.jst.ws.util.JspUtils.markup(typeexchangeRate390.toString());
        %>
        <%= tempResultexchangeRate390 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(RMGetExchangeRates387mtemp != null){
java.lang.String typestatus392 = RMGetExchangeRates387mtemp.getStatus();
        String tempResultstatus392 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus392));
        %>
        <%= tempResultstatus392 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">message:</TD>
<TD>
<%
if(RMGetExchangeRates387mtemp != null){
java.lang.String typemessage394 = RMGetExchangeRates387mtemp.getMessage();
        String tempResultmessage394 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemessage394));
        %>
        <%= tempResultmessage394 %>
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
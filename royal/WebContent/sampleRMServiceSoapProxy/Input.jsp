<%@page contentType="text/html;charset=UTF-8"%>
<HTML>
<HEAD>
<TITLE>Inputs</TITLE>
</HEAD>
<BODY>
<H1>Inputs</H1>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) methodID = Integer.parseInt(method);
switch (methodID){ 
case 2:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 5:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">endpoint:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="endpoint8" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 10:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 13:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">remReQ:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">destinationCurrency:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="destinationCurrency34" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">productId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="productId36" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">credentials:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">agentCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="agentCode40" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">password:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="password42" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="userCode44" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">loginCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="loginCode46" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">processDateTime:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="processDateTime48" SIZE=20></TD>
<%
java.text.DateFormat dateFormatprocessDateTime48 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampprocessDateTime48  = new java.util.GregorianCalendar();
java.util.Date dateprocessDateTime48 = gcExampprocessDateTime48.getTime();
String tempResultprocessDateTime48 = dateFormatprocessDateTime48.format(dateprocessDateTime48);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultprocessDateTime48 %> </TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">destinationCountry:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="destinationCountry50" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">payoutAgentID:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="payoutAgentID52" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sourceCurrency:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="sourceCurrency54" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">exchangeRate:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="exchangeRate56" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">cBCR:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDocType:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderDocType60" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDOCDateOfIssue:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderDOCDateOfIssue62" SIZE=20></TD>
<%
java.text.DateFormat dateFormatsenderDOCDateOfIssue62 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampsenderDOCDateOfIssue62  = new java.util.GregorianCalendar();
java.util.Date datesenderDOCDateOfIssue62 = gcExampsenderDOCDateOfIssue62.getTime();
String tempResultsenderDOCDateOfIssue62 = dateFormatsenderDOCDateOfIssue62.format(datesenderDOCDateOfIssue62);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultsenderDOCDateOfIssue62 %> </TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverGender:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverGender64" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverPostorZipCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverPostorZipCode66" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">cPFNumber:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="cPFNumber68" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankBranch:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="bankBranch70" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderTelephone:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderTelephone72" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">testAnswer:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="testAnswer74" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderLastName:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderLastName76" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderGender:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderGender78" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverFirstName:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverFirstName80" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankAccount:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="bankAccount82" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverNo:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverNo84" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">testQuestion:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="testQuestion86" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverAddress:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverAddress88" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">reasonForPayment:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="reasonForPayment90" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverCountryCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverCountryCode92" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDOCDateOfExpiry:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderDOCDateOfExpiry94" SIZE=20></TD>
<%
java.text.DateFormat dateFormatsenderDOCDateOfExpiry94 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampsenderDOCDateOfExpiry94  = new java.util.GregorianCalendar();
java.util.Date datesenderDOCDateOfExpiry94 = gcExampsenderDOCDateOfExpiry94.getTime();
String tempResultsenderDOCDateOfExpiry94 = dateFormatsenderDOCDateOfExpiry94.format(datesenderDOCDateOfExpiry94);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultsenderDOCDateOfExpiry94 %> </TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">sourceOfFund:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="sourceOfFund96" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverTelephone:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverTelephone98" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankAccountType:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="bankAccountType100" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">iBAN:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="iBAN102" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverPlaceOfBirth:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverPlaceOfBirth104" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverStateorCounty:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverStateorCounty106" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderPostorZipCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderPostorZipCode108" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">credentials:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">agentCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="agentCode112" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">password:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="password114" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">userCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="userCode116" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">loginCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="loginCode118" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderAddress:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderAddress120" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDOCCountryOfIssue:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverDOCCountryOfIssue122" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderNationality:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderNationality124" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDOC:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderDOC126" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankState:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="bankState128" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDOB:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderDOB130" SIZE=20></TD>
<%
java.text.DateFormat dateFormatsenderDOB130 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampsenderDOB130  = new java.util.GregorianCalendar();
java.util.Date datesenderDOB130 = gcExampsenderDOB130.getTime();
String tempResultsenderDOB130 = dateFormatsenderDOB130.format(datesenderDOB130);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultsenderDOB130 %> </TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankCity:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="bankCity132" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderPlaceOfBirth:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderPlaceOfBirth134" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">localBankCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="localBankCode136" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDocType:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverDocType138" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderOccupation:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderOccupation140" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDOCDateOfIssue:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverDOCDateOfIssue142" SIZE=20></TD>
<%
java.text.DateFormat dateFormatreceiverDOCDateOfIssue142 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampreceiverDOCDateOfIssue142  = new java.util.GregorianCalendar();
java.util.Date datereceiverDOCDateOfIssue142 = gcExampreceiverDOCDateOfIssue142.getTime();
String tempResultreceiverDOCDateOfIssue142 = dateFormatreceiverDOCDateOfIssue142.format(datereceiverDOCDateOfIssue142);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultreceiverDOCDateOfIssue142 %> </TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderStateOfIssue:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderStateOfIssue144" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">customerNo:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="customerNo146" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderStateorCounty:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderStateorCounty148" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDOC:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverDOC150" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDOB:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverDOB152" SIZE=20></TD>
<%
java.text.DateFormat dateFormatreceiverDOB152 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampreceiverDOB152  = new java.util.GregorianCalendar();
java.util.Date datereceiverDOB152 = gcExampreceiverDOB152.getTime();
String tempResultreceiverDOB152 = dateFormatreceiverDOB152.format(datereceiverDOB152);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultreceiverDOB152 %> </TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverEmail:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverEmail154" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderFirstName:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderFirstName156" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankCountry:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="bankCountry158" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderCountryCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderCountryCode160" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderSocialSecurityNo:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderSocialSecurityNo162" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverLastName:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverLastName164" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bankAddress:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="bankAddress166" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">senderDOCCountryOfIssue:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="senderDOCCountryOfIssue168" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">receiverDOCDateOfExpiry:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="receiverDOCDateOfExpiry170" SIZE=20></TD>
<%
java.text.DateFormat dateFormatreceiverDOCDateOfExpiry170 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampreceiverDOCDateOfExpiry170  = new java.util.GregorianCalendar();
java.util.Date datereceiverDOCDateOfExpiry170 = gcExampreceiverDOCDateOfExpiry170.getTime();
String tempResultreceiverDOCDateOfExpiry170 = dateFormatreceiverDOCDateOfExpiry170.format(datereceiverDOCDateOfExpiry170);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultreceiverDOCDateOfExpiry170 %> </TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bank:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="bank172" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">partnerTransactionNo:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="partnerTransactionNo174" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">payoutAmount:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="payoutAmount176" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sourceCountry:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="sourceCountry178" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">localAmount:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="localAmount180" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">transferCharge:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="transferCharge182" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 184:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">scReQ:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">productID:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="productID195" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">credentials:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">agentCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="agentCode199" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">password:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="password201" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="userCode203" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">loginCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="loginCode205" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">mTRefNo:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="mTRefNo207" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">partnerTransactionNo:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="partnerTransactionNo209" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 211:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">getTrnReQ:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">credentials:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">agentCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="agentCode350" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">password:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="password352" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="userCode354" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">loginCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="loginCode356" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">partnerTransactionNo:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="partnerTransactionNo358" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 360:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">canslTrnReq:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">productID:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="productID371" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">credentials:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">agentCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="agentCode375" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">password:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="password377" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="userCode379" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">loginCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="loginCode381" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">partnerTransactionNo:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="partnerTransactionNo383" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">remark:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="remark385" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 387:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">getExchReQ:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">destinationCurrency:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="destinationCurrency398" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">productID:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="productID400" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">credentials:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">agentCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="agentCode404" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">password:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="password406" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="userCode408" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">loginCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="loginCode410" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sourceCurrency:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="sourceCurrency412" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 1111111111:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">URLString:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="url1111111111" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 1111111112:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
}
if (valid) {
%>
Select a method to test.
<%
}
%>

</BODY>
</HTML>

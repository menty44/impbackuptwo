<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBLZServicePortTypeProxyid" scope="session" class="com.thomas_bayer.blz.BLZServicePortTypeProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBLZServicePortTypeProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleBLZServicePortTypeProxyid.getEndpoint();
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
        sampleBLZServicePortTypeProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.thomas_bayer.blz.BLZServicePortType getBLZServicePortType10mtemp = sampleBLZServicePortTypeProxyid.getBLZServicePortType();
if(getBLZServicePortType10mtemp == null){
%>
<%=getBLZServicePortType10mtemp %>
<%
}else{
        if(getBLZServicePortType10mtemp!= null){
        String tempreturnp11 = getBLZServicePortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String blz_1id=  request.getParameter("blz24");
            java.lang.String blz_1idTemp = null;
        if(!blz_1id.equals("")){
         blz_1idTemp  = blz_1id;
        }
        com.thomas_bayer.blz.DetailsType getBank13mtemp = sampleBLZServicePortTypeProxyid.getBank(blz_1idTemp);
if(getBank13mtemp == null){
%>
<%=getBank13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">bic:</TD>
<TD>
<%
if(getBank13mtemp != null){
java.lang.String typebic16 = getBank13mtemp.getBic();
        String tempResultbic16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebic16));
        %>
        <%= tempResultbic16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">plz:</TD>
<TD>
<%
if(getBank13mtemp != null){
java.lang.String typeplz18 = getBank13mtemp.getPlz();
        String tempResultplz18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeplz18));
        %>
        <%= tempResultplz18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ort:</TD>
<TD>
<%
if(getBank13mtemp != null){
java.lang.String typeort20 = getBank13mtemp.getOrt();
        String tempResultort20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeort20));
        %>
        <%= tempResultort20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">bezeichnung:</TD>
<TD>
<%
if(getBank13mtemp != null){
java.lang.String typebezeichnung22 = getBank13mtemp.getBezeichnung();
        String tempResultbezeichnung22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebezeichnung22));
        %>
        <%= tempResultbezeichnung22 %>
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
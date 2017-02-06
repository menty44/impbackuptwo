package com.impala.webservices;

import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConnection;

import java.security.MessageDigest;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
// add this import if you need soapaction
//import javax.xml.soap.MimeHeaders;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;

import javax.xml.transform.stream.StreamResult;

public class RetrieveGet_dtickets {

  public static void main(String[] args) {

    try {
    	
    	String currency = "EUR";
        String IDProduct = "4";
        String IDReseller = "impalapay.reseller.test@neosurf.com+soked3dpme";
        String IDTransaction = "TRX001";
        String IDUser = "225";
        String quantity = "1";
        String distributorSecretKey = "de544d61zekhe6fgkezuf64e69effztd";
        
        String fred = currency + IDProduct + IDReseller + IDTransaction + IDUser + quantity + distributorSecretKey;
        
        //************start hashing using SHA-1*************//
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(fred.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        //System.out.println("Hex format : " + sb.toString());

        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
    	for (int i=0;i<byteData.length;i++) {
    		String hex=Integer.toHexString(0xff & byteData[i]);
   	     	if(hex.length()==1) hexString.append('0');
   	     	hexString.append(hex);
    	}
    	//System.out.println("Hex format : " + hexString.toString());
    	
    	String hash = hexString.toString();
    	
    	//System.out.println(hash);
    	
    	//************end hashing using SHA-1*************//
    	
    	
		// Create the connection
		SOAPConnectionFactory scf = SOAPConnectionFactory.newInstance();
		SOAPConnection conn = scf.createConnection();
				
		// Create message
		MessageFactory mf = MessageFactory.newInstance();
		SOAPMessage msg = mf.createMessage();

        // Add eventually a SoapAction header if necessary
        /*
        MimeHeaders hd = msg.getMimeHeaders();
        hd.addHeader("SOAPAction", "urn:yoursoapaction");
        */

		// Object for message parts
		SOAPPart sp = msg.getSOAPPart();
	
		SOAPEnvelope env = sp.getEnvelope();
		env.addNamespaceDeclaration("xsd","http://www.w3.org/2001/XMLSchema");
		env.addNamespaceDeclaration("xsi","http://www.w3.org/2001/XMLSchema-instance");
		env.addNamespaceDeclaration("enc","http://schemas.xmlsoap.org/soap/encoding/");
		env.addNamespaceDeclaration("env","http://schemas.xmlsoap.org/soap/envelop/");
		env.setEncodingStyle("http://schemas.xmlsoap.org/soap/encoding/");
	
		SOAPBody bd = env.getBody();
		
		// Populate body
		// Main element and namespace
		SOAPElement be = bd.addChildElement(env.createName("get_dtickets")); 
		
		// namespace to use for my rpc/encoded wsdl version is:
	    // http://phonedirlux.homeip.net/wsdl
	    // note, in this case the endpoint address is /rcx-ws-rpc/rcx
	
		// Add content
		be.addChildElement("currency").addTextNode(currency).setAttribute("xsi:type","xsd:string");
		be.addChildElement("hash").addTextNode(hash).setAttribute("xsi:type","xsd:string");
		be.addChildElement("IDProduct").addTextNode(IDProduct).setAttribute("xsi:type","xsd:int");
		be.addChildElement("IDReseller").addTextNode(IDReseller).setAttribute("xsi:type","xsd:string");
		be.addChildElement("IDTransaction").addTextNode(IDTransaction).setAttribute("xsi:type","xsd:string");
		be.addChildElement("IDUser").addTextNode(IDUser).setAttribute("xsi:type","xsd:int");
		be.addChildElement("quantity").addTextNode(quantity).setAttribute("xsi:type","xsd:int");
	
		// Save message
		msg.saveChanges();
	
		// View input
		System.out.println("\n Soap request:\n");
		msg.writeTo(System.out);
		System.out.println();
	
		// Send
		String urlval = "https://www.neosurf.info:443/soap/index.php";
	    // or /rcx-ws-rpc/rcx for my rpc/encoded web service
	
		SOAPMessage rp = conn.call(msg, urlval);

		// View the output
		System.out.println("\nXML response\n");
	
		// Create transformer
		TransformerFactory tff = TransformerFactory.newInstance();
		Transformer tf = tff.newTransformer();
	
		// Get reply content
		Source sc = rp.getSOAPPart().getContent();
	
		// Set output transformation
		StreamResult result = new StreamResult(System.out);
		tf.transform(sc, result);
		System.out.println();
				
		// Close connection
		conn.close();
		
		}
    catch (Exception e){
	System.out.println(e.getMessage());
	}
    
    }
  
  }
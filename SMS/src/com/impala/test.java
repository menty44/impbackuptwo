package com.impala;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.MalformedInputException;

public class test {
	
	public static void main (String [] args) {
		
		String apiUrl = "http://localhost:8080/SMSGateway//sendsms";
		
		try {
			System.out.println("Response for a sendsms request" + getResponse(apiUrl +
					"?"+
					"username="+ URLEncoder.encode("tawi" , "UTF-8") +
					"&password="+ URLEncoder.encode("tawi123", "UTF-8") +
					"&source=20240"+
					"&destination=254720106420"+
					"&message="+ URLEncoder.encode("hello from Impala") +
					"&network=safaricom_ke"
					));
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			System.err.println("UnsupportedEncodingException whle trying to send SMS");
			e.printStackTrace();
		}
	}
	
	private static String getResponse(String urlStr) {
		URLConnection conn;
		URL url;
		BufferedReader reader;
		String response = "";
		
		try {
			url = new URL(urlStr);
			conn = url.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			response = reader.readLine();
			
			reader.close();
			
		} catch (MalformedURLException e) {
			// TODO: handle exception
			System.err.println("MalformedURLException");
			e.printStackTrace();
			
		} catch (IOException e2) {
			// TODO: handle exception
			System.err.println("IOException exception");
			e2.printStackTrace();
			
			}
		
		return response;
			
			
		}
		
		
	}



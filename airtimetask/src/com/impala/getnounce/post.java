package com.impala.getnounce;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
/**
 * @author Arpit Mandliya
 */
public class post {
	
	//Bypassing the SSL verification to execute our code successfully 
    static {
        try {
            disableSSLVerification();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(post.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Method used for bypassing SSL verification
    public static void disableSSLVerification() throws NoSuchAlgorithmException {

        TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }

        } };

        SSLContext sc = null;
        try {
            sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };      
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);           
    }

 private final String USER_AGENT = "Mozilla/5.0";

 public static void main(String[] args) throws Exception {

  post http = new post();

     // Sending get request
  //http.sendingGetRequest();
  
    // Sending post request
  http.sendingPostRequest();

 }

 // HTTP GET request
// private void sendingGetRequest() throws Exception {
//
//  String urlString = "https://localhost:8443/AirtimeGateway/0.3/topup";
//  
//  URL url = new URL(urlString);
//  HttpURLConnection con = (HttpURLConnection) url.openConnection();
//
//  // By default it is GET request
//  con.setRequestMethod("GET");
//
//  //add request header
//  con.setRequestProperty("User-Agent", USER_AGENT);
//
//  int responseCode = con.getResponseCode();
//  System.out.println("Sending get request : "+ url);
//  System.out.println("Response code : "+ responseCode);
//
//  // Reading response from input Stream
//  BufferedReader in = new BufferedReader(
//          new InputStreamReader(con.getInputStream()));
//  String output;
//  StringBuffer response = new StringBuffer();
//
//  while ((output = in.readLine()) != null) {
//   response.append(output);
//  }
//  in.close();
//
//  //printing result from response
//  System.out.println(response.toString());
//
// }
 
 // HTTP Post request
 private void sendingPostRequest() throws Exception {

  String url = "https://localhost:8443/AirtimeGateway/0.3/topup";
  URL obj = new URL(url);
  HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Setting basic post request
  con.setRequestMethod("POST");
  con.setRequestProperty("User-Agent", USER_AGENT);
  con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
  con.setRequestProperty("Content-Type","application/json");

  String postJsonData = "{\"id\":5,\"countryName\":\"USA\",\"population\":8000}";
  
  // Send post request
  con.setDoOutput(true);
  DataOutputStream wr = new DataOutputStream(con.getOutputStream());
  wr.writeBytes(postJsonData);
  wr.flush();
  wr.close();

  int responseCode = con.getResponseCode();
  System.out.println("\nSending 'POST' request to URL : " + url);
  System.out.println("Post Data : " + postJsonData);
  System.out.println("Response Code : " + responseCode);

  BufferedReader in = new BufferedReader(
          new InputStreamReader(con.getInputStream()));
  String output;
  StringBuffer response = new StringBuffer();

  while ((output = in.readLine()) != null) {
   response.append(output);
  }
  in.close();
  
  //printing result from response
  System.out.println(response.toString());
 }
}

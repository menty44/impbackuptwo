package jsonPost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.entity.ContentType;
import org.apache.http.HttpResponse;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import java.util.Map;

public class SimpleHTTPPOSTRequester {
	
	private String apiusername;
    private String apipassword;
    private String apiURL;
 
    public SimpleHTTPPOSTRequester(String apiusername, String apipassword, String apiURL) {        
        this.apiURL = apiURL;
        this.apiusername = apiusername;
        this.apipassword = apipassword;
    }
 
    public void makeHTTPPOSTRequest() {
        try {
            HttpClient c = new DefaultHttpClient();        
            HttpPost p = new HttpPost(this.apiURL);        
 
            p.setEntity(new StringEntity("{\"username\":\"" + this.apiusername + "\",\"password\":\"" + this.apipassword + "\"}", 
                             ContentType.create("application/json")));
 
            HttpResponse r = c.execute(p);
 
            BufferedReader rd = new BufferedReader(new InputStreamReader(r.getEntity().getContent()));
            String line = "";
            while ((line = rd.readLine()) != null) {
               //Parse our JSON response               
               JSONParser j = new JSONParser();
               JSONObject o = (JSONObject)j.parse(line);
               Map response = (Map)o.get("response");
 
               System.out.println(response.get("somevalue"));
            }
        }
        catch(ParseException e) {
            System.out.println(e);
        }
        catch(IOException e) {
            System.out.println(e);
        }                        
    }    

}

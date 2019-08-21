package api.framework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;


public class ApiRequestBuilder {

	public void getRequest(String url, String param) {
		try {
			
			CloseableHttpClient client = HttpClients.createDefault();
		    HttpGet request = new HttpGet(url+param);
		    request.setHeader("Accept","application/json");
		    request.setHeader("Content-Type", "application/json;charset=UTF-8");

		    CloseableHttpResponse response = client.execute(request);
		    String json = EntityUtils.toString(response.getEntity());   
		  //  assertEquals(response.getStatusLine().getStatusCode(),200);
		    System.out.println(response.getStatusLine().getStatusCode());
		    System.out.println(json);
		}
		catch(Exception e)
		{
			System.out.println("The Get request errored out : "+e);
		}
	}
	
	
	public void postrequest_multiform(String url, String body)
	{
		try {
		
		
		CloseableHttpClient client = HttpClients.createDefault();
	    HttpPost request = new HttpPost(url);
	    request.setHeader("Accept","application/json");
	    request.setHeader("Content-Type", "multipart/form-data");
	    MultipartEntityBuilder builder = MultipartEntityBuilder.create();
	    builder.addTextBody("field1", "yes", ContentType.TEXT_PLAIN);

	    // This attaches the file to the POST:
	    File f = new File("c:/");
	    builder.addBinaryBody(
	        "file",
	        new FileInputStream(f),
	        ContentType.APPLICATION_OCTET_STREAM,
	        f.getName()
	    );
	    
	    HttpEntity multipart = builder.build();
	    request.setEntity(multipart);
	    CloseableHttpResponse response = client.execute(request);
	    HttpEntity responseEntity = response.getEntity();
	    
	    String json = EntityUtils.toString(response.getEntity());   
	    System.out.println(response.getStatusLine().getStatusCode());
	    System.out.println(json);
	    
	    
		}
		catch(Exception e)
		{
			System.out.println("The Get request errored out : "+e);
		}
	}
	
	
	
	
}


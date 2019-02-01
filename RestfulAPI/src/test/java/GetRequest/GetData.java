package GetRequest;

import org.testng.Assert;
//import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetData 
{
	
	
    @Test
	public void testResponseCode() 
	{
		
		Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		int code = resp.getStatusCode();
		
		System.out.println("The http status code is" + code);
		
		Assert.assertEquals(code,200);
		
	}
	
    @Test
   	public void testbody() 
   	{
   		
   		Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
   		
   		String data = resp.asString();
   		
   		System.out.println("The body is"+ data);
   		
   		System.out.println("The respose time"+resp.getTime());
   				
}
   @Test
   	public void testheader() 
   	{
   		
   		Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
   		
   		String data = resp.asString();
   		
   		System.out.println("The header is"+ data);
   			
   		System.out.println("The header"+resp.getHeaders());
   			
}  
    
}

package restassuredapi_1;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class datapassingPUT {
	
	@Test
	void usingHashmap()
	{
		HashMap data = new HashMap();
		
		data.put("name","vikas");
		data.put("job","tester");
		
		given()
		.header("x-api-key","reqres-free-v1")
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		
		
		.then()
		.statusCode(201)
		.log().all();
	}
	
	@Test
	void usingJson()
	{
		JSONObject data = new JSONObject ();
		
		data.put("name","vikas");
		data.put("job","tester");
		
		given()
		.header("x-api-key","reqres-free-v1")
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		
		
		.then()
		.statusCode(201)
		.log().all();
	}
	
	@Test
	
	void usingpojo()
	{
		datapassingpost data = new datapassingpost ();
		
		data.setId("2");
		data.setName("vicky");
		given()
		.header("x-api-key","reqres-free-v1")
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		
		
		.then()
		.statusCode(201)
		.log().all();
		
		
	}

}

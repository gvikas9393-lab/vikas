package restassuredapi_1;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class xtnell {
	
	@Test
	void request1() throws FileNotFoundException
	{
		File av = new File(".\\Body.json");
		FileReader va = new FileReader(av); 
		JSONTokener vi = new JSONTokener(va);
		JSONObject ai = new JSONObject(vi);
		
		
		given()
		.header("x-api-key","reqres-free-v1")
		.contentType("application/json")
		.body(ai.toString())
		
		.when()
		.post("https://reqres.in/api/users")
		
		
		.then()
		.statusCode(201)
		.log().all();
	}
	

}

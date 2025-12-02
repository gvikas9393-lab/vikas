package restassuredapi_1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DELET_api {

	@Test
	
	void dlt()
	{
		given()
		.header("x-api-key","reqres-freev1")
		.contentType("application/json")
		.pathParam("id","2")
		
		
		.when()
		.delete("https://reqres.in/api/users/{id}")
		
		.then()
		.statusCode(204)
		.log().all();
	}
	
}

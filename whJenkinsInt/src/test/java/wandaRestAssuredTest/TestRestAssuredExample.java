package wandaRestAssuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestRestAssuredExample {

	@Test
	public void testStatusCode() {
		given().
			get("http://jsonplaceholder.typicode.com/posts/3").
		then().statusCode(200);
	}
	
	@Test
	public void testLogging() {
		given().get("http://services.groupkt.com/country/get/iso2code/in").then().statusCode(200).log().all();
	}
}

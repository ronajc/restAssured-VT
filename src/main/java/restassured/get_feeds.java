package restassured;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class get_feeds {

	private String URLQA = "http://52.41.195.107:8080/qdesq/occupant/feeds?limit=5000";
	private String URLStaging ="http://13.127.87.149:8080/qdesq/occupant/feeds?limit=5000";	
	private String token = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJBVVRIT1JJVElFU19LRVkiOiJST0xFX09jY3VwYW50Iiwic3ViIjoiMjMiLCJ1c2VySWQiOjIzLCJpYXQiOjE1OTExNjU3NTJ9.sVXrRfjY9vDH42Sfh6ymbI2QEwhUDf2S9iwYzlHX6X4";
	//	int count;
	//	List<Object> hey = new ArrayList<Object>();

	@Test
	void test2() {
		given().when().header("Authorization", token)
		.contentType(ContentType.JSON)
		.get(URLQA)
		.then().statusCode(200)
		.log().all();

		//		Iterator iterator = hey.iterator();
		//		while(iterator.hasNext()) {
		//			count +=1;
		//		}
		//		System.out.println(count);
	}

	//	@AfterTest
	//	void count() {
	//		String N = get(URLQA).asString();
	//		int number = N.length();
	//		System.out.print("_____"+number+"_______");
	//	}
}

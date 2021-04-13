package restassured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import org.json.simple.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.restassured.http.ContentType;


import static io.restassured.RestAssured.*;

public class add_occupant {

	private String tokenQA = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJBVVRIT1JJVElFU19LRVkiOiJST0xFX0NNIiwic3ViIjoiOCIsInVzZXJJZCI6OCwiaWF0IjoxNTkwOTQzODE4fQ.UdUFo650FbFM33wLboxyESMadGk1q1ZaRCBhyBYqzQo";
	private String tokensg = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJBVVRIT1JJVElFU19LRVkiOiJST0xFX0NNIiwic3ViIjoiMSIsInVzZXJJZCI6NTMsImlhdCI6MTU5NzE0Mjk1NH0.4XkQzGWli_Wunmi5DjPUJWSJA9vwrCMEcPnqeoqTrmY";

	private String URLQA = "http://52.41.195.107:8080/qdesq/operator/cm/add-occupant";
	private String URLstaging = "http://13.127.87.149:8080/qdesq/operator/cm/add-occupant";

//	@Parameters({"name"})
	@Test() 
	void addinput() {
		HashMap<String, Object> add = new HashMap<String, Object>();	
		add.put("companyMasterId", 1);
		add.put("emailId", "aaa@gmail.com");
		add.put("gender", "Male");
		add.put("mobile", 8301639800L);
		add.put("name", "Kakashi");
		add.put("seatOrCabin", 123);

		List<Object> occupantProfileList = new ArrayList<Object>();
		occupantProfileList.add(add);

		HashMap<String, List<Object>> abc = new HashMap<String, List<Object>>();
		JSONObject paylaod = new JSONObject(abc);
		paylaod.put("occupentProfileRequests", occupantProfileList);
		System.out.println(paylaod);

		given().when().header("Authorization", tokensg)
		.contentType(ContentType.JSON)
		.body(paylaod)
		.post(URLstaging)
		.then()
		.log().all().statusCode(200);			
	}
}
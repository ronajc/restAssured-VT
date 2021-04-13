package restassured;

import org.json.simple.JSONObject;
import org.omg.CORBA.DATA_CONVERSION;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class Test_Post {
	
//	@Test(enabled = false)
//	void test_post() {
	//	HashMap<String, Object> map = new HashMap<String, Object>(); // This is to input data
	//	map.put("name", "Vishal");
	//	map.put("job", "Tester");
		
	//	System.out.println(map);
		
//		JSONObject request = new JSONObject(map); // This is a lib used to input data in json format.
//	 	request.put("companyMasterId", 1);
//		request.put("emailId", "ace.vishal537@gmail.com");
//		request.put("gender", "Male");
//		request.put("mobile", "8894962011");
//		request.put("name", "Obito");
//		request.put("workSpaceMasterId", 1);
		
//		System.out.println(request);
		
//		given().when()
//		 .contentType(ContentType.JSON).
//			body(request.toJSONString()).
//					post("http://13.127.87.149:8080/qdesq/auth/create-profile").
//						then().
//							statusCode(200);		
//	}
	
//	@Test(enabled = false) 
//	void test_post2() {
//			HashMap<String, Object>map2 = new HashMap<String, Object>();
//				JSONObject reqJsonObject = new JSONObject(map2);
//				reqJsonObject.put("ratings", 3);
				
//				System.out.println(reqJsonObject);
				
//				given().when().header("Authorization","Bearer eyJhbGciOiJIUzI1NiJ9.eyJBVVRIT1JJVElFU19LRVkiOiJST0xFX09jY3VwYW50Iiwic3ViIjoiNTYiLCJ1c2VySWQiOjQ5LCJpYXQiOjE1ODk0NTgwMzF9.JBnkqyFmFHz7fdF23zFiE_HS_IJytuTtqMmqfj4pNV8").
//					contentType(ContentType.JSON).
//						body(reqJsonObject.toJSONString()).
//							post("http://13.127.87.149:8080/qdesq/occupant/feedback/rate-workspace").
//							then().statusCode(200).log().all();
					
//	}
	
//	@DataProvider(name="kakashi")
//	public Object[] DatatoPost(){ //This is when you want to run same test for multiple data
////		Object[] data = new Object[1];
////		
////		data[1] = 2;
////		data[2] = 3;
////		data[3] = 5;
////		
////		return DatatoPost();
//		
//		return new Object[] {
//			1,3,5
//		};
//	}
	
	
	@Test(dataProvider = "kakashi")
	void test_post3(Object ratings) {
			HashMap<String, Object>map3 = new HashMap<String, Object>();
			JSONObject reqJsonObject = new JSONObject(map3);
			reqJsonObject.put("ratings", ratings);
			
			System.out.println(reqJsonObject);
			
			given().when().header("Authorization","Bearer eyJhbGciOiJIUzI1NiJ9.eyJBVVRIT1JJVElFU19LRVkiOiJST0xFX09jY3VwYW50Iiwic3ViIjoiNTYiLCJ1c2VySWQiOjQ5LCJpYXQiOjE1ODk0NTgwMzF9.JBnkqyFmFHz7fdF23zFiE_HS_IJytuTtqMmqfj4pNV8").
				contentType(ContentType.JSON).
					body(reqJsonObject.toJSONString()).
						post("http://13.127.87.149:8080/qdesq/occupant/feedback/rate-workspace").
						then().statusCode(200).log().all();
}
	}
	

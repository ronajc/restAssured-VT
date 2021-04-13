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

public class ratemy_workspace extends ratemyworkspace_main {
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
	



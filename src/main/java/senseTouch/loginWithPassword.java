package senseTouch;

import java.util.List;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import POJO.AuthDataObj;
import POJO.loginwithpasswordPOJO;

public class loginWithPassword {
	Response response;

	@Test
	public void logintest01(){
		RestAssured.baseURI = "http://sensetouchqa2.sensorise.net";
		//	RestAssured.basePath= "/senseTouchServicesR2Development/v2";
		loginwithpasswordPOJO loginwithpasswordPOJO = new loginwithpasswordPOJO();
		AuthDataObj authDataObj = new AuthDataObj();

		authDataObj.setAppId("1923");
		authDataObj.setDeviceImei("abcdefghsdlksd12");
		authDataObj.setDeviceMobileNumber("8894962429");
		authDataObj.setPosCode("");
		authDataObj.setType("RETAIL");

		loginwithpasswordPOJO.setPassword("custodian@123");
		loginwithpasswordPOJO.setLatitude("32.009092750988906");
		loginwithpasswordPOJO.setLongitude("76.75450723625417");
		loginwithpasswordPOJO.setUserId("8894962429");
		loginwithpasswordPOJO.setAuthDataObj(authDataObj);


		response = RestAssured.given().header("apiToken", "kDmSvHklsMoPMEE0").header("relationid", "STKYC1001")
				.when().contentType(ContentType.JSON)
				.body(loginwithpasswordPOJO)
				.post("/senseTouchServicesR2Development/v2/loginWithPassword");

		System.out.println(response.asString());
	}


	@Test(dependsOnMethods = "logintest01", description = "to check the status code 200")
	public void checkStatusCode() {
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
	}

	@Test
	public void verifyFeatureList() {
		List<String> featureList = response.jsonPath().get("FeatureList");
		try {
		if(featureList != null) {
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
		}
	}
	
	catch(Exception e){
		e.printStackTrace();;
	}
	}

}

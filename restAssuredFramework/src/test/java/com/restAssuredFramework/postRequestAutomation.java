package com.restAssuredFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class postRequestAutomation {

	@Test
	public void TC_002() {
		RestAssured.baseURI = "https://reqres.in/api/users";

		String json = "{\r\n" + "    \"name\": \"Atul\",\r\n" + "    \"job\": \"SDET\"\r\n" + "}";

		Response resp = RestAssured.given().body(json).post();

		String body = resp.asString();
		System.out.println(body);
		/*Assert.assertEquals(body.contains("2021-03-07")  Expected value , true  Actual Value ,
				"Response body contains 2021-03-07");*/
		
		Assert.assertEquals(body.toLowerCase().contains("2021-05-29") /*Expected value*/, true /*Actual Value*/, "Response body contains 2021-03-07");
	
		
	}

}

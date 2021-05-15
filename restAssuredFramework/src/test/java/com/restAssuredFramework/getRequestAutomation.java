package com.restAssuredFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class getRequestAutomation {

	@Test(description="get request Automation")
	public void T001() {
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		Response resp=RestAssured.given().param("page", "2")
		.when()
		.get();
		
		System.out.println(resp.asPrettyString());
		
		
	/*	RestAssured.given().param("page", "2")
		.when()
		.get()
		.then()
		.assertThat()
		.log()
		.all()
		.statusCode(200);*/
		
		
		JsonPath jsonPathEvaluator = resp.jsonPath();
		
		String total_pages = jsonPathEvaluator.get("total_pages");
		
		System.out.println("first_name received from Response " + total_pages);
		
		Assert.assertEquals(total_pages, "2", "Correct total_pages received in the Response");
	}
	
	
}

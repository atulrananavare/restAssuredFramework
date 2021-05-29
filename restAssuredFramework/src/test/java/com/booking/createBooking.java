package com.booking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createBooking {

	public static void main(String[] args) {
		
		//Build request
		RequestSpecification requestSpecification=RestAssured.given().log().all();
		requestSpecification.baseUri("https://restful-booker.herokuapp.com");
		requestSpecification.basePath("booking");
		
		requestSpecification.body("{\r\n" + 
				"    \"firstname\" : \"Atul\",\r\n" + 
				"    \"lastname\" : \"Ran\",\r\n" + 
				"    \"totalprice\" : 100,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2018-01-01\",\r\n" + 
				"        \"checkout\" : \"2019-01-01\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}");
		
		requestSpecification.contentType(ContentType.JSON);
		
		//Hit the request and get response
		Response response=requestSpecification.post();
		
		ValidatableResponse validate=response.then();
		
				
		validate.assertThat().statusCode(200);
		
		

	}

}

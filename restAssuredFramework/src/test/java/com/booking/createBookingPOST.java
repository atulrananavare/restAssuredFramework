package com.booking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class createBookingPOST {

	public static void main(String[] args) {
		
		String url="https://restful-booker.herokuapp.com";
		String path="booking";
		String json="{\r\n" + 
				"    \"firstname\" : \"advff\",\r\n" + 
				"    \"lastname\" : \"efdd\",\r\n" + 
				"    \"totalprice\" : 56,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2018-01-01\",\r\n" + 
				"        \"checkout\" : \"2019-01-01\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}";
		
		RestAssured
			.given()
			.baseUri(url)
			.basePath(path)
			.body(json)
			.contentType(ContentType.JSON)
			.when()
			.post()
			.then()
			.assertThat()
			.statusCode(200).log().all();
			
			
		
		
		
	}

}

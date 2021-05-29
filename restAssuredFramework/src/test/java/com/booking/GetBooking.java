package com.booking;

import io.restassured.RestAssured;

public class GetBooking {

	public static void main(String[] args) {
		String url="https://restful-booker.herokuapp.com";
		String path="booking/{id}";
		
		RestAssured.given()
						.baseUri(url)
						.basePath(path)
					.when()
							.pathParam("id", 10)
					.get()
					.then()
							.assertThat().log().all()
							.statusCode(200);
		
	}

}

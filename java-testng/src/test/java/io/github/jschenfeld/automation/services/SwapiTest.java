package io.github.jschenfeld.automation.services;

import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwapiTest extends AbstractTest {

	public SwapiTest() {
		super();
	}

	@Test
	public void charactersTest(){
		RestAssured
				.given()
					.log().all()
					.pathParam("resource","planets")
					.pathParam("id", "1")
				.when()
					.get(getUrl())
				.then()
					.statusCode(200)
					.assertThat().body("residents[0]", equalTo("https://swapi.co/api/people/1/"));
	}

}
package io.github.jschenfeld.automation.services;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    List<?> kal;

    @Test
    public void getProduct() {
        String url = "http://localhost:3000/api/{resource}/{id}";
        RestAssured
                .given()
                    .log().all()
                    .pathParam("resource", "producto")
                    .pathParam("id", "1")
                    .get(url)
                .then()
                    .statusCode(200)
                    .assertThat().body("nombre", equalTo("Monitor"));
    }

}

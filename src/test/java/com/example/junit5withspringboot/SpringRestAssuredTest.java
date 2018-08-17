package com.example.junit5withspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringJUnitConfig
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringRestAssuredTest {

    @LocalServerPort
    int port;

    @Test
    void exampleTest() {
        given()
                .port(port)
                .basePath("/hello")
                
                .when()
                .get("")
                
                .then()
                .statusCode(200)
                .body("user", equalTo("user"))
                .body("text", equalTo("hello"));
    }


}

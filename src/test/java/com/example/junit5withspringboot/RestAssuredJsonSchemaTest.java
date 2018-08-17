package com.example.junit5withspringboot;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

@SpringJUnitConfig
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestAssuredJsonSchemaTest {

    @LocalServerPort
    int port;

    @Test
    void exampleTest() {

        given()
                .port(port)
                .basePath("/hello")
                
                .when()
                .get()
                
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("hello-schema.json"));
    }


}

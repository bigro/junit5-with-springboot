package com.example.junit5withspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootRestTest {

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	void exampleTest() {
		String body = this.restTemplate.getForObject("/hello", String.class);
		assertThat(body).isEqualTo("{\"user\":\"user\",\"text\":\"hello\"}");
	}


}

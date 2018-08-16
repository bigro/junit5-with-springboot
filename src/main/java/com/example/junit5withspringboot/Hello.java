package com.example.junit5withspringboot;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hello {
    @JsonProperty
    String user = "user";
    @JsonProperty
    String text = "hello";
}

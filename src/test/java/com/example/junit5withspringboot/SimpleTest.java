package com.example.junit5withspringboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest {
    
    @Test
    void test() {
        assertThat("test").isEqualTo("test");
    }
}

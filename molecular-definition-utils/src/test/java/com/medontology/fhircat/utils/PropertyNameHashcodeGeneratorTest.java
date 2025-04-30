package com.medontology.fhircat.utils;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PropertyNameHashcodeGeneratorTest {

    @org.junit.jupiter.api.Test
    void getHashcode() {
        Assertions.assertEquals("name: 3373707", PropertyNameHashcodeGenerator.getHashcode("name"));
    }

    @org.junit.jupiter.api.Test
    void testGetHashcode() {
        System.out.println("age".hashCode());
        assertEquals("name: 3373707\n" +
                "age: 96511\n", PropertyNameHashcodeGenerator.getHashcode("name", "age"));
    }
}
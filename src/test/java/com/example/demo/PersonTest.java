package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testHello() {
        Person person = new Person();
        assertEquals("Personne", person.hello(), "La méthode hello doit retourner 'Personne'");
    }
}
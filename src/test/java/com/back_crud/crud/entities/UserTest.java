package com.back_crud.crud.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    User user;
    @BeforeEach
    void setup(){
        user = user.builder()
                .id(1l)
                .nom("thioub")
                .prenom("djiby")
                .email("thioubdjiby96@gmail.com")
                .pays("senegal")
                .ville("Dakar")
                .telephone("775490734")
                .build();
    }
    @Test
    void testBuilder(){
        Assertions.assertAll(
                ()-> Assertions.assertEquals(1,user.getId()),
                ()->Assertions.assertEquals("thioub",user.getNom()),
                ()->Assertions.assertEquals("djiby",user.getPrenom()),
                ()->Assertions.assertEquals("thioubdjiby96@gmail.com",user.getEmail()),
                ()->Assertions.assertEquals("senegal",user.getPays()),
                ()->Assertions.assertEquals("Dakar",user.getVille()),
                ()->Assertions.assertEquals("775490734",user.getTelephone())
        );
    }

    @Test
    void testEquals() {
    }

    @Test
    void canEqual() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}


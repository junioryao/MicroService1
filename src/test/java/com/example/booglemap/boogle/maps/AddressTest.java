package com.example.booglemap.boogle.maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AddressTest {
    Address customAdress = new Address("rue hamon", "villejuif", "ile de france", "75000");
    Address nothing = new Address();

    @Test
    void getAddress() {
        assertEquals("rue hamon", customAdress.getAddress());
    }

    @Test
    void setAddress() {

        customAdress.setAddress("paris");
        assertEquals("paris", customAdress.getAddress());
    }

    @Test
    void getCity() {
        assertEquals("villejuif", customAdress.getCity());
    }

    @Test
    void setCity() {
        customAdress.setAddress("vitry sur seine");
        assertEquals("vitry sur seine", customAdress.getAddress());
    }

    @Test
    void getState() {
        assertNotEquals("bangalore", customAdress.getState());
        assertEquals("ile de france", customAdress.getState());
    }

    @Test
    void setState() {
        customAdress.setState("bangalore");
        assertEquals("bangalore", customAdress.getState());
    }

    @Test
    void getZip() {
        assertEquals("75000", customAdress.getZip());
    }

    @Test
    void setZip() {

        customAdress.setZip("56000");
        assertEquals("56000", customAdress.getZip());
    }
}
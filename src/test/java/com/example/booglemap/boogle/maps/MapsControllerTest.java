package com.example.booglemap.boogle.maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MapsControllerTest {

    @Test
    void get() throws Exception {
        MockAddressRepository.getRandom();
        assertTrue(true);

    }
}
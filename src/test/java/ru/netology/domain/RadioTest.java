package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void constructorVolume() {
        Radio radio = new Radio(100, 100, 0, true);

        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void constructorRadioStationPro() {
        Radio radio = new Radio(5, 0, 9,true);
        assertEquals(5, radio.getCurrentRadioStation());
    }




//    @Test
//    public void Ra() {
//        Radio radio = new Radio();
//        assertEquals(10, radio.getCurrentVolume());
//        assertFalse(radio.isOn());

}


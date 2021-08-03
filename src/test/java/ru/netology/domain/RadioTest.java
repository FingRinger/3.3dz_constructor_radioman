package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void defaultStation() {
    Radio radio = new Radio();
    assertEquals(10,radio.getMaxStation());
    }


    @Test // устанавливаем радио - станцию (валидная станция)
    public void shouldInputStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test // устанавливаем радио - станцию (невалидная станция)
    public void shouldInputWrongStation() {
        Radio radio = new Radio(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void canSetAmountOfStation() {
        Radio radio = new Radio(33333);
        assertEquals(33333, radio.getMaxStation());
    }

    @Test //
    public void shouldZeroAfterMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(13);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test //
    public void shouldZeroStationIfTen () {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldZeroStationIfLessThenMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1000);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }


    @Test // станция перед 0-ой - 10-ая
    public void shouldTenAfterMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test //
    public void shouldTenAfterLessMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-63);
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prevStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);
        radio.plusVolume();
        assertEquals(61, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeIfAlreadyMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.minusVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotTurnDownVolumeIfAlreadyMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}

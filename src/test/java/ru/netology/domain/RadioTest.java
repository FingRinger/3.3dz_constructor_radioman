package ru.netology.domain;

import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void defaultMaxStation() {
    Radio radio = new Radio();
    assertEquals(9,radio.getMaxStation());
    }

    @Test
    public void defaultMinStation() {
        Radio radio = new Radio();
        assertEquals(0,radio.getMinStation());
    }

    @Test
    public void defaultMaxVolume() {
        Radio radio = new Radio();
        assertEquals(100,radio.getMaxVolume());
    }

    @Test
    public void defaultMinVolume() {
        Radio radio = new Radio();
        assertEquals(0,radio.getMinVolume());
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
        assertEquals(33333, radio.getAmountOfStations());
        assertEquals(33332,radio.getMaxStation());
    }


    @Test //
    public void shouldZeroStationIfMax () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
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
    public void shouldMaxAfterLessMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-63);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
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

package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation = 10; // оно же желаемое кол-во станций
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void plusVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
            this.currentVolume = currentVolume + 1;
        }


    public void minusVolume() {
        if (currentVolume == minVolume) {
            return;
        }
            this.currentVolume = currentVolume - 1;
        }


    public int getCurrentStation() {

        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            currentStation = 0;
        }
    }


    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = 10;
        }
        else {
            this.currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }
}





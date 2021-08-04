package ru.netology.domain;

public class Radio {
    private int amountOfStations = 10;
    private int currentStation;
    private int maxStation = amountOfStations - 1;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio() {
    }

    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
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

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getAmountOfStations() {
        return amountOfStations;
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            currentStation = 0;
        }
        else {
            this.currentStation = currentStation - 1;
        }
    }


    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = 9;
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





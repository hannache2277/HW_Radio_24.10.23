package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prew() {
        if (currentStation != 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {     // увеличить громкость на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = currentVolume;
        }
    }

    public void volumeTurnDown() {           //уменьшить громкость на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentStation = currentStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

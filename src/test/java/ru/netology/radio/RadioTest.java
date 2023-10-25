package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void testshouldSetStatOn5() {     //выбор станции
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMax() {   //выбор станции больше Max
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationWrightBoundaryValue() {   //выбор станции граничное значение справа
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationWrightBoundaryValueMinusOne() {   //выбор станции граничное значение справа -1
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationLeftBoundaryValue() {   //выбор станции граничное значение слева
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationLeftBoundaryValuePlusOne() {   //выбор станции граничное значение слева +1
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLessMin() {   //выбор станции меньше Min
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {     //следующая станция
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterMax() {          //следущая станция после Max
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prewStation() {     //переключение на предыдущую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prew();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {     //предыидущая станция после Min
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prew();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeForOne() {   //прибавить громкость +1
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreMax() {   //прибавить громкость больше Max
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TurnDownVolumeForOne() {   //уменьшить громкость  на 1
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setCurrentVolume(55);
        radio.volumeTurnDown();

        int expected = 54;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TurnDownVolumeBelowMin() {   //уменьшить громкость  меньше мин
        Radio radio = new Radio();

        radio.volumeTurnDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
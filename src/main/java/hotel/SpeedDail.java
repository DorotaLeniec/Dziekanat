package main.java.hotel;

/**
 * Created by dorka on 09.08.2017.
 */
public enum SpeedDail {
    ONE("0001"), TWO("0002"), THREE("0003"), FOUR("0004");

    SpeedDail(String number) {
        this.number = number;
    }

    String number;

    public void setNumber(String number1) {
        this.number = number1;
    }

}

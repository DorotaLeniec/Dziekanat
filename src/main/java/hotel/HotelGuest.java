package main.java.hotel;

/**
 * Created by dorka on 09.08.2017.
 */
public class HotelGuest {
    private String name;

    public HotelGuest(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HotelGuest{" +
            "name='" + name + '\'';
    }
}

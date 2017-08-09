package main.java.hotel;

/**
 * Created by dorka on 09.08.2017.
 */
public class HotelEmployee {
    public static int counter = 1;
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public HotelEmployee(String name) {
        this.name = name;
        this.id = counter;
        counter++;

    }

    @Override
    public String toString() {
        return "HotelEmployee{" +
            "name='" + name + '\'' +
            ", id " + id +  '\'' +
            '}';
    }
}

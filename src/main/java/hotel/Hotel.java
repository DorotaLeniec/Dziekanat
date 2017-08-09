package main.java.hotel;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by dorka on 09.08.2017.
 */
public class Hotel {
    public static int counter = 0;
    private List<HotelRoom> rooms = new LinkedList<>();
    private List<HotelGuest> quests = new LinkedList<>();
    private Map<HotelRoom,HotelGuest> occupation = new HashMap<>();
    private List<HotelEmployee> employees = new LinkedList<>();
    private HotelCash cash;

    public Hotel() {
        this.employees.add(new HotelEmployee("Kasia"));
        this.employees.add(new HotelEmployee("Olaf"));
        this.employees.add(new HotelEmployee("Bartek"));
        this.employees.add(new HotelEmployee("Zbynek"));
        this.phone = new HotelPhone();
    }

    public void handleGuest(HotelGuest guest){
        if(counter<=4) {
            System.out.println("Pracownik " + employees.get(counter).getName() +
                "o nr : " + employees.get(counter).getId() + " zajmię się Panią/Panem");
        } else {
            System.out.println("Pracownik"+ employees.get(counter%employees.size()-1).getName() +
                " o nr : " + employees.get(counter%employees.size()-1).getId() + " zajmię się Panią/Panem");

        }

    }

    public List<HotelRoom> getRooms() {
        return rooms;
    }

    public List<HotelGuest> getQuests() {
        return quests;
    }

    public Map<HotelRoom, HotelGuest> getOccupation() {
        return occupation;
    }

    public List<HotelEmployee> getEmployees() {
        return employees;
    }

    public HotelCash getCash() {
        return cash;
    }

    public HotelPhone getPhone() {
        return phone;
    }

    private HotelPhone phone;


}

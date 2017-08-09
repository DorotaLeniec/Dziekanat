package main.java.hotel;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dorka on 09.08.2017.
 */
public class HotelPhone {
    private List<PhoneCall> calls = new LinkedList<>();
    private SpeedDail speedDail;

    public void call(HotelGuest guest, String phoneNo){
        System.out.println(guest + " Dzowni do " + phoneNo);
        calls.add(new PhoneCall(phoneNo, guest));
    }

    public void speedCall(SpeedDail dail){
        if (SpeedDail.ONE == dail) {
            System.out.println("Naciśnięto ONE dzwnie na " + dail.number);
        } else if (SpeedDail.TWO == dail) {
            System.out.println("Naciśnięto TWO dzwnie na: " + dail.number);
        } else if (SpeedDail.THREE == dail) {
            System.out.println("Naciśnięto THREE dzwnie na: " + dail.number);
        } else if (SpeedDail.FOUR == dail) {
            System.out.println("Naciśnięto FOUR dzwnie na: " + dail.number);
        }
    }

    public void setSpeedDail(SpeedDail dail, String num){
        if(num.length()== 4) {
            if (SpeedDail.ONE == dail) {
                dail.setNumber(num);
                System.out.println("Ustawiam ONE na " + dail.number);
            } else if (SpeedDail.TWO == dail) {
                dail.setNumber(num);
                System.out.println("Ustawiam TWO na : " + dail.number);
            } else if (SpeedDail.THREE == dail) {
                dail.setNumber(num);
                System.out.println("Ustawiam THREE na: " + dail.number);
            } else if (SpeedDail.FOUR == dail) {
                dail.setNumber(num);
                System.out.println("Ustawiam FOUR na : " + dail.number);
            }
        } else {
            System.out.println("Podano zły nr wewnętrzny");
        }
    }

    public void printPhoneList(){
        for (PhoneCall call : calls) {
            System.out.println(call);
        }

    }
}

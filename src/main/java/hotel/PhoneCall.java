package main.java.hotel;

/**
 * Created by dorka on 09.08.2017.
 */
public class PhoneCall {
    private String phoneNo;
    private HotelGuest guest;

    public PhoneCall(String phoneNo, HotelGuest guest) {
        this.phoneNo = phoneNo;
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "PhoneCall{" +
            "phoneNo='" + phoneNo + '\'' +
            ", guest=" + guest +
            '}';
    }
}

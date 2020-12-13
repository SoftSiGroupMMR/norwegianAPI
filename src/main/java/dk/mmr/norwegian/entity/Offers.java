package dk.mmr.norwegian.entity;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Offers {
    private final String CompanyName = "Norwegian";
    private ArrayList<FlightBooking> list;

    public Offers(ArrayList<FlightBooking> list) {
        this.list = list;
    }
}

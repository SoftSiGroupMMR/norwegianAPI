package dk.mmr.norwegian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightBooking {
    private String cityFrom, cityTo;
    private Long time;
    private int price;

}

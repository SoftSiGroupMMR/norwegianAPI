package dk.mmr.norwegian.controller;

import dk.mmr.norwegian.entity.FlightBooking;
import dk.mmr.norwegian.entity.Offers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class FlightBookingController {

    @GetMapping("/search")
    public Offers flight(
            @RequestParam(value = "cityFrom") String cityFrom,
            @RequestParam(value = "cityTo") String cityTo,
            @RequestParam(value = "time") Long time) {
        return generateOffers(cityFrom,cityTo,time);
    }

    public Offers generateOffers(String cityFrom, String cityTo, long time) {
        ArrayList<FlightBooking> list = new ArrayList<>();
        int randomNum;
        for (int i = 0; i < 5; i++) {
            randomNum = ThreadLocalRandom.current().nextInt(500, 10000 + 1);
            list.add(new FlightBooking(cityFrom, cityTo, time, randomNum));
        }
        return new Offers(list);
    }
}

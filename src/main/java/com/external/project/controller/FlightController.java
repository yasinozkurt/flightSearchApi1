package com.external.project.controller;


import com.external.project.model.Flight;
import com.external.project.service.FlightService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/searchApi")
@RestController
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/oneWayTrip")
    public ResponseEntity<List<Flight>> oneWayTrip(
            @RequestParam Long departureAirportId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime departureTime,
            @RequestParam Long arrivalAirportId) {

        List<Flight> flights = flightService.findFlightsOneWay(departureAirportId, departureTime, arrivalAirportId);


        return ResponseEntity.ok(flights);
    }

    @GetMapping("/returnTrip")
    public ResponseEntity<List<Flight>> returnTrip(
            @RequestParam Long departureAirportId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime departureTime,
            @RequestParam Long arrivalAirportId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime returnTime

    ) {


        List<Flight> flights = flightService.findFlightsReturn(departureAirportId, departureTime, arrivalAirportId, returnTime);


        return ResponseEntity.ok(flights);
    }


}

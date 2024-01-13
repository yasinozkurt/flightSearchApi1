package com.external.project.service;


import com.external.project.model.Airport;
import com.external.project.model.Flight;
import com.external.project.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class FlightService {

    private FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository){
        this.flightRepository=flightRepository;
    }

    public List<Flight> findFlightsOneWay(Long departureAirportId, LocalDateTime departureTime, Long arrivalAirportId){


        return flightRepository.findByDepartureAPIdAndArrivalAPIdAndDepartureTime(departureAirportId,arrivalAirportId,departureTime);

    }



    public List<Flight> findFlightsReturn(Long departureAirportId, LocalDateTime departureTime, Long arrivalAirportId, LocalDateTime returnTime){

        return flightRepository.findByDepartureAPIdAndArrivalAPIdAndDepartureTimeAndReturnTime(departureAirportId,arrivalAirportId,departureTime,returnTime);

    }



}

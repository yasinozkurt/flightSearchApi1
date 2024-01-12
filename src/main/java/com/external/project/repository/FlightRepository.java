package com.external.project.repository;

import com.external.project.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findByDepartureAPIdAndArrivalAPIdAndDepartureTime(
            Long departureAPId, Long arrivalAPId, LocalDateTime departureTime);

    List<Flight> findByDepartureAPIdAndArrivalAPIdAndDepartureTimeAndReturnTime(
            Long departureAPId, Long arrivalAPId, LocalDateTime departureTime, LocalDateTime returnTime);




}

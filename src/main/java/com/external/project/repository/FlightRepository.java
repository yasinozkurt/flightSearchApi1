package com.external.project.repository;

import com.external.project.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {


   /* @Query(
            value = ("SELECT * FROM flights f JOIN  airports a ON f.id=a.id WHERE f.departure_airport_id= ?1 AND f.arrival_airport_id= ?2 " +
                    "AND f.departure_datetime= ?3"),
            nativeQuery = true)*/
    List<Flight> findByDepartureAPIdAndArrivalAPIdAndDepartureTime(
            Long departureAPId, Long arrivalAPId, LocalDateTime departureTime);



   /* @Query(
            value = ("SELECT * FROM flights f JOIN  airports a ON f.id=a.id WHERE f.departure_airport_id= ?1 AND f.arrival_airport_id= ?2 " +
                    "AND f.departure_datetime= ?3  AND f.return_datetime= ?4 "),
            nativeQuery = true)*/
    List<Flight> findByDepartureAPIdAndArrivalAPIdAndDepartureTimeAndReturnTime(
            Long departureAPId, Long arrivalAPId, LocalDateTime departureTime, LocalDateTime returnTime);


}

package com.external.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Table(name="flights")
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="departure_airport_id", nullable = false)
    private Airport departureAP;

    @ManyToOne
    @JoinColumn(name="arrival_airport_id", nullable = false)
    private Airport arrivalAP;

    @Column(name = "departure_datetime")
    private Date departureTime;

    @Column(name = "return_datetime")
    private Date returnTime;

    @Column(name = "fare")
    private int  fare;



  // cons getter and setters

    public Flight(){

    }

    public Flight(Long id, Airport departureAP, Airport arrivalAP, Date departureTime, Date returnTime, int fare) {
        this.id = id;
        this.departureAP = departureAP;
        this.arrivalAP = arrivalAP;
        this.departureTime = departureTime;
        this.returnTime = returnTime;
        this.fare = fare;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Airport getDepartureAP() {
        return departureAP;
    }

    public void setDepartureAP(Airport departureAP) {
        this.departureAP = departureAP;
    }

    public Airport getArrivalAP() {
        return arrivalAP;
    }

    public void setArrivalAP(Airport arrivalAP) {
        this.arrivalAP = arrivalAP;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return returnTime;
    }

    public void setArrivalTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }


}

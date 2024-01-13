package com.external.project.model;



import java.util.Date;

public class FlightDTO {

    private Airport departureAP;

    private Airport arrivalAP;

    private Date departureTime;

    private Date returnTime;
    private int  fare;

    public FlightDTO(Airport departureAP, Airport arrivalAP, Date departureTime, Date returnTime, int fare) {
        this.departureAP = departureAP;
        this.arrivalAP = arrivalAP;
        this.departureTime = departureTime;
        this.returnTime = returnTime;
        this.fare = fare;
    }

    public FlightDTO(Airport departureAP, Airport arrivalAP, Date departureTime, int fare) {
        this.departureAP = departureAP;
        this.arrivalAP = arrivalAP;
        this.departureTime = departureTime;
        this.fare = fare;
    }

    public FlightDTO() {
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

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }



}

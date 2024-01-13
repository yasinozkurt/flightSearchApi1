package com.external.project.service;

import com.external.project.model.Flight;
import com.external.project.repository.FlightRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
public class ScheduledDataRetrieval {

    private FlightRepository flightRepository;

    public ScheduledDataRetrieval(FlightRepository flightRepository){
        this.flightRepository=flightRepository;
    }

    @Scheduled(cron = "0 0 1 * * ?") // her gün saat 01:00'de çalıştırır
    public void fetchDataAndSaveToDatabase() {

        //apiden çekmiş gibi mock entity oluşturuyorum
        Flight f1=  new Flight();//boş
        flightRepository.save(f1);
        System.out.println("Scheduled job executed at: " + System.currentTimeMillis());
    }
}

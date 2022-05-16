package com.example.mockweatherproject.controllers;

import com.example.mockweatherproject.model.SensorData;
import com.example.mockweatherproject.repositories.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Controller for the Sensor Data, defines behaviours for the Sensor Data Objects
@RestController
public class SensorDataController {
    @Autowired
    public SensorDataRepository sensorDataRepository; // use MongoRepository's built in methods

    // HTTP POST request to create a new SensorData Object in the Database
    @PostMapping("/createSensorData")
    public void createSensorData(@RequestBody SensorData sensorData){
        SensorData sd = sensorDataRepository.insert(sensorData);
        System.out.println(sd);
        System.out.println("Sensor Data added");
    }

    // HTTP GET request to get all the existing SensorData Objects in the database
    @GetMapping("/getAllData")
    public List<SensorData> getAllSensorData(){
        return sensorDataRepository.findAll();
    }


    // HTTP GET request to return a specific SensorData given the date the data was collected on
    @GetMapping("/getDataByDate/{date}")
    public void getSensorDataByDate(@PathVariable("date") String date){
        SensorData sd = this.sensorDataRepository.findItemByName(date);
        System.out.println(sd);
    }

}

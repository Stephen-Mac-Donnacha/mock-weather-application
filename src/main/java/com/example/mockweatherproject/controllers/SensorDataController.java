package com.example.mockweatherproject.controllers;

import com.example.mockweatherproject.model.SensorData;
import com.example.mockweatherproject.repositories.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.List;
import java.util.Optional;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.where;

// Controller for the Sensor Data, defines behaviours for the Sensor Data Objects
@RestController
public class SensorDataController {
    @Autowired
    public SensorDataRepository sensorDataRepository; // use MongoRepository's built in methods

    // HTTP POST request to create a new SensorData Object in the Database
    @PostMapping("/createSensorData")
    public void createSensorData(@RequestBody SensorData sensorData){
        SensorData sd = sensorDataRepository.insert(sensorData);
        sensorDataRepository.save(sensorData);
        System.out.println(sd);
        System.out.println("Sensor Data added");
    }

    // HTTP GET request to get all the existing SensorData Objects in the database
    @GetMapping("/getAllData")
    public List<SensorData> getAllSensorData(){
        return sensorDataRepository.findAll();
    }

    // HTTP DELETE request to delete all items in the repository
    @DeleteMapping("/clearAllSensorData")
    public void cleanDatabase(){
        sensorDataRepository.deleteAll();
        System.out.println("Database cleared");
    }

    @GetMapping("/getSensorDataById/{sensorId}")
    public void getSensorDataById(@PathVariable("sensorId") long sensorId){
        SensorData SensorData = new SensorData(sensorId,"02-01-2022",14.0,35.0,23.0);
        Example<SensorData> example = Example.of(SensorData);
        Optional<SensorData> actual = sensorDataRepository.findOne(example);
        System.out.println(actual);
    }
}

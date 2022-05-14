package com.example.mockweatherproject.controllers;

import com.example.mockweatherproject.model.SensorData;
import com.example.mockweatherproject.repositories.SensorDataRepository;
import com.example.mockweatherproject.repositories.WeatherSensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorDataController {
    @Autowired
    public SensorDataRepository sensorDataRepository;

    @PostMapping("/createSensorData")
    public void createSensorData(@RequestBody SensorData sensorData){
        SensorData sd = sensorDataRepository.insert(sensorData);
        System.out.println("Sensor Data added");
    }

}

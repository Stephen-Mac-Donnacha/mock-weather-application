package com.example.mockweatherproject.controllers;

import com.example.mockweatherproject.model.SensorData;
import com.example.mockweatherproject.model.WeatherSensor;
import com.example.mockweatherproject.repositories.SensorDataRepository;
import com.example.mockweatherproject.repositories.WeatherSensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SensorDataController {
    @Autowired
    public SensorDataRepository sensorDataRepository;

    @PostMapping("/createSensorData")
    public void createSensorData(@RequestBody SensorData sensorData){
        SensorData sd = sensorDataRepository.insert(sensorData);
        System.out.println(sd);
        System.out.println("Sensor Data added");
    }

    // GET Sensor Data (all)
    @GetMapping("/getAllData")
    public List<SensorData> getAllSensorData(){
        return sensorDataRepository.findAll();
    }

    // GET Sensor Data by date
    @GetMapping("/getDataByDate")
    public void getSensorDataByDate(String date){
        SensorData sd = sensorDataRepository.findItemByName(date);
        System.out.println(sd);
    }

}

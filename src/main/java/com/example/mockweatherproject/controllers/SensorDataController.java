package com.example.mockweatherproject.controllers;

import com.example.mockweatherproject.model.SensorData;
import com.example.mockweatherproject.repositories.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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


    @GetMapping("/getDataByDate/{date}")
    public void getSensorDataByDate(@PathVariable("date") String date){
        SensorData sd = this.sensorDataRepository.findItemByName(date);
        System.out.println(sd);
    }

}

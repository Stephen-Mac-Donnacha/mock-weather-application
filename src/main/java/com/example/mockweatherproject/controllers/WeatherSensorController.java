package com.example.mockweatherproject.controllers;

import com.example.mockweatherproject.model.WeatherSensor;
import com.example.mockweatherproject.repositories.WeatherSensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.List;

@RestController
public class WeatherSensorController {
    @Autowired
    public WeatherSensorRepository weatherSensorRepository;

    @GetMapping("/all") // GET method to return the list of weather sensors
    public List<WeatherSensor> getAllWeatherSensors(){
        return weatherSensorRepository.findAll();
    }
    
    @PostMapping("/CreateWeatherSensor") // POST method to create a weather sensor object
    public void createWeatherSensor(@RequestBody WeatherSensor weatherSensor){
        WeatherSensor ws = weatherSensorRepository.insert(weatherSensor);
        System.out.println("New Weather Sensor created");
    }

    @DeleteMapping("/DeleteWeatherSensor/{id}")
    public void deleteWeatherSensor(@PathVariable("id") WeatherSensor id){
        this.weatherSensorRepository.delete(id);
        System.out.println("Deleted Weather sensor");
    }

}

package com.example.mockweatherproject.controllers;

import com.example.mockweatherproject.model.WeatherSensor;
import com.example.mockweatherproject.repositories.WeatherSensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.List;

// Controller for the WeatherSensor Class, provides implementations for REST API's
@RestController
public class WeatherSensorController {
    @Autowired
    public WeatherSensorRepository weatherSensorRepository; // use MongoRepository's built in methods

    // HTTP GET request to return all weatherSensor Objects in the database currently
    @GetMapping("/all") // GET method to return the list of weather sensors
    public List<WeatherSensor> getAllWeatherSensors(){
        return weatherSensorRepository.findAll();
    }


    // HTTP POST request to create a new weatherSensor Object
    @PostMapping("/CreateWeatherSensor") // POST method to create a weather sensor object
    public void createWeatherSensor(@RequestBody WeatherSensor weatherSensor){
        WeatherSensor ws = weatherSensorRepository.insert(weatherSensor);
        System.out.println("New Weather Sensor created");
    }

    // DELETE a weatherSensor Object given it's id
    @DeleteMapping("/DeleteWeatherSensor/{id}")
    public void deleteWeatherSensor(@PathVariable("id") WeatherSensor id){
        this.weatherSensorRepository.delete(id);
        System.out.println("Deleted Weather sensor");
    }

}

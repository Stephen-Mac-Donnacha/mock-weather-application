package com.example.mockweatherproject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mockweatherproject.model.WeatherSensor;
import org.springframework.stereotype.Repository;

// Repository interface for the weather sensor, defines the behaviour for the WeatherSensor Class
@Repository
public interface WeatherSensorRepository extends MongoRepository<WeatherSensor, String> {

}

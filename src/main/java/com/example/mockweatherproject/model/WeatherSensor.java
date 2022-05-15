package com.example.mockweatherproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
// Class to hold the WeatherSensor object
@Document(collection = "weather-sensor-db")
public class WeatherSensor {
    // Sensor id, will act as the primary key in the database
    @Id
    private String id;
    private String cityName;
    private String countryName;

    private SensorData sensorData;

    // Constructor for the WeatherSensor class
    public WeatherSensor(String cityName, String countryName){
        super();
        this.cityName = cityName;
        this.countryName = countryName;
    }

    // Getter and setter methods for the class fields
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(this.id != null) {
            this.id = id;
        } else {
            System.out.println("Please enter a value for Id");
        }
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        if(this.cityName != null){
            this.cityName = cityName;
        } else {
            System.out.println("Please enter a value for city name");
        }
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        if(this.countryName != null){
            this.countryName = countryName;
        } else {
            System.out.println("Please enter a value for country name");
        }
    }


    public SensorData getSensorData() {
        return sensorData;
    }

    public void setSensorData(SensorData sensorData) {
        this.sensorData = sensorData;
    }


}

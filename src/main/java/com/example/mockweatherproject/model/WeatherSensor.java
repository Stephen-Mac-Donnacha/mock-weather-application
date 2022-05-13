package com.example.mockweatherproject.model;

import java.util.HashMap;
import java.util.List;
// Class to hold the WeatherSensor object
public class WeatherSensor {
    // Sensor id, will act as the primary key in the database
    private String id;
    private String cityName;
    private String countryName;
    private HashMap<String, List<Float>> sensorData = new HashMap<>();

    // Constructor for the WeatherSensor class
    public WeatherSensor(){

    }

    // Getter and setter methods for the class fields
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public HashMap<String, List<Float>> getSensorData() {
        return sensorData;
    }

    public void setSensorData(HashMap<String, List<Float>> sensorData) {
        this.sensorData = sensorData;
    }
}

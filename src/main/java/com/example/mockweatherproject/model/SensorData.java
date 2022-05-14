package com.example.mockweatherproject.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "weather-sensor-db")
public class SensorData {
    @Id
    private String date;
    private double temp;
    private double humidity;
    private double windTemp;

    public SensorData(double temp, double humidity, double windTemp){
        super();
        this.temp = temp;
        this.humidity = humidity;
        this.windTemp = windTemp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindTemp() {
        return windTemp;
    }

    public void setWindTemp(double windTemp) {
        this.windTemp = windTemp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

package com.example.mockweatherproject.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "weather-data-db") // Define collection for the data to be stored in
public class SensorData {
    @Id
    private String date; // @Id signifies this will act as our primary key
    private double temp;
    private double humidity;
    private double windTemp;

    private List<Double> dataList = new ArrayList<>(); // This List was designed to hold the temp,humidity and windTemp variables in List form

    private HashMap<String, List<Double>> dataHash = new HashMap<>(); // Map a String (i.e. date, to the List of values / data for that day

    // Constructor for the SensorData class
    public SensorData(double temp, double humidity, double windTemp){
        super();
        this.temp = temp;
        this.humidity = humidity;
        this.windTemp = windTemp;
    }

    // Getters and setters for each variable
    // Try / Catch blocks added to each setter for input validation
    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        try {
            this.temp = temp;
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        try {
            this.humidity = humidity;
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    public double getWindTemp() {
        return windTemp;
    }

    public void setWindTemp(double windTemp) {
        try {
            this.windTemp = windTemp;
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDataList(Double temp, Double humidity, Double windTemp) {
        dataList.add(temp);
        dataList.add(humidity);
        dataList.add(windTemp);
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "date='" + date + '\'' +
                ", temp=" + temp +
                ", humidity=" + humidity +
                ", windTemp=" + windTemp +
                ", dataList=" + dataList +
                ", dataHash=" + dataHash +
                '}';
    }
}

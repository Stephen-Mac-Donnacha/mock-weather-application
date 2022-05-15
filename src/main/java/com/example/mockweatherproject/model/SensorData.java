package com.example.mockweatherproject.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "weather-data-db")
public class SensorData {
    @Id
    private String date;
    private double temp;
    private double humidity;
    private double windTemp;

    private List<Double> dataList = new ArrayList<>();

    private HashMap<String, List<Double>> dataHash = new HashMap<>();

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

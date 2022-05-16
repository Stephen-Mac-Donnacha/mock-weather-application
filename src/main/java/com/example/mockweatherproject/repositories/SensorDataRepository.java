package com.example.mockweatherproject.repositories;

import com.example.mockweatherproject.model.SensorData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// Repository interface for the Sensor Data, defines the behaviour for the Data Sensor Class
@Repository
public interface SensorDataRepository extends MongoRepository<SensorData, String> {
    @Query("{date:'?0'}")
    SensorData findItemByName(String date); // Method to find an item given a name
}

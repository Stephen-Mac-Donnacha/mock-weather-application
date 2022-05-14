package com.example.mockweatherproject.repositories;

import com.example.mockweatherproject.model.SensorData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorDataRepository extends MongoRepository<SensorData, String> {
}

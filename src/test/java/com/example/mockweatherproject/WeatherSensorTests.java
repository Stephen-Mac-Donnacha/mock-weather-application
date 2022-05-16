package com.example.mockweatherproject;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

// Testing class for Weather Sensors
@SpringBootTest
public class WeatherSensorTests {
    @Autowired
    private WebApplicationContext webApplicationContext; // Used to set up the web context for testing

    private DefaultMockMvcBuilder mockMvc;

    @Before // This should be run before any tests are run
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext);
    }
}

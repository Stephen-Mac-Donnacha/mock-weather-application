package com.example.mockweatherproject;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@SpringBootTest
public class SensorDataTests {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private DefaultMockMvcBuilder mockMvc;

    @Before // This should be run before any tests are run
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext);
    }

    @Test
    public void TestSensorData() throws Exception {

    }
}

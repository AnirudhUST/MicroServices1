package com.UST.Sharath_Cars.controller;

import com.UST.Sharath_Cars.model.Cars;
import com.UST.Sharath_Cars.service.CarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(CarController.class)
public class CarsControllerTest {
    @Autowired
    private MockMvc mockmvc;

    @MockBean
    private CarService service;

    private Cars cars;

    @BeforeEach
    void setup() {

        cars = new Cars(1, "X9", "89Lakh", "BMW","Black","5","20-05-2023","booked");
    }

    @Test
    void testGetAllCars() throws Exception {

        final List<Cars> cars = List.of(new Cars(1, "X9", "89Lakh", "BMW","Black","5","20-05-2023","booked"));
        when(service.getAllCars()).thenReturn(cars);

        // Run the test
        final MockHttpServletResponse response = mockmvc.perform(get("/sharathcars/cars")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
//        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testGetCarsByDate() throws Exception {
        // Setup
        // Configure StudentService.getStudentByName(...).
        final List<Cars> cars = List.of(new Cars(1, "X9", "89Lakh", "BMW","Black","5","20-05-2023","booked"));
        when(service.getCarsByDate("date")).thenReturn(cars);

        // Run the test
        final MockHttpServletResponse response = mockmvc.perform(get("/sharathcars/cars/{date}", "date")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
    }
}



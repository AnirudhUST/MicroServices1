package com.UST.Sharath_Cars.service;

import com.UST.Sharath_Cars.model.Cars;
import com.UST.Sharath_Cars.repository.CarRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarServiceImplTest {
    @Mock
    private CarRepo mockCarrepo;

    @InjectMocks
    private CarServiceImpl CarServiceImplUnderTest;

    @Test
    void testGetAllStudent() {
        // Setup
        final List<Cars> expectedResult = List.of(new Cars(1, "X9", "89Lakh", "BMW","Black","5","20-05-2023","booked"));

        // Configure Studentrepo.findAll(...).
        final List<Cars> cars = List.of(new Cars(1, "X9", "89Lakh", "BMW","Black","5","20-05-2023","booked"));
        when(mockCarrepo.findAll()).thenReturn(cars);

        // Run the test
        final List<Cars> result = CarServiceImplUnderTest.getAllCars();

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }
}

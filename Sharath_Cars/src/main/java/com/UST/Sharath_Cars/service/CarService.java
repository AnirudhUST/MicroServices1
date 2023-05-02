package com.UST.Sharath_Cars.service;

import com.UST.Sharath_Cars.model.Cars;
import com.UST.Sharath_Cars.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//import org.springframework.stereotype.Service;


public interface CarService {


    Object getCars();

    Cars addCar(Cars cars);

    List<Cars> getAllCars();

    List<Cars> getCarsByDate(String availabilityDate);
}

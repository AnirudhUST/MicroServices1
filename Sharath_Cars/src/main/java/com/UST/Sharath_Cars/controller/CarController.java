package com.UST.Sharath_Cars.controller;

import com.UST.Sharath_Cars.model.Cars;
import com.UST.Sharath_Cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sharathcars")
public class CarController {

    @Autowired
    private CarService carservice;
    @PostMapping
    public Cars addCars(@RequestBody Cars cars){
        return carservice.addCar(cars);
    }

    @GetMapping("/cars")
    public List<Cars> getAllCar(){
        return carservice.getAllCars();
    }

    @GetMapping("/cars/{availablityDate}")
    public List<Cars> getCarsByDates(@PathVariable("availablityDate") String availabilityDate){
        return carservice.getCarsByDate( availabilityDate);
    }

}

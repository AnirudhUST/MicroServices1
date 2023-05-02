package com.UST.Sharath_Cars.service;

import com.UST.Sharath_Cars.model.Cars;
import com.UST.Sharath_Cars.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarRepo carRepo;

    public List<Cars> getAllCars() {
        return carRepo.findAll();
    }

    @Override
    public List<Cars> getCarsByDate(String availabilityDate) {
        return null;
    }


    @Override
    public Object getCars() {
        return null;
    }

    @Override
    public Cars addCar(Cars cars) {
        return null;
    }
}

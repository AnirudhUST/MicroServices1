package com.UST.Sharath_Cars.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cars {

    @Id
    @GeneratedValue
    private int carId;
    private String carName;
    private String price;
    private String brand;
    private String color;
    private String noOfSeats;
    private String availabilityDate;
    private String status;


}

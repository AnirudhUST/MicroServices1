package com.UST.Flightservices.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="passanger-info")
public class Passangerinfo {
    @Id
    @GeneratedValue
    private Long pId;
    private String name;
    private String email;
    private String  source;
    private String Destination;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date traveldata;
    private String pickupTime;
    private String arrivalTime;
    private double fare;

}

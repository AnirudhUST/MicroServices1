package com.UST.Sharath_Cars.repository;

import com.UST.Sharath_Cars.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Cars,Integer> {
}

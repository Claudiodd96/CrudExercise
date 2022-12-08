package com.crud.crud01.repository;


import com.crud.crud01.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository <Car,Integer> {


}

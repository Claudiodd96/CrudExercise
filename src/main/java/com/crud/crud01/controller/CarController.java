package com.crud.crud01.controller;

import com.crud.crud01.entities.Car;
import com.crud.crud01.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {


    @Autowired
    private CarRepository carRepository;


    @PostMapping("/insert")
    public Car insertCar(@RequestBody Car car){
        Car carSave = (Car) carRepository.saveAndFlush(car);
        return carSave;
    }


    @GetMapping("/list")
    public ArrayList<Car> carList(){
        ArrayList<Car> list = (ArrayList<Car>) carRepository.findAll();
            return list;
        }

    @GetMapping("/{id}")
    public Optional<Car> carById(@PathVariable int id){
        Optional<Car> carById = carRepository.findById(id);
        return carById;
    }


    @PutMapping("/{id}")
    public Car modificaCar(@PathVariable int id, @RequestBody Car car){
        car.setId(id);
        Car editCar = carRepository.saveAndFlush(car);
        return editCar;
    }


    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable int id){
        carRepository.deleteById(id);
    }

    @DeleteMapping("/delete")
    public void deleteCar(){
        carRepository.deleteAll();
    }











}

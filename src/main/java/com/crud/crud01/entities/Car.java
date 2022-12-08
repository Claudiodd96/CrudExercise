package com.crud.crud01.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "car")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @Column( name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column( name = "modelName")
    private  String modelName;
    @Column( name = "type")
    private String type;

    public Car(String modelName, String type) {
        this.modelName = modelName;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{ id=" + id + " modelName=" + modelName + " type=" + type + " }";

    }
}

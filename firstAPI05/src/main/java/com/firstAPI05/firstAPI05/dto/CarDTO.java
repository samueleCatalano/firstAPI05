package com.firstAPI05.firstAPI05.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
public class CarDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String modelName;
    double price;

    public CarDTO(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }
}


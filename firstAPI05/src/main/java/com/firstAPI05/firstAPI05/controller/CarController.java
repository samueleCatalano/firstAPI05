package com.firstAPI05.firstAPI05.controller;

import com.firstAPI05.firstAPI05.dto.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {


    @GetMapping
    public CarDTO getCars(){
        return new CarDTO("220", "Mazda mx5", 2000);
    }

    @PostMapping
    public String postCars(@Valid @RequestBody (required = false) CarDTO ford){
        System.out.println(ford);
        return "Created";
    }

}

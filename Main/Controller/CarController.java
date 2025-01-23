package com.example.demo.controller;

import com.example.demo.entity.Hyundai;
import com.example.demo.entity.Kia;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// REST controller to handle HTTP requests for Hyundai and Kia cars.

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

            
             // Endpoint to create a Hyundai car along with its associated Kia car.
             // @param hyundai Hyundai car details
             // @param kia Kia car details
             // @return Saved Hyundai with associated Kia
             
    @PostMapping("/createHyundaiWithKia")
    public Hyundai createHyundaiWithKia(@RequestBody Hyundai hyundai, @RequestBody Kia kia) {
        return carService.createHyundaiWithKia(hyundai, kia);
    }

   
  
            
               // Endpoint to create a Kia car along with its associated Hyundai car.
               // @param kia Kia car details
               // @param hyundai Hyundai car details
               //  @return Saved Kia with associated Hyundai
               
    @PostMapping("/createKiaWithHyundai")
    public Kia createKiaWithHyundai(@RequestBody Kia kia, @RequestBody Hyundai hyundai) {
        return carService.createKiaWithHyundai(kia, hyundai);
    }
}


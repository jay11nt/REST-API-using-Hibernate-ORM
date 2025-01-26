package com.example.demo.service;

import com.example.demo.entity.Hyundai;
import com.example.demo.entity.Kia;
import com.example.demo.repository.HyundaiRepository;
import com.example.demo.repository.KiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Service layer to handle the creation of Hyundai and Kia entities.
 
@Service
public class CarService 
{

    @Autowired
    private HyundaiRepository hyundaiRepository;

    @Autowired
    private KiaRepository kiaRepository;

    
    // Creates a Hyundai car and associates it with a Kia car.
    //  @param hyundai Hyundai details
     // @param kia Kia details
     // @return Saved Hyundai
     
    public Hyundai createHyundaiWithKia(Hyundai hyundai, Kia kia) 
     {
        hyundai.setKia(kia);
        kia.setHyundai(hyundai);
        hyundaiRepository.save(hyundai);
        return hyundai;
     }

    
     // Creates a Kia car and associates it with a Hyundai car.
     // @param kia Kia details
     // @param hyundai Hyundai details
     // @return Saved Kia
     
    public Kia createKiaWithHyundai(Kia kia, Hyundai hyundai) 
     {
        kia.setHyundai(hyundai);
        hyundai.setKia(kia);
        kiaRepository.save(kia);
        return kia;
     }
}


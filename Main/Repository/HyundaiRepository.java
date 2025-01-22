package com.example.demo.repository;

import com.example.demo.entity.Hyundai;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HyundaiRepository extends JpaRepository<Hyundai, Long> {
}

package com.example.demo.repository;


import com.example.demo.entity.CoffeeBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface coffeedata extends JpaRepository<CoffeeBean, Long>{

}

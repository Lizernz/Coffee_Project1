package com.example.demo.service;


import com.example.demo.entity.CoffeeBean;
import com.example.demo.repository.coffeedata;
import org.springframework.stereotype.Service;
import java.util.List;


@Service

public class CoffeeService {

    private final coffeedata coffeedata;

    public CoffeeService(coffeedata coffeedata) {
        this.coffeedata = coffeedata;
    }

    public List<CoffeeBean> getAllCoffeeBeans() {
        return coffeedata.findAll();
    }

    public CoffeeBean saveCoffeeBean(CoffeeBean CoffeeBean) {
        return coffeedata.save(CoffeeBean);
    }

}

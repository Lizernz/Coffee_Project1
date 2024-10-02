package com.example.demo.controller;

import com.example.demo.entity.CoffeeBean;
import com.example.demo.service.CoffeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coffee")
public class CoffeeController {

    private final CoffeeService coffeeService; // Use camelCase for variable names

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping
    public List<CoffeeBean> getAllCoffeeBeans() {
        return coffeeService.getAllCoffeeBeans();
    }

    @PostMapping
    public CoffeeBean createCoffeeBean(@RequestBody CoffeeBean coffeeBean) {
        return coffeeService.saveCoffeeBean(coffeeBean);
    }
}

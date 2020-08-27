package com.example.demo.controller;

import com.example.demo.entities.Animal;
import com.example.demo.services.AnimalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animals")
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

}

package com.example.demo.services;

import com.example.demo.entities.Animal;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AnimalService {
    List<Animal> getAllAnimals();
}

package com.example.cardapiojava.controller;
import com.example.cardapiojava.food.Food;
import com.example.cardapiojava.food.FoodRepository;
import com.example.cardapiojava.food.FoodRequestDTO;
import com.example.cardapiojava.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food") //mapiando o request do controller
public class FoodController {

    //instanciando o foodRepos
    @Autowired //injetando a dependencia
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}

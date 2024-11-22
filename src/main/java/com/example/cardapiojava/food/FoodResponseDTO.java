package com.example.cardapiojava.food;
//Criacao do response pra aminizar os bugs
public record FoodResponseDTO(Long id,
                              String title,
                              String image,
                              Integer price){
    //const para funcionar
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}

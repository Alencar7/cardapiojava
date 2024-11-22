package com.example.cardapiojava.food;

import org.springframework.data.jpa.repository.JpaRepository;

//herdando tudo do Jpa
public interface FoodRepository extends JpaRepository<Food, Long> {
 //dentro do controller
}

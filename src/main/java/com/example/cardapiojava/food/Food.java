package com.example.cardapiojava.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods") //foods -> nome da tabela no DB
@Entity(name = "foods") // nome para entidade
@Getter //lombok
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id" )
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //primaryKey
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}

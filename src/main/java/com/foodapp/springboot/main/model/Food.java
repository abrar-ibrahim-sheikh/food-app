package com.foodapp.springboot.main.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item")
    private String item;

    @Column(name = "cuisine")
    private String cuisine;

//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "ingredients", referencedColumnName = "id")
//    private List <Ingredient> ingredientList = new ArrayList<>();
//
//    public List<Ingredient> addIngredient(Ingredient ingredient) {
//        ingredientList.add(ingredient);
//        return ingredientList;
//    }
//
//    public Boolean removeIngredient(Ingredient ingredient) {
//        Boolean result = ingredientList.remove(ingredient);
//        return result;
//    }
//
//    public List<Ingredient> addIngredient(List<Ingredient> ingredientList) {
//        ingredientList.addAll(ingredientList);
//        return ingredientList;
//    }
//
//    public Boolean removeIngredient(List<Ingredient> ingredientList) {
//        Boolean result = ingredientList.removeAll(ingredientList);
//        return result;
//    }
//
//    public List<Ingredient> addIngredient(Integer index, List<Ingredient> ingredientList) {
//        ingredientList.addAll(index, ingredientList);
//        return ingredientList;
//    }


}

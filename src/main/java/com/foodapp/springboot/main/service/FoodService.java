package com.foodapp.springboot.main.service;

import com.foodapp.springboot.main.model.Food;

import java.util.List;

public interface FoodService {

    Food save(Food foodObj);

    List<Food> getAllFoods();

    Food getFoodById(Long id);

    void updateFoodById(Long id, Food food);

    void deleteFoodById(Long id);

    void deleteAllFoods();
}

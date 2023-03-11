package com.foodapp.springboot.main.service.impl;

import com.foodapp.springboot.main.model.Food;

import com.foodapp.springboot.main.repository.FoodRepository;
import com.foodapp.springboot.main.service.FoodService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    private final FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //    @Autowired
//    private IngredientRepository ingredientRepository;

    @Override
    public Food save(Food foodObj) {
        Food food = foodRepository.save(foodObj);
        return food;
    }

    @Override
    public List<Food> getAllFoods() {
        List<Food> foodList = foodRepository.findAll();
        return foodList;
    }

    @Override
    public Food getFoodById(Long id) {
        Food foodObj = foodRepository.findById(id).get();
        return foodObj;
    }

    @Override
    public void updateFoodById(Long id, Food food) {
        Food tempFood = new Food();
        tempFood.setId(id);
        tempFood.setItem(food.getItem());
        tempFood.setCuisine(food.getCuisine());
        foodRepository.save(tempFood);
    }

    @Override
    public void deleteFoodById(Long id) {
        foodRepository.deleteById(id);
    }

    @Override
    public void deleteAllFoods() {
        foodRepository.deleteAll();
    }
}

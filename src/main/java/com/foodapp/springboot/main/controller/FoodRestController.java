package com.foodapp.springboot.main.controller;

import com.foodapp.springboot.main.model.Food;
import com.foodapp.springboot.main.service.FoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/food")
public class FoodRestController {

    private final FoodService foodService;

    public FoodRestController(FoodService foodService) {
        super();
        this.foodService = foodService;
    }


    @PostMapping
    public ResponseEntity<Food> createFood(@RequestBody Food foodObj) {
        Food foodRes = foodService.save(foodObj);
        return new ResponseEntity<>(foodRes,HttpStatus.OK);
    }

    @GetMapping
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable(name = "id") Long id) {
        Food foodObj = foodService.getFoodById(id);
        return new ResponseEntity<>(foodObj, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFoodById(@PathVariable(name = "id") Long id, @RequestBody Food food) {
        foodService.updateFoodById(id, food);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteFoodById(@PathVariable(name = "id") Long id) {
        foodService.deleteFoodById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteFoodById() {
        foodService.deleteAllFoods();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

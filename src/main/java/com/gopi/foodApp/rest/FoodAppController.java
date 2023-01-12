package com.gopi.foodApp.rest;

import com.gopi.foodApp.model.RestaurantsData;
import com.gopi.foodApp.service.FoodAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodAppController {

    @Autowired
    private FoodAppService foodAppService;

    @RequestMapping(value = "/saveRestaurants", method = RequestMethod.POST)
    public List<RestaurantsData> saveRestaurantsData(@RequestBody List<RestaurantsData> restaurantsData){

        return foodAppService.saveRestaurantsData(restaurantsData,"");
    }
}

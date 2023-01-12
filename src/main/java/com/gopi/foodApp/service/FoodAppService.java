package com.gopi.foodApp.service;

import com.gopi.foodApp.model.RestaurantsData;

import java.util.List;

public interface FoodAppService {
    List<RestaurantsData> saveRestaurantsData(List<RestaurantsData> restaurantsDataList, String requestUser);
}

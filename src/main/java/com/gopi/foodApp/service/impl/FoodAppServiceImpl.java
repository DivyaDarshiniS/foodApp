package com.gopi.foodApp.service.impl;

import com.gopi.foodApp.dao.FoodAppDao;
import com.gopi.foodApp.model.RestaurantsData;
import com.gopi.foodApp.service.FoodAppService;
import com.gopi.foodApp.util.FoodAppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FoodAppServiceImpl implements FoodAppService {

    @Autowired
    private FoodAppDao foodAppDao;

    @Override
    public List<RestaurantsData> saveRestaurantsData(List<RestaurantsData> restaurantsDataList, String requestUser){
        restaurantsDataList.forEach(restaurantsData -> {
            restaurantsData.setCreatedBy(requestUser);
            restaurantsData.setCreatedTimeStamp(new Date());
            restaurantsData.setUpdatedBy(requestUser);
            restaurantsData.setUpdatedTimeStamp(new Date());
            restaurantsData.setRestaurantId(FoodAppUtil.getUUID(restaurantsData.getRestaurantName()));
        });

        return foodAppDao.saveRestaurantsData(restaurantsDataList);
    }
}

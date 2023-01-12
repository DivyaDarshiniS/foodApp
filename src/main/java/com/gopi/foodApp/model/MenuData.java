package com.gopi.foodApp.model;

import lombok.Data;

@Data
public class MenuData {

    private String restaurantId;
    private String menuId;
    private String dishName;
    private String description;
    private float rate;
    private String noOfOrder;
}

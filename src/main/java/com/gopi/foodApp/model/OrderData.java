package com.gopi.foodApp.model;

import lombok.Data;

import java.util.List;

@Data
public class OrderData{

    private String restaurantId;
    private String orderId;
    private List<MenuData> menuId;
    private float totalRate;
    private String paymentMode;

}
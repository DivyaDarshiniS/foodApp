package com.gopi.foodApp.model;

import lombok.Data;

import java.util.List;

@Data
public class UsersData {

    private String customerId;
    private String customerName;
    private String mobileNo;
    private List<UserAddress> address;
    
}

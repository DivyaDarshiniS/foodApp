package com.gopi.foodApp.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RestaurantsData {

	private String restaurantId;
	private String restaurantName;
    private String image;
    private String outlet;
    private List<MenuData> menu;
    private String createdBy;
    private Date createdTimeStamp;
    private String updatedBy;
    private Date updatedTimeStamp;

}

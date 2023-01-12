package com.gopi.foodApp.util;

import java.util.UUID;

public class FoodAppUtil {

    public static String getUUID(String name){
        UUID uuid = UUID.randomUUID();
        String id= name+"-"+uuid.toString();
        return id;
    }
}

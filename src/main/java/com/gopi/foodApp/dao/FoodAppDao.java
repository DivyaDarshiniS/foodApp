package com.gopi.foodApp.dao;

import com.google.api.client.util.Lists;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.gopi.foodApp.model.RestaurantsData;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Component
public class FoodAppDao {

    public List<RestaurantsData> saveRestaurantsData(List<RestaurantsData> restaurantsDataList) {

        Firestore firestore = FirestoreClient.getFirestore();
        restaurantsDataList.stream().forEach(restaurantsData -> {
            ApiFuture<WriteResult> apiFuture = firestore.collection("gopi_restaurant_data").document(restaurantsData.getRestaurantId()).set(restaurantsData);
            try {
                apiFuture.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
            return restaurantsDataList;
    }
}

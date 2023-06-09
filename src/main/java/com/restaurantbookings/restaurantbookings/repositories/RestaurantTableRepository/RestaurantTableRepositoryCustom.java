package com.restaurantbookings.restaurantbookings.repositories.RestaurantTableRepository;

import com.restaurantbookings.restaurantbookings.models.RestaurantTable;

import java.util.List;

public interface RestaurantTableRepositoryCustom {
    List<RestaurantTable> getTablesAvailableOnDate(String date);

}

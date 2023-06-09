package com.restaurantbookings.restaurantbookings.controllers;

import com.restaurantbookings.restaurantbookings.models.RestaurantTable;
import com.restaurantbookings.restaurantbookings.repositories.RestaurantTableRepository.RestaurantTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/", name="RestaurantTableController")
public class RestaurantTableController {

    @Autowired
    RestaurantTableRepository restaurantTableRepository;

    @GetMapping(value="/restaurant-tables")
    @CrossOrigin
    public List<RestaurantTable> getAllRestaurantTables() {
        return restaurantTableRepository.findAll();
    }

    @GetMapping(value="/restaurant-tables/seating/{number}" )
    @CrossOrigin
    public List<RestaurantTable> getTablesBySeating(@PathVariable int number){
        return restaurantTableRepository.findTablesBySeating(number);
    }

    @GetMapping(value="/restaurant-tables/availableondate/{date}" )
    @CrossOrigin
    public List<RestaurantTable> getTablesAvailableOnDate(@PathVariable String date){
        return restaurantTableRepository.getTablesAvailableOnDate(date);
    }
}

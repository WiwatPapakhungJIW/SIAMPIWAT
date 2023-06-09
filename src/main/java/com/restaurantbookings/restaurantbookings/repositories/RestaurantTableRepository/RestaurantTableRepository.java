package com.restaurantbookings.restaurantbookings.repositories.RestaurantTableRepository;

import com.restaurantbookings.restaurantbookings.models.RestaurantTable;
import com.restaurantbookings.restaurantbookings.projections.EmbedBookingsForRestaurantTables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(excerptProjection = EmbedBookingsForRestaurantTables.class)
public interface RestaurantTableRepository extends JpaRepository<RestaurantTable, Long> {

    List<RestaurantTable> findTablesBySeating(int number);
    List<RestaurantTable> getTablesAvailableOnDate(String date);
    List<RestaurantTable> findAll();
}

package com.restaurantbookings.restaurantbookings.projections;

import com.restaurantbookings.restaurantbookings.models.Booking;
import com.restaurantbookings.restaurantbookings.models.RestaurantTable;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedBookingsForTables", types = RestaurantTable.class)
public interface EmbedBookingsForRestaurantTables {
    public Long getId();
    List<Booking> getBookings();
}

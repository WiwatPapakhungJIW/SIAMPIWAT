package com.restaurantbookings.restaurantbookings.repositories.BookingRepository;

import com.restaurantbookings.restaurantbookings.models.Booking;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> getBookingByDateTimeAndCustomerId(LocalDate date, LocalTime time, Long customerId);

    List<Booking> getBookingsByCustomerId(Long customerId);
}

package com.restaurantbookings.restaurantbookings.controllers;

import com.restaurantbookings.restaurantbookings.models.Booking;
import com.restaurantbookings.restaurantbookings.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value="/date/{date}")
    @CrossOrigin
    public List<Booking> getAllBookingsForDate(@PathVariable String date) {
        LocalDate getDate = LocalDate.parse(date);
        return bookingRepository.findAllBookingsByDate(getDate);
    }

    @GetMapping(value="/date/{date}/time/{time}/customer/{customerId}")
    public List<Booking> getBookingByDateTimeAndCustomerId(@PathVariable String date, @PathVariable String time, @PathVariable Long customerId) {
        LocalDate getDate = LocalDate.parse(date);
        LocalTime getTime = LocalTime.parse(time);
        return bookingRepository.getBookingByDateTimeAndCustomerId(getDate, getTime, customerId);
    }

    @GetMapping(value="/customer/{customerId}")
    public List<Booking> getBookingsByCustomerId(@PathVariable Long customerId){
        return bookingRepository.getBookingsByCustomerId(customerId);
    }
}
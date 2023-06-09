package com.restaurantbookings.restaurantbookings.repositories.BookingRepository;

import com.restaurantbookings.restaurantbookings.models.Booking;
import com.restaurantbookings.restaurantbookings.projections.EmbedAllForBookings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
@RepositoryRestResource(excerptProjection = EmbedAllForBookings.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> findAllBookingsByDate(LocalDate date);

    List<Booking> getBookingByDateTimeAndCustomerId(LocalDate date, LocalTime time, Long customerId);

    List<Booking> getBookingsByCustomerId(Long customerId);

}

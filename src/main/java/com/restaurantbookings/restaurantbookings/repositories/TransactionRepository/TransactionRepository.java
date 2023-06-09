package com.restaurantbookings.restaurantbookings.repositories.TransactionRepository;

import com.restaurantbookings.restaurantbookings.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionRepository  extends JpaRepository<Transaction, Long>, TransactionRepositoryCustom{
    List<Transaction> getTransactionsByCustomerId(Long customerId);
    List<Transaction> getTransactionsByBookingId(Long bookingId);
    List<Transaction> getTransactionsByCustomerName(String customerName);
    List<Transaction> findAllTransactionsByDate(LocalDate date);
}


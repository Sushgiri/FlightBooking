package com.FlightBooking.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightBooking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long> {

   List<Booking>findByOriginatingAndDestination(String originating , String destination);
}

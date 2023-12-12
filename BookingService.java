package com.FlightBooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlightBooking.entity.Booking;
import com.FlightBooking.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	public BookingRepository bookingrepo;
	
	
	public void saveRecord(Booking booking) {
		
		bookingrepo.save(booking);
	}
	
	public List<Booking>ReadBooking() {
		List<Booking> record = bookingrepo.findAll();
		return record;
		
	}
	
	public void deleterecord(long id) {
	bookingrepo.deleteById(id);
	}
     
	public void updatesave(Booking booking) {
		bookingrepo.save(booking);
	}
	
	public Booking getById(long id) {
		Optional<Booking> booking = bookingrepo.findById(id);
		return booking.get();
	}
	
	public List<Booking> Search(String originating , String destination){
		List<Booking> searched = bookingrepo.findByOriginatingAndDestination(originating, destination);
		return searched;
		
	}
}

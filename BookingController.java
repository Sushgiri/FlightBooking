package com.FlightBooking.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FlightBooking.entity.Booking;
import com.FlightBooking.repository.BookingRepository;
import com.FlightBooking.service.BookingService;
import com.FlightBookingdto.dto.Bookingdto;

//http://localhost:8080/main





@Controller
public class BookingController {
	
	@Autowired
	public BookingService bookingService;
	
	@Autowired
	public BookingRepository bookingrepo;
	
	
	
	@RequestMapping("/main")
	public String LoadMain() {
		
		
		return "Main";
		
	}

	
	@RequestMapping("/adminlog")
	public String gotoAdmin() {
		return "Admin_page";
	}

	@RequestMapping("/SaveRecord")
	public String AdminPage(@RequestParam("originating") String originating,
			@RequestParam("destination") String destination,
			@RequestParam("arrvial") String arrvial,
			@RequestParam("departure") String departure,
			@RequestParam("flightDuration") String flightDuration,
			@RequestParam("flightNumber") String flightNumber,
			@RequestParam("price") String price,
			@RequestParam("seats") String seats,
			Model model) {
		Booking booking = new Booking();
		booking.setOriginating(originating);
		booking.setDestination(destination);
      	booking.setDeparture(departure);
		booking.setArrvial(arrvial);
      	booking.setFlightDuration(flightDuration);
      	booking.setFlightNumber(flightNumber);
      	booking.setPrice(price);
      	booking.setSeats(seats);

		bookingService.saveRecord(booking);
		
      model.addAttribute("saved", "Record saved");
		

		

		return "Admin_page";
		
	}
	@RequestMapping("/delete")
	public String deletecontroller(@RequestParam long id, Model model) {
		
          bookingService.deleterecord(id);
		List<Booking> record = bookingService.ReadBooking();
		model.addAttribute("record",record);
		return "booking_list";
		
	}
	@RequestMapping("/update")
    public String gotoupdate(@RequestParam long id, Model model) {
		Booking record = bookingService.getById(id);
		model.addAttribute("record", record);
    	return "update_list";
    }
    
	@RequestMapping("/updaterecord")
	public String updatecontroller(Bookingdto dto,Model model) {
		Booking reg = new Booking();
		reg.setId(dto.getId());
		reg.setOriginating(dto.getOriginating());
		reg.setDestination(dto.getDestination());
		reg.setDeparture(dto.getDeparture());
		reg.setFlightDuration(dto.getFlightDuration());
		reg.setArrvial(dto.getArrvial());
		reg.setSeats(dto.getSeats());
		reg.setPrice(dto.getPrice());
		bookingService.updatesave(reg);
		List<Booking> record = bookingService.ReadBooking();
		model.addAttribute("record",record);
		model.addAttribute("up", "Update record");
		return "booking_list";
		
	}

	
	@RequestMapping("/readAll")
	public String readPage(Model model) {
		List<Booking> record = bookingService.ReadBooking();
		model.addAttribute("record",record);

		return "booking_list" ;
		
	}
	@RequestMapping("/searchrecord")
	public String searchbyfirstname(@RequestParam("originating") String originating ,@RequestParam("destination")  String destination, Model model) {
        List<Booking> record = bookingService.Search(originating, destination);
        model.addAttribute("record", record);
        return "search_listjsp";
    
		
	}
	@RequestMapping("/book")
	public String book() {
		
		return "book_page";
		
	}

	@RequestMapping("/bookticket")
	public String bookticket(Bookingdto dto,Model model) {
		
		return "Payment";
		
	}

	
}

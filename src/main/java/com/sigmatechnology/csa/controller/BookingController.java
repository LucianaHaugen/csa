package com.sigmatechnology.csa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sigmatechnology.csa.entity.Booking;
import com.sigmatechnology.csa.entity.User;
import com.sigmatechnology.csa.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/bookings")
	public List<Booking> getAllBookings(){
		return bookingService.getAllBookings();
	}
	
	@GetMapping("/users/{id}/bookings")
	public List<Booking> getAllBookings(@PathVariable long id){
		return bookingService.getAllBookingsOfUser(id);
	}
	
	@GetMapping("/users/{usersId}/bookings/{id}")
	public Booking getBooking(@PathVariable long id) {
		return bookingService.getBooking(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="users/{userId}/bookings")
	public void addBooking(@RequestBody Booking booking, @PathVariable long userId) {
		//booking.setUser(userId);
		booking.setUser(new User(userId, "", "", true, 0, 0.0));
		bookingService.createBooking(booking);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="users/{userId}/bookings/{id}")
	public void updateBooking(@RequestBody Booking booking, @PathVariable long userId, @PathVariable long id) {
		//booking.setUser(id);
		booking.setUser(new User(userId, "", "", true, 0, 0.0));
		bookingService.updateBooking(id, booking);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="users{userId}/bookings/{id}")
	public void deleteBooking(@PathVariable long id) {
		bookingService.deleteBooking(id);
	}
}

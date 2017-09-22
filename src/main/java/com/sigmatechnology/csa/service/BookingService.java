package com.sigmatechnology.csa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmatechnology.csa.entity.Booking;
import com.sigmatechnology.csa.entity.User;
import com.sigmatechnology.csa.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	public List<Booking> getAllBookings() {
		List<Booking> bookings = new ArrayList<>();
		bookingRepository.findAll().forEach(bookings::add);
		return bookings;
	}
	
	public List<Booking> getAllBookingsOfUser(long id){
		List<Booking> bookings = new ArrayList<>();
		bookingRepository.findByUserId(id)
		.forEach(bookings::add);
		return bookings;
	}
	
	public List<Booking> getAllBookingsByDestination(String destination){
		List<Booking> bookings = new ArrayList<>();
		bookingRepository.findByDestination(destination).forEach(bookings::add);
		return bookings;
	}
	
	public Booking getBooking(Long id) {
		return bookingRepository.findOne(id);
	}

	public void createBooking(Booking booking) {
		bookingRepository.save(booking);
	}

	public void updateBooking(long id, Booking booking) {
		List<Booking> bookingsLista = new ArrayList<>();
		bookingRepository.findAll().forEach(bookingsLista::add);
		for(Booking olderBooking:bookingsLista) {
			if(olderBooking.getId()==id) {
				bookingRepository.save(booking);
				return;
			}
		}
	}

	public void deleteBooking(long id) {
		bookingRepository.delete(id);
	}


}

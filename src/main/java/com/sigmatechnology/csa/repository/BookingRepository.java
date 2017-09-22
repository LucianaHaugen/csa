package com.sigmatechnology.csa.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sigmatechnology.csa.entity.Booking;

public interface BookingRepository extends CrudRepository<Booking, Long>{
	
	public List<Booking> findByUserId(Long userId);
	
	public List<Booking> findByStartingDate(Date startingDate);
	
	public List<Booking> findByDestination(String destination);
}
package com.sigmatechnology.csa.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	//@DateTimeFormat(iso = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
	@JsonFormat(pattern = "YYYY-MM-dd HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
    private Date timeOfBooking;
	
	@Temporal(TemporalType.DATE)
    private Date startingDate;
	
	@JsonFormat(pattern = "HH:mm")
	@Temporal(TemporalType.TIME)
    private Date startingTime;
	
	@Temporal(TemporalType.DATE)
    private Date endingDate;
	
	@JsonFormat(pattern = "HH:mm")
	@Temporal(TemporalType.TIME)
    private Date endingTime;
	
    private boolean isConfirmed;  
    private String errand;
    private String destination;
    private String purpose;
    
    @ManyToOne
    private User user; 
    
    @ManyToOne
    private Vehicle vehicle;
 
    
	public Booking() {
	}
		

	public Booking(long id, Date timeOfBooking, Date startingDate, Date startingTime,
			Date endingDate, Date endingTime, boolean isConfirmed, String errand, String destination,
			String purpose, Long userId) {
		super();
		this.id = id;
		this.timeOfBooking = timeOfBooking;
		this.startingDate = startingDate;
		this.startingTime = startingTime;
		this.endingDate = endingDate;
		this.endingTime = endingTime;
		this.isConfirmed = isConfirmed;
		this.errand = errand;
		this.destination = destination;
		this.purpose = purpose;
		this.user = new User(userId, "", "", true, 0, 0.0);
		//this.user = listOfUsers.get(userId);
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getTimeOfBooking() {
		return timeOfBooking;
	}

	public void setTimeOfBooking(Date timeOfBooking) {
		this.timeOfBooking = timeOfBooking;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public Date getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(Date startingTime) {
		this.startingTime = startingTime;
	}

	public Date getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}

	public Date getEndingTime() {
		return endingTime;
	}

	public void setEndingTime(Date endingTime) {
		this.endingTime = endingTime;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public String getErrand() {
		return errand;
	}

	public void setErrand(String errand) {
		this.errand = errand;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	@Override
	public String toString() {
		return "Booking [id=" + id + ", timeOfBooking=" + timeOfBooking + ", startingDate=" + startingDate
				+ ", startingTime=" + startingTime + ", endingDate=" + endingDate + ", endingTime=" + endingTime
				+ ", isConfirmed=" + isConfirmed + ", errand=" + errand + ", destination=" + destination + ", purpose="
				+ purpose + ", user=" + user + "]";
	}

   
}
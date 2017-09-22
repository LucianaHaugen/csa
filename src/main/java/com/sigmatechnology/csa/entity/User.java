package com.sigmatechnology.csa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by lucianahaugen on 31/08/17.
 */
@Entity
public class User {

	@Id
	@Column(name = "user_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column(name = "user_name")
    private String userName;
    private String password;
    @Column(name = "is_approved")
    private boolean isApproved;
    @Column(name = "total_bookings_year")
    private Integer totalBookingsYear;
    @Column(name = "total_distance_year")
    private Double totalDistanceYear;
    
    
    
	public User() {
		
	}

	public User(Long userId, String userName, String password, boolean isApproved, Integer totalBookingsYear,
			Double totalDistanceYear) {
		this.id = userId;
		this.userName = userName;
		this.password = password;
		this.isApproved = isApproved;
		this.totalBookingsYear = totalBookingsYear;
		this.totalDistanceYear = totalDistanceYear;
	}

	public Long getUserId() {
		return id;
	}

	public void setUserId(Long userId) {
		this.id = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public Integer getTotalBookingsYear() {
		return totalBookingsYear;
	}

	public void setTotalBookingsYear(Integer totalBookingsYear) {
		this.totalBookingsYear = totalBookingsYear;
	}

	public Double getTotalDistanceYear() {
		return totalDistanceYear;
	}

	public void setTotalDistanceYear(Double totalDistanceYear) {
		this.totalDistanceYear = totalDistanceYear;
	}

	

	@Override
	public String toString() {
		return "User [userId=" + id + ", userName=" + userName + ", password=" + password + ", isApproved="
				+ isApproved + ", totalBookingsYear=" + totalBookingsYear + ", totalDistanceYear=" + totalDistanceYear
				+ "]";
	}
    
    
    
}

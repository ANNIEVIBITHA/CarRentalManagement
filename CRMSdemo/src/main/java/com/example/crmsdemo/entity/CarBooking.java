package com.example.crmsdemo.entity;


import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class CarBooking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="contactno")
	private String contactNo;
	
	@Column(name="booking_date")
	private Date bookingDate;
	
	@Column(name="pickup_time")
	private LocalTime pickupTime;

	
	public CarBooking() {
		super();
	}


	public CarBooking(int id, String firstName, String lastName, String contactNo, Date bookingDate,
			LocalTime pickupTime) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.bookingDate = bookingDate;
		this.pickupTime = pickupTime;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public Date getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	public LocalTime getPickupTime() {
		return pickupTime;
	}


	public void setPickupTime(LocalTime pickupTime) {
		this.pickupTime = pickupTime;
	}


	@Override
	public String toString() {
		return "CarBooking [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contactNo="
				+ contactNo + ", bookingDate=" + bookingDate + ", pickupTime=" + pickupTime + "]";
	}

	


}

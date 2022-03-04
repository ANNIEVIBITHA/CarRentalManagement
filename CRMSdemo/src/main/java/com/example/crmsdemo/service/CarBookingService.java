package com.example.crmsdemo.service;

import java.util.List;

import com.example.crmsdemo.entity.CarBooking;
import com.example.crmsdemo.entity.CarDetails;

    public interface CarBookingService {

    public List<CarDetails> findAll();
	
	public CarDetails findByCarName(int theCarName);
	
	public void book(CarBooking carBooking);
  
}

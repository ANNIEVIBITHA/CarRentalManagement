package com.example.crmsdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crmsdemo.entity.CarBooking;

public interface CarBookingRepository  extends JpaRepository<CarBooking, Integer>{

}

package com.example.crmsdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crmsdemo.entity.CarDetails;

public interface CarDetailsRepository extends JpaRepository<CarDetails, Integer> {

	CarDetails save(int theCarId);
	

}

package com.example.crmsdemo.service;

import java.sql.Blob;
import java.util.List;
//import org.springframework.web.multipart.MultipartFile;

import com.example.crmsdemo.entity.CarDetails;


public interface AdminService  {

	
	public List<CarDetails> findAll();
	
	public void deleteById(int theCarId);
	
	public CarDetails updateCar(int theCarId);

	public void save(int carId ,Blob image, String carName, int carPrice, int seater, String description);


	   
}

package com.example.crmsdemo.service;


import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
//import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//import org.springframework.web.multipart.MultipartFile;

import com.example.crmsdemo.dao.CarDetailsRepository;

import com.example.crmsdemo.entity.CarDetails;


@Service
public class AdminServiceImpl implements AdminService {
	
	 @Autowired
	    JdbcTemplate template;

	@Autowired
	private CarDetailsRepository carDetailsRepository;
	
	@Autowired
	public AdminServiceImpl(CarDetailsRepository theCarDetailsRepository) {
		
		carDetailsRepository = theCarDetailsRepository;
	}
	
	
	
	@Override
	public void deleteById(int theCarId) {
		// TODO Auto-generated method stub

	}

	@Override
	public CarDetails updateCar(int theCarId) {
		// TODO Auto-generated method stub
		return carDetailsRepository.save(theCarId);
	}

	@Override
	public void save(int carId ,Blob image, String carName, int carPrice, int seater, String description) {
		// TODO Auto-generated method stub
		 
	     CarDetails c = new CarDetails();
//	     String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//	     if(fileName.contains(".."))
//	     {
//	    	 System.out.println("not a valid file");
//	     }
//	     try {
//			c.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
//		} catch (IOException e) {
//		
//			e.printStackTrace();
//		}
	     
	     c.setDescription(description);
	     c.setCarName(carName);
	     c.setCarPrice(carPrice);
	     c.setSeater(seater);
	     c.setImage(image);
	     
	     carDetailsRepository.save(c);
	     
	     
	     
	   
	}



	@Override
	public List<CarDetails> findAll() {
		// TODO Auto-generated method stub
		
		String sql = "select * from carDetails";
		
		RowMapper<CarDetails> rm = new RowMapper<CarDetails>() {

			@Override
			public CarDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				CarDetails car = new CarDetails(rs.getInt("carId"),rs.getString ("carName"), rs.getInt("carPrice") , rs.getInt("seater") , rs.getString("description") ,rs.getBlob("image"));
				
				return car;
			}
		
		};
		
		return template.query(sql, rm);
		
	}

   	

	

	

	
	

}

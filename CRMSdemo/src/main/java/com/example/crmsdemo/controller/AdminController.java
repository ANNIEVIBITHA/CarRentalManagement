package com.example.crmsdemo.controller;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;

import com.example.crmsdemo.entity.CarDetails;
import com.example.crmsdemo.service.AdminService;

@Controller
@RequestMapping("users")
public class AdminController {
	
	@Autowired
    private AdminService adminService;
	
     public AdminController (AdminService theAdminService) {
		
		adminService = theAdminService;
	}   
     
  
	@GetMapping("/cardetails")
	public String listcars(Model theModel) {
		
		

	  List<CarDetails> theCarDetails = adminService.findAll();
		
		
		theModel.addAttribute("cardetailss", theCarDetails);
		
		return "users/cardetails";
	}
	
	
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
	      CarDetails theCarDetails    = new CarDetails();
		
		theModel.addAttribute("cardetails", theCarDetails);
		
		return "users/carupdate";
	}

	@PostMapping("/carUpdate")
	public String showFormForUpdate(@RequestParam("carDetails") int theCarId,Model theModel) {
		
		// get the employee from the service
		CarDetails theCarDetails = adminService.updateCar(theCarId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("cardetailss", theCarDetails);
		
		// send over to our form
		return "users/carupdate";			
	}
	
	@GetMapping("/showFormForAdd")
	public String addcar(@RequestParam("image")Blob image,
			@RequestParam("carid") int carId,
			@RequestParam("carname") String carname,
			@RequestParam("carprice") int price,
			@RequestParam("seater") int seater,
			@RequestParam("description") String description)
	{
		adminService.save(carId,image,  carname, price, seater, description);
		return "users/cardetails";
	}
	

	
	
	@PostMapping("/delete")
	public String delete(@RequestParam("carId") int theCarId) {
		
		// delete the employee
		adminService.deleteById(theCarId);
		
		// redirect to /employees/list
		return "redirect:/users/cardetails";
		
	}

}

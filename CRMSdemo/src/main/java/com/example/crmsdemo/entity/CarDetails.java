package com.example.crmsdemo.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="cardetails")
public class CarDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="carid")
	private int carId;
	
	@Column(name="carname")
	private String carName;
	
	@Column(name="carprice")
	private int carPrice;
	
	private int seater;
	
	private String description;

	//@Column(columnDefinition = "MEDIUMBLOB")
	private Blob image;

	public CarDetails() {
		super();
	}

	public CarDetails(int carId, String carName, int carPrice, int seater, String description, Blob image) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carPrice = carPrice;
		this.seater = seater;
		this.description = description;
		this.image = image;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public int getSeater() {
		return seater;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public Blob getImage() {
		return image;
	}

	public void setImage(Blob string) {
		this.image = string;
	}

	@Override
	public String toString() {
		return "CarDetails [carId=" + carId + ", carName=" + carName + ", carPrice=" + carPrice + ", seater=" + seater
				+ ", description=" + description + ", image=" + image + "]";
	}
	
}

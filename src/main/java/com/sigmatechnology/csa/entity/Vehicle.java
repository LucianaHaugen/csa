package com.sigmatechnology.csa.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.ImageIcon;
/**
 * Created by lucianahaugen on 31/08/17.
 */

@Entity
public class Vehicle {
	
	@Id
	@Column(name="vehicle_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vehicleId;
	private String reg;
	private Integer year;
	private Double mileage;
	private String body;
	private String equipment;
	private String model;
	private String fuel;
	private String site;
	private String responsible;
	private ImageIcon vehicleImage;
	private Boolean isAvaliable;
	private String vehicleImageLink;
	
	
	public Vehicle() {
	}
	
	public Vehicle(Long vehicleId, String reg, Integer year, Double mileage, String body, String equipment,
			String model, String fuel, String site, String responsible, Boolean isAvaliable) {
		super();
		this.vehicleId = vehicleId;
		this.reg = reg;
		this.year = year;
		this.mileage = mileage;
		this.body = body;
		this.equipment = equipment;
		this.model = model;
		this.fuel = fuel;
		this.site = site;
		this.responsible = responsible;
		this.isAvaliable = isAvaliable;
		this.vehicleImageLink = "/csa/src/main/resources/images/vehicle/"+reg+".jpg";
		this.vehicleImage = new ImageIcon(getClass().getResource(vehicleImageLink));
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getMileage() {
		return mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public Boolean getIsAvaliable() {
		return isAvaliable;
	}

	public void setIsAvaliable(Boolean isAvaliable) {
		this.isAvaliable = isAvaliable;
	}
	
	public String getVehicleImageLink() {
		return vehicleImageLink;
	}

	public void setVehicleImageLink(String vehicleImageLink) {
		this.vehicleImageLink = vehicleImageLink;
	}

	public ImageIcon getVehicleImage() {
		return vehicleImage;
	}

	public void setVehicleImage(ImageIcon vehicleImage) {
		this.vehicleImage = vehicleImage;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", reg=" + reg + ", year=" + year + ", mileage=" + mileage
				+ ", body=" + body + ", equipment=" + equipment + ", model=" + model + ", fuel=" + fuel + ", site="
				+ site + ", responsible=" + responsible + ", vehicleImage=" + vehicleImage + ", isAvaliable="
				+ isAvaliable + ", vehicleImageLink=" + vehicleImageLink + "]";
	}

	
	

}

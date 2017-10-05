package com.sigmatechnology.csa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sigmatechnology.csa.entity.Vehicle;
import com.sigmatechnology.csa.service.VehicleService;

/**
 * Created by lucianahaugen on 05/09/17.
 */

@RestController
@RequestMapping("/api/csa")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;

	@GetMapping("/vehicles")
	public List<Vehicle> getAllVehicles(){
		return vehicleService.getAll();
	}
	
	@GetMapping("/vehicles/free")
	public List<Vehicle> getAvaliableVehicles(){
		return vehicleService.getAvaliableVehicles();
	}
	
	@GetMapping("/vehicles/{id}")
	public Vehicle getVehicle(@PathVariable Long id) {
		return vehicleService.getVehicle(id);
	}
	
	@GetMapping("/vehicles/reg/{reg}")
	public Vehicle getVehicleByReg(@PathVariable String reg) {
		return vehicleService.getVehicleByReg(reg);
	}
	
	@GetMapping("/vehicles/site/{site}")
	public List<Vehicle> getVehiclesBySite(@PathVariable String site) {
		return vehicleService.getVehiclesBySite(site);
	}
	
	@GetMapping("/vehicles/responsible/{responsible}")
	public List<Vehicle> getVehicleByResponsible(@PathVariable String responsible){
		return vehicleService.getVehicleByResponsible(responsible);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/vehicles")
	public void addVehicle(@RequestBody Vehicle vehicle) {
		vehicleService.createVehicle(vehicle);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/vehicles/{id}")
	public void updateVehicle(@RequestBody Vehicle vehicle, @PathVariable long id) {
		vehicleService.updateVehicle(id, vehicle);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/vehicle/{id}")
	public void deleteVehicle(@PathVariable long id) {
		vehicleService.deleteVehicle(id);
	}

}

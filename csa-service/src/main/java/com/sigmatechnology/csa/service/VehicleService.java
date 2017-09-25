package com.sigmatechnology.csa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmatechnology.csa.entity.Vehicle;
import com.sigmatechnology.csa.repository.VehicleRepository;

/**
 * Created by lucianahaugen on 05/09/17.
 */
@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;

	
	public List<Vehicle> getAll(){
		List<Vehicle> vehiclesList = new ArrayList<>();
		vehicleRepository.findAll().forEach(vehiclesList::add);
		return vehiclesList;
	}
	
	public Vehicle getVehicle(Long id) {
		return vehicleRepository.findOne(id);
	}

	public void createVehicle(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}

	public void updateVehicle(long id, Vehicle vehicle) {
		List<Vehicle> vehiclesList = new ArrayList<>();
		vehicleRepository.findAll().forEach(vehiclesList::add);
		for(Vehicle olderVehicle:vehiclesList) {
			if(olderVehicle.getVehicleId()==id) {
				vehicleRepository.save(vehicle);
				return;
			}
		}
	}

	public void deleteVehicle(long id) {
		vehicleRepository.delete(id);
	}
	
	public Vehicle getVehicleByReg(String reg){
		return vehicleRepository.findByReg(reg);
	}
	
	public List<Vehicle> getVehiclesBySite(String site){
		return vehicleRepository.findBySite(site);
	}
	
	public List<Vehicle> getVehicleByResponsible(String responsible){
		return vehicleRepository.findByResponsible(responsible);
	}

	public List<Vehicle> getAvaliableVehicles(){
		return vehicleRepository.findByIsAvaliable(true);
	}
	
	public List<Vehicle> getUnavaliableVehicles(){
		return vehicleRepository.findByIsAvaliable(false);
	}
}

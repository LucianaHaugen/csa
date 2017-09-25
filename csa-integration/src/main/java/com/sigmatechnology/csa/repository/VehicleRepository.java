package com.sigmatechnology.csa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sigmatechnology.csa.entity.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long>{

	public Vehicle findByReg(String reg);
	
	public List<Vehicle> findBySite(String site);
	
	public List<Vehicle> findByResponsible(String responsible);
	
	public List<Vehicle> findByIsAvaliable(Boolean isAvaliable);
}

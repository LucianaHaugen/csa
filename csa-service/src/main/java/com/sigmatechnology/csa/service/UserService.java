package com.sigmatechnology.csa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmatechnology.csa.entity.User;
import com.sigmatechnology.csa.repository.UserRepository;

/**
 * Created by lucianahaugen on 31/08/17.
 */
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	
	public List<User> getAll(){
		List<User> usersList = new ArrayList<>();
		userRepository.findAll().forEach(usersList::add);
		return usersList;
	}
	
	public User getUser(Long id) {
		return userRepository.findOne(id);
	}

	public void createUser(User user) {
		userRepository.save(user);
	}

	public void updateUser(long id, User user) {
		List<User> usersList = new ArrayList<>();
		userRepository.findAll().forEach(usersList::add);
		for(User olderUser:usersList) {
			if(olderUser.getUserId()==id) {
				userRepository.save(user);
				return;
			}
		}
		
	}

	public void deleteUser(long id) {
		userRepository.delete(id);
	}

	//TODO: NOVO
	public void save(User user) {
		userRepository.save(user);
		
	}


}

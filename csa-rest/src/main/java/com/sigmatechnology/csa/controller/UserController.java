package com.sigmatechnology.csa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sigmatechnology.csa.entity.User;
import com.sigmatechnology.csa.service.UserService;

/**
 * Created by lucianahaugen on 05/09/17.
 */

/**
 * @author lucianahaugen
 * Return a JSON payload from user REST API endpoint 
 * by returning objects from user Spring MVC com.sigmatechnology.csa.controller method.
 */

@RestController
@RequestMapping("/api/csa")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable long id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody User user) {
		userService.createUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable long id) {
		userService.updateUser(id, user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public void deleteUser(@PathVariable long id) {
		userService.deleteUser(id);
	}

}

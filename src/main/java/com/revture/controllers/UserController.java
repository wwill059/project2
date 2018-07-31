package com.revture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.UserService;

@RestController
@RequestMapping(path="/user")
public class UserController {

	
	 @Autowired 
	private UserService userService;
	   //private XyzService xyzService;
	
	
	
//	@RequestMapping(value="/list", method=RequestMethod.get)
//	public ResponseEntity<List<T>> t() {
//		
//	}
	    // Get All Notes

	    // Create a new Note

	    // Get a Single Note

	    // Update a Note

	    // Delete a Note
	
	
}

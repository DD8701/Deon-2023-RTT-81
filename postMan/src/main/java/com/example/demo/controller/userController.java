package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class userController {
	
	@PostMapping("/user")
	   public void printData(@RequestBody User user) {
		//return user;
	   System.out.println("Printing the user data:"+user);
	   }
}

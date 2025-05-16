package com.spring2.security2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring2.security2.model.User;
import com.spring2.security2.service.Jwtservice;
import com.spring2.security2.service.UserService;
@RestController
public class UserController {
	@Autowired
	private UserService service;
	@Autowired
	AuthenticationManager authenticationmanager;
	@Autowired
	private Jwtservice jwtservice;
	@PostMapping("register")
	public User register(@RequestBody User user) {
		return service.saveuser(user);
	}
	@PostMapping("login")
	public String login(@RequestBody User user) {
		
		org.springframework.security.core.Authentication authentication  = authenticationmanager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		if(authentication.isAuthenticated()) 
			return jwtservice.generateToken(user.getUsername());
		else
			return "login failed";
		
	}
	
}

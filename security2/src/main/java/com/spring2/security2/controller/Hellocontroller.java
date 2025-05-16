package com.spring2.security2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Hellocontroller {
	@GetMapping("hello")
	public String hello(HttpServletRequest req) {
		return "hello world"+ req.getSession().getId() ;
	}

}

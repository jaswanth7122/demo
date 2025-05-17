package com.spring3.web3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring3.web3.model.Jobpost;
import com.spring3.web3.service.Jobservice;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Jobcontroller {
	private Jobservice service;
@GetMapping("jobposts")
public List<Jobpost> getalljobs(Jobpost jobpost){
	return service.getalljobs();
}
@PostMapping("jobpost/3")
public Jobpost getJob() {
    //TODO: process POST request
    
    return service.getJob(3);
}

}

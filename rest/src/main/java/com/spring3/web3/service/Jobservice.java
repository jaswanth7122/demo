package com.spring3.web3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring3.web3.model.Jobpost;
import com.spring3.web3.repo.Jobrepo;
@Service
public class Jobservice {
	@Autowired
	private Jobrepo repo;
	public void addjob(Jobpost jobpost) {
		repo.addjob(jobpost);
		
	}
	public List<Jobpost> getalljobs(){
		return repo.getalljobs();
		
	}
	public Jobpost getJob(int postid) {
		// TODO Auto-generated method stub
		return repo.getJob(postid);
	}
	
}

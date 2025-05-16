
package com.spring2.security2.service;

import java.nio.file.attribute.UserPrincipal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring2.security2.model.User;
import com.spring2.security2.repo.UserRepo;

@Service
public class Myuserdetailsservices implements UserDetailsService {
	@Autowired
	private UserRepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = repo.findByUsername(username);
		if(user == null) {
			System.out.println("User 404");
			throw new UsernameNotFoundException("user 404");
		}
		
		return new  com.spring2.security2.model.UserPrincipal(user);
		
	}

}

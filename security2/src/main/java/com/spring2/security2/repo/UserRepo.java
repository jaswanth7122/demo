package com.spring2.security2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring2.security2.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
		User findByUsername(String username);

	
}

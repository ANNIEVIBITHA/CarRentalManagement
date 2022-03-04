package com.example.crmsdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crmsdemo.entity.Users;

public interface UsersRepository extends JpaRepository<Users,Integer> {
	
	


}

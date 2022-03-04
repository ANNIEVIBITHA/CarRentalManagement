package com.example.crmsdemo.service;

//import java.util.Collection;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.crmsdemo.dao.LoginRepository;
//import com.example.crmsdemo.entity.Role;
import com.example.crmsdemo.entity.Users;
//import com.example.crmsdemo.exception.UsernameNotFoundException;

//import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class LoginServiceImpl implements LoginService {

	
	private LoginRepository loginRepository;
	
	
	@Lazy
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	public LoginServiceImpl(LoginRepository theLoginRepository) {
	
		loginRepository = theLoginRepository;
	}
	
	@Override
	public void findbyId(int roleId ) {
		// TODO Auto-generated method stub
		loginRepository.findById(roleId);
	
	}

	@Override
	public void save(Users theUsers) {
		// TODO Auto-generated method stub
		
		loginRepository.save(theUsers);
	}
	
	
	@Override
	public Users login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void findbyUsername(String username) {
		
		loginRepository.findbyUsername(username);
		 		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
		
}

	

	



package com.example.crmsdemo.service;


import org.springframework.security.core.userdetails.UserDetailsService;

//import org.springframework.security.core.userdetails.UserDetails;

import com.example.crmsdemo.entity.Users;

public interface LoginService extends UserDetailsService {

  public void findbyId(int roleId);
  
  public void save(Users theUsers);
  
  public Users login(String username,String password);
  
  public void findbyUsername(String username);
}

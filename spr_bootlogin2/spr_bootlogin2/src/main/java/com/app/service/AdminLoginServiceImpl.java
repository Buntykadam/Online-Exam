package com.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.AdminLogin;
import com.app.repo.AdminLoginRepository;



@Service
@Transactional
public class AdminLoginServiceImpl implements AdminLoginService {
     
	@Autowired
	AdminLoginRepository adminloginrepo;
     
	@Override
	public AdminLogin findAdmin(String uname) {
		
	return adminloginrepo.findUserByUname(uname);
	}
}
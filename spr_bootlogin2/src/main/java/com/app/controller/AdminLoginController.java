package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.AdminLogin;
import com.app.service.AdminLoginService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/adminRest/api")
public class AdminLoginController {
    @Autowired
    AdminLoginService adminloginservice;
    @GetMapping("/validate/{uname}/{upass}")
	public int validateAdmin(@PathVariable(value="uname") String uname,@PathVariable(value="upass") String upass) {
    	AdminLogin a;
    	a=adminloginservice.findAdmin(uname) ;
		if(a==null) {
//			username does not exist
			
			return 3;
		}
		else if(a.getUpass().equals(upass)) {
//			correct password
			return 2;
		}
//		wrong credentials
		else
		return 1;
	}
}


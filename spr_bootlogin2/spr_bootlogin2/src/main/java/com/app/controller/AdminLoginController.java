package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.QuestionsDTO;
import com.app.model.AdminLogin;

import com.app.model.Question;
import com.app.service.AdminLoginService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/adminRest/api")
public class AdminLoginController {
    @Autowired
    AdminLoginService adminloginservice;
    @GetMapping("/validate/{uname}/{upass}")
	public String validateAdmin(@PathVariable(value="uname") String uname,@PathVariable(value="upass") String upass) {
    	AdminLogin a;
    	a=adminloginservice.findAdmin(uname) ;
		if(a==null) {

			
			return "user does not exist";
		}
		else if(a.getUpass().equals(upass)) {

			return "login successful";
		}

		else
		return "Wrong credentials";
	}
    

}



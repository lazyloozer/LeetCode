package com.example.shopnest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.shopnest.entity.User;
import com.example.shopnest.serviceimpl.Userserviceimpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	Userserviceimpl Userserviceimpl;
	
	@PostMapping("/register")
	public String adduser(@ModelAttribute User user) {
		Userserviceimpl.addUser(user);
		
		return "registration";
		
	}



	@PostMapping("/login")
	public String validate(@RequestParam(value="email",required=false) String email,
			@RequestParam(value="password",required=false) String password, HttpSession session, Model model) {
		if(Userserviceimpl.vaildateUser(email, password)==true) {
			String role = Userserviceimpl.getRole(email);
			if(role.equalsIgnoreCase("admin")) {
				session.setAttribute("msg", "Login Succesfully");
				return "home";

			}
			else {
				
			return "customer";
			}
		}	
		else {

		return "registration";
		}
		}

@PostMapping("/newforgotpassword")
public String newforgotpassword() {
	return "newforgotpassword";
}

	
	}



package com.example.shopnest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
@Controller
public class NavController {
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	
	}

	@GetMapping("/register")

	public String registration(){
		return "registration";
		
	}
	@GetMapping("/forgotpassword")
	public String forgotpassword() {
		return "forgotpassword";
		
	}

@GetMapping("/newforgotpassword")
public String newforgotpassword() {
	return "newforgotpassword";
}
@GetMapping("/about")
public String About() {
	return "About";
}
@GetMapping("/logout")
public String logout(HttpSession session) {
	session.invalidate();
	
	return "index";
}
@GetMapping("/chome")
public String chome() {
	
	return "chome";

}
@GetMapping("/ahome")
public String ahome() {
	
	return "ahome";

}
@GetMapping("/shopping")
public String shopping() {
	
	return "login";
}}
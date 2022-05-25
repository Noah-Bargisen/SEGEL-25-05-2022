package com.spring.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class WebController {
	@GetMapping("/home")
	public ModelAndView allAccess() {
		ModelAndView mav = new ModelAndView("../index.html");
		return mav;	
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String adminAccess() {
		ModelAndView mav = new ModelAndView("../signup.html");
		return "Admin";
	}
}

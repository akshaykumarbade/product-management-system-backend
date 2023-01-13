package com.codemonk96.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.codemonk96.model.User;
import com.codemonk96.service.UserServiceImp;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	
	@Autowired UserServiceImp userService;
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody User newUser){
		
		return new ResponseEntity<>(userService.register(newUser), HttpStatus.CREATED);
	}
	
	@GetMapping("/login")
	public ModelAndView login() {
	     ModelAndView mav = new ModelAndView("login");
	        mav.addObject("user", new User());
	        return mav;
	    }
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User user) throws Exception {
		
		System.out.println(user.getUsername());
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.login(user.getUsername(), user.getPassword()));
		
//		if(userLogin.equals(user)) {
//			return "logged in";
//		}else {
//			return "logg in failed";
//		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		
		return "redirect:/login";
		
	}
}

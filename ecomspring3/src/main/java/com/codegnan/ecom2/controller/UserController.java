package com.codegnan.ecom2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@GetMapping
    public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("Hi User");
	}

}

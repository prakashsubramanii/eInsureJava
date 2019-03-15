package com.hackathon.einsure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policies/")
@CrossOrigin
public class PolicyController {

	@GetMapping
	public ResponseEntity<Object> getAllPolicies() {
		return null;
	}

	@GetMapping("{id}")
	public ResponseEntity<Object> getPolicyDetails(@PathVariable Integer id) {
		return null;
	}
	
	@PostMapping("{id}")
	public ResponseEntity<Object> optPolicy(@PathVariable Integer id) {
		return null;
	}

}

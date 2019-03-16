package com.hackathon.einsure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.einsure.model.Policy;
import com.hackathon.einsure.service.PolicyService;

@RestController
@RequestMapping("/policies/")
@CrossOrigin
public class PolicyController {
	@Autowired
	PolicyService policyService;

	@GetMapping
	public ResponseEntity<List<Policy>> getAllPolicies() {
		return new ResponseEntity<List<Policy>>(policyService.getPolicies(),HttpStatus.OK);
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

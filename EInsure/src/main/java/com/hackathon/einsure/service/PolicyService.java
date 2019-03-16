package com.hackathon.einsure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.einsure.model.Policy;
//import com.hackathon.einsure.model.PolicyDetails;
//import com.hackathon.einsure.repository.PolicyDetailsRepository;
import com.hackathon.einsure.repository.PolicyRepository;



@Service
public class PolicyService {
	@Autowired
	PolicyRepository policyRepository;
	
	/*@Autowired
	PolicyDetailsRepository policyDetailsRepository;*/

	public List<Policy> getPolicies() {
		return policyRepository.findAll();
	}
	
	
}

package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.FlightDetails;
import com.example.demo.repos.AirlineRepository;

@Service
public class AirlineService {
	
	@Autowired
	AirlineRepository repo;

	public FlightDetails save(FlightDetails entity) {
		return repo.save(entity);
	}
	
	public Iterable<FlightDetails> findAll() {
		return repo.findAll();
	}
}

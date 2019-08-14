package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.FlightDetails;
import com.example.demo.services.AirlineService;

@RestController
public class AirlineReservationController {

	@Autowired
	private AirlineService service;
	
	@PostMapping(value="/payments", produces="application/json")
	public FlightDetails add(FlightDetails entity) {
		
		return this.service.save(entity);
	}
}

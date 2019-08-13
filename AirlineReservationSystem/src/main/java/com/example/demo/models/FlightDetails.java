package com.example.demo.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightDetails {
	
	private String planeName;
	private int flightNumber;
	private double price;
	private double timeOfFlight;
	private Date departureDate;
	private Date arrivalDate;
	
}

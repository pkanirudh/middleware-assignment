package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="flight_details")
@Component
public class FlightDetails {
	
	@Id
	private int flightNumber;
	private String planeName;
	private double price;
	private double timeOfFlight;
	private Date departureDate;
	private Date arrivalDate;
	
}

package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="flight_details")
@Component
public class UserDetails {
	
	@Id
	private String bookingId;
	private String userName;
	private String userAddress;
	private String city;
	private String state;
	private String phone;
}

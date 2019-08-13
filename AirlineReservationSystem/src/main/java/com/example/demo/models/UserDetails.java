package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
	
	private String bookingId;
	private String userName;
	private String userAddress;
	private String city;
	private String state;
	private String phone;
}

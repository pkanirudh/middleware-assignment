package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.FlightDetails;

@Repository
public interface AirlineRepository extends CrudRepository<FlightDetails, String> {

}

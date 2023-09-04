package com.delta_airlines.service;


import com.delta_airlines.dto.ReservationRequest;
import com.delta_airlines.entity.Reservation;


public interface ReservationService {
	
	Reservation bookFlight(ReservationRequest request);

}

package com.delta_airlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.delta_airlines.dto.ReservationRequest;
import com.delta_airlines.entity.Reservation;
import com.delta_airlines.service.ReservationService;

@Controller
public class ReservationController {
	
	
	private final ReservationService reservationService;
	
	
	@Autowired
	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation reservationsaved = reservationService.bookFlight(request);
		modelMap.addAttribute("reservationsaved", reservationsaved.getId());
		return "login/confirmReservation";
	}
	

}

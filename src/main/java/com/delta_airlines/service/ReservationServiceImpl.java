package com.delta_airlines.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delta_airlines.dto.ReservationRequest;
import com.delta_airlines.entity.Flight;
import com.delta_airlines.entity.Passenger;
import com.delta_airlines.entity.Reservation;
import com.delta_airlines.repository.FlightRepository;
import com.delta_airlines.repository.PassengerRepository;
import com.delta_airlines.repository.ReservationRepository;
import com.delta_airlines.utilities.EmailServiceimpl;
import com.delta_airlines.utilities.PDFgenerator;
import com.delta_airlines.utilities.SmsSender;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Autowired
	private PDFgenerator pdfGenerator;
	
	@Autowired
	private EmailServiceimpl emailServiceImpl;
	
	@Autowired
	private SmsSender smsSender;
	
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
//		String firstName=request.getFirstName();
//		String lastName=request.getLastName();
//		String middleName=request.getMiddleName();
//		String email=request.getEmail();
//		String phone=request.getPhone();
		
		
		
		Passenger passenger =new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		
		passengerRepository.save(passenger);
		
		
		long flightId = request.getFlightId();
		 Optional<Flight> findById = flightRepository.findById(flightId);
		 Flight flight = findById.get();
		 
		 
		 Reservation reservation=new Reservation();
		 reservation.setFlight(flight);
		 reservation.setPassenger(passenger);
		 reservation.setCheckedIn(false);
		 reservation.setNumberOfBags(0);
		 
		 
		 String filePath="F:\\sts workspace\\delta_airlines\\Tickets\\reservation"+reservation.getId()+".pdf";
		 
		 Reservation saved = reservationRepository.save(reservation);
		 

		 pdfGenerator.generateItinerary(reservation, filePath);
		 emailServiceImpl.sendEmail(passenger.getEmail(),filePath);
		 smsSender.sendSMS(passenger.getPhone());
		 
		return saved;
	}

}

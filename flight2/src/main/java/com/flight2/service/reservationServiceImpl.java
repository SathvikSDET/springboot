package com.flight2.service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight2.Repository.fligthRepository;
import com.flight2.Repository.passengerRepository;
import com.flight2.Repository.reservationRepository;
import com.flight2.dto.Reservationrequest;
import com.flight2.entitiy.fligth;

import com.flight2.entitiy.passenger;
import com.flight2.entitiy.reservation;


@Service
public class reservationServiceImpl implements reservationService {
	
	@Autowired
	passengerRepository passengerRepository;
	
	@Autowired
	fligthRepository fligthRepository;
	
	
	@Autowired
	reservationRepository repository;
	
	
	
	@Override
	public reservation bookFligth(Reservationrequest request) {
		
		
		Optional<fligth> findById = fligthRepository.findById(request.getId());
		fligth fligth = findById.get();
		
		
		
		passenger passenger =new passenger();
		passenger.setFirstname(request.getFirstname());
		passenger.setLastname(request.getLastname());
		passenger.setMiddlename(request.getMiddlename());
		passenger.setEmailid(request.getEmailid());
		passenger.setPhone(request.getPhone());
		passengerRepository.save(passenger);
		
		
		
		
		
		
		reservation reservation= new reservation();
		reservation.setFligth(fligth);
		reservation.setPassenger(passenger);
		reservation.setCheckedin(false);
		reservation.setNumberofbags(2);
		repository.save(reservation);
		
		
		
		
		return reservation;
		
	}
}

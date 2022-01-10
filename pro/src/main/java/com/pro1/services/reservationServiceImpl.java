package com.pro1.services;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro1.Repository.fligthRepository;
import com.pro1.Repository.passengerRepository;
import com.pro1.Repository.reservationRepository;
import com.pro1.dto.Reservationrequest;
import com.pro1.entity.fligth;
import com.pro1.entity.passenger;
import com.pro1.entity.reservation;




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
		passenger.setEmail(request.getEmailid());
		passenger.setPhone(request.getPhone());
		passengerRepository.save(passenger);
		
		
		
		
		
		
		reservation reservation= new reservation();
		reservation.setFligthid(fligth);
		reservation.setPassengerid(passenger);
		reservation.setCheckedin(false);
		reservation.setNumberofbags(2);
		repository.save(reservation);
		
		
		
		
		return reservation;
		
	}
}

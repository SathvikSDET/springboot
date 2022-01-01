package com.flight2.service;

import com.flight2.dto.Reservationrequest;
import com.flight2.entitiy.reservation;

public interface reservationService {
	  reservation bookFligth(Reservationrequest request);

}

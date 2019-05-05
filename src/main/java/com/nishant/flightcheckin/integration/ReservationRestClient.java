package com.nishant.flightcheckin.integration;

import com.nishant.flightcheckin.integration.dto.Reservation;
import com.nishant.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
	

}

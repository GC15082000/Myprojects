package com.dto;

import java.util.Set;

public class TrainDTO {
	private int tId;
	private String tName;
	private Set<PassengerDTO> passenger;

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public Set<PassengerDTO> getPassenger() {
		return passenger;
	}

	public void setPassenger(Set<PassengerDTO> passenger) {
		this.passenger = passenger;
	}

}

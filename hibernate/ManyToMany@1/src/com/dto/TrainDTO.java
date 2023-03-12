package com.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="TrainDTO")
public class TrainDTO {
	@Id
	@Column(name="tId")
	private int tId;
	@Column(name="tName")
	private String tName;
	@ManyToMany(targetEntity=PassengerDTO.class,cascade=CascadeType.ALL)
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

package com.dto;

import java.util.Set;

public class PersonDTO {
	private int pID;
	private String pName;
	private String pCity;
	private Set<MovieTheatreDTO> MovieTheatre;

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCity() {
		return pCity;
	}

	public void setpCity(String pCity) {
		this.pCity = pCity;
	}

	public Set<MovieTheatreDTO> getMovieTheatre() {
		return MovieTheatre;
	}

	public void setMovieTheatre(Set<MovieTheatreDTO> movieTheatre) {
		MovieTheatre = movieTheatre;
	}

}

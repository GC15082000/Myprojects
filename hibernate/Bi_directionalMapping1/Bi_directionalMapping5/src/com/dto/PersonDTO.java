package com.dto;

public class PersonDTO {
	private int pID;
	private String pName; 
	private String pCity;
	private MovieTheatreDTO MovieTheatre;

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

	public MovieTheatreDTO getMovieTheatre() {
		return MovieTheatre;
	}

	public void setMovieTheatre(MovieTheatreDTO movieTheatre) {
		MovieTheatre = movieTheatre;
	}

	@Override
	public String toString() {
		return "PersonDTO [pID=" + pID + ", pName=" + pName + ", pCity=" + pCity + ", MovieTheatre=" + MovieTheatre
				+ "]";
	}
}

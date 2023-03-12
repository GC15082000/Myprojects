package com.dto;

public class PassengerDTO {
	private int pID;
	private String pName;
	private String pStation;
	private TrainDTO train;

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

	public String getpStation() {
		return pStation;
	}

	public void setpStation(String pStation) {
		this.pStation = pStation;
	}

	public TrainDTO getTrain() {
		return train;
	}

	public void setTrain(TrainDTO train) {
		this.train = train;
	}

}

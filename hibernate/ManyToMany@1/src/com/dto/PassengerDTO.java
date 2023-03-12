package com.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PassengerDTO")
public class PassengerDTO {
	@Id
	@Column(name="pID")
	private int pID;
	@Column(name="pname")
	private String pName;
	@Column(name="pStation")
	private String pStation;
	@ManyToMany(targetEntity=TrainDTO.class,cascade=CascadeType.ALL)
	private Set<TrainDTO> train;

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

	public Set<TrainDTO> getTrain() {
		return train;
	}

	public void setTrain(Set<TrainDTO> train) {
		this.train = train;
	}

	

}

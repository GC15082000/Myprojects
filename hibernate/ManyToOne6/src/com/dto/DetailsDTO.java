package com.dto;

public class DetailsDTO {
	private int dId;
	private int numOfPopulation;
	private String livesOn;
	private String name;
	private LivingOrganismDTO LivingOrganism;

	public LivingOrganismDTO getLivingOrganism() {
		return LivingOrganism;
	}

	public void setLivingOrganism(LivingOrganismDTO livingOrganism) {
		LivingOrganism = livingOrganism;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public int getNumOfPopulation() {
		return numOfPopulation;
	}

	public void setNumOfPopulation(int numOfPopulation) {
		this.numOfPopulation = numOfPopulation;
	}

	public String getLivesOn() {
		return livesOn;
	}

	public void setLivesOn(String livesOn) {
		this.livesOn = livesOn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DetailsDTO [dId=" + dId + ", numOfPopulation=" + numOfPopulation + ", livesOn=" + livesOn + ", name="
				+ name + ", LivingOrganism=" + LivingOrganism + "]";
	}

}

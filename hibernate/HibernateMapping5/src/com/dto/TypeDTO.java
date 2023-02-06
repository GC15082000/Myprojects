package com.dto;

public class TypeDTO {
	private int tId;
	private String tName;
	private int maxPlayer;

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public int getMaxPlayer() {
		return maxPlayer;
	}

	public void setMaxPlayer(int maxPlayer) {
		this.maxPlayer = maxPlayer;
	}

	@Override
	public String toString() {
		return "TypeDTO [tId=" + tId + ", tName=" + tName + ", maxPlayer=" + maxPlayer + "]";
	}
}

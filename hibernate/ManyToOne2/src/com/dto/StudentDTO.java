package com.dto;

public class StudentDTO {
	private int rollNo;
	private String sName;
	private String sAddress;
	private ClassDTO classDTO;

	public ClassDTO getClassDTO() {
		return classDTO;
	}

	public void setClassDTO(ClassDTO classDTO) {
		this.classDTO = classDTO;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	@Override
	public String toString() {
		return "StudentDTO [rollNo=" + rollNo + ", sName=" + sName + ", sAddress=" + sAddress + ", classDTO=" + classDTO
				+ "]";
	}

}

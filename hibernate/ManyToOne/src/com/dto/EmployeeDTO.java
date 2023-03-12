package com.dto;

public class EmployeeDTO {
	private int employeeId;
	private String name, email;
	private String address;
	private CompanyDTO Company;

	public CompanyDTO getCompany() {
		return Company;
	}

	public void setCompany(CompanyDTO company) {
		Company = company;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", Company=" + Company + "]";
	}

}

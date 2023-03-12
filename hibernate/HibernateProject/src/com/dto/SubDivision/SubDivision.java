package com.dto.SubDivision;

import java.util.Set;

import com.dto.Address.Address;
import com.dto.Division.Division;
import com.dto.Role.Role;

public class SubDivision {
	private Integer idSubDivision;
	private Division Division_idDivision;
	private String name;
	private Address Address_idAddress;
	private Set<Role> role;

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}

	public Integer getIdSubDivision() {
		return idSubDivision;
	}

	public void setIdSubDivision(Integer idSubDivision) {
		this.idSubDivision = idSubDivision;
	}

	public Division getDivision_idDivision() {
		return Division_idDivision;
	}

	public void setDivision_idDivision(Division division_idDivision) {
		Division_idDivision = division_idDivision;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress_idAddress() {
		return Address_idAddress;
	}

	public void setAddress_idAddress(Address address_idAddress) {
		Address_idAddress = address_idAddress;
	}

}

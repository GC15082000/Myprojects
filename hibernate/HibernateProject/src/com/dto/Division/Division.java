package com.dto.Division;

import java.util.Set;

import com.dto.Address.Address;
import com.dto.Circle.Circle;
import com.dto.Role.Role;

public class Division {
	private Integer idDivision;
	private Circle Circle_idCircle;
	private String name;
	private Address Address_idAddress;
	private Set<Role> role;

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}

	public Integer getIdDivision() {
		return idDivision;
	}

	public void setIdDivision(Integer idDivision) {
		this.idDivision = idDivision;
	}

	public Circle getCircle_idCircle() {
		return Circle_idCircle;
	}

	public void setCircle_idCircle(Circle circle_idCircle) {
		Circle_idCircle = circle_idCircle;
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

package com.dto.Circle;

import java.util.Set;

import com.dto.Address.Address;
import com.dto.Region.Region;
import com.dto.Role.Role;

public class Circle {
	private Integer idCircle;
	private Region Region_idRegion;
	private String name;
	private Address Address_idAddress;
	private Set<Role> role;

	public Integer getIdCircle() {
		return idCircle;
	}

	public void setIdCircle(Integer idCircle) {
		this.idCircle = idCircle;
	}

	public Region getRegion_idRegion() {
		return Region_idRegion;
	}

	public void setRegion_idRegion(Region region_idRegion) {
		Region_idRegion = region_idRegion;
	}

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
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

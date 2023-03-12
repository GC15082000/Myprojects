package com.dto.Distcenter_zone;

import java.util.Set;

import com.dto.Address.Address;
import com.dto.Role.Role;
import com.dto.SubDivision.SubDivision;

public class Distencentor_zone {
	private Integer idDistCenter;
	private SubDivision SubDivision_idSubDivision;
	private String name;
	private Address Address_idAddress;
	private Set<Role> role;

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}

	public Integer getIdDistCenter() {
		return idDistCenter;
	}

	public void setIdDistCenter(Integer idDistCenter) {
		this.idDistCenter = idDistCenter;
	}

	public SubDivision getSubDivision_idSubDivision() {
		return SubDivision_idSubDivision;
	}

	public void setSubDivision_idSubDivision(SubDivision subDivision_idSubDivision) {
		SubDivision_idSubDivision = subDivision_idSubDivision;
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

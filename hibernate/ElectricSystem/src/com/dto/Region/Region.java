package com.dto.Region;

import java.util.Set;

import com.dto.Address.Address;
import com.dto.Company.Company;
import com.dto.Role.Role;

public class Region {
	private Integer idRegion;
	private Company Company_idCompany;
	private String name;
	private Address Address_idAddress;
	private Set<Role> role;

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}

	public Integer getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}

	public Company getCompany_idCompany() {
		return Company_idCompany;
	}

	public void setCompany_idCompany(Company company_idCompany) {
		Company_idCompany = company_idCompany;
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

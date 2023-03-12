package com.dto.Company;

import java.util.Set;

import com.dto.Address.Address;
import com.dto.Role.Role;

public class Company {
	private Integer idCompany;
	private String name;
	private String initials;
	private Integer contact;
	private Address Address_idaddress;
	private Set<Role> role;

	public Integer getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(Integer contact) {
		this.contact = contact;
	}

	public Address getAddress_idaddress() {
		return Address_idaddress;
	}

	public void setAddress_idaddress(Address address_idaddress) {
		Address_idaddress = address_idaddress;
	}

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}
}

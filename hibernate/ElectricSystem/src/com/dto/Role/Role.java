package com.dto.Role;

import java.util.Set;

import com.dto.Circle.Circle;
import com.dto.Company.Company;
import com.dto.Distcenter_zone.Distencentor_zone;
import com.dto.Division.Division;
import com.dto.Region.Region;
import com.dto.SubDivision.SubDivision;
import com.dto.User.User;

public class Role {
	private Integer idRole;
	private Integer create;
	private Integer read;
	private Integer update;
	private Integer delete;
	private Integer execute;
	private String name;
	private String name_short;
	private Set<Company> company;
	private Set<User> user;
	private Set<Region> region;
	private Set<Circle> circle;
	private Set<Division> division;
	private Set<SubDivision> subdivision;
	private Set<Distencentor_zone> distencentor;

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	public Set<Region> getRegion() {
		return region;
	}

	public void setRegion(Set<Region> region) {
		this.region = region;
	}

	public Set<Circle> getCircle() {
		return circle;
	}

	public void setCircle(Set<Circle> circle) {
		this.circle = circle;
	}

	public Set<Division> getDivision() {
		return division;
	}

	public void setDivision(Set<Division> division) {
		this.division = division;
	}

	public Set<SubDivision> getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(Set<SubDivision> subdivision) {
		this.subdivision = subdivision;
	}

	public Set<Distencentor_zone> getDistencentor() {
		return distencentor;
	}

	public void setDistencentor(Set<Distencentor_zone> distencentor) {
		this.distencentor = distencentor;
	}

	public Set<Company> getCompany() {
		return company;
	}

	public void setCompany(Set<Company> company) {
		this.company = company;
	}

	public Integer getIdRole() {
		return idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}

	public Integer getCreate() {
		return create;
	}

	public void setCreate(Integer create) {
		this.create = create;
	}

	public Integer getRead() {
		return read;
	}

	public void setRead(Integer read) {
		this.read = read;
	}

	public Integer getUpdate() {
		return update;
	}

	public void setUpdate(Integer update) {
		this.update = update;
	}

	public Integer getDelete() {
		return delete;
	}

	public void setDelete(Integer delete) {
		this.delete = delete;
	}

	public Integer getExecute() {
		return execute;
	}

	public void setExecute(Integer execute) {
		this.execute = execute;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_short() {
		return name_short;
	}

	public void setName_short(String name_short) {
		this.name_short = name_short;
	}

}

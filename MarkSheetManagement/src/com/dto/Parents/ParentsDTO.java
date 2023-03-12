package com.dto.Parents;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.User.UserDTO;
@Entity
@Table(name="ParentsDTO")
public class ParentsDTO {
	@Id
	@Column(name="pid")
	private Integer pid;
	@Column(name="pname")
	private String pname;
	@Column(name="childname")
	private String childname;
	@Column(name="pCity")
	private String pCity;
	@OneToOne(targetEntity=UserDTO.class,cascade=CascadeType.ALL)
	private UserDTO user;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getChildname() {
		return childname;
	}

	public void setChildname(String childname) {
		this.childname = childname;
	}

	public String getpCity() {
		return pCity;
	}

	public void setpCity(String pCity) {
		this.pCity = pCity;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

}

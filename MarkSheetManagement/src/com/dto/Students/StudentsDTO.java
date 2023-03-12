package com.dto.Students;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.User.UserDTO;
@Entity
@Table(name="StudentDTO")
public class StudentsDTO {
	@Id
	@Column(name="sID")
	private Integer sID;
	@Column(name="sClass")
	private String sClass;
	@Column(name="sDepartment")
	private String sDepartment;
	@OneToOne(targetEntity=UserDTO.class,cascade=CascadeType.ALL)
	private UserDTO user;

	public Integer getsID() {
		return sID;
	}

	public void setsID(Integer sID) {
		this.sID = sID;
	}

	public String getsClass() {
		return sClass;
	}

	public void setsClass(String sClass) {
		this.sClass = sClass;
	}

	public String getsDepartment() {
		return sDepartment;
	}

	public void setsDepartment(String sDepartment) {
		this.sDepartment = sDepartment;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

}

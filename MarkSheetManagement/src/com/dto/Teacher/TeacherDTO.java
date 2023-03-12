package com.dto.Teacher;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.User.UserDTO;

@Entity
@Table(name = "TeacherDTO")
public class TeacherDTO {
	@Id
	@Column(name = "tid")
	private Integer tid;
	@Column(name = "tName")
	private String tName;
	@Column(name = "tphnumber")
	private String tphnumber;
	@Column(name = "tClass")
	private String tClass;
	@OneToOne(targetEntity = UserDTO.class, cascade = CascadeType.ALL)
	private UserDTO user;

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getTphnumber() {
		return tphnumber;
	}

	public void setTphnumber(String tphnumber) {
		this.tphnumber = tphnumber;
	}

	public String gettClass() {
		return tClass;
	}

	public void settClass(String tClass) {
		this.tClass = tClass;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

}

package com.dto.HOD;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.Result.ResultDTO;
import com.dto.Students.StudentsDTO;
import com.dto.Teacher.TeacherDTO;
import com.dto.User.UserDTO;

@Entity
@Table(name = "HODDTO")
public class HODDTO {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@OneToMany(targetEntity = StudentsDTO.class, cascade = CascadeType.ALL)
	private Set<StudentsDTO> stu;
	@OneToMany(targetEntity = TeacherDTO.class, cascade = CascadeType.ALL)
	private Set<TeacherDTO> adm;
	@OneToOne(targetEntity=UserDTO.class,cascade=CascadeType.ALL)
	private UserDTO user;
	@OneToMany(targetEntity = ResultDTO.class, cascade = CascadeType.ALL)
	private Set<ResultDTO> result;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<StudentsDTO> getStu() {
		return stu;
	}

	public void setStu(Set<StudentsDTO> stu) {
		this.stu = stu;
	}

	public Set<TeacherDTO> getAdm() {
		return adm;
	}

	public void setAdm(Set<TeacherDTO> adm) {
		this.adm = adm;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public Set<ResultDTO> getResult() {
		return result;
	}

	public void setResult(Set<ResultDTO> result) {
		this.result = result;
	}

}

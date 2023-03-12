package com.dto.Department;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dto.HOD.HODDTO;
import com.dto.Parents.ParentsDTO;
import com.dto.Students.StudentsDTO;
import com.dto.Teacher.TeacherDTO;

@Entity
@Table(name = "DepartmentDTO")
public class DepartmentDTO {
	@Id
	@Column(name = "ID")
	private Integer ID;
	@Column(name = "numOfDepatments")
	private String numOfDepatments;
	@ManyToOne(targetEntity = StudentsDTO.class, cascade = CascadeType.ALL)
	private Set<StudentsDTO> student;
	@ManyToOne(targetEntity = ParentsDTO.class, cascade = CascadeType.ALL)
	private Set<ParentsDTO> parent;
	@ManyToOne(targetEntity = TeacherDTO.class, cascade = CascadeType.ALL)
	private Set<TeacherDTO> teacher;
	@ManyToOne(targetEntity = HODDTO.class, cascade = CascadeType.ALL)
	private Set<HODDTO> hod;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNumOfDepatments() {
		return numOfDepatments;
	}

	public void setNumOfDepatments(String numOfDepatments) {
		this.numOfDepatments = numOfDepatments;
	}

	public Set<StudentsDTO> getStudent() {
		return student;
	}

	public void setStudent(Set<StudentsDTO> student) {
		this.student = student;
	}

	public Set<ParentsDTO> getParent() {
		return parent;
	}

	public void setParent(Set<ParentsDTO> parent) {
		this.parent = parent;
	}

	public Set<TeacherDTO> getTeacher() {
		return teacher;
	}

	public void setTeacher(Set<TeacherDTO> teacher) {
		this.teacher = teacher;
	}

	public Set<HODDTO> getHod() {
		return hod;
	}

	public void setHod(Set<HODDTO> hod) {
		this.hod = hod;
	}

}

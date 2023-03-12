package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDTO1")
public class UserDTO {
  @Id
  @Column(name="uID")
  private Integer uID;
  @Column(name="uName")
  private String uName;
  
public Integer getuID() {
	return uID;
}
public void setuID(Integer uID) {
	this.uID = uID;
}
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
  
}

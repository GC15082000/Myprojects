package com.dto.principal;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.HOD.HODDTO;
import com.dto.User.UserDTO;
@Entity
@Table(name="PrincipalDTO")
public class PrincipalDTO {
	@Id
	@Column(name="prinID")
   private Integer prinId;
	@Column(name="pName")
   private String pName;
	@OneToMany(targetEntity=HODDTO.class,cascade=CascadeType.ALL)
	private Set<HODDTO> hod;
	@OneToOne(targetEntity=UserDTO.class,cascade=CascadeType.ALL)
	private UserDTO user;

	public Integer getPrinId() {
		return prinId;
	}

	public void setPrinId(Integer prinId) {
		this.prinId = prinId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Set<HODDTO> getHod() {
		return hod;
	}

	public void setHod(Set<HODDTO> hod) {
		this.hod = hod;
	}
}

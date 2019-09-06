package com.mentor.MentorOnDemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mentor")
public class Mentor {
	@Id
	@Column(name="reg_code")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int regCode;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private int mobile;
	@Column(name="linkedin_url")
	private String url;
	@Column(name="experience")
	private int experience;
	@Column(name="technology")
	private String technology;
	@Column(name="slot_time")
	private String slotTime;
	@Column(name="password")
	private String password;
	@Column(name="active")
	private boolean active;
	@Column(name="status")
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getRegCode() {
		return regCode;
	}
	public void setRegCode(int regCode) {
		this.regCode = regCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getSlotTime() {
		return slotTime;
	}
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}

package com.hibernate_Restart.crudOperation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String colleegeName;
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getColleegeName() {
		return colleegeName;
	}
	public void setColleegeName(String colleegeName) {
		this.colleegeName = colleegeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int id, String name, String address, String colleegeName, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.colleegeName = colleegeName;
		this.email = email;
	}
	public Student(String name, String address, String colleegeName, String email) {
		super();
		this.name = name;
		this.address = address;
		this.colleegeName = colleegeName;
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", colleegeName=" + colleegeName
				+ ", email=" + email + "]";
	}
	
	
	

}

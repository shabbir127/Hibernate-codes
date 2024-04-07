package com.hibernate_Restart.onetoMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

	@Id
	private int id;
	private String addressType;
	private String address;
	
	@ManyToOne
	private Employee employee;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Address(int id, String addressType, String address, Employee employee) {
		super();
		this.id = id;
		this.addressType = addressType;
		this.address = address;
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", addressType=" + addressType + ", address=" + address + ", employee=" + employee
				+ "]";
	}
	public Address(int id, String addressType, String address) {
		super();
		this.id = id;
		this.addressType = addressType;
		this.address = address;
	}
	
	

	
}

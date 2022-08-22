package com.training.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	private int id;
	
	@Column(name="dept_name")
	private String dept_name;
	
	@Column(name="location")
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String dept_name, String location) {
		super();
		this.id = id;
		this.dept_name = dept_name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dept_name=" + dept_name + ", location=" + location + "]";
	}
	



}

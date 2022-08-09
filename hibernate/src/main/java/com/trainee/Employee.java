package com.trainee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name="id",nullable=false)
	@SequenceGenerator(name="emp_seq",sequenceName="emp_id__seq")
	@GeneratedValue(strategy=GenerationType.IDENTITY,generator="emp_seq")
	private int id;
	@Column(name="fmane")
	private String firstName;
	@Column(name="lname")
	private String lastName;
	private String created_by;
	private String created_date;
	private String udated_date;
	private String job_name;
	private String hire_date;
	private int salary;
//	@Column(name="manager_id")
//	private int Manager_id=0;
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getUdated_date() {
		return udated_date;
	}
	public void setUdated_date(String updated_date) {
		this.udated_date = updated_date;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob__name(String job_name) {
		this.job_name = job_name;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire__date(String hire__date) {
		this.hire_date = hire__date;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
//	public int getManager_id() {
//		return Manager_id;
//	}
//	public void setManager_id(int manager_id) {
//		this.Manager_id = manager_id;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", created_by="
				+ created_by + ", created_date=" + created_date + ", updated_date=" + udated_date + ", job__name="
				+ job_name + ", hire__date=" + hire_date + ", salary=" + salary + ", manager_id= ]";
	}
	

}

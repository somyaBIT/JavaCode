package com.serviceDao;

import java.util.ArrayList;

import com.trainee.Employee;

public interface ServiceDao {

	public void add(Employee emp);
	public void update(Employee emp);
	public void delete(int emp_id);
	public Employee getEmployee(int emp_id);
	public ArrayList<Employee> getEmployeeList();
}

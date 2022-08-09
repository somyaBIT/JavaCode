package com.service.Dao.Impl;

import java.util.ArrayList;

import com.DaoImp.EmpDaoImpl;
import com.serviceDao.ServiceDao;
import com.trainee.Employee;

public class ServiceDaoImpl implements ServiceDao{
	EmpDaoImpl edi = new EmpDaoImpl();
	public void add(Employee emp) 
	{
		edi.add(emp);
	}
	public void update(Employee emp)
	{
		edi.update(emp);
	}
	
	public void delete(int emp_id) 
	{
		edi.delete(emp_id);
	}
	public Employee getEmployee(int emp_id) 
	{
		return edi.getEmployee(emp_id);
	}
	public ArrayList<Employee> getEmployeeList() 
	{
		return edi.getEmployeeList();
	}
}

package com.DaoImp;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.dao.EmpDao;
import com.trainee.Employee;
import com.trainee.HibernatePersistence;

public class EmpDaoImpl extends BaseDAOImpl implements EmpDao {

	public void add(Employee emp) {
		// TODO Auto-generated method stub
		super.save(emp);


	}

	public void update(Employee emp) {
		// TODO Auto-generated method stub
		Session session = HibernatePersistence.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(emp);
		session.getTransaction().commit();
//		System.out.print("updating....");
		HibernatePersistence.shutdown();

	}

	public void delete(int emp_id) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(emp_id);
		super.delete(emp);
		
	}

	public Employee getEmployee(int emp_id) {
		// TODO Auto-generated method stub
		Session session = HibernatePersistence.getSessionFactory().openSession();
		session.beginTransaction();
		Employee emp = new Employee();
		emp =(Employee)session.get(Employee.class, emp_id);
		
	 	HibernatePersistence.shutdown();
		return emp;
	}

	public ArrayList<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		Session session = HibernatePersistence.getSessionFactory().openSession();
		Criteria criteria =session.createCriteria(Employee.class);
		ArrayList<Employee> criteriaList =(ArrayList<Employee>)criteria.list();
		HibernatePersistence.shutdown();
		return criteriaList;
		
		
	}







}

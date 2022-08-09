package com.trainee;

import org.hibernate.Session;

import com.DaoImp.EmpDaoImpl;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernatePersistence.getSessionFactory().openSession();
		session.beginTransaction();
		Employee emp = new Employee();
		
//		Make some employee for storing in database
		emp.setId(141);
		emp.setFirstName("Priya");
		emp.setLastName("Kumari");
		
//		Save employee to database
//		Integer empID= (Integer)session.save(emp);
//		session.getTransaction().commit();
		
//		get data from database
//		emp =(Employee)session.get(Employee.class, empID);
//		System.out.println(emp);
		
		EmpDaoImpl edi = new EmpDaoImpl();
//		edi.addEmp(emp);
//		edi.update(emp);
//		System.out.print(edi.getEmployee(141));
//		edi.update(emp);
//		System.out.print(edi.getEmployee(141));
//		edi.delete(141);
		System.out.print(edi.getEmployeeList());
//		close the session
		HibernatePersistence.shutdown();

	}

}

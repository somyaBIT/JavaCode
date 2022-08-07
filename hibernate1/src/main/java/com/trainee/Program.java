package com.trainee;

import org.hibernate.Session;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernatePersistence.getSessionFactory().openSession();
		session.beginTransaction();
		Employee emp = new Employee();
		
//		Make some employee for storing in database
		emp.setId(12);
		emp.setFirstName("Somya");
		emp.setLastName("Singh");
		
//		Save employee to database
		Integer empID= (Integer)session.save(emp);
		session.getTransaction().commit();
		
//		get data from database
		emp =(Employee)session.get(Employee.class, empID);
		System.out.println(emp);
		
//		close the session
		HibernatePersistence.shutdown();

	}

}

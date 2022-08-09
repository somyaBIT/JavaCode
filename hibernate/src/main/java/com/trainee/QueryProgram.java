package com.trainee;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class QueryProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernatePersistence.getSessionFactory().openSession();
//		
//		String hql ="from Employee";
//		Query query = session.createQuery(hql);
//		List list = query.list();
//		Iterator iter = list.iterator();
//		while(iter.hasNext())
//		{
//			Employee employee =(Employee)iter.next();
//			System.out.println(employee);
//		}
//		String Hql = "from Employee e where e.id = :id";
//		Query query = session.createQuery(Hql).setParameter("id", 2);
//		List result=query.list();
//		Iterator iter = result.iterator();
//		while(iter.hasNext())
//		{
//			Employee employee =(Employee)iter.next();
//			System.out.println(employee);
//		}
		
//		String hql = "from Employee e where e.id>5 ORDER BY e.salary DESC";
		String hql ="select SUM(e.salary),e.firstName from Employee as e "+"group by e.firstName";
		Query query = session.createQuery(hql);
		List result=query.list();
		Iterator iter = result.iterator();
		 for(Iterator it=query.iterate();it.hasNext();)
	  {
	   Object[] row = (Object[]) it.next();
	   System.out.print("salary :" + row[0]);
	   System.out.println(" | employee " + row[1]);
	  }
		HibernatePersistence.shutdown();
	}

}

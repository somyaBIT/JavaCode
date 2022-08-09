package com.DaoImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BaseDAOImpl {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	public static SessionFactory buildSessionFactory()
	{
		try
		{
			return new Configuration().configure().buildSessionFactory();
		}
		catch (Throwable ex)
		{
			System.err.println("Initial session factory creation failed."+ex);
//			throw new ExceptionInInitilizerError(ex);
		}
		return null;
		
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void shutdown()
	{
		getSessionFactory().close();
	}
	public void save(Object object)
	{
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(object);
		session.getTransaction().commit();
		shutdown();
	}
	public void delete(Object object)
	{
		Session session = getSessionFactory().openSession();
//		Employee employee = new Employee();
//		employee.setId(id);
		session.beginTransaction();
		session.delete(object);
		session.getTransaction().commit();
		shutdown();
	}
	
}
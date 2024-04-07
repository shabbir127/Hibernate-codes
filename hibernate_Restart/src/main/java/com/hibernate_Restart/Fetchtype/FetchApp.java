package com.hibernate_Restart.Fetchtype;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FetchApp {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
//		
//		String name="Rohit";
//		String email="rohit@gmail.com";
//		String Address="Mumbai";
//		
//		Employee employee=new Employee(name, email, Address);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		//session.save(employee);
		
		Employee employee=session.get(Employee.class, 2);
		
		System.out.println(employee);
		
		tx.commit();
		session.close();
		factory.close();
		
	}
}

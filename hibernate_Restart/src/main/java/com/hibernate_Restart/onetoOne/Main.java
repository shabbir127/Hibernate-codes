package com.hibernate_Restart.onetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		/* Address address=new Address();
		address.setId(201);
		address.setAddress("Pune");
	   
		
		Employee employee=new Employee();
		employee.setId(101);
		employee.setName("Shabbir");
		employee.setAddress(address);
		address.setEmployee(employee);
		
		
		
		session.save(address);
		session.save(employee);
		tx.commit(); */
		
		
		Transaction tx=session.beginTransaction();
		Address address=(Address)session.get(Address.class, 201);
		System.out.println(address.getAddress());
		
		System.out.println(address.getEmployee().getName());
		
		
		Employee employee=session.get(Employee.class, 101);
		
		System.out.println(employee.getAddress().getAddress());
		tx.commit();
		session.close();
		factory.close();
		
	}
}

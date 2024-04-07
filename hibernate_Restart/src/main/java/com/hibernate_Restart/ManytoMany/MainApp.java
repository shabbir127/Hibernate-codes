package com.hibernate_Restart.ManytoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainApp {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Employee e1=new Employee();
		e1.setName("Sujit");
		
		
		Employee e2=new Employee();
		e2.setName("Rohit");
		
		Address ad1=new Address();
		ad1.setName("Pune");
		
		Address ad2=new Address();
		ad2.setName("kalyan");
		
	
		List<Address>addlist=new ArrayList<Address>();
		addlist.add(ad1);
		addlist.add(ad2);
		
		
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		
		e1.setAddress(addlist);
		ad1.setEmployee(emplist);
		
		
		
		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(e1);
		session.save(e2);
//		session.save(ad1);
//		session.save(ad2);
		
		
//		Employee emp=session.get(Employee.class,1 );
//		System.out.println(emp.getName());
		
		
		tx.commit();
		session.close();
		factory.close();
	}
}

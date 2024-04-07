package com.hibernate_Restart.onetoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		/* Address ad1=new Address(101, "permanent Address","pune");
		Address ad2=new Address(102, "office Address","Mumbai");
		List<Address>list=new ArrayList<Address>();
		list.add(ad1);
		list.add(ad2);
		
		Employee emp1=new Employee();
		emp1.setId(201);
		emp1.setName("shabbir");
		emp1.setAddress(list);
		ad1.setEmployee(emp1);
		ad2.setEmployee(emp1);
		
		
		Transaction tx=session.beginTransaction();
		session.save(ad1);
		session.save(ad2);
		session.save(emp1);
		tx.commit(); */
		
		
		Employee employee=session.get(Employee.class, 201);
	for(Address ad:employee.getAddress())
	{
		System.out.println(ad.getAddress());
	}
		
		Address address=session.get(Address.class, 101);
		System.out.println(address.getAddressType());
		
		
		session.close();
		factory.close();
		
	}
}

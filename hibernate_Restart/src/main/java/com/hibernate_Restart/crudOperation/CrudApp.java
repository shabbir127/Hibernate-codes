package com.hibernate_Restart.crudOperation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.persistence.criteria.From;

public class CrudApp {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
	/*	Student st1 =new Student();
		st1.setName("Shabbir");
		st1.setAddress("Kalyan");
		st1.setColleegeName("Mumbai University");
		st1.setEmail("shabbir@gmail.com");
		
		Student st2 =new Student();
		st2.setName("Rohit");
		st2.setAddress("Pune");
		st2.setColleegeName("Pune University");
		st2.setEmail("rohit@gmail.com");
		
		session.save(st1);
		session.save(st2);
		
		
		tx.commit();
		
		*/
		
		
		//fetch
		List<Student>list=session.createQuery("from Student",Student.class).list();		
		
//		for(Student student:list)
//		{
//			System.out.println(student);
//		}
		
		list.forEach(e->System.out.println(e));
		
		
		
		//update 
//		Student st1=session.get(Student.class, 1);
//		st1.setName("Shabbir");
//		st1.setAddress("Chennai");
//		st1.setColleegeName("Mumbai University");
//		st1.setEmail("shabbir@gmail.com");
//		
//		session.saveOrUpdate(st1);
//		tx.commit();
		
		//delete
//		Student st1=session.get(Student.class, 1);
//		session.delete(st1);
//		tx.commit();
	
		Student st1=session.get(Student.class, 1);
		System.out.println(st1);
		
		session.close();
		factory.close();
	}
}

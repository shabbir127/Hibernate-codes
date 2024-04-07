package com.hibernate_Restart.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import net.sf.ehcache.search.expression.Criteria;

public class HqlApp {
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
	
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		//Student st1=new Student(101, "Rohit", "Kalyan");
		//session.save(st1);
		//tx.commit();
		
		
	 /* Query<Student>query =session.createQuery("from Student");	
		List<Student>list=query.list();
		for(Student s:list)
		{
			System.out.println(s);
		}*/
		
		
		Query<Student>query =session.createQuery("from Student where id=:id");
		query.setParameter("id", 2);
		List<Student>list=query.list();
		for(Student s:list)
		{
			System.out.println(s);
		}
		
		//HCQL criteria API...
		
		
		
		
		
		
		session.close();
		factory.close();
		
	}

}

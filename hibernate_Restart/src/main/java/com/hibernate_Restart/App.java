package com.hibernate_Restart;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
         SessionFactory factory=HibernateUtil.getSessionFactory();
         
         Address ad=new Address("India","Maharashtra","Mumbai");
         Address ad1=new Address("India","UP","Lucknow");
         Address ad2=new Address("India","MP","Bhopal");
         Address ad3=new Address("India","Gujarat","gandhinagar");
        
         
         List<Address>list =new ArrayList<Address>();
         list.add(ad);
         list.add(ad1);
         list.add(ad2);
      
         List<Address>list1 =new ArrayList<Address>();
         list1.add(ad);
         list1.add(ad1);
         list1.add(ad2);
         list1.add(ad3);
         
         User user=new User();
         user.setName("shabbir khan");
         user.setEmail("shabbir126@gmail.com");
         user.setDob("03-08-2001");
         user.setPass("12345");
         user.setAddress(list);
         
         User user1=new User();
         user1.setName("Sajid khan");
         user1.setEmail("Sajid@gmail.com");
         user1.setDob("05-06-2005");
         user1.setPass("12345");
         user1.setAddress(list1);
         
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(user);
        session.save(ad);
        session.save(ad1);
        session.save(ad2);
        session.save(ad3);
      
        //session.save(user1);
        
        tx.commit();
        session.close();
        factory.close();
        
    }
}

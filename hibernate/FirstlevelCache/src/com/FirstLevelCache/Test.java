package com.FirstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory(); 
		Session s = sf.openSession();   // first level cache is created here also  by default enabled
		Transaction tx = s.beginTransaction();
		
		Country c =(Country)s.get(Country.class,1);
		System.out.println(c.getcName());  
		
		System.out.println("Country Name");
		
		Country c1 =(Country)s.get(Country.class,1);  // no repetation of queries
		System.out.println(c1.getcName()); 
		
		System.out.println(s.contains(c1));
		System.out.println(s.contains(c));
		tx.commit();
		s.close();
		System.out.println(s.contains(c1));  // session is close i.e cache is also closed 
		
		// Note :If you want to use again  first level cache then make another session 
		}

}

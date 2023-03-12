package com.SecondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory(); 

		Session s = sf.openSession(); 
		Country c =(Country)s.get(Country.class,1);
		System.out.println(c.getcName());  
		s.close();
		
		Session s1 = sf.openSession();
		Country c1 =(Country)s1.get(Country.class,1);  // no repetition of queries
		System.out.println(c1.getcName()); 
		s1.close();
		
		}

}

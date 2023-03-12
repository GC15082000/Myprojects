package com.SecondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory(); // Second level cache is created here and enabled manually in cfg
	
		Session s = sf.openSession(); 
		Country c =(Country)s.get(Country.class,1);
		System.out.println(c.getcName());  
		s.close();
		
		System.out.println("");
		
		Session s1 = sf.openSession();
		Country c1 =(Country)s1.get(Country.class,1);  // no repetition of queries
		System.out.println(c1.getcName()); 
		s1.close();
	
	//	sf.close();
		  // sessionfactory is close i.e Secondlevelcache is also closed 
		
		// Note :If you want to use again  first level cache then make another session 
		}

}

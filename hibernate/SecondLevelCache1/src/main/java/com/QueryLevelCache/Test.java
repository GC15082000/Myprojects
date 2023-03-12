package com.QueryLevelCache;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/QueryLevelCache/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory(); // Query level cache is created here and enabled manually in cfg
	
		Session s1 = sf.openSession(); 
		Query q=s1.createQuery("from Country");
		q.setCacheable(true);
		List<Object> l =q.list();		
		for(Object o[]:l)
		{
			System.out.println(o[0]+" "+o[1]);
		}
		s1.close();
		
		System.out.println("");
		
		Session s2 = sf.openSession();
		Query q1=s2.createQuery("from Country");
		q1.setCacheable(true);
		List<Object> l2 =q1.list();		
		for(Object o[]:l2)
		{
			System.out.println(o[0]+" "+o[1]);
		}
		
		s2.close();

		// Note :If you want to use again  first level cache then make another session 
		}

}

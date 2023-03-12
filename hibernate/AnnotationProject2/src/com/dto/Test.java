package com.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		AnnotationConfiguration an= new AnnotationConfiguration().configure("Hibernate.cfg.xml");
		SessionFactory sf=an.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		UserDTO user=new UserDTO();
		user.setuID(1);
		user.setuName("Gaurav");		
		
		s.save(user);
		tx.commit();
		s.close();
		//sf.close();
	}

}

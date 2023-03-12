package com.dto.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/bidirectional/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		
		Employee em = (Employee)s.get(Employee.class, 1);

        System.out.println(em);
		tx.commit();

		s.close();
		// sf.close();

	}
}

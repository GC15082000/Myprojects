package com.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {
	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Customer cu=new Customer();
		cu.setCusID(1);
		cu.setCusName("Gaurav");		
		
		Order1 ord=new Order1();
		ord.setOrNum(11);
		ord.setOrAdd("Ganga Nagar");
		ord.setOrProductName("Charger");
		
	    cu.setOrder1(ord);
	    s.save(cu);
		tx.commit();

		s.close();
		// sf.close();

	}
}

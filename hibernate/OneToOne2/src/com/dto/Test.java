package com.dto;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		State em = new State();
		em.setStName("MP");
		em.setStArea("12000KM");

		Country ac = new Country();
		ac.setCounID(120);
		ac.setCounName("INDIA");

		em.setCountry(ac);

		s.save(em);
		tx.commit();

		s.close();
		// sf.close();

	}
}

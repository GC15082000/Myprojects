package com.dto;

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

		//CountryDTO cn = (CountryDTO) s.get(CountryDTO.class, 1);
		//System.out.println(cn);
		StateDTO st=(StateDTO)s.get(StateDTO.class, 3);
		System.out.println(st);
		s.close();
		// sf.close();

	}
}

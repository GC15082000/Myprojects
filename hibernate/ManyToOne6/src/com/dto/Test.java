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
		LivingOrganismDTO dt = (LivingOrganismDTO) s.get(LivingOrganismDTO.class, 1);
		System.out.println(dt.getlId());
		//s.delete("name", 4);
		tx.commit();
		 s.close();
		// sf.close();

	}
}

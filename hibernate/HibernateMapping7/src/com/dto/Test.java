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

		SoldierDetailsDTO sd = (SoldierDetailsDTO) s.get(SoldierDetailsDTO.class, 4);

		s.delete(sd);
		tx.commit();

	}
}

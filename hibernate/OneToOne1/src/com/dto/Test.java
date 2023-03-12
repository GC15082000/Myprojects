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

		Employee em = new Employee();
		em.setEmpID(1);
		em.setEmpName("Gaurav");
		em.setEmpCity("pune");

		Account ac = new Account();
		ac.setAccNum(123);
		ac.setAccName("Sbi");

		em.setAccount(ac);

		s.save(em);
		tx.commit();

		s.close();
		// sf.close();

	}
}

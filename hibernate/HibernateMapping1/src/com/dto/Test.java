package com.dto;


import java.util.HashSet;
import java.util.Set;

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

		VendorDTO vn = new VendorDTO();
		vn.setVenID(1);
		vn.setVenName("Airtel");
		vn.setVenPhoneNum(8801120);

		CustumerDTO cus1 = new CustumerDTO();
		cus1.setCusAddress("London");
		cus1.setCusID(1);
		cus1.setCusName("Gaurav");

		CustumerDTO cus = new CustumerDTO();
		cus.setCusAddress("India");
		cus.setCusID(2);
		cus.setCusName("Arjun");

		Set l = new HashSet();
		l.add(cus);
		l.add(cus1);

		vn.setCs(l);
		
		s.save(vn);
		tx.commit();

		s.close();
		// sf.close();

	}
}

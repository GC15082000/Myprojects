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

		VendorDTO vn = new VendorDTO();
		vn.setVenID(1);
		vn.setVenName("JIO");
		vn.setVenPhoneNum(1101120);

		CustumerDTO cus1 = new CustumerDTO();
		cus1.setCusAddress("Greenland");
		cus1.setCusID(1);
		cus1.setCusName("Garvit");
		cus1.setVendor(vn);
		
		CustumerDTO cus = new CustumerDTO();
		cus.setCusAddress("Newzealand");
		cus.setCusID(2);
		cus.setCusName("Karan");
		cus.setVendor(vn);

		Transaction tx = s.beginTransaction();
		s.save(cus1);
		s.save(cus);
		//s.save(vn);
		tx.commit();

		s.close();
		// sf.close();

	}
}

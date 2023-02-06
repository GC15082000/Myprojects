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

		CompanyDTO dto = new CompanyDTO();
		dto.setcId(1);
		dto.setcName("GOOGLE");

		EmployeeDTO em1 = new EmployeeDTO();
		// em1.setEmployeeId(1);
		em1.setName("gaurav");
		em1.setEmail("gc@gmail.com");
		em1.setAddress("RATLAM");

		EmployeeDTO em2 = new EmployeeDTO();
		// em2.setEmployeeId(2);
		em2.setName("gaurav2");
		em2.setEmail("gc2@gmail.com");
		em2.setAddress("RATLAM2");

		EmployeeDTO em3 = new EmployeeDTO();
		// em3.setEmployeeId(3);
		em3.setName("gaurav3");
		em3.setEmail("gc3@gmail.com");
		em3.setAddress("RATLAM3");

		List l = new ArrayList();
		l.add(em1);
		l.add(em2);
		l.add(em3);

		dto.setEmp(l);
		Transaction tx = s.beginTransaction();
		s.save(dto);
		tx.commit();

		// s.close();
		// sf.close();

	}
}

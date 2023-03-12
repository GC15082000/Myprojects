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

		StudentDTO st = new StudentDTO();
		st.setsId(1);
		st.setsName("Gaurav");
		st.setCourseName("Java");
		
		CollegeDTO cl=new CollegeDTO();
		cl.setcId(1);
		cl.setcName("MIT");
		cl.setNumOfStudents(20);
		cl.setcCity("Ratlam");
		
		st.setCollege(cl);
		s.save(st);
		tx.commit();
		s.close();
		// sf.close();

	}
}

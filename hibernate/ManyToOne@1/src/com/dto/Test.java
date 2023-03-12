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

		CouresDTO course =new CouresDTO();
		course.setcId(1);
		course.setcName("MATHEMATICS");
		
		StudentDTO st=new StudentDTO();
		st.setsId(1);
		st.setsEnrolledIn("MATHEMATICS");
		st.setsName("GAURAV");
		
		st.setCourse(course);
		s.save(st);
		tx.commit();

		s.close();
		// sf.close();

	}
}

package com.dto;

import java.util.HashSet;
import java.util.Set;

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
		
		CollegeDTO cl=new CollegeDTO();
		cl.setcId(1);
		cl.setcName("MIT");
		cl.setNumOfStudents(20);
		cl.setcCity("Ratlam");
		
		StudentDTO st1 = new StudentDTO();
		st1.setsId(1);
		st1.setsName("Gaurav");
		st1.setCourseName("cl");
		
		StudentDTO st2 = new StudentDTO();
		st2.setsId(2);
		st2.setsName("Gaurav2");
		st2.setCourseName("cl2");
		
		StudentDTO st3 = new StudentDTO();
		st3.setsId(3);
		st3.setsName("Gaurav3");
		st3.setCourseName("cl3");
		
		Set list =new HashSet();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		cl.setSt(list);
		
		s.save(cl);
		tx.commit();
		s.close();
		// sf.close();

	}
}

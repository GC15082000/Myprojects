package com.dto.TestSQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.dto.Student;

public class Test {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		String str="Select where sID=1";
		Query q=s.createSQLQuery(str).addEntity(Student.class);
		List<Object> student = q.list();
		for (Object st : student) {
			System.out.println(st);
		}
		
		System.out.println();
		tx.commit();
		s.close();
	}
}
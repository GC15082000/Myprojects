
package com.dto.TestHQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.dto.Student;

public class TestWithAllData {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		// For All Column
		Query q = s.getNamedQuery("SelectAll");

		List<Student> student = q.list();
		for(Student st : student) {
			System.out.println(st);
		}
		tx.commit();
		s.close();
	}
}

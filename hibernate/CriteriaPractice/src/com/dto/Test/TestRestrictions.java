package com.dto.Test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.dto.Student;

public class TestRestrictions {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Criteria c = s.createCriteria(Student.class); // (Select* from Student);
		Criterion cr=Restrictions.gt("id", 1);
		
		
		c.add(cr);
		List<Student> st =c.list();
		for (Student student : st) {
               System.out.println(student);
		}
		tx.commit();
		s.close();
	}
}

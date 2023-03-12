package com.dto.Test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.dto.Student;

public class TestProjections {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		//Getting Only one Column
		Criteria c = s.createCriteria(Student.class); // (Select* from Student);
		Projection p=Projections.property("sName");
		c.setProjection(p);
		List<String> st =c.list();
		for (String student : st) {
               System.out.println(student);
		}
		tx.commit();
		s.close();
	}
}

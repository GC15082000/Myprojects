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

public class TestSelectingAlldata {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		// Criteria is an API used for doing all selection purposes in DataBase.
		// Acts as meadiater in between Pojo's and Database

		//for selecting one row we have to use where in sql 
		// in criteria we Restriction for this
		Criteria c = s.createCriteria(Student.class); // (Select* from Student);
		Criterion cr=Restrictions.gt("id", 1);
		
		c.add(cr);
		Student St=(Student)c.uniqueResult();
		System.out.println(St);
		tx.commit();
		s.close();
	}
}

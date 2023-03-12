package com.dto.Test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.dto.Student;

public class TestwithMultipleRecords {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
        
		//For One Column
		String str="SELECT sID FROM criteriapractice.student";
		Query q=s.createSQLQuery(str);
		
		List<Integer> student=q.list();
		for(Integer st:student) {
		System.out.println(st);
		}
		tx.commit();
		s.close();
	}
}

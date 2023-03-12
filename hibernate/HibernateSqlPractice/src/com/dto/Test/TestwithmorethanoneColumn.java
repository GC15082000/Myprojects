
package com.dto.Test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.dto.Student;

public class TestwithmorethanoneColumn {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		// For more than one Column
		String str="SELECT sID,sName FROM criteriapractice.student";
		Query q=s.createSQLQuery(str);

		List<Object[]> student = q.list();
		for (Object[] st : student) {
			System.out.println("sId="+st[0]+" and "+"sName="+st[1]);
		}
		tx.commit();
		s.close();
	}
}

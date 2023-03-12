package com.dto;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		// For %g Filter
		System.out.println("Student Filter!");
		s.enableFilter("sName");
		Query q = s.createQuery("from Student");
		List l = q.list();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println();
			Student stu = (Student) itr.next();
			System.out.println("Student name Starting with g%=" + stu.getsName());
		}
		s.disableFilter("sName");

		// For AGE Filter
		Filter f=s.enableFilter("sAge");
		f.setParameter("sAge",18);
		Query q1 = s.createQuery("from Student");
		List l1 = q1.list();
		Iterator itr1 = l1.iterator();
		while (itr1.hasNext()) {
			System.out.println();
			Student stu1 = (Student) itr1.next();
			System.out.println("Student whose age>=18 :" + stu1.getsAge());
		}
		s.disableFilter("sAge");
		tx.commit();
		s.close();
		// sf.close();

	}

}

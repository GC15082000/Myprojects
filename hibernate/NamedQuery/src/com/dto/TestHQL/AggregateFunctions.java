
package com.dto.TestHQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AggregateFunctions {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Query q = s.getNamedQuery("AggregateFunction");
        Double avg=(Double) q.uniqueResult();
        System.out.println("Average= "+avg);
		tx.commit();
		s.close();
	}
}

package com.dto.Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.dto.Student;

public class TestWithAggregateFunction {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		//Using aggregate (we use c.uniqueresult() to iterate)
		Criteria c = s.createCriteria(Student.class); // (Select* from Student);		
		Projection p=Projections.max("sFees");
		c.setProjection(p);
		double fees=(double) c.uniqueResult();
		System.out.println("Fees="+fees);
		
		//For more than one Projection with aggregate Functions
		Projection p1=Projections.max("sFees");
		Projection p2=Projections.avg("sID");
		ProjectionList pr=Projections.projectionList();
		pr.add(p1);
		pr.add(p2);
		c.setProjection(pr);
		List<Object[]> student=c.list();
		for(Object st[]:student) {
		System.out.println("sFees(max)="+st[0]+" and "+"sID(avg)="+st[1]);
		}
		tx.commit();
		s.close();
	}
}

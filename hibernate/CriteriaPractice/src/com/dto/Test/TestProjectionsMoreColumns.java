package com.dto.Test;

import java.util.ArrayList;
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

public class TestProjectionsMoreColumns {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("com/dto/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		//Getting More than one Column (we use object to iterate)
		Criteria c = s.createCriteria(Student.class); // (Select* from Student);
		
		Projection p1=Projections.property("sName");
		Projection p2=Projections.property("sID");
		ProjectionList p=Projections.projectionList();
		p.add(p1);
		p.add(p2);
		c.setProjection(p);
		List<Object> st =c.list();
		for (Object student : st) {
			   Object obj[]=(Object[]) student;
               System.out.println(obj[0]+" "+obj[1]); // take array based on projection(p1,p2) not on table columns
		}
		tx.commit();
		s.close();
	}
}

package com.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration().configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		QuestionDTO ques=new QuestionDTO();
		ques.setqID(1);
		ques.setqName("What is JAVA?");
		
		AnswerDTO an=new AnswerDTO();
		an.setaID(1);
		an.setaName("Java is programming Language");
						
		ques.setAnswer(an);
		
		s.save(ques);
		tx.commit();
		s.close();
		sf.close();
	}

}

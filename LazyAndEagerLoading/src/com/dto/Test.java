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
		
		
		QuestionDTO ques =(QuestionDTO)s.get(QuestionDTO.class, 1);
		System.out.println(ques.getqID());
		System.out.println(ques.getqName()); // Eager will call Answer details also even when we comment AnswerDTO
		//System.out.println(ques.getAnswer().size());  // in LAZY we have to CAll Explicitly AnswerDTO 
		// According to our program it should be call automatically 

		tx.commit();
		s.close();
		//sf.close();
	}

}

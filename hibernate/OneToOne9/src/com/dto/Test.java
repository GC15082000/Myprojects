package com.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
//		QuestionDTO ques=new QuestionDTO();
//		ques.setqID(1);
//		ques.setqName("What is JAVA?");
//		
//		AnswerDTO an=new AnswerDTO();
//		an.setaID(1);
//		an.setaName("Java is programming Language");
		
		QuestionDTO ques =(QuestionDTO)s.get(QuestionDTO.class, 1);
		System.out.println(ques.getAnswer());
						
		//ques.setAnswer(an);
		
		s.save(ques);
		tx.commit();
		s.close();
		//sf.close();
	}

}

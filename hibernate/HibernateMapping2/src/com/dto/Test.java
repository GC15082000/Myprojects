package com.dto;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Test {

	public static void main(String[] args) {

	  Configuration cfg =new Configuration().configure("hibernate.cfg.xml");
	  SessionFactory sf=cfg.buildSessionFactory();
	  Session s=sf.openSession(); 
	  Transaction tx=s.beginTransaction();
	  
	  System.out.println();
	  ClassDTO cl=(ClassDTO)s.get(ClassDTO.class, 1);
	  System.out.println(cl);
	  
	  s.close();
	  //sf.close();
	  
   }
}



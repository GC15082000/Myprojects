package com.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        
        PersonDTO mv=(PersonDTO)s.get(PersonDTO.class, 3);
        s.delete(mv);
        
        tx.commit();
       // s.save(mv);
        s.close();
       //sf.close();
       
	}

}

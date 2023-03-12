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
        
        CitizenDTO cit1 =(CitizenDTO)s.get(CitizenDTO.class, 1);
        cit1.setcName("GauravChouhan");
        
        tx.commit();
        s.update(cit1);
        s.save(cit1);
        s.close();
       //sf.close();
       
	}

}

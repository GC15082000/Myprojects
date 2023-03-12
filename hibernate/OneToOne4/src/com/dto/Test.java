package com.dto;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Person ct = new Person();
		ct.setpID(1);
		ct.setpName("Gaurav");
		ct.setpCity("Ratlam");
		
		MovieTickets vt1 = new MovieTickets();
		vt1.setMtNum(120);
		vt1.setmName("GC");
		vt1.setMtime("12:00");
        
		vt1.setPerson(ct);
        		
		s.save(vt1);
		tx.commit();

		s.close();
		// sf.close();

	}
}
